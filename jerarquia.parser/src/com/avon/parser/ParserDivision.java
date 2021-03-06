package com.avon.parser;

import java.io.File;
import java.util.HashMap;

import org.apache.log4j.Logger;

import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.User;

public class ParserDivision extends RootParser{
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	private HashMap<String, Account> mapParent;
	private HashMap<String, Account> mapDivision;
	private String rtDivision;
	private StringBuffer errors = new StringBuffer();
	
	public void setupParser() {
	}
	
	public String getErrors(){
		return errors.toString();
	}
	
	public ParserDivision(File fDivision, String rtDivision, HashMap<String, Account> mapParent) {
		super(fDivision);
		this.rtDivision = rtDivision;
		this.mapParent = mapParent;
	}

	@Override
	void item(String[] campos) {
		
		Account division = new Account();
		division.setName(campos[2].trim());
		division.setEXTERNAL_ID__c(campos[2].trim());
		division.setRecordTypeId(rtDivision);
		
		String keyParent = campos[0].trim();
		Account parent = mapParent.get(keyParent);
		if(parent!=null){
			Account parentTmp = new Account();
			parentTmp.setEXTERNAL_ID__c(parent.getEXTERNAL_ID__c());
			division.setParent(parentTmp);
		}else{
			logger.error("Región " + keyParent + " no encontrada para la division:" + division.getName()+ "\n");
			errors.append("Región " + keyParent + " no encontrada para la division:" + division.getName()+ "\n");
		}
		
		User owner = new User();
		owner.setESTRUCTURA_ID__c(campos[6].trim());
		division.setOwner(owner);
		
		if(mapDivision==null){
			mapDivision = new HashMap<String, Account>();
		}
		String key = campos[1].trim();
		mapDivision.put(key, division);
	}
	
	public HashMap<String, Account> getMapDivision() {
		return mapDivision;
	}
	
		public HashMap <String, Account> getmapParent(){
			return mapParent;
		}

		
}
	
