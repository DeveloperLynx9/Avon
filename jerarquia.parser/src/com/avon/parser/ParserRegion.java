package com.avon.parser;

import java.io.File;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.User;


public class ParserRegion extends RootParser{
	private Logger logger = Logger.getLogger(this.getClass());
	private HashMap<String, Account> mapRegion;
	private HashMap<String, User> mapaGerentes;
	
	private String rtRegion;
	
	public void setupParser() {
	}
	
	public ParserRegion(File fRegion, String rtRegion) {
		super(fRegion);
		this.rtRegion = rtRegion;
	}

	@Override
	void item(String[] campos) {
		
		Account region = new Account();
			
			region.setName(campos[1].trim());
			region.setEXTERNAL_ID__c('R'+campos[0].trim());
			region.setRecordTypeId(rtRegion);
			
			String ExternalId = "";
			try {
				ExternalId = StringUtils.leftPad(campos[2].trim(), 8, "0");
			} catch (Exception e) {
				logger.error(ExternalId + "Error en ficha:" + e.toString() );
			}
			
			User gerente = new User();
			String apellido =campos[4].trim();
			if(apellido.length()>80){
				apellido= apellido.substring(0, 80);
			}
			gerente.setFirstName( campos[3].trim());
			gerente.setLastName(apellido);
			gerente.setEmail(campos[5].trim());
			
			if(mapaGerentes==null){
				mapaGerentes = new HashMap<String, User>();
			}
			mapaGerentes.put(gerente.getEmail(), gerente);
			
			User owner = new User();
			owner.setEmail(campos[5].trim());
			region.setOwner(owner);
			
			if(mapRegion==null){
				mapRegion = new HashMap<String, Account>();
			}
			mapRegion.put(region.getEXTERNAL_ID__c(), region);
	}
	public HashMap<String, Account> getMapRegion() {
		return mapRegion;
	}
	
	public HashMap<String, User> getMapaGerentes() {
		return mapaGerentes;
	}

}