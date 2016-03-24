/*******************************************************************************
Copyright © 2016 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Lógica para generar la URL de Fort/Spiral
********************************************************************************/
global class MDF65Redirect {

    webservice static String generateURLFORT(String zone) {

        String acct_nr = '99999' + zone;
        
        MDF65__c conf = MDF65__c.getOrgDefaults();
        
        String host = conf.Link_FORT__c;
        String privateKey = conf.PrivateKey_FORT__c;
        Integer locale = (Integer)conf.Locale__c;
        
        String strToEncrypt = acct_nr + locale + privateKey;
        String hash = null;
        try {
            hash = encrypt(strToEncrypt);
        } catch (Exception e) {
            System.debug('Error encriptando la cadena:' + e.getMessage());
        }
        String url = host + '?userId=' + acct_nr + '&locale=' + locale + '&perSessId=' + hash;
        System.debug('URL FORT to redirect:' + url);
        return url;
    }
    
    webservice static String generateURLSpiral(String registro) {
        
        MDF65__c conf = MDF65__c.getOrgDefaults();
        
        String host = conf.Link_Spiral__c;
        String privateKey = conf.PrivateKey_Spiral__c;
        Integer locale = (Integer)conf.Locale__c;
        String campaignName = getCampaign();
        String year_nr = campaignName.left(4);
        Integer cmpn_nr = Integer.valueOf(campaignName.right(2));
        String strToEncrypt = registro + year_nr + cmpn_nr + locale + privateKey;
        System.debug('A encriptar:' + strToEncrypt);
        String hash = null;
        try {
            hash = encrypt(strToEncrypt);
        } catch (Exception e) {
            System.debug('Error encriptando la cadena:' + e.getMessage());
        }
        String url = host + '?ACCT_NR=' + registro + '&YEAR_NR=' + year_nr + '&CMPN_NR=' + 
            cmpn_nr + '&LOCALE=' + locale + '&HASH=' + hash;
        
        System.debug('URL Spiral to redirect:' + url);
        return url;
    }
    
    private static String getCampaign() {
        System.debug('Actual date:' + System.today());
        return [Select Id, Name From Campania_Avon__c 
                Where Fecha_Inicio__c <= :System.today()
                And Fecha_Fin__c >= :System.today()
                Order By Name].Name;
    }
    
    private static String encrypt(String clear){
        Blob targetBlob = Blob.valueOf(clear);
        Blob hash = Crypto.generateDigest('MD5', targetBlob);
        String finalValue = EncodingUtil.convertToHex(hash).toUpperCase();
        System.debug('Original:' + clear);
        System.debug('Encriptado:' + finalValue);
        return finalValue;
    }

}