package com.avon.parser;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.avon.parser.util.Loader;
import com.sforce.soap.enterprise.sobject.Campania_Avon__c;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.Movimiento__c;

	public class ManParser extends RootParser{
	
				private Logger logger = Logger.getLogger(this.getClass());
				private HashMap<String, Movimiento__c> mapMan;
				private Loader motivos = null;
				private String ivMan;
			
			public void setupParser() {
			}
			
			public ManParser(File MAN, String ivMan) {
				super(MAN);
				this.ivMan=ivMan;
				try{
					motivos = new Loader ("sforce.properties");
				}catch (Exception e){
					logger.error("Error leyendo motivos de las propiedades:" + e.getMessage());
				}
			}
			
			@Override
			void item(String[] campos) {
			
				if (campos.length!=12){
					return; 
				}
				String inicio = campos[0].trim().replace("\"","");
				if(!inicio.equals("02")){
						return ;
						}
				
		 		Movimiento__c ivr = new Movimiento__c();
					
					String registro =StringUtils.leftPad(campos[2].trim().replace("\"",""), 8, '0');
					String key =super.getFile().getName() + registro;

					Contact rep = new Contact();
					rep.setRegistro__c(registro);
					ivr.setRepresentante__r(rep);
					ivr.setRecordTypeId(ivMan);
					
					ivr.setTipo_Modificacion__c("Ficha");
					logger.info("Tipo de Modificación:" + ivr.getTipo_Modificacion__c());
					ivr.setExternal_Id__c(key);
					logger.info("External: " + ivr.getExternal_Id__c());
					
					String motivo = StringUtils.leftPad(campos[5].trim().replace("\"",""),2,"0");
					String motivoValor = null;
					
					if(motivos!=null){
						try{
							motivoValor = motivos.getString("motivo." + motivo);
						}catch(Exception e){
							logger.error("Motivo " + motivo + " no encontrado en properties");
						}
					}
					if(motivoValor==null){
						logger.error("Motivo " + motivo + " no encontrado en properties");
						motivoValor = motivo;
					}
					
					ivr.setMotivo__c(motivoValor);
					logger.info("Motivo: " + ivr.getMotivo__c());

					//Parseo de fecha 
					String sdate = campos[9].trim().replace("\"","");
					Date fechaIVR = null;
					try{
						fechaIVR = super.getDate(sdate, "mm/dd/yyyy");
					}catch(Exception e){
						logger.error("Error parseando la fecha:" + sdate);
					}
					ivr.setFecha_IVR__c(fechaIVR);
					logger.info("Fecha: " + sdate);
					
					
					Calendar cal = Calendar.getInstance();
					cal.setTime(fechaIVR);
					String noCamp= campos[4].trim().replace("\"","");
					
					String aCampania = cal.get(Calendar.YEAR) + StringUtils.leftPad(noCamp, 2, '0');
					Campania_Avon__c cam = new Campania_Avon__c();
					cam.setExternal_Id__c(aCampania);
					ivr.setA_Campania__r(cam);	
					logger.info("A Campaña:" +aCampania);
					
					String dValor = campos[6].trim().replace("\"","");
					Double ddValor = 0.00;
					try{
						ddValor = Double.parseDouble(dValor);
					}catch(Exception e){
						logger.error("Error generando 'de valor':" + e.getMessage());
					}
					ivr.setDe_Valor__c(ddValor);
					logger.info("De valor:" + dValor);
					
					String aValor = campos[7].trim().replace("\"","");
					Double daValor = 0.00;
					try{
						daValor = Double.parseDouble(aValor);
					}catch(Exception e){
						logger.error("Error generando 'a valor':" + e.getMessage());
					}
					ivr.setA_Valor__c(daValor);
					logger.info("A Valor:" + aValor);
					
					ivr.setAutorizacion_IVR__c(campos[10].trim().replace("\"",""));
					ivr.setDigitos__c(campos[11].trim().replace("\"",""));
					
					if(mapMan==null){
						mapMan = new HashMap<String, Movimiento__c>();
					}
					mapMan.put(ivr.getExternal_Id__c(), ivr);
				}	
			
			public HashMap<String, Movimiento__c> getmapMan() {
				return mapMan;
				}
			
			public String getIvMod() {
				return ivMan;
			}
			
			public void setIvMan(String ivMan) {
				this.ivMan = ivMan;
			}
		}
