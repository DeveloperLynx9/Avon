/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Disparador de incidencias
********************************************************************************/
trigger trgCase on Case (before insert, before update, after insert, after update) {
    CaseHandler.onTrigger();
}