package com.avon.parser;

import java.io.File;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.Contact;

public class ParserZona extends RootParser{
	private Logger logger = Logger.getLogger(this.getClass());
	private HashMap<String, Account> mapZona;
	private HashMap<String, Contact> mapaGerentes;
	
	private String rtGerente;
	private String rtZona;
	
	public void setupParser() {
	}
	
	public ParserZona(File fZona,String rtGerente,String rtZona) {
		super(fZona);
		this.rtGerente = rtGerente;
		this.rtZona= rtZona;
		
	}

	@Override
	void item(String[] campos) {
		
		Account zona = new Account();
			Account division  =new Account();
			division.setEXTERNAL_ID__c('D' + campos[1].trim());
			zona.setParent(division);
			
			zona.setEXTERNAL_ID__c('Z' + campos[2].trim());
			zona.setName(campos[2]);
			zona.setRecordTypeId(rtZona);
			
			String ExternalId = "";
			try {
				ExternalId = StringUtils.leftPad(campos[3].trim(), 8, "0");
				logger.info("Registro: " + ExternalId);
				
			} catch (Exception e) {
				logger.error(ExternalId + "Error en ficha:" + e.toString() );
			}
		
			Contact gerente = new Contact();
			
			gerente.setRecordTypeId(rtGerente);
			gerente.setRegistro__c(ExternalId );  
			gerente.setFirstName( campos[4].trim());
			gerente.setLastName( campos[5].trim() );
			gerente.setEmail(campos[6]);
						
			if(mapaGerentes==null){
				mapaGerentes = new HashMap<String, Contact>();
			}
			
			mapaGerentes.put(gerente.getRegistro__c(), gerente);
			
			Contact newGerente = new Contact();
			newGerente.setRegistro__c(gerente.getRegistro__c());
			zona.setGerente__r(newGerente);
			
			if(mapZona==null){
				mapZona = new HashMap<String, Account>();
			}
			mapZona.put(zona.getEXTERNAL_ID__c(), zona);
				
		}

	public HashMap<String, Account> getMapZona() {
		return mapZona;
	}

	public HashMap<String, Contact> getMapaGerentes() {
		return mapaGerentes;
	}

}
	
