/*******************************************************************************
Copyright © 2014 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Ayuda a cerrar los eventos de los casos
********************************************************************************/
global class CloseMilestones {

    webservice static void execute(String caseId){
    	if(caseId==null){return;}
        
        List<CaseMilestone> milestones = IncidenciasDAO.getCaseMilestone(caseId);
        if(milestones.size()==0){
            return;
        }
        
        for(CaseMilestone cm:milestones){
            cm.CompletionDate = System.now();
        }
        
        update milestones;
    }
}