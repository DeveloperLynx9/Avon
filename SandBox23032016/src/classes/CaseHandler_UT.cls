/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Unit Test for CaseHandler
********************************************************************************/
@isTest(SeeAllData = true)
private class CaseHandler_UT {

    public static final String RTYPE_REGION = retrieveRT('Account', 'Región');
    public static final String RTYPE_DIVISION = retrieveRT('Account', 'División');
    public static final String RTYPE_ZONA = retrieveRT('Account', 'Zona');
    
    public static final String RTYPE_REP = retrieveRT('Contact', 'Representante');
    public static final String RTYPE_GTE = retrieveRT('Contact', 'Gerente');
    
    public static final String RTYPE_MASTER = retrieveRT('Case', 'Master');
    
    static testMethod void myUnitTest(){
        
        Account reg = createRegion();
        Contact gteReg = createGte(reg.Id);
        reg.Gerente__c = gteReg.Id;
        update reg;
        
        Account div = createDiv(reg.Id);
        Contact gteDiv = createGte(div.Id);
        div.Gerente__c = gteDiv.Id;
        update div;
        
        Account zona = createZone(div.Id);
        Contact gteZona = createGte(zona.Id);
        zona.Gerente__c = gteZona.Id;
        update zona;
        
        Contact rep = createRep(zona.Id);
        
        Case myCase = new Case();
            myCase.ContactId = rep.Id;
            myCase.Subject = 'Test Incidencia';
            myCase.RecordTypeId = RTYPE_MASTER;
            myCase.Categoria__c = 'Nombramientos';
            myCase.Tipificacion__c = 'Actualización de datos - Representantes';
        insert myCase;

        Case myCase2 = new Case();
            myCase2.ContactId = rep.Id;
            myCase2.Subject = 'Test Incidencia';
            myCase2.RecordTypeId = RTYPE_MASTER;
        insert myCase2;
        
        //myCase2.ContactId = emp.Id;
        //update myCase2;  
        
        myCase2.IsEscalated = true;
        update myCase2;
        
        myCase2.Status = 'Cerrado';
        update myCase2;
    }
    
    static Account createRegion(){
        Account reg = new Account();
            reg.Name = 'CENTRO';
            reg.RecordTypeId = RTYPE_REGION;
        insert reg;
        return reg;
    }
    
    static Account createDiv(String regId){
        Account div = new Account();
            div.Name = 'PLATINO';
            div.ParentId = regId;
            div.RecordTypeId = RTYPE_DIVISION;
        insert div;
        return div;
    }
    
    static Account createZone(String divId) {
        Account zona = new Account();
            zona.Name = '1130';
            zona.ParentId = divId;
            zona.RecordTypeId = RTYPE_ZONA;
        insert zona;
        return zona;
    }
    
    static Contact createRep(String zonaId){
        Contact rep = new Contact();
            rep.FirstName = 'Rep';
            rep.LastName = 'Lynx9';
            rep.Registro__c = 'XXXXXXXX';
            rep.RecordTypeId = RTYPE_REP;
            rep.AccountId = zonaId;
        insert rep;
        return rep;
    }
    
    static Contact createGte(String accId){
        Contact gte = new Contact();
            gte.FirstName = 'Gte';
            gte.LastName = 'Lynx9';
            gte.RecordTypeId = RTYPE_GTE;
            gte.AccountId = accId;
        insert gte;
        return gte;
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