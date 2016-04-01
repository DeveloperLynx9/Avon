package com.avon.parser;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.avon.parser.util.AvonDAO;
import com.avon.parser.util.Loader;
import com.avon.parser.util.SForceClient;
import com.sforce.soap.enterprise.UpsertResult;
import com.sforce.soap.enterprise.sobject.Campania_Avon__c;
import com.sforce.soap.enterprise.sobject.Movimiento__c;


public class ivrParser {

	protected Logger logger = Logger.getLogger(this.getClass());
	
	private String sFilesPath;
	private boolean isDevEnv;
	
	private String ivMod=null;
	private String ivMan=null;

	public StringBuffer messages = null;
	protected File MAN = null;
	protected File MOD = null;

	//Mapas
	private HashMap<String, Movimiento__c>mapMan;
	private HashMap<String, Movimiento__c>mapMod;

	public static void main(String[] args) {
			String myDate		= null;
				if(args.length > 0){
					myDate = StringUtils.trimToNull(args[0]);
				}
				
				ivrParser rp = new ivrParser();
				Boolean success = rp.init(myDate);
				if(!success){
					rp.finalizar(false, rp.messages.toString());
					return;
				}else
			
				rp.parse();
				rp.storeMod();
				rp.storeMan();
				rp.finalizar(true, rp.messages.toString());
				
			}
		
		public void finalizar(Boolean success, String emailBody) {
			// Liberar recursos
			// Cerrar conexiones.
			SForceClient sfc = new SForceClient();
			try{
				sfc.sendEmail(success, emailBody, this.date);
			} catch (Exception e) {
				logger.error(e);
			}
			logger.info( "Proceso terminado");
		}

		public ivrParser(){
			messages = new StringBuffer();
		};private Date   	date;
		
		private Boolean init(String indate){
			SimpleDateFormat sdf 			= new SimpleDateFormat("ddMMyyyy");
			indate							= StringUtils.trimToNull(indate);
			if(indate==null){
				this.date = new Date();
				Calendar c = Calendar.getInstance(); 
				c.setTime(this.date); 
				c.add(Calendar.DATE, -1);
				this.date = c.getTime();
				logger.debug("Fecha a procesar:" + sdf.format(this.date) );
			}
			else{
				try{
					this.date = sdf.parse(indate);
				}
				catch(Exception e){
					this.date = new Date();
					logger.error("Error parseando la fecha", e);
				}
			}
			
			AvonDAO dao = new AvonDAO ();
			try{
				ivMod=dao.getRecordType("Movimiento__c", "Modificaciones");
			}catch(Exception e){
				messages.append("Error en registros" + e.getMessage());
				return false;
			}
			try{
					//Leer Configuración 
					String loaderName		= new String("");
					Loader verify 			= new Loader("parser.properties");
					isDevEnv				= verify.getBoolean("parser.isDevEnv");
					if(isDevEnv)
						loaderName			= "dev.properties";
					else
						loaderName			= "prod.properties";
					logger.debug("loadername = " + loaderName);
					Loader loader			= new Loader(loaderName);
					sFilesPath		 	    = loader.getString("files.path");

				
				SimpleDateFormat formatDateFile = new SimpleDateFormat("yyMMdd");
				String dateFile = formatDateFile.format(date);
				
				//Buscar Archvo
				StringBuilder sbFile = new StringBuilder();
				sbFile.append(sFilesPath);
				sbFile.append("MOD_"+ dateFile + ".txt ");
				
				StringBuilder sbFile_d = new StringBuilder();
				sbFile_d.append(sFilesPath);
				sbFile_d.append("MAN_" + dateFile + ".txt ");
				
				File fTempMay = new File( sbFile.toString() );
					logger.info("Buscando archivo: "+fTempMay);
						if ( fTempMay.exists() ) {
							MOD = fTempMay;
					}
				File fTempMay_d = new File( sbFile_d.toString() );
					logger.info("Buscando archivo: "+fTempMay_d);
					if ( fTempMay.exists() ) {
							MAN = fTempMay_d;	
					}
				
				if (MOD==null){
					logger.error( "No se encontro el archivo: MOD_" + dateFile + ".txt" );
					messages.append( "No se encontro el archivo: MOD_" + dateFile + ".txt\n");
				} 
				
				if(MAN==null){
					logger.error( "No se encontro el archivo: MAN_ " + dateFile + ".txt" );
					messages.append( "No se encontro el archivo: MAN_" + dateFile + ".tx\n");
				}
				
				if(MOD==null && MAN==null ){
					return false;
				}
		}
		catch(Exception e){
			e.printStackTrace();
			}
				return true;
		}
		
		protected void parse(){
			
			if (MOD != null) {
					logger.info("Parseando archivo:" + MOD.getName() );
					ModParser p = new ModParser(MOD,ivMod);
				try {
					p.parse();
				} catch (Exception e) {
					logger.error("Error parseando el archivo: " + MOD.getName() + ", error:" + e.getMessage());
					messages.append("Error parseando el archivo: " + MOD.getName() + ", error:" + e.getMessage());
					}
				mapMod  = p.getmapMod();
				logger.info("Total de archivos MOD procesados < Código 235 >: " + mapMod.size());
			}
	
			if (MAN != null) {
				logger.info("Parseando archivo:" + MAN.getName() );
				ManParser p = new ManParser(MAN,ivMan);
			try {
				p.parse();
			} catch (Exception e) {
				logger.error("Error parseando el archivo: " + MAN.getName() + ", error:" + e.getMessage());
				messages.append("Error parseando el archivo: " + MAN.getName() + ", error:" + e.getMessage());
				}
			mapMan = p.getmapMan();
			logger.info("Total de archivos MAN procesados < Código 236 >: " + mapMan.size());
			}
		}
		
		private Boolean storeMod(){
			ArrayList<Movimiento__c> listSFObjs = new ArrayList<Movimiento__c>(mapMod.values());
			return storeFin(listSFObjs, "MOD");
		}
		
		private Boolean storeMan (){
			ArrayList<Movimiento__c> listSFObjs = new ArrayList<Movimiento__c>(mapMan.values());
			return storeFin(listSFObjs, "MAN");
		}
		
		private Boolean storeFin(ArrayList<Movimiento__c> toUpsert,String modulo){
			
			Boolean success =true;
			Movimiento__c[] arrSFObjs = new Movimiento__c[toUpsert.size()]; 
			arrSFObjs = toUpsert.toArray(arrSFObjs);
			
			Campania_Avon__c camp = new Campania_Avon__c();
			camp.getExternal_Id__c();
			
				SForceClient sfc = new SForceClient();
				try {
					logger.debug("To upsert:" + arrSFObjs.length);
					Integer total = arrSFObjs.length;
					Integer totalSuccess = 0;
					Integer totalUpdated = 0;
					Integer totalInserted = 0;
					Integer totalError = 0;
					Integer index=-1;
					
					//Upsert  -> MOD
					UpsertResult[] results = sfc.upsertObjects("External_Id__c" ,arrSFObjs);
					if(results!=null){
						for(UpsertResult result:results){
						index++;
						if(result==null){
							continue;
						}	
						if(result.isSuccess()){
							totalSuccess++;
							if(result.isCreated()){
								totalInserted++;
							}else{
								totalUpdated++;
								logger.info(totalUpdated);
							}
							continue;
						}
						com.sforce.soap.enterprise.Error[] errors = result.getErrors();
						if(errors==null){
							continue;
						}
						Movimiento__c acc = (Movimiento__c)arrSFObjs[index];
						for(com.sforce.soap.enterprise.Error error:errors){
							totalError++;
							if(error==null){
								continue;
							}
							if(error.getMessage()==null){
								continue;
							}
							logger.error("Error en registro '" + acc.getExternal_Id__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
							messages.append("Error en registro '" + acc.getExternal_Id__c() + "': ");
							messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
							success = false;
							break;
						}	
					}
				}
					logger.info("success:" + totalSuccess + ", errors:" + totalError);
					messages.append("\n   Total de Archivos " + modulo + "\n\n");
					messages.append(" Total de registros procesados:" + total + "\n\n");
					
					messages.append(" Total de registros exitosos:" + totalSuccess + "\n");
					messages.append(" Total de registros erroneos:" + totalError + "\n\n");
					
					messages.append(" Total de registros actualizados:" + totalUpdated + "\n");
					messages.append(" Total de registros insertados:" + totalInserted + "\n\n");
				
				} catch (Exception e) {
					logger.error("Error actualizando registros:" + e.getMessage());
					messages.append("Error subiendo la información a Salesforce.com \n");
					messages.append(e.getMessage());
					success = false;
				}
				return success;
			}	
	}	
