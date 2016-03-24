/*******************************************************************************
Copyright © 2016 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Lógica para consultar los datos de la representante que envía el
			sistema telefónico.
********************************************************************************/
public class ctrlAvoncti {

    public Contact contacto {get;set;}
    public String tel{get;set;}
    public List<Contact> results{get;set;}
    
    public ctrlAvoncti(ApexPages.StandardController controller){

        String registro = ApexPages.currentPage().getParameters().get('registro');
        tel = ApexPages.currentPage().getParameters().get('phone');
        
        if(registro==null){
            //ApexPages.Message myMsg = new ApexPages.Message(ApexPages.Severity.ERROR, 'El parámetro "Registro" es nulo');
            //ApexPages.addMessage(myMsg);
            return;
        }
        if(registro.length()==0){
            //ApexPages.Message myMsg = new ApexPages.Message(ApexPages.Severity.ERROR, 'El parámetro "Registro" esta vacío');
            //ApexPages.addMessage(myMsg);
            return;
        }
        
        contacto = queryContact(registro);
        
        if(contacto==null){
            //ApexPages.Message myMsg = new ApexPages.Message(ApexPages.Severity.ERROR, 'El registro no existe');
            //ApexPages.addMessage(myMsg);
            return;
        }
        

    }
    
    public PageReference redirect(){
        if(contacto!=null){
            PageReference pageRef = new PageReference('/' + contacto.Id);
            pageRef.setRedirect(true);
            return pageRef;
        }
        
        results = queryByPhone(tel);
        
        return null;
    }
    
    private List<Contact> queryByPhone(String phone){
        return [Select Id, Name, Registro__c, Phone, MobilePhone, HomePhone 
                From Contact
               Where RecordType.Name = 'Representante'
                And Registro__c != NULL
                And(Phone like :phone or MobilePhone like :phone or HomePhone like :phone)
                LIMIT 20];
    }
    
    private Contact queryContact(String registro){
        List<Contact> contacts = [Select Id, Name From Contact 
                                 Where Registro__c = :registro];
        if(contacts.size()>0){
            return contacts.get(0);
        }
        
        return null;
    }
}