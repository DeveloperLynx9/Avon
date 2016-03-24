@isTest (SeeAllData=true)
public class ctrlCobranzaW2C_UT {

    @isTest static void testConst() {
        Test.startTest();

        ctrlCobranzaW2C exec = new ctrlCobranzaW2C();
        
        Test.stopTest();
    }
    
    @isTest static void testConstTrue() {
        Test.startTest();
        
        ApexPages.currentPage().getParameters().put('showThanks','true');
        ctrlCobranzaW2C exec = new ctrlCobranzaW2C();
        
        Test.stopTest();
    }
    
    @isTest static void testSubmit() {
        Test.startTest();
        
        ctrlCobranzaW2C exec = new ctrlCobranzaW2C();
        	exec.submit();
        
        Test.stopTest();
    }
    
    @isTest static void testSubmitPhone() {
        Test.startTest();
        
        ctrlCobranzaW2C exec = new ctrlCobranzaW2C();
        	exec.txtPhone = '787807758';
        	exec.submit();
        
        Test.stopTest();
    }
}