package com.avon.parser;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.avon.parser.util.AvonDAO;
import com.avon.parser.util.Loader;
import com.avon.parser.util.SForceClient;
import com.sforce.soap.enterprise.UpsertResult;
import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.Contact;
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
		}
		rp.parse();
		rp.store();
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
		};
		private Date   	date;
		
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
			AvonDAO ivr = new AvonDAO ();
			try{
				logger.info("Consultando los registros MOD & MAN ... ");
				ivMod=ivr.getRecordType("Movimiento__c", "Modificaciones");
			}catch(Exception e){
				logger.error("error" + e.getMessage());
				messages.append("Error en registros" + e.getMessage());
				return false;
			}
			try{
				//Leer Configuraci�n 
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

				//Buscar Archvo
				StringBuilder sbFile = new StringBuilder();
				sbFile.append(sFilesPath);
				sbFile.append("fMOD2610.txt");
				
				StringBuilder sbFile_d = new StringBuilder();
				sbFile_d.append(sFilesPath);
				sbFile_d.append("fMAN2610.txt");
				
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
				logger.error( "No se encontro el archivo: fMOD2610.txt" );
				messages.append( "No se encontro el archivo: fMOD2610.txt\n");
					} 
				if(MAN==null){
				logger.error( "No se encontro el archivo: fMAN2610.txt" );
				messages.append( "No se encontro el archivo: fMAN2610.tx\n");
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
			// parser jerarquia
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
				logger.info("Total de archivos procesados < C�digo 235 >: " + mapMod.size());
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
			logger.info("Total de archivos procesados < C�digo 236 >: " + mapMan.size());
			
		}
	} 
		
		private Boolean store(){

			Boolean success =true;
			
				List<Movimiento__c> listSFObjs = new ArrayList<Movimiento__c>(mapMod.values());// solo los valores
				Movimiento__c[] arrSFObjs = new Movimiento__c[listSFObjs.size()];//n�mero de elementos 
				arrSFObjs = listSFObjs.toArray(arrSFObjs);
				
				SForceClient sfc = new SForceClient();
				try {
					logger.debug("To upsert:" + arrSFObjs.length);
					
					Integer total = arrSFObjs.length;
					Integer totalSuccess = 0;
					Integer totalUpdated = 0;
					Integer totalInserted = 0;
					Integer totalError = 0;
					Integer index=-1;
					
					//Upsert Cuentas -> MOD
					UpsertResult[] results = sfc.upsertObjects("External_Id_c__c" ,arrSFObjs);
						if(results!=null){
							results.hashCode();
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
							totalError++;
							Movimiento__c acc = (Movimiento__c)arrSFObjs[index];
							for(com.sforce.soap.enterprise.Error error:errors){
								if(errors==null){
									continue;
								}else
								logger.error(acc);
								logger.error("Error en registro '" + acc.getExternal_Id_c__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
								messages.append("Error en registro '" + acc.getExternal_Id_c__c() + "': ");
								messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
								success = false;
							}	
						}
					}
						HashMap <String,Contact> mapaAsociado =  new HashMap<String, Contact>();
						/* 3  ASIGNACION DE NOMBRE DE CTA A CONTACTOS */
						for (Movimiento__c acc:mapMod.values()){
							String key = acc.getExternal_Id_c__c();
							if(!mapaAsociado.containsKey(key)){
								Contact contact = new Contact();
								contact.setRegistro__c(key);
								Account padre= new Account();
								padre.setEXTERNAL_ID__c(acc.getExternal_Id_c__c());
								contact.setAccount(padre);
								mapaAsociado.put(key, contact);
							}
						}
						ArrayList<Contact> asociado = new ArrayList<Contact>(mapaAsociado.values());
						Contact[] arraySocio = new Contact[asociado.size()];
						asociado.toArray(arraySocio);
						UpsertResult[]fin = sfc.upsertObjects("Registro__c",arraySocio);
						if(fin!=null){
							results.hashCode();
							index=0;
							totalSuccess=0;
							totalUpdated=0;
							for(UpsertResult result:fin){
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
								}
								continue;
							}
							com.sforce.soap.enterprise.Error[] errors = result.getErrors();
							if(errors==null){
								continue;
							}
							totalError++;
							Movimiento__c acc = (Movimiento__c)arrSFObjs[index];
							for(com.sforce.soap.enterprise.Error error:errors){
								if(errors==null){
									continue;
								}else
								logger.error(acc);
								logger.error("Error en registro '" + acc.getExternal_Id_c__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
								messages.append("Error en registro '" + acc.getExternal_Id_c__c() + "': ");
								messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
								success = false;
							}	
						}
					}
					logger.info("success:" + totalSuccess + ", errors:" + totalError);
					messages.append("\n   Total de Archivos MOD   \n\n");
					messages.append(" Total de registros procesados:" + total + "\n\n");
					
					messages.append(" Total de registros exitosos:" + totalSuccess + "\n");
					messages.append(" Total de registros erroneos:" + totalError + "\n\n");
					
					messages.append(" Total de registros actualizados:" + totalUpdated + "\n");
					messages.append(" Total de registros insertados:" + totalInserted + "\n");
				} catch (Exception e) {
					logger.error("Error actualizando registros:" + e.getMessage());
					messages.append("Error subiendo la informaci�n a Salesforce.com \n");
					messages.append(e.getMessage());
					success = false;
				}
				return success;
			}	
			
}	


