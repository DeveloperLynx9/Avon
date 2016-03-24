/*******************************************************************************
Copyright © 2014 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Unit Test for ctrlSelfService
********************************************************************************/
@isTest(SeeAllData = true)
public class ctrlSelfService_UT {

    public static final String RTYPE_REGION = retrieveRT('Account', 'Región');
    public static final String RTYPE_DIVISION = retrieveRT('Account', 'División');
    public static final String RTYPE_ZONA = retrieveRT('Account', 'Zona');
    
    public static final String RTYPE_REP = retrieveRT('Contact', 'Representante');
    public static final String RTYPE_GTE = retrieveRT('Contact', 'Gerente');

    static testMethod void testError(){
        
        ApexPages.StandardController scError = new ApexPages.standardController(new Case());
		ctrlSelfService ctrlError = new ctrlSelfService(scError);
        ctrlError.save();

        PageReference pageRefError = Page.selfservice;
        Test.setCurrentPage(pageRefError);
        ApexPages.currentPage().getParameters().put('registro', 'NA');
        
        ApexPages.StandardController scError2 = new ApexPages.standardController(new Case());
		ctrlSelfService ctrlError2 = new ctrlSelfService(scError2);
        ctrlError2.save();
        
        PageReference pageRef1 = Page.selfservice;
        Test.setCurrentPage(pageRef1);
        ApexPages.currentPage().getParameters().put('zona', 'NA');
        
        ApexPages.StandardController sc1 = new ApexPages.standardController(new Case());
		ctrlSelfService ctrl1 = new ctrlSelfService(sc1);
        PageReference result = ctrl1.save();
        
    }

    static testMethod void testSucess(){
        
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
        // Representante
        PageReference pageRef1 = Page.selfservice;
        Test.setCurrentPage(pageRef1);
        ApexPages.currentPage().getParameters().put('registro', rep.Registro__c);
        
        ApexPages.StandardController sc1 = new ApexPages.standardController(new Case());
		ctrlSelfService ctrl1 = new ctrlSelfService(sc1);
        PageReference result = ctrl1.save();
        
        ctrl1.myCase.Categoria__c = 'Operadores';
        ctrl1.myCase.Tipificacion__c = 'Quejas atención';
        ctrl1.myCase.Sub_Tipificacion__c = '';
        ctrl1.myCase.Subject = 'Test Rep';
        ctrl1.myCase.Description = 'Description Rep';
        
        PageReference result1 = ctrl1.save();
    }

    static testMethod void testZona(){
        
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
        
        // Representante
        PageReference pageRef1 = Page.selfservice;
        Test.setCurrentPage(pageRef1);
        ApexPages.currentPage().getParameters().put('zona', zona.Name);
        
        ApexPages.StandardController sc1 = new ApexPages.standardController(new Case());
		ctrlSelfService ctrl1 = new ctrlSelfService(sc1);
        PageReference result = ctrl1.save();
        
        ctrl1.myCase.Categoria__c = 'Operadores';
        ctrl1.myCase.Tipificacion__c = 'Quejas atención';
        ctrl1.myCase.Sub_Tipificacion__c = '';
        ctrl1.myCase.Subject = 'Test Rep';
        ctrl1.myCase.Description = 'Description Rep';
        
        PageReference result1 = ctrl1.save();
        
        if(result1!=null){
            Test.setCurrentPage(result1);
            ApexPages.StandardController scDisplay = new ApexPages.standardController(new Case());
            ctrlSelfService ctrlDisplay = new ctrlSelfService(scDisplay);
        }
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