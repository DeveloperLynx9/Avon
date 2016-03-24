@isTest
private class MDF65Redirect_UT {

    @isTest static void testError() {
        
        Campania_Avon__c camp = new Campania_Avon__c ();
        camp.Name = '201605';
        Date startDate = System.today().addDays(-1);
        Date endDate = System.today().addDays(1);
        camp.Fecha_Inicio__c = startDate;
        camp.Fecha_Fin__c = endDate;
        camp.External_Id__c = '201605';
        insert camp;
        
        String urlFORT = MDF65Redirect.generateURLFORT('1337');
        System.assert(urlFORT!=null);
        String urlSpiral = MDF65Redirect.generateURLSpiral('6105459');
        System.assert(urlSpiral!=null);
        
    }
}