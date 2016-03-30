package com.avon.parser;

import java.io.File;
import java.util.HashMap;

import com.sforce.soap.enterprise.sobject.Account;
import com.sforce.soap.enterprise.sobject.User;


public class ParserRegion extends RootParser{
	
	private HashMap<String, Account> mapRegion;
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
			region.setEXTERNAL_ID__c(campos[1].trim());
			region.setRecordTypeId(rtRegion);
			
			User owner = new User();
			owner.setESTRUCTURA_ID__c(campos[5].trim());
			region.setOwner(owner);
			
			if(mapRegion==null){
				mapRegion = new HashMap<String, Account>();
			}
			String key = campos[0].trim();
			mapRegion.put(key, region);
	}
	
	public HashMap<String, Account> getMapRegion() {
		return mapRegion;
	}
	
}