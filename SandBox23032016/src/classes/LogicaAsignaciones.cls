/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Contiene la lógica para el procesamiento de las asignaciones(entitlements)
********************************************************************************/
public class LogicaAsignaciones {
    
    public static void beforeInsert() {
        Map<String, String> mapEnt = new Map<String, String>();
        for(SObject obj:Trigger.new){
            Entitlement ent = (Entitlement)obj;
            String key = ent.Categoria__c + '_' + ent.Tipificacion__c + '_' + ent.Sub_Tipificacion__c;
            mapEnt.put(key, null);
        }
        
        if(mapEnt.size()>0){
            mapEnt = exists(mapEnt.keySet());
        }
        
        for(SObject obj:Trigger.new){
            Entitlement ent = (Entitlement)obj;
            String key = ent.Categoria__c + '_' + ent.Tipificacion__c + '_' + ent.Sub_Tipificacion__c;
            String value = mapEnt.get(key);
            if(value==null){
                continue;
            }
            ent.addError('Ya existe la combinación "Categoría / Tipificación", favor de verificar');
        }
    }
    
    public static void beforeUpdate(){
        Map<String, List<Entitlement>> toVerify = new Map<String, List<Entitlement>>();
        for(SObject obj:Trigger.new){
            Entitlement ent = (Entitlement)obj;
            Entitlement entOld = (Entitlement)Trigger.oldMap.get(ent.Id);
            if(ent.Categoria__c!= entOld.Categoria__c || ent.Tipificacion__c != entOld.Tipificacion__c ||
              ent.Sub_Tipificacion__c != entOld.Sub_Tipificacion__c){
            	String key = ent.Categoria__c + '_' + ent.Tipificacion__c;
                List<Entitlement> listEnt = toVerify.get(key);
                if(listEnt==null){
                    listEnt = new List<Entitlement>();
                    toVerify.put(key, listEnt);
                }
            	listEnt.add(ent);
            }
        }
        
        if(toVerify.isEmpty()){
            return;
        }
        
        Map<String, String> mapEnt = exists(toVerify.keySet());
        for(SObject obj:Trigger.new){
            Entitlement ent = (Entitlement)obj;
            String key = ent.Categoria__c + '_' + ent.Tipificacion__c + '_' + ent.Sub_Tipificacion__c;
            String value = mapEnt.get(key);
            List<Entitlement> listEnt = toVerify.get(key);
            if(value==null || listEnt==null){
                continue;
            }
            Boolean alreadyExists = false;
            for(Entitlement eEnt:listEnt){
                if(value!=eEnt.Id){
                    ent.addError('Ya existe la combinación "Categoría / Tipificación / Sub-Tipificación", favor de verificar');
                    break;
                }
            }
        }
    }

    public static Map<String, String> exists(Set<String> keys){
        List<Entitlement> listEnt = [Select Id, Unique_ID__c From Entitlement
                                    Where Status = 'Active'
                                    And Unique_ID__c in :keys];
        Map<String, String> mapEnt = new Map<String, String>();
        for(Entitlement ent:listEnt){
            System.debug('keymap:' + ent.Unique_ID__c);
            mapEnt.put(ent.Unique_ID__c, ent.Id);
        }
        return mapEnt;
    }
}