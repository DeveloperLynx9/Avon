/*******************************************************************************
Copyright © 2014 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Controlador para el flujo de las incidencias
********************************************************************************/
public class ctrlGeneralFlowForCases {
    public String representanteId {get;set;}
    public String zonaId {get;set;}
    public String zonaNombre {get;set;}
    
    public Flow.Interview.Avon_Ejemplo myFlow{get;set;}
    public String recordType {get;set;}
    
    public ctrlGeneralFlowForCases(ApexPages.StandardController controller){
        representanteId = ApexPages.currentPage().getParameters().get('representanteId');
        zonaId = ApexPages.currentPage().getParameters().get('zonaId');
        zonaNombre = ApexPages.currentPage().getParameters().get('zonaNombre');
    }
    
    public PageReference getFinish(){
        if(myFlow != null) recordType = myFlow.vRecordType;
        
        Flujo_General__c conf = Flujo_General__c.getOrgDefaults();
        
        String urlZona = '';
        if(zonaId!=null && zonaNombre!=null){
            if(zonaId!='' && zonaNombre!=''){
                urlZona = '&' + conf.Campo_Nombre_Zona__c + '=' + zonaNombre + '&' +
                    conf.Campo_Nombre_Zona__c + '_lkid=' + zonaId + '&retURL=%2F' + zonaId;                
            }
        }
        
        String urlRepresentante = '';
        if(representanteId!=null && representanteId!=''){
            urlRepresentante = '&def_contact_id=' + representanteId +
                '&retURL=%2F' + representanteId;
            if(zonaId!=null && zonaId!=''){
                urlRepresentante = '&' + conf.Campo_Nombre_Zona__c + '_lkid=' + zonaId;
            }
        }
        
        String url = '500/e?ent=Case&RecordType=' + recordType + urlZona + urlRepresentante;
           
        return new PageReference('/' + url);
    }

}