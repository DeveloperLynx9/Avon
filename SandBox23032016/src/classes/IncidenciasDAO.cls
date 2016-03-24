/*******************************************************************************
Copyright © 2014 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Clase que contiene los queries a Salesforce.com
********************************************************************************/
public class IncidenciasDAO {
	
	public static Map<String, String> getRegions(Set<String> accountId){
		List<Account> listAccounts = [Select Id, Name, RecordType.Name, 
			Parent.Name, Parent.Parent.Name
			From Account
			Where Id in :accountId];
		
		Map<String, String> mapRegions = new Map<String, String>();
		for(Account acc:listAccounts){
			String region = null;
			if(acc.RecordType.Name=='Zona'){
				region = acc.Parent.Parent.Name;
			}
			if(acc.RecordType.Name=='Division'){
				region = acc.Parent.Name;
			}
			if(acc.RecordType.Name=='Region'){
				region = acc.Name;
			}
			System.debug('Region:' + region);
			if(region==null){
				continue;
			}
			mapRegions.put(acc.Id, region);
		}
		
		return mapRegions;
	}
    
    public static List<CaseMilestone> getCaseMilestones(List<String> listCases){
        return [Select c.Id, c.CompletionDate, c.CaseId 
                From CaseMilestone c
                Where isCompleted = false
                And c.CaseId in :listCases];
        
    }
    
    public static List<CaseMilestone> getCaseMilestone(String caseId){
        return [Select c.Id, c.CompletionDate, c.CaseId 
                From CaseMilestone c
                Where isCompleted = false
                And c.CaseId = :caseId];
    }    
}