package com.avon.parser;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sforce.soap.enterprise.sobject.Campania_Avon__c;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.Movimiento__c;


	public class ModParser extends RootParser{
		
	private Logger logger = Logger.getLogger(this.getClass());
	private HashMap<String, Movimiento__c> mapMod;
	
	private String ivMod;

	public void setupParser() {
	}
	
	public ModParser(File MOD, String ivMod) {
		super(MOD);
		this.ivMod=ivMod;
	}
	
	@Override
	void item(String[] campos) {
 		Movimiento__c ivr = new Movimiento__c();
			
			String registro =StringUtils.leftPad(campos[2].trim(), 8, '0');
			//No detecta key 
			String key = super.getFile().getName()+ registro;

			Contact rep = new Contact();
			rep.setRegistro__c(registro);
			ivr.setRepresentante__r(rep);
			ivr.setRecordTypeId(ivMod);
			
			ivr.setTipo_Modificacion__c("COD");
			logger.info("Tipo de Modificación:" + ivr.getTipo_Modificacion__c());
			
			ivr.setExternal_Id_c__c(key);
			logger.info("External:" + ivr.getExternal_Id_c__c());
		
			ivr.setMotivo__c(campos[5].trim());
			logger.info("Motivo: "+ ivr.getMotivo__c());
			
			//Parseo de fecha 
			String sdate = campos[9].trim();
			Date fechaIVR = null;
			try{
				fechaIVR = super.getDate(sdate, "mm/dd/yyyy");
			}catch(Exception e){
				logger.error("Error parseando la fecha:" + sdate);
			}
			ivr.setFecha_IVR__c(fechaIVR);
			logger.info("Fecha:" + sdate);
			
			Calendar cal = Calendar.getInstance();
			cal.setTime(fechaIVR);
			String noCamp = campos[4].trim();
			
			String aCampania = cal.get(Calendar.YEAR) + StringUtils.leftPad(noCamp, 2, '0');
			Campania_Avon__c cam = new Campania_Avon__c();
			cam.setExternal_Id__c(aCampania);
			ivr.setA_Campania__r(cam);
			logger.info("A Campaña:" + aCampania);
			
			String dValor = campos[6].trim();
			Double ddValor = 0.00;
			try{
				ddValor = Double.parseDouble(dValor);
			}catch(Exception e){
				logger.error("Error generando 'de valor':" + e.getMessage());
			}
			ivr.setDe_Valor__c(ddValor);
			logger.info("De valor:" + dValor);
			
			String aValor = campos[7].trim();
			Double daValor = 0.00;
			try{
				daValor = Double.parseDouble(aValor);
			}catch(Exception e){
				logger.error("Error generando 'a valor':" + e.getMessage());
			}
			ivr.setA_Valor__c(daValor);
			logger.info("A Valor:" + aValor);
			
			ivr.setAutorizacion_IVR__c(campos[10].trim());
			logger.info("Autorización: " + campos[10]);
			
			ivr.setDigitos__c(campos[11].trim());
			logger.info("Digitos: " + ivr.getDigitos__c());
					
			if(mapMod==null){
				mapMod = new HashMap<String, Movimiento__c>();
			}
			mapMod.put(ivr.getExternal_Id_c__c(), ivr);
			
		}	
	
	public HashMap<String, Movimiento__c> getmapMod() {
		return mapMod;
		}
	public String getIvMod() {
		return ivMod;
	}
	public void setIvMod(String ivMod) {
		this.ivMod = ivMod;
	}
	
}
