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
import com.salesforce.SForceClient;
import com.sforce.soap.enterprise.UpsertResult;
import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.Contact;

public class JerarquiaProceso {

	protected Logger logger = Logger.getLogger(this.getClass());
	
	private String sFilesPath;
	private boolean isDevEnv;
	private String rtRegion = null;
	private String rtDivision = null;
	private String rtZona = null;
	private String rtGerente = null;
	
	public StringBuffer messages = null;
	
	protected File fRegion = null;
	protected File fDivision = null;
	protected File fZona = null;

	// Representantes
	
	private HashMap<String, Account>mapRegion;
	private HashMap<String, Contact> mapaGerentes;
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
		}
		rp.parse();
		rp.store();
		rp.store_d();
		rp.store_z();
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

	public JerarquiaProceso(){
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
		
		AvonDAO dao = new AvonDAO();
		
		try{
			logger.info("Consultando tipo de registro 'Representante'...");			
			rtRegion = dao.getRecordType("Account", "Regi�n");
			rtDivision = dao.getRecordType("Account", "Divisi�n");
			rtZona = dao.getRecordType("Account", "Zona");
			rtGerente = dao.getRecordType("Contact", "Gerente");
			
		}catch(Exception e){
			logger.error("Error " + e.getMessage());
			messages.append("Error consultando el tipo de registro 'Representante':" + e.getMessage());
			return false;
		}
		
		try{
			
			// Leer configuraci�n.
			
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
			
			/*
			 * BUSCAR ARCHIVO ...
			 */
			StringBuilder sbFile = new StringBuilder();
				sbFile.append(sFilesPath);
				sbFile.append("region.csv");
				
			StringBuilder sbFile_d = new StringBuilder();
				sbFile_d.append(sFilesPath);
				sbFile_d.append("division.csv");
				
			StringBuilder sbFile_z = new StringBuilder();
				sbFile_z.append(sFilesPath);
				sbFile_z.append("zona.csv");
		
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
				logger.error( "No se encontro el archivo: region.csv" );
				messages.append( "No se encontro el archivo: region.csv\n");
			} 
			if(fDivision==null){
				logger.error( "No se encontro el archivo: divisi�n.csv" );
				messages.append( "No se encontro el archivo: divisi�n.csv\n");
			} 
			if (fZona==null){
				logger.error( "No se encontro el archivo: zona.csv" );
				messages.append( "No se encontro el archivo: zona.csv\n");				
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
			ParserRegion p = new ParserRegion(fRegion, rtGerente, rtRegion);
			try {
				p.parse();
			} catch (Exception e) {
				logger.error("Error parseando el archivo: " + fRegion.getName() + ", error:" + e.getMessage());
				messages.append("Error parseando el archivo: " + fRegion.getName() + ", error:" + e.getMessage());
			}
			
			mapRegion  = p.getMapRegion();
			mapaGerentes = p.getMapaGerentes();
			logger.info("Total de regiones:" + mapRegion.size());
		}
	
	 if (fDivision != null) {
		logger.info("Parseando archivo:" + fDivision.getName() );
		ParserDivision p = new ParserDivision(fDivision,rtGerente,rtDivision);
		try {
			p.parse();
		} catch (Exception e) {
			logger.error("Error parseando el archivo: " + fDivision.getName() + ", error:" + e.getMessage());
			messages.append("Error parseando el archivo: " + fDivision.getName() + ", error:" + e.getMessage());
		}
		mapDivision = p.getMapDivision();
		mapaGerentes.putAll(p.getMapaGerentes());
		logger.info("Total de Divisiones:" + mapDivision.size());
		
	}
	 
	 if (fZona != null) {
			logger.info("Parseando archivo:" + fZona.getName() );
			ParserZona p = new ParserZona(fZona,rtGerente,rtZona);
			try {
				p.parse();
			} catch (Exception e) {
				logger.error("Error parseando el archivo: " + fZona.getName() + ", error:" + e.getMessage());
				messages.append("Error parseando el archivo: " + fZona.getName() + ", error:" + e.getMessage());
			}
			
			mapZona = p.getMapZona();
			mapaGerentes.putAll(p.getMapaGerentes());
			logger.info("Total de Zonas:" + mapZona.size());
	 	}
	}
	
	
	private Boolean store(){
	//------------------------------REGIONES---------------------//
		
		Boolean success =true;
		
		List<Account> listSFObjs = new ArrayList<Account>(mapRegion.values());// solo los valores
		Account[] arrSFObjs = new Account[listSFObjs.size()];//n�mero de elementos 
		arrSFObjs = listSFObjs.toArray(arrSFObjs);
		logger.info(listSFObjs);
		
		SForceClient sfc = new SForceClient();
		try {
			logger.debug("To upsert:" + arrSFObjs.length);
		
			Integer total = arrSFObjs.length;
			Integer totalSuccess = 0;
			Integer totalUpdated = 0;
			Integer totalInserted = 0;
			Integer totalError = 0;
			
			ArrayList<Contact> gerentes = new ArrayList<Contact>(mapaGerentes.values());
			Contact[] arrayGerentes = new Contact[gerentes.size()];
			gerentes.toArray(arrayGerentes);
			//Upsert Contactos -> Gerentes 
			UpsertResult[] resultsGerentes = sfc.upsertObjects("Registro__c", arrayGerentes);
			if(resultsGerentes!=null){
				for(UpsertResult resultG:resultsGerentes)
				{
					if(resultG==null){
						continue;
						}
					if(resultG.isSuccess()){
						continue;
						}
					com.sforce.soap.enterprise.Error[] errors = resultG.getErrors();
					if(errors==null){
						continue;
						}
					for(com.sforce.soap.enterprise.Error error:errors){
						if(error==null){
							continue;
							}
						logger.error(error.getMessage());
						messages.append("Error procesando gerentes de region:" + error.getMessage());
						success = false;
					}
				}
			}
			if(!success){
				return false;
			}
			Integer index=-1;
			//Upsert Cuentas -> Region
			UpsertResult[] results_r = sfc.upsertObjects("EXTERNAL_ID__c" ,arrSFObjs);
			results_r.hashCode();
				if(results_r!=null){
					results_r.hashCode();
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
							logger.info(totalUpdated);
						}
						continue;
					}
					com.sforce.soap.enterprise.Error[] errors = result.getErrors();
					if(errors==null){
						continue;
					}
					totalError++;
					Account acc = (Account)arrSFObjs[index];
					for(com.sforce.soap.enterprise.Error error:errors){
						if(errors==null){
							continue;
						}else
						logger.error(acc);
						logger.error("Error en registro '" + acc.getEXTERNAL_ID__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
						messages.append("Error en registro '" + acc.getEXTERNAL_ID__c() + "': ");
						messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
						success = false;
					}	
				}
			}
				HashMap <String,Contact> mapaAsociado =  new HashMap<String, Contact>();
				/* 3  ASIGNACION DE NOMBRE DE CTA A CONTACTOS */
				for (Account acc:mapRegion.values()){
					String key = acc.getGerente__r().getRegistro__c();
					if(!mapaAsociado.containsKey(key)){
						Contact contact = new Contact();
						contact.setRegistro__c(key);
						Account padre= new Account();
						padre.setEXTERNAL_ID__c(acc.getEXTERNAL_ID__c());
						contact.setAccount(padre);
						mapaAsociado.put(key, contact);
					}
				}
				ArrayList<Contact> asociado = new ArrayList<Contact>(mapaAsociado.values());
				Contact[] arraySocio = new Contact[asociado.size()];
				asociado.toArray(arraySocio);
				
				UpsertResult[]fin = sfc.upsertObjects("Registro__c",arraySocio);
				if(fin!=null){
					results_r.hashCode();
					logger.info("total");
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
					Account acc = (Account)arrSFObjs[index];
					for(com.sforce.soap.enterprise.Error error:errors){
						if(errors==null){
							continue;
						}else
						logger.error(acc);
						logger.error("Error en registro '" + acc.getEXTERNAL_ID__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
						messages.append("Error en registro '" + acc.getEXTERNAL_ID__c() + "': ");
						messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
						success = false;
					}	
				}
			}
			logger.info("success:" + totalSuccess + ", errors:" + totalError);
			messages.append(" \n   Total de Regiones  \n\n");
			
			messages.append(" Total de registros procesados:" + total + "\n");
			messages.append(" Total de registros exitosos:" + totalSuccess+ "\n");
			messages.append(" Total de registros erroneos:" + totalError + "\n");
			
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
	
	
	private Boolean store_d(){
	//------------------------------DIVISIONES---------------------//
		
		Boolean success =true;
		
		List<Account> listSFObjs = new ArrayList<Account>(mapDivision.values());// solo los valores
		Account[] arrSFObjs = new Account[listSFObjs.size()];//n�mero de elementos 
		arrSFObjs = listSFObjs.toArray(arrSFObjs);
		logger.info(listSFObjs);
		
		SForceClient sfc = new SForceClient();
		try {
			logger.debug("To upsert:" + arrSFObjs.length);
		
			Integer total_d = arrSFObjs.length;
			Integer totalSuccess_d = 0;
			Integer totalUpdated_d = 0;
			Integer totalInserted_d = 0;
			Integer totalError_d = 0;
			
			Integer index_d=-1;
			//Upsert Cuentas -> DIVISIONES
			UpsertResult[] results_d = sfc.upsertObjects("EXTERNAL_ID__c" ,arrSFObjs);
				if(results_d!=null){
					results_d.hashCode();
					for(UpsertResult result:results_d){
					index_d++;
					if(result==null){
						continue;
					}	
					if(result.isSuccess()){
						totalSuccess_d++;
						if(result.isCreated()){
							totalInserted_d++;
						}else{
							totalUpdated_d++;
							logger.info(totalUpdated_d);
						}
						continue;
					}
					com.sforce.soap.enterprise.Error[] errors = result.getErrors();
					if(errors==null){
						continue;
					}
					totalError_d++;
					Account acc = (Account)arrSFObjs[index_d];
					for(com.sforce.soap.enterprise.Error error:errors){
						if(errors==null){
							continue;
						}else
						logger.error(acc);
						logger.error("Error en registro '" + acc.getEXTERNAL_ID__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
						messages.append("Error en registro '" + acc.getEXTERNAL_ID__c() + "': ");
						messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
						success = false;
					}	
				}
			}
				HashMap <String,Contact> mapaAsociado =  new HashMap<String, Contact>();
				/* 3  ASIGNACION DE NOMBRE DE CTA A CONTACTOS */
				for (Account acc:mapDivision.values()){
					String key = acc.getGerente__r().getRegistro__c();
					if(!mapaAsociado.containsKey(key)){
						Contact contact = new Contact();
						contact.setRegistro__c(key);
						Account padre= new Account();
						padre.setEXTERNAL_ID__c(acc.getEXTERNAL_ID__c());
						contact.setAccount(padre);
						mapaAsociado.put(key, contact);
					}
				}
				ArrayList<Contact> asociado = new ArrayList<Contact>(mapaAsociado.values());
				Contact[] arraySocio = new Contact[asociado.size()];
				asociado.toArray(arraySocio);
				
				UpsertResult[]fin = sfc.upsertObjects("Registro__c",arraySocio);
				logger.info(fin.hashCode());
				if(fin!=null){
					results_d.hashCode();
					index_d=0;
					totalSuccess_d=0;
					totalUpdated_d=0;
					for(UpsertResult result:fin){
					index_d++;
					if(result==null){
						continue;
					}	
					if(result.isSuccess()){
						totalSuccess_d++;
						if(result.isCreated()){
							totalInserted_d++;
						}else{
							totalUpdated_d++;
						}
						continue;
					}
					com.sforce.soap.enterprise.Error[] errors = result.getErrors();
					if(errors==null){
						continue;
					}
					totalError_d++;
					Account acc = (Account)arrSFObjs[index_d];
					for(com.sforce.soap.enterprise.Error error:errors){
						if(errors==null){
							continue;
						}else
						logger.error(acc);
						logger.error("Error en registro '" + acc.getEXTERNAL_ID__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
						messages.append("Error en registro '" + acc.getEXTERNAL_ID__c() + "': ");
						messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
						success = false;
					}	
				}
			}
			logger.info("success:" + totalSuccess_d + ", errors:" + totalError_d);
			messages.append("\n   Total de Divisiones    \n\n");
			
			messages.append(" Total de registros procesados:" + total_d + "\n");
			messages.append(" Total de registros exitosos:" + totalSuccess_d + "\n");
			messages.append(" Total de registros erroneos:" + totalError_d + "\n");

			messages.append(" Total de registros actualizados:" + totalUpdated_d + "\n");
			messages.append(" Total de registros insertados:" + totalInserted_d + "\n");
			
			
		} catch (Exception e) {
			logger.error("Error actualizando registros:" + e.getMessage());
			messages.append("Error subiendo la informaci�n a Salesforce.com \n");
			messages.append(e.getMessage());
			success = false;
		}
		return success;
	}	
	

	private Boolean store_z(){
		//------------------------------ZONAS---------------------//
			
			Boolean success =true;
			
			List<Account> listSFObjs = new ArrayList<Account>(mapZona.values());// solo los valores
			Account[] arrSFObjs = new Account[listSFObjs.size()];//n�mero de elementos 
			listSFObjs.toArray(arrSFObjs);
			
			SForceClient sfc = new SForceClient();
			try {
				logger.debug("To upsert:" + arrSFObjs.length);
			
				Integer total_z = arrSFObjs.length;
				Integer totalSuccess_z = 0;
				Integer totalUpdated_z = 0;
				Integer totalInserted_z = 0;
				Integer totalError_z = 0;
			
				
				Integer index_z=-1;
				//Upsert Cuentas -> Zona
				UpsertResult[] results_z = null;
				try{
					results_z = sfc.upsertObjects("EXTERNAL_ID__c" ,arrSFObjs);
				}catch(Exception e){
					logger.error("Error actualizando zonas:" + e.getMessage());
				}
					if(results_z!=null){
						results_z.hashCode();
						for(UpsertResult result:results_z){
						index_z++;
						if(result==null){
							continue;
						}	
						if(result.isSuccess()){
							totalSuccess_z++;
							if(result.isCreated()){
								totalInserted_z++;
							}else{
								totalUpdated_z++;
							}
							continue;
						}
						com.sforce.soap.enterprise.Error[] errors = result.getErrors();
						if(errors==null){
							continue;
						}
						totalError_z++;
					
						Account acc = (Account)arrSFObjs[index_z];
						for(com.sforce.soap.enterprise.Error error:errors){
							if(errors==null){
								continue;
							}else
							logger.error("Error en registro '" + acc.getEXTERNAL_ID__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
							messages.append("Error en registro '" + acc.getEXTERNAL_ID__c() + "': ");
							messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
							success = false;
						}	
					}
						
				}
					HashMap <String,Contact> mapaAsociado =  new HashMap<String, Contact>();
					/* 3  ASIGNACION DE NOMBRE DE CTA A CONTACTOS */
					for (Account acc:mapZona.values()){
						String key = acc.getGerente__r().getRegistro__c();
						if(!mapaAsociado.containsKey(key)){
							Contact contact = new Contact();
							contact.setRegistro__c(key);
							Account padre= new Account();
							padre.setEXTERNAL_ID__c(acc.getEXTERNAL_ID__c());
							contact.setAccount(padre);
							mapaAsociado.put(key, contact);
						}else{
							logger.info("Gerente de zona existente:" + key);
						}
						
					}
					
					
					ArrayList<Contact> asociado = new ArrayList<Contact>(mapaAsociado.values());
					Contact[] arraySocio = new Contact[asociado.size()];
					asociado.toArray(arraySocio);
					
					
					UpsertResult[]fin = sfc.upsertObjects("Registro__c",arraySocio);
					if(fin!=null){
						results_z.hashCode();
						index_z=0;
						totalSuccess_z=0;
						totalUpdated_z=0;
												
						for(UpsertResult result_z:fin){
						index_z++;
						if(result_z==null){
							continue;
						}	
						if(result_z.isSuccess()){
							totalSuccess_z++;
							if(result_z.isCreated()){
								totalInserted_z++;
							}else{
								totalUpdated_z++;
							}
							continue;
						}
						com.sforce.soap.enterprise.Error[] errors = result_z.getErrors();
						if(errors==null){
							continue;
						}
						totalError_z++;
						Contact acc = arraySocio[index_z];
						for(com.sforce.soap.enterprise.Error error:errors){
							if(errors==null){
								continue;
							}else
							logger.error(acc);
							logger.error("Error en registro '" + acc.getRegistro__c() + "': " + error.getMessage() + " (" + error.getStatusCode() + ")");
							messages.append("Error en registro '" + acc.getRegistro__c() + "': ");
							messages.append(error.getMessage() + " (" + error.getStatusCode() + ") \n");
							success = false;
						}	
					}
				}
				logger.info("success:" + totalSuccess_z + ", errors:" + totalError_z);
				messages.append("\n\n     Total de Zonas     \n\n");
				messages.append(" Total de registros procesados:" + total_z + "\n");
				logger.info(total_z);
				messages.append(" Total de registros exitosos:" + total_z + "\n");
				messages.append(" Total de registros erroneos:" + totalError_z + "\n");
				logger.info(totalSuccess_z);
				messages.append(" Total de registros actualizados:" + total_z + "\n");
				logger.info(totalUpdated_z);
				messages.append(" Total de registros insertados:" + totalInserted_z + "\n");
				
			} catch (Exception e) {
				logger.error("Error actualizando registros:" + e.getMessage());
				messages.append("Error subiendo la informaci�n a Salesforce.com \n");
				messages.append(e.getMessage());
				success = false;
			}
			return success;
		}	
	}
