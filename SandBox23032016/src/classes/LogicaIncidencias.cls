/*******************************************************************************
Copyright © 2014 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Clase que contiene la lógica de negocio de Avon para el manejo de incidencias
********************************************************************************/
public class LogicaIncidencias {
	
	public static void copyRegion(){
		Map<String, String> mapAccounts = new Map<String, String>();
		for(SObject obj:Trigger.new){
            Case myCase = (Case)obj;
            System.debug('Case Account:' + myCase.AccountId);
            System.debug('Case Contact:' + myCase.ContactId);
            mapAccounts.put(myCase.AccountId, null);
		}
		
		Map<String, String> mapRegions = IncidenciasDAO.getRegions(mapAccounts.keyset());
		if(mapRegions.size()==0){
			return;
		}
		
		for(SObject obj:Trigger.new){
            Case myCase = (Case)obj;
            String region = mapRegions.get(myCase.AccountId);
            System.debug('Finding:' + myCase.AccountId + ', ' + region);
            
            if(region==null){
            	continue;
            }
			if(myCase.Id!=null){
				Case olderVersion = (Case)Trigger.oldMap.get(myCase.Id);
		        if(olderVersion!=null){
		        	if(myCase.ContactId!=olderVersion.ContactId){
		        		myCase.Region__c = region;
		        		continue;
		        	}
		        }
			}
			
            myCase.Region__c = region;
            
		}
	}
    
    public static void assingEntitlement() {
        Map<String, String> mapEntitlements = new Map<String, String>();
        for(SObject obj:Trigger.new){
            Case myCase = (Case)obj;
            if(myCase.Id==null){
                String key = myCase.Categoria__c + '_' + myCase.Tipificacion__c + '_';
                if(myCase.Sub_Tipificacion__c!=null)
                    key += myCase.Sub_Tipificacion__c;
                System.debug('key1:' + key);
                mapEntitlements.put(key, null);
            }
        }
        
        if(mapEntitlements.isEmpty()){
            return;
        }
        
        mapEntitlements = LogicaAsignaciones.exists(mapEntitlements.keySet());
        for(SObject obj:Trigger.new){
            Case myCase = (Case)obj;
            if(myCase.Id==null){
                String key = myCase.Categoria__c + '_' + myCase.Tipificacion__c + '_';
                if(myCase.Sub_Tipificacion__c!=null)
                    key += myCase.Sub_Tipificacion__c;
                
                String value = mapEntitlements.get(key);
                if(value!=null){
                    myCase.EntitlementId = value;
                }
            }
        }
    }
    
    public static void caseEscalation(){
        List<String> listCases = new List<String>();
        for(SObject obj:Trigger.new){
            Case myCase = (Case)obj;
            if(myCase.Id==null){
                continue;
            }
            Case olderVersion = (Case)Trigger.oldMap.get(myCase.Id);
            if(olderVersion==null){
                continue;
            }
            if(myCase.IsEscalated && !olderVersion.IsEscalated && !myCase.IsClosed){
                listCases.add(myCase.Id);
            }
        }
        
        if(listCases.size()==0){
            return;
        }
        
        List<CaseMilestone> milestones = IncidenciasDAO.getCaseMilestones(listCases);
        if(milestones.size()==0){
            return;
        }
        
        for(CaseMilestone cm:milestones){
            cm.CompletionDate = System.now();
        }
        
        update milestones;
    }

    public static void closeMilestones(){
        List<String> listCases = new List<String>();
        for(SObject obj:Trigger.new){
            Case myCase = (Case)obj;
            if(myCase.Id==null){
                continue;
            }
            if(myCase.Status!='Cerrado' && myCase.Status!='Atendida'){
                continue;
            }
            listCases.add(myCase.Id);
        }
        
        if(listCases.size()==0){
            return;
        }
        
        List<CaseMilestone> milestones = IncidenciasDAO.getCaseMilestones(listCases);
        if(milestones.size()==0){
            return;
        }
        
        for(CaseMilestone cm:milestones){
            cm.CompletionDate = System.now();
        }
        
        update milestones;
    }
    
}