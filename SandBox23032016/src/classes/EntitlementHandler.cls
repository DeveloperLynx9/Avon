/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Controlador para el disparador de las asignaciones
********************************************************************************/
public class EntitlementHandler {

    public static void onTrigger(){
        if(Trigger.isBefore){
            if(Trigger.isInsert){
                LogicaAsignaciones.beforeInsert();
            }
        }
        if(Trigger.isBefore){
            if(Trigger.isUpdate){
                LogicaAsignaciones.beforeUpdate();
            }
        }        
    }
}