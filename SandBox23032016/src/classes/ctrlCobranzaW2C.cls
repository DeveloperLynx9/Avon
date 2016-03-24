public class ctrlCobranzaW2C {
    
    public static final String RTYPE_CASE_W2C = getIdByDevName('Case', 'Avon - Web2Case Despacho de Cobranza');
    public Case c {get; set;}
    public String txtPhone {get; set;}
    
    public Boolean showThanks {get; set;}
    
    public ctrlCobranzaW2C() {
        String st = ApexPages.currentPage().getParameters().get('showThanks');
        c = new Case();
        c.RecordTypeId = RTYPE_CASE_W2C;
        
        if( String.isBlank( st ) ) {
            showThanks = false; 
        } 
        else if( st == 'true' ) {
            showThanks = true;
        }
    }
    
    public PageReference submit() {
        c.Origin = 'Web';
        if( String.isBlank( txtPhone ) ) {
            ApexPages.addMessage( new ApexPages.Message(ApexPages.Severity.ERROR, 'Por favor proporcione el número de teléfono!') );
        }
        c.SuppliedPhone = txtPhone;
        
        try {
            insert c;
        }
        catch( Exception e ) {
            System.debug('There was an error trying to insert the case.');
            ApexPages.addMessages(e);
            return null;
        }
        
        PageReference pref = new PageReference('/cobranza?showThanks=true');
			pref.setRedirect(true);
        return pref;
    }

    private static String getIdByDevName(String objName, String rtName){
        return [Select r.Id, r.DeveloperName
                From RecordType r 
                where sobjecttype=:objName 
                and name = :rtName
                LIMIT 1].Id;
    }
}