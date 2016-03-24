package com.avon.parser;

import java.io.File;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.User;

public class ParserZona extends RootParser{
	private Logger logger = Logger.getLogger(this.getClass());
	private HashMap<String, Account> mapZona;
	private HashMap<String, User> mapaGerentes;
	
	private String rtZona;
	
	public void setupParser() {
	}
	
	public ParserZona(File fZona,String rtZona) {
		super(fZona);
		this.rtZona= rtZona;
		
	}

	@Override
	void item(String[] campos) {
		
		Account zona = new Account();
			
		zona.setName(campos[1].trim());
		zona.setEXTERNAL_ID__c('Z'+campos[0].trim());
		zona.setRecordTypeId(rtZona);
		
			String ExternalId = "";
			try {
				ExternalId = StringUtils.leftPad(campos[3].trim(), 8, "0");
				logger.info("Registro: " + ExternalId);
				
			} catch (Exception e) {
				logger.error(ExternalId + "Error en ficha:" + e.toString() );
			}
		
			User gerente = new User();
			String apellido =campos[4].trim();
			if(apellido.length()>80){
				apellido= apellido.substring(0, 80);
			}
			gerente.setFirstName( campos[4].trim());
			gerente.setLastName( campos[5].trim() );
			gerente.setEmail(campos[6]);
						
			if(mapaGerentes==null){
				mapaGerentes = new HashMap<String, User>();
			}
			
			mapaGerentes.put(gerente.getEmail(), gerente);
			
			User owner = new User();
			owner.setEmail(campos[6].trim());
			zona.setOwner(owner);
			
			if(mapZona==null){
				mapZona = new HashMap<String, Account>();
			}
			mapZona.put(zona.getEXTERNAL_ID__c(), zona);
				
		}

	public HashMap<String, Account> getMapZona() {
		return mapZona;
	}

	public HashMap<String, User> getMapaGerentes() {
		return mapaGerentes;
	}

}
	
