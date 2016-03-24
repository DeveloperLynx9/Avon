/*******************************************************************************
Copyright © 2014 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Controlador para el flujo de las incidencias
********************************************************************************/
public class ctrlSelfService {
    
    public static final String RTYPE_CASE_REP = getIdByDevName('Case', 'Avon - Web2Case Representante');
    public static final String RTYPE_CASE_GTE = getIdByDevName('Case', 'Avon - Web2Case Gerente');
    
    public Contact contact {get;set;}
    public Account region {get;set;}
    public Account division {get;set;}
    public Account zona {get;set;}
    
    public String caseNumber {get;set;}
    public Boolean display {get;set;}
    
    public Boolean success {get;set;}
    public String origen {get;set;}
    
    public Case myCase {get;set;}

    public ctrlSelfService(ApexPages.StandardController controller){
        myCase = new Case();
        
        success = true;
        String pRegistro = ApexPages.currentPage().getParameters().get('registro');        
        String pZona = ApexPages.currentPage().getParameters().get('zona');
        origen = ApexPages.currentPage().getParameters().get('origen');
        
        caseNumber = ApexPages.currentPage().getParameters().get('caseNumber');
        if(caseNumber==null){
            display=false;
        }else if(caseNumber==''){
            display=false;
        }else{
            display=true;
        }

        if(pRegistro!=null && pRegistro!=''){
            buscarRegistro(pRegistro);
            myCase.RecordTypeId = RTYPE_CASE_REP;
        }else if(pZona!=null && pZona!=''){
         	buscarCuenta(pZona); 
            myCase.RecordTypeId = RTYPE_CASE_GTE;
            myCase.Tipo_solicitante__c = 'Gerente de Zona';
        }
        
        if(contact==null){
            ApexPages.Message myMsg = new ApexPages.Message(ApexPages.Severity.ERROR, 'Los datos no son válidos');
            ApexPages.addMessage(myMsg);
        }
        else{
            myCase.ContactId = contact.Id;    
        }

    }
    
    public PageReference save() {
        if(!isValid()){
            return null;
        }
        
        try{

            //Fetching the assignment rules on case
            AssignmentRule AR = new AssignmentRule();
            AR = [select id from AssignmentRule where SobjectType = 'Case' and Active = true limit 1];
            
            //Creating the DMLOptions for "Assign using active assignment rules" checkbox
            Database.DMLOptions dmlOpts = new Database.DMLOptions();
            dmlOpts.assignmentRuleHeader.assignmentRuleId= AR.id;
            
            myCase.setOptions(dmlOpts);            
			insert myCase; 
            
            myCase = [Select CaseNumber, Id From Case Where Id = :myCase.Id LIMIT 1];
        }
        catch(System.DMLException e){
            ApexPages.addMessages(e);   
            return null;      
        }

        PageReference successPage = new PageReference('/apex/selfservice?caseNumber=' + myCase.CaseNumber);               
        successPage.setRedirect(true);
		return successPage;        
    }
    
    public Boolean isValid(){
        Boolean success = true;
        if(contact==null){
            ApexPages.Message myMsg = new ApexPages.Message(ApexPages.Severity.ERROR, 'Los datos no son válidos');
            ApexPages.addMessage(myMsg);
            success = false;
        }
        
        return success;
    }
    
    public void buscarCuenta(String nombreCuenta){
        List<Account> accounts = [Select Id, Name, RecordType.Name, Gerente__r.FirstName, 
                                  Gerente__r.LastName, ParentId, Parent.Name, Parent.RecordType.Name,
                                  Nombre_Region__c, Gerente__c
								 From Account
                                 Where Name = :nombreCuenta ];
        
        if(accounts.size()!=1){
            ApexPages.addmessage(new ApexPages.message(ApexPages.severity.ERROR,'El ' + nombreCuenta + ' no es válido.'));
            success = false;
        }else {
            Account acc = accounts.get(0);
            if(acc.RecordType.Name=='Zona'){
                zona = acc;
                division = new Account();
                	division.Id = acc.ParentId;
                	division.Name = acc.Parent.Name;
                region = new Account();
                	region.Name = acc.Nombre_Region__c;
            }else if(acc.RecordType.Name=='División'){
                division = acc;
                region = new Account();
                	region.Id = acc.ParentId;
                	region.Name = acc.Parent.Name;
            }else{
                region = acc;
            }
            
            contact = new Contact();
            	contact.Id = acc.Gerente__c;
            	contact.FirstName = acc.Gerente__r.FirstName;
            	contact.LastName = acc.Gerente__r.LastName;
        }
    }
    
    public void buscarRegistro(String registro){
        List<Contact> contacts = [Select Id, FirstName, LastName, RecordType.Name, AccountId, Account.Name,
                              Division__c, Region__c, Registro__c
                             From Contact
                             Where Registro__c = :registro];
        if(contacts.size()!=1){
            ApexPages.addmessage(new ApexPages.message(ApexPages.severity.ERROR,'El registro: ' + registro + ' no es válido.'));
            success = false;
        }else {
            contact = contacts.get(0);
            zona = new Account();
            	zona.Id = contact.AccountId;
            	zona.Name = contact.Account.Name;
            division = new Account();
            	division.Name = contact.Division__c;
            region = new Account();
            	region.Name = contact.Region__c;
        }       
    }
    
    private static String getIdByDevName(String objName, String rtName){
		return [Select r.Id, r.DeveloperName
                From RecordType r 
                where sobjecttype=:objName 
                and name = :rtName
            	LIMIT 1].Id;
    }
    
}