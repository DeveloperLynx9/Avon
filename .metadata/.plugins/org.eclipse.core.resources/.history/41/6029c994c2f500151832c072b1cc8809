package com.avon.parser;

import java.io.File;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.User;

public class ParserDivision extends RootParser{
	private Logger logger = Logger.getLogger(this.getClass());
	private HashMap<String, Account> mapDivision;
	private HashMap<String, User> mapaGerentes;
	
	private String rtDivision;
	
	public void setupParser() {
	}
	
	public ParserDivision(File fDivision, String rtDivision) {
		super(fDivision);
		this.rtDivision = rtDivision;
	}

	@Override
	void item(String[] campos) {
		
		Account division = new Account();
		division.setName(campos[2].trim());
		division.setEXTERNAL_ID__c('D'+campos[1].trim());
		division.setRecordTypeId(rtDivision);
		
		String ExternalId = "";
			try {
				ExternalId = StringUtils.leftPad(campos[3].trim(), 8, "0");
				} catch (Exception e) {
				logger.error(ExternalId + "Error en ficha:" + e.toString() );
			}
			
			User gerente = new User();
			gerente.setFirstName( campos[4].trim());
			gerente.setLastName( campos[5].trim() );
			gerente.setEmail(campos[6]);
			
			if(mapaGerentes==null){
				mapaGerentes = new HashMap<String, User>();
			}
			mapaGerentes.put(gerente.getEmail(), gerente);
			
			User owner = new User();
			owner.setEmail(campos[6].trim());
			division.setOwner(owner);
			
			if(mapDivision==null){
				mapDivision = new HashMap<String, Account>();
			}
			mapDivision.put(division.getEXTERNAL_ID__c(), division);
		}
	
	public HashMap<String, Account> getMapDivision() {
		return mapDivision;
	}
	
	public HashMap<String, User> getMapaGerentes() {
		return mapaGerentes;
	}

}
	
