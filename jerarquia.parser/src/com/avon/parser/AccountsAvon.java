package com.avon.parser;

//import java.io.File;
import java.util.HashMap;
import java.util.Map;

//import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

import com.salesforce.SForceClient;
import com.sforce.soap.enterprise.Query;
import com.sforce.soap.enterprise.sobject.Account;
/*import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.Search;
import com.sforce.soap.enterprise.SearchRecord;
import com.sforce.soap.enterprise.SearchResult;
import com.sforce.soap.enterprise.SoapBindingStub;*/
import com.sforce.soap.enterprise.sobject.SObject;

public class AccountsAvon {
	private Logger logger = Logger.getLogger(this.getClass());
	// ExternalId, AccountId
	Map<String, String> mapAccounts;
	
	public AccountsAvon(){
		mapAccounts = new HashMap<String, String>();
		try {
			getAccounts();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getZonaId(String EXTERNAL_ID__c){
		return mapAccounts.get(EXTERNAL_ID__c);
	}

	private void getAccounts() throws Exception
	{
		StringBuffer sql = new StringBuffer();
		
		sql.append("Select a.Id, a.External_ID__c From Account a where a.External_ID__c != '' And a.RecordType.Name = 'Zona' ");
		
		logger.info(sql.toString());
		
		Query q = new Query();
		q.setQueryString(sql.toString());
		
		SForceClient sfc = new SForceClient();
		
		SObject objects[] = sfc.querySObjects(q);
		
		if(objects == null)
			throw new Exception("Error al obtener 'Accounts'" );

		logger.info("Accounts length=" +objects.length);
		
		for(int i=0;i<objects.length;i++)
		{
			if(  objects[i] instanceof com.sforce.soap.enterprise.sobject.Account )
			{
				Account acc = (Account)objects[i];
				//logger.info(acc.toString());
				
				if(acc != null)
				{
					//logger.info("externalid=" + acc.getEXTERNAL_ID__c());
					this.mapAccounts.put(acc.getEXTERNAL_ID__c(), acc.getId());
				}
			}
		}
	}
}
