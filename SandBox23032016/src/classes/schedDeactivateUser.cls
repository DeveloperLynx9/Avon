/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Schedulable class for deactivate users
********************************************************************************/
global class schedDeactivateUser implements Schedulable{
           
    global void execute(SchedulableContext sc) {
        
       DeactivateUser deactivate = new DeactivateUser();
        deactivate.run();
     }
}