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
import com.salesforce.SForceClient;
import com.sforce.soap.enterprise.UpsertResult;
import com.sforce.soap.enterprise.sobject.Account;

public class JerarquiaProceso {

	protected Logger logger = Logger.getLogger(this.getClass());
	
	private String sFilesPath;
	private boolean isDevEnv;
	private String rtRegion = null;
	private String rtDivision = null;
	private String rtZona = null;
	
	public StringBuffer messages = null;
	
	protected File fRegion = null;
	protected File fDivision = null;
	protected File fZona = null;

	private HashMap<String, Account>mapRegion;
	private HashMap<String, Account>mapDivision;
	private HashMap<String, Account>mapZona;

	public static void main(String[] args) {
		String myDate		= null;
		
		if(args.length > 0){
			myDate = StringUtils.trimToNull(args[0]);
		}
		
		JerarquiaProceso rp = new JerarquiaProceso();
		Boolean success = rp.init(myDate);
		if(!success){
			rp.finalizar(false, rp.messages.toString());
			return;
		}else 
			
		rp.parse();
		rp.store();
		rp.store_d();
		rp.store_z();
		rp.finalizar(success, rp.messages.toString());
		
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

	public JerarquiaProceso(){
		messages = new StringBuffer();
	}; private Date   	date;
	
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
		
		AvonDAO dao = new AvonDAO();
		
		try{
			rtRegion = dao.getRecordType("Account", "Región");
			rtDivision = dao.getRecordType("Account", "División");
			rtZona = dao.getRecordType("Account", "Zona");
			
		}catch(Exception e){
			logger.error("Error " + e.getMessage());
			return false;
		}
		
		try{
			// Leer configuración.
			
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
			/*BUSCAR ARCHIVO ...*/
			StringBuilder sbFile = new StringBuilder();
				sbFile.append(sFilesPath);
				sbFile.append("region_" + dateFile + ".csv");
				
			StringBuilder sbFile_d = new StringBuilder();
				sbFile_d.append(sFilesPath);
				sbFile_d.append("division_" + dateFile + ".csv");
				
			StringBuilder sbFile_z = new StringBuilder();
				sbFile_z.append(sFilesPath);
				sbFile_z.append("zonas_" + dateFile + ".csv");
		
			File fTempMay = new File( sbFile.toString() );
			logger.info("Buscando archivo: "+fTempMay);
			if ( fTempMay.exists() ) {
				fRegion = fTempMay;
			}
		File fTempMay_d = new File( sbFile_d.toString() );
				logger.info("Buscando archivo: "+fTempMay_d);
				if ( fTempMay.exists() ) {
					fDivision = fTempMay_d;	
				}
			File fTempMay_z = new File( sbFile_z.toString() );
					logger.info("Buscando archivo: "+fTempMay_z);
					if ( fTempMay.exists() ) {
						fZona = fTempMay_z;
					}
 			if (fRegion==null){
				logger.error( "No se encontro el archivo: region_" + dateFile + ".csv \n" );
				messages.append( "No se encontro el archivo: region_" + dateFile + " .csv \n" );
				} 
			if(fDivision==null){
				logger.error( "No se encontro el archivo: division_" + dateFile + ".csv \n"  );
				messages.append( "No se encontro el archivo:  division_" + dateFile + ".csv \n" );
			} 
			if (fZona==null){
				logger.error( "No se encontro el archivo: zonas_" + dateFile + ".csv \n" );
				messages.append( "No se encontro el archivo: zonas_" + dateFile + ".csv \n" );				
			}
			if (fRegion == null && fDivision == null && fZona  == null){
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
		if (fRegion != null) {
			logger.info("Parseando archivo:" + fRegion.getName() );
			ParserRegion p = new ParserRegion(fRegion, rtRegion);
			try {
				p.parse();
			} catch (Exception e) {
				logger.error("Error parseando el archivo: " + fRegion.getName() + ", error:" + e.getMessage());
				messages.append("Error parseando el archivo: " + fRegion.getName() + ", error:" + e.getMessage());
			}
			mapRegion  = p.getMapRegion();
			logger.info("Total de regiones:" + mapRegion.size());
		}
	 if (fDivision != null) {
		logger.info("Parseando archivo:" + fDivision.getName() );
//
		ParserDivision p = new ParserDivision(fDivision,rtDivision, mapRegion);
		try {
			p.parse();
		} catch (Exception e) {
			logger.error("Error parseando el archivo: " + fDivision.getName() + ", error:" + e.getMessage());
			messages.append("Error parseando el archivo: " + fDivision.getName() + ", error:" + e.getMessage());
		}
		mapDivision = p.getMapDivision();
		logger.info("Total de Divisiones:" + mapDivision.size());
	}
	 if (fZona != null) {
			logger.info("Parseando archivo:" + fZona.getName() );
			ParserZona p = new ParserZona(fZona,rtZona,mapDivision);
			try {
				p.parse();
			} catch (Exception e) {
				logger.error("Error parseando el archivo: " + fZona.getName() + ", error:" + e.getMessage());
				messages.append("Error parseando el archivo: " + fZona.getName() + ", error:" + e.getMessage());
			}
			mapZona = p.getMapZona();
			logger.info("Total de Zonas:" + mapZona.size());
	 	}
	}

	private Boolean store(){
		
		ArrayList<Account> listSFObjs = new ArrayList<Account>(mapRegion.values());
		return storeGral(listSFObjs, "Región");			
		
	}	
	
	private Boolean store_d(){
		
		ArrayList<Account> listSFObjs = new ArrayList<Account>(mapDivision.values());
		return storeGral(listSFObjs, "División");
		
	}	
	
	private Boolean store_z(){
		
		ArrayList<Account> listSFObjs = new ArrayList<Account>(mapZona.values());
		return storeGral(listSFObjs, "Zona");
		
	}
	
		private Boolean storeGral(ArrayList<Account> toUpsert,String modulo){
	
			ArrayList<Account> sinPropietario = new ArrayList<Account>();
			
			Boolean success =true;
			Account[] arrSFObjs = new Account[toUpsert.size()];//número de elementos 
			arrSFObjs = toUpsert.toArray(arrSFObjs);

			SForceClient sfc = new SForceClient();
			try {
				logger.debug("To upsert:" + arrSFObjs.length);

				Integer total = arrSFObjs.length;
				Integer totalSuccess = 0;
				Integer totalUpdated = 0;
				Integer totalInserted = 0;
				Integer totalError = 0;
				Integer index=-1;

				UpsertResult[] results_r = sfc.upsertObjects("EXTERNAL_ID__c" ,arrSFObjs);
				if(results_r!=null){
					for(UpsertResult result:results_r){
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
						
						Account acc = (Account)arrSFObjs[index];
						for(com.sforce.soap.enterprise.Error error:errors){
							totalError++;
							
							if(error==null){
								continue;
							}
							if(error.getMessage()==null){
								continue;
							}
							
							//Verificar mensaje
							
							if(error.getMessage().contains("Foreign key external ID:")){
								logger.error(error.getMessage());
								messages.append(error.getMessage() + "\n");
								acc.setOwner(null);
								sinPropietario.add(acc);
								continue;
							}
							
							logger.error("Error en registro '" + acc.getEXTERNAL_ID__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
							messages.append("Error en registro '" + acc.getEXTERNAL_ID__c() + "': ");
							messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
							success = false;
							break;
						}	
					}
					
				}
				
				if(sinPropietario.size()>0){
					Account[] arrSFObjsSP = new Account[sinPropietario.size()];//número de elementos 
					arrSFObjsSP = sinPropietario.toArray(arrSFObjsSP);
					
					index=-1;
					UpsertResult[] resultsSP = sfc.upsertObjects("EXTERNAL_ID__c" ,arrSFObjsSP);
					if(resultsSP!=null){
						for(UpsertResult result:resultsSP){
							index++;
							if(result==null){
								continue;
							}	
							if(result.isSuccess()){
								continue;
							}
							com.sforce.soap.enterprise.Error[] errors = result.getErrors();
							if(errors==null){
								continue;
							}

							Account acc = (Account)arrSFObjsSP[index];
							for(com.sforce.soap.enterprise.Error error:errors){
								if(error==null){
									totalError++;
									continue;
								}
								if(error.getMessage()==null){
									continue;
								}
								logger.error("Error en registro '" + acc.getEXTERNAL_ID__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
								messages.append("Error en registro '" + acc.getEXTERNAL_ID__c() + "': ");
								messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
							}	
						}
					}
				}
				logger.info("success:" + totalSuccess + ", errors:" + totalError);
				messages.append(" \n   Reporte Final  \n\n");
				messages.append(" Total de registros " + modulo + " procesados:" + total + "\n\n");
				messages.append(" Total de registros " + modulo + " exitosos:" + totalSuccess+ "\n");
				messages.append(" Total de registros " + modulo + " erroneos:" + totalError + "\n\n");
				messages.append(" Total de registros " + modulo + " actualizados:" + totalUpdated + "\n");
				messages.append(" Total de registros " + modulo + " insertados:" + totalInserted + "\n\n");
				
			} catch (Exception e) {
				logger.error("Error actualizando registros:" + e.getMessage());
				messages.append("Error subiendo la información a Salesforce.com \n");
				messages.append(e.getMessage());
				success = false;
			}
			return success;
		}	
		
		
		
		
}