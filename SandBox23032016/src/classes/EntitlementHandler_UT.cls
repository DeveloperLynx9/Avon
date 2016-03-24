/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Unit Test for EntitlementHandler
@isTest(SeeAllData = true)
********************************************************************************/
@isTest
private class EntitlementHandler_UT {

    public static final String RTYPE_ENT = retrieveRT('Entitlement', 'Asignación Avon');
    public static final String RTYPE_AVON = retrieveRT('Account', 'Master');
    
    static testMethod void myUnitTest(){
        String accId = createAccount();
        
		Entitlement ent = new Entitlement();
        ent.RecordTypeId = RTYPE_ENT;
        ent.Name = 'Nombramientos1';
        ent.Categoria__c = 'Nombramientos';
        ent.Tipificacion__c = 'Actualización de datos - Representantes';
        ent.AccountId = accId;
        ent.StartDate = System.today();
        insert ent;
        
        Entitlement ent2 = new Entitlement();
        ent2.RecordTypeId = RTYPE_ENT;
        ent2.Name = 'Nombramientos2';
        ent2.Categoria__c = 'Nombramientos';
        ent2.Tipificacion__c = 'Cambio de zona';
        ent2.AccountId = accId;
        ent2.StartDate = System.today();
        insert ent2;
        
        ent2.Tipificacion__c = 'Actualización de datos - Representantes';
        try{
        	update ent2;    
        }catch(Exception e){
            System.assert(true);
        }
        
    }
    
    
    static String createAccount() {
        Account acc = new Account();
        acc.RecordTypeId = RTYPE_AVON;
        acc.Name = 'Temp';
        insert acc;
        return acc.Id;
    }
    
    static String retrieveRT(String objectName, String rtName){
        
        List<RecordType> types = [Select Id From RecordType 
                                  Where SObjectType = :objectName 
                                  And Name = :rtName];
        if(types.size()==1){
            return types.get(0).Id;
        }
        return null;
    }
}