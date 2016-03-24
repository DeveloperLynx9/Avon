/*******************************************************************************
Copyright © 2014 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Unit Test for ctrlAvoncti
********************************************************************************/
@isTest(SeeAllData = true)
public class ctrlAvoncti_UT {

    public static final String RTYPE_REGION = retrieveRT('Account', 'Región');
    public static final String RTYPE_DIVISION = retrieveRT('Account', 'División');
    public static final String RTYPE_ZONA = retrieveRT('Account', 'Zona');
    
    public static final String RTYPE_REP = retrieveRT('Contact', 'Representante');
    public static final String RTYPE_GTE = retrieveRT('Contact', 'Gerente');

    static testMethod void testError(){
        
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
        
        ApexPages.StandardController sc = new ApexPages.standardController(rep);
        ctrlAvoncti ctrl = new ctrlAvoncti(sc);
        ctrl.redirect();
        
        PageReference pageRef = Page.avoncti;
        Test.setCurrentPage(pageRef);
        ApexPages.currentPage().getParameters().put('registro', 'XXXXXXXX');
        ApexPages.currentPage().getParameters().put('phone', '12345');
        
        ApexPages.StandardController sc2 = new ApexPages.standardController(rep);
        ctrlAvoncti ctrl2 = new ctrlAvoncti(sc2);
		ctrl2.redirect();
        
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
        	rep.Phone = '12345';
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