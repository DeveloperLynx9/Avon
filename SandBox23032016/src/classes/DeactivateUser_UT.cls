/*******************************************************************************
Copyright © 2015 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Unit test for class DeactivateUser
********************************************************************************/
@isTest( SeeAllData = true ) 
public class DeactivateUser_UT {

   static testmethod void test() {

       Test.startTest();
       String CRON_EXP = '0 0 0 1 1 ? 2025';  
       String jobId = System.schedule('testScheduledApex', CRON_EXP, new schedDeactivateUser() );
       
       CronTrigger ct = [select id, CronExpression, TimesTriggered, NextFireTime from CronTrigger where id = :jobId];
       
       System.assertEquals(CRON_EXP, ct.CronExpression); 
       System.assertEquals(0, ct.TimesTriggered);
       System.assertEquals('2025-01-01 00:00:00', String.valueOf(ct.NextFireTime));
       
       Test.stopTest();

  }
    
}