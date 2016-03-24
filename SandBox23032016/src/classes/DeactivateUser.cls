/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Class for deactivate users
********************************************************************************/
public class DeactivateUser {

    public void run() {
        
        List<User> users = [Select Id
                            From User
                            Where isActive = true
                            AND (LastLoginDate = null
                                 OR LastLoginDate < LAST_N_DAYS:90)];
        
        for(User user:users){
            user.isActive = false;
            try{
            	update user;
            }catch(Exception e){
                System.debug('Error updating an user:' + e);
            }
        }
        
    }
}