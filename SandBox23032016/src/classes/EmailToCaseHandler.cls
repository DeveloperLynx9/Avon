/*******************************************************************************
Copyright © 2016 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Email Service to process a case
********************************************************************************/
global class EmailToCaseHandler implements Messaging.InboundEmailHandler {

    global Messaging.InboundEmailResult handleInboundEmail(Messaging.InboundEmail email, Messaging.InboundEnvelope envelope) {
        
        Case cc = new Case();
        cc.RecordTypeId = '012j0000000x2cn';
        cc.Tipificacion__c = 'Afectaciones';
        cc.Tipo_solicitante__c = 'Gerente Regional';
        cc.Status= 'Nuevo';
        cc.Description = email.plainTextBody;
        
        System.debug('Text:' + email.plainTextBody);
        System.debug('HTML:' + email.htmlBody);
        cc.SuppliedEmail = email.fromAddress;
        cc.SuppliedName = email.fromName;

        cc.Subject = email.subject;
        //cc.Folio_Sistema_Externo__c = '01415825';
        cc.Importe__c = 1200;
        cc.Origin = 'Correo electrónico';
        
        Campania_Avon__c camp = new Campania_Avon__c();
        	camp.External_Id__c = '201605';
        cc.Campania_Avon__r = camp;
        
        Contact rep = new Contact();
        	rep.Registro__c = '01415825';
        cc.Contact = rep;
        
        upsert cc;
        
        System.debug('Case Id:' + cc.Id + ', Case number:' + cc.CaseNumber);
        
        return null;
    }
    
}