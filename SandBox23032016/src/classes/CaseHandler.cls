/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Controlador para el flujo de las incidencias
********************************************************************************/
public class CaseHandler {

    public static void onTrigger(){
        if(Trigger.isBefore){
            if(Trigger.isInsert){
                LogicaIncidencias.assingEntitlement();
            }
            if(Trigger.isUpdate){
                LogicaIncidencias.caseEscalation();
            }
            LogicaIncidencias.copyRegion();
        }
        if(Trigger.isAfter){
        	if(Trigger.isUpdate){
        		LogicaIncidencias.closeMilestones();
        	}
        }
    }
    
}