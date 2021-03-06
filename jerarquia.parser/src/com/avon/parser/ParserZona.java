package com.avon.parser;

import java.io.File;
import java.util.HashMap;

import org.apache.log4j.Logger;

import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.User;

public class ParserZona extends RootParser{
	
	private Logger logger = Logger.getLogger(this.getClass());
	private HashMap<String, Account> mapParent;
	private HashMap<String, Account> mapZona;
	private StringBuffer errors = new StringBuffer();
	
	private String rtZona;
	
	public void setupParser() {
	}
	
	public String getErrors(){
		return errors.toString();
	}
	
	public ParserZona(File fZona,String rtZona, HashMap<String, Account> mapParent) {
		super(fZona);
		this.rtZona= rtZona;
		this.mapParent = mapParent;
	}

	@Override
	void item(String[] campos) {
		
		Account zona = new Account();
			
		zona.setName(campos[2].trim());
		zona.setEXTERNAL_ID__c(campos[2].trim());
		zona.setRecordTypeId(rtZona);
		
		String keyParent = campos[1].trim();
		Account parent = mapParent.get(keyParent);
		if(parent!=null){
			Account parentTmp = new Account();
			parentTmp.setEXTERNAL_ID__c(parent.getEXTERNAL_ID__c());
			zona.setParent(parentTmp);
		}else{
			logger.error("División: " + keyParent + " no encontrada para la zona:" + zona.getName()+ "\n");
			errors.append("División: " + keyParent + " no encontrada para la zona:" + zona.getName()+ "\n");
		}
		
		User owner = new User();
		owner.setESTRUCTURA_ID__c(campos[6].trim());
		zona.setOwner(owner);
		
		if(mapZona==null){
			mapZona = new HashMap<String, Account>();
		}
		mapZona.put(zona.getEXTERNAL_ID__c(), zona);
	}

	public HashMap<String, Account> getMapZona() {
		return mapZona;
	}

}
	
