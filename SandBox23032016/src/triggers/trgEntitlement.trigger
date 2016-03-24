/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Disparador de asignaciones
********************************************************************************/
trigger trgEntitlement on Entitlement (before insert, before update) {
	EntitlementHandler.onTrigger();
}