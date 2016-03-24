/*******************************************************************************
Copyright © 2016 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Lógica para el ingreso de las modificaciones
********************************************************************************/
public class ctrlModificaciones {
    
    public static final String RTYPE_MOD = getIdByDevName('Movimiento__c', 'Modificaciones');
    
    public Movimiento__c mov{get;set;}
    public Boolean motivo03 {get;set;}
	public Boolean motivo0514 {get;set;}
    public Boolean motivo09 {get;set;}
    
    public String tituloOtro{get;set;}
    
    public Boolean mostrarCOD{get;set;}
    public Boolean mostrarOtro{get;set;}
    public Boolean mostrarDigitos{get;set;}
    
    public List<SelectOption> campaignOptions {get;set;}
    public String fromCampaign {get;set;}
    public String toCampaign {get;set;}
    public String paymentCampaign {get;set;}
    
    public ctrlModificaciones(ApexPages.StandardController controller){
        mov = (Movimiento__c)Movimiento__c.sObjectType.newSObject(RTYPE_MOD, false);
        mov.RecordTypeId = RTYPE_MOD;
        //mov = new Movimiento__c(RecordTypeId = RTYPE_MOD);
        
        mov.Tipo_Modificacion__c = 'COD';
        motivo03 = false;
        motivo0514 = false;
        motivo09 = false;
        
        mostrarCOD = true;
        mostrarDigitos = false;
        mostrarOtro = false;
        
        fromCampaign = '';
        toCampaign = '';
        paymentCampaign = '';
        
        campaignOptions = new List<SelectOption>();
        campaignOptions.add(new SelectOption('','-- Seleccione --'));
            
        List<Campania_Avon__c> opts = this.getCampaigns();
        for(Campania_Avon__c opt:opts) {
            campaignOptions.add(new SelectOption(opt.Id,opt.Name));
        }
    }
    
    public PageReference saveAndNew(){
        PageReference result = saveAndDetail();
        if(result==null){
            return null;
        }
        PageReference redirect = new PageReference('/apex/modificaciones');
        redirect.setRedirect(true);
        return redirect;
    }
    
    public PageReference saveAndReturn(){
        PageReference result = saveAndDetail();
        if(result==null){
            return null;
        }
        PageReference redirect = new PageReference('/apex/mainModificaciones');
        redirect.setRedirect(true);
        return redirect;
    }
    
    public PageReference returnTo(){
        PageReference redirect = new PageReference('/apex/mainModificaciones');
        redirect.setRedirect(true);
        return redirect;
    }
    
    public PageReference saveAndDetail(){
        if(!isValid()){
            return null;
        }
        
        try{
            insert mov;
        }catch(System.DMLException e){
            ApexPages.addMessages(e);   
            return null;      
        }
        
        PageReference redirect = new PageReference('/' + mov.Id);
        redirect.setRedirect(true);
        return redirect;
    }
    
    private Boolean isValid(){
        Boolean valido = true;
        
        if(mov.Representante__c==null){
            mov.Representante__c.addError('Seleccionar un valor');
            valido = false;
        }
        
        if(String.isNotBlank(fromCampaign)){
	        mov.De_Campania__c = fromCampaign;
        }
        if(String.isNotBlank(toCampaign)){
	        mov.A_Campania__c = toCampaign;
        }
        System.debug('Campaña de pago:' + paymentCampaign);
        if(String.isNotBlank(paymentCampaign)){
	        mov.Campana_de_Pago__c = paymentCampaign;
        }
        
        System.debug('Motivo seleccionado:' + mov.Motivo__c);
        if(mostrarCOD && String.isBlank(mov.Motivo__c)){
            mov.Motivo__c.addError('Favor de seleccionar un valor');
            valido = false;
        }
        
        if(String.isNotBlank(mov.Motivo__c)){
            String motivo = mov.Motivo__c;
            if(motivo.startsWith('01')){
                valido = validarMotivo01();
            }
        }
        
        return valido;
    }
    
    public void fRenderMod(){
        mostrarCOD = false;
        mostrarDigitos = false;
        mostrarOtro = false;
		tituloOtro = 'Ficha';
        
        if(mov.Tipo_Modificacion__c=='COD'){
            mostrarCOD = true;
        }else{
            mostrarOtro = true;
        }        
        
        if(mov.Tipo_Modificacion__c=='Dígitos'){
            mostrarDigitos = true;
            tituloOtro = 'Dígitos';
        }
    }
    
    public void fRenderCOD(){
        motivo03 = false;
        motivo0514 = false;
        motivo09 = false;
        
        String startsWith = mov.Motivo__c;
        
        if(startsWith.startsWith('03')){
            motivo03 = true;
        }
        if(startsWith.startsWith('05') || startsWith.startsWith('14')){
            motivo0514 = true;
        }
        if(startsWith.startsWith('09')){
            motivo09 = true;
        }
    }
    
    public Boolean validarMotivo01(){
        //Máximo 5 registros de este tipo por zona por campaña
        //Monto máximo a modificar sea del 25% del valor de la orden
        //El valor LOA del registro sea mayor a 6 campañas
        //Que en las últimas 6 campañas no haya presentado:
        //	modificaciones de este tipo
        //	registros del motivo 11
        //	que la representante este activa
        
        Boolean valid = true;
        String zona = '';

        List<Contact> reps = [Select Activo__c, Account.Name From Contact Where Id = :mov.Representante__c];
        for(Contact rep:reps){
            zona = rep.Account.Name;
            if(!rep.Activo__c){
                String errorMsg = 'No se puede crear una modificación para una representante con status de baja si el motivo es 01';
                ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.FATAL, errorMsg);
                ApexPages.addMessage(msg);
                valid = false;
            }
        }

        Double pVal = (mov.De_Valor__c/100.00)*0.25;
        Double valMax = (mov.De_Valor__c/100.00)-pVal;
        if(((mov.A_Valor__c/100.00)<valMax)){
            String errorMsg = 'Solo se puede otorgar el (25%) de crédito máximo del valor de la orden si el motivo es 01';
            ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.FATAL, errorMsg);
            ApexPages.addMessage(msg);
            valid = false;
        }
        
        System.debug('Zona Rep:' + zona);
        List<AggregateResult> results = [Select COUNT(Id) total
                                         From Movimiento__c
                                         Where Zona__c = :zona
                                         And Motivo__c like '01%'];

        for(AggregateResult result:results){
            if(result==null){continue;}
            Integer total=(Integer)result.get('total');
            if(total>=5){
                String errorMsg = 'Solo están permitidas un máximo de 5 modificaciones por Zona y por campaña si el motivo es 01, y se ha llegado al máximo permitido';
                ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.FATAL, errorMsg);
                ApexPages.addMessage(msg);
                valid = false;
            }
        }
                
        return valid;
    }
    
    public void obtenerLinea(){
        if(mov.Representante__c==null || fromCampaign==null || mov.A_Valor__c==null){
            mov.Digitos__c = null;
            return;
        }
        
        String registro = getRepresentativeAccount(mov.Representante__c);
        
        String campaniaPago = '';
        for (SelectOption so : campaignOptions){
            if (so.getValue() == fromCampaign){
                campaniaPago = so.getLabel();
            }
        }
        
        String mes = campaniaPago.right(2);
        Integer campania = Integer.valueOf(mes);
        
        Integer primerDV = chkDigit1(mov.A_Valor__c);
        if(primerDV==null){
            mov.Digitos__c = null;
            return;
        }
        String primerDVStr = String.valueOf(primerDV) + '1';
        Integer segundoDV = chkDigit2(registro, campania, primerDV);
        String segundoDVStr = String.valueOf(segundoDV).leftPad(2,'0');
        
        MDF30__c conf = MDF30__c.getOrgDefaults();
        String linea = '';
        
        String banco = mov.Banco__c;
        if(banco==null){
            linea = mes + primerDVStr + ' ' + segundoDVStr;
        }else{
            if(banco=='Banamex'){
                linea = conf.Linea_Banamex__c;
            }else if(banco=='Santander'){
                linea = conf.Linea_Santander__c;
            }else{
                linea = conf.Linea_Bancomer__c;
            }
            linea = linea.replace('RRRR',registro.left(4));
            linea = linea.replace('RASC', registro.right(4));
            linea = linea.replace('CC', mes);
            linea = linea.replace('A1', primerDVStr);
            linea = linea.replace('BB', segundoDVStr);
        }

        mov.Digitos__c = linea;
    }
    
    public Integer chkDigit1(Decimal monto){
        MDF30__c conf = MDF30__c.getOrgDefaults();
        
        Integer[] arrayMonto = amountToArray(monto);
        Integer[] arraySequence = stringToInteger(conf.Primera_Secuencia__c);
        
        if(arrayMonto.size()!=arraySequence.size()){
            String errorMsg = 'No se puede realizar el calculo "Primer DV" NO tienen la misma longitud (8)';
            //ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.FATAL, errorMsg);
            mov.Digitos__c.addError(errorMsg);
            return null;
        }
        
        Integer total = 0;
        for(Integer index=0;index<arrayMonto.size();index++){
            total += (arrayMonto[index]*arraySequence[index]);
        }
        Integer dv = Math.mod(total,(Integer)conf.Divisor_Primer_DV__c);
        System.debug('Total:' + total);
        System.debug('Residuo:' + dv);
        return dv;
    }
    
    public Integer chkDigit2(String registro, Integer campaniaPago, Integer primerDV){
        MDF30__c conf = MDF30__c.getOrgDefaults();
        
        Integer firstPart = Integer.valueOf(registro.left(5));
        System.debug('First part:' + firstPart);
        Integer secondPart = Integer.valueOf(registro.right(3));
        System.debug('Second part:' + secondPart);
        
        Long totalSegundo = (Long)(firstPart*10000000.0);
        System.debug('1:' + totalSegundo);
        totalSegundo += (secondPart*10000);
        System.debug('2:' + totalSegundo);
        totalSegundo += (campaniaPago*100);
        System.debug('3:' + totalSegundo);
        totalSegundo += (primerDV*10);
        System.debug('4:' + totalSegundo);
        totalSegundo +=1;
        System.debug('5:' + totalSegundo);
        
        System.debug('Total segundo DV:' + totalSegundo);
        
        String totalSegundoStr = String.valueOf(totalSegundo);
        totalSegundoStr = totalSegundoStr.leftPad(12, '0');
        
        String workString = conf.Constante_Segundo_DV__c + totalSegundoStr;
        System.debug('Secuencia completa:' + workString);
        String[] workArray = workString.split('^*');
        Integer[] workInteger = new Integer[workArray.size()];
        for(Integer index=0;index<workArray.size();index++){
            workInteger[index]=Integer.valueOf(workArray[index]);
        }
        
        Integer[] sequence = stringToInteger(conf.Segunda_Secuencia__c);
        
        if(workInteger.size()!=sequence.size()){
            String errorMsg = 'No se puede realizar el calculo "Segundo DV" NO tienen la misma longitud (19)';
            //ApexPages.Message msg = new ApexPages.Message(ApexPages.Severity.FATAL, errorMsg);
            mov.Digitos__c.addError(errorMsg);
            return null;
        }
        
        Integer total = 0;
        for(Integer index=0;index<workInteger.size();index++){
            total += (workInteger[index]*sequence[index]);
        }
        return Math.mod(total,(Integer)conf.Divisor_Segundo_DV__c)+1;
        
    }
    
    private static Integer[] amountToArray(Decimal amount){
        String intPart = String.valueOf((Integer)amount);
        intPart = intPart.leftPad(6, '0');
        System.debug('Integer part:' + intPart);
        
        String numberStr = String.valueOf(amount);
        String fractionalStr = numberStr.substring(numberStr.indexOf('.')+1);
        fractionalStr = fractionalStr.rightPad(2, fractionalStr);
        System.debug('Fractional part:' + fractionalStr);
        
        String complete = intPart + fractionalStr;
        String[] arrayString = complete.split('^*');
        Integer[] arrayInteger = new Integer[arrayString.size()];
        for(Integer index=0;index<arrayString.size();index++){
            Integer numberOf = Integer.valueOf(arrayString[index]);
            arrayInteger[index]= numberOf;
            System.debug('Amount number:' + numberOf);
        }
        System.debug('Amount array length:' + arrayInteger.size());
        return arrayInteger;
    }
    
    private static Integer[] stringToInteger(String sequence){
        String[] arrayString = sequence.split(',');
        Integer[] arrayInteger = new Integer[arrayString.size()];
        for(Integer index=0;index<arrayString.size();index++){
            arrayInteger[index]=Integer.valueOf(arrayString[index]);
        }
        return arrayInteger;
    }
    
    private static String getIdByDevName(String objName, String rtName){
        return [Select r.Id, r.DeveloperName
                From RecordType r 
                where sobjecttype=:objName 
                and name = :rtName
                LIMIT 1].Id;
    }

    public String getRepresentativeAccount(String id){
        return [Select Registro__c From Contact Where Id=:id LIMIT 1].Registro__c;
    }
    
    public List<Campania_Avon__c> getCampaigns(){
        Date startDate = System.today().addDays(-183);
        Date endDate = System.today().addDays(183);
        
        return [Select Id, Name From Campania_Avon__c 
                Where Fecha_Inicio__c >= :startDate
                And Fecha_Fin__c <= :endDate
                Order By Name];
    }
    
    /*
     * VALIDAR LAS ULTIMAS 6 CAMPAÑAS EL LOA NO ES POSIBLE YA QUE NO SE CUENTA CON LA 
     * INFORMACIÓN DE PAGO DE LA REPRESENTANTE
     * La lógica implementada en el sistema MDF30 era:
     * 
     * long resp=validateLast6Camp();
        if (resp!=0){
                if(resp==1){
                   msgBox( "Dato Inv·lido", MB_OK | MB_ICONEXCLAMATION, "Para el motivo 01 la representante debe tener una antig¸edad mayor a 6 campaÒas y no cumple con esa antig¸edad" );
                   cbRsn->SetFocus();  return false;
                }
                if(resp==2){
                   msgBox( "Dato Inv·lido", MB_OK | MB_ICONEXCLAMATION, "Para el motivo 01 la representante debe no haber presentado inactividad en las ultimas 6 campaÒas, la representante no cumple esa condiciÛn" );
                   cbRsn->SetFocus();  return false;
                }
                if(resp==3){
                   msgBox( "Dato Inv·lido", MB_OK | MB_ICONEXCLAMATION, "Para el motivo 01 la representante no debe haber tenido una modificaciÛn de este tipo en las ultimas 6 campaÒas, la representante tuvo una modificaciÛn del tipo 01 en la campaÒa:  %i", campMsg);
                   cbRsn->SetFocus();  return false;
                }
                if(resp==4){
                   msgBox( "Dato Inv·lido", MB_OK | MB_ICONEXCLAMATION, "Para el motivo 01 la representante no debe haber hecho devoluciones completas en las ultimas 6 campaÒas, la representante tuvo una devoluciÛn en la campaÒa: %i", campMsg);
                   cbRsn->SetFocus();  return false;
                }
        }
     * 
     * 
     * long __fastcall TForm2::validateLast6Camp()
        {
        //Cargar parametros
        TNewStrings params( "mdf30parms.ctl", "MDF30" );
        string campaignFinal= params.Value( "CampaingFinal" );
        long campFinal = atol(campaignFinal.c_str());
        
        //Variables locales
        long resp=0;
        long count=0;
        long camYearCur=0;
        long campaignCur=0;
        long camYearNext=0;
        long campaignNext=0;
        campSet.clear();
        campMsg=0;
        
        //Consulta de las ultimas ultimas campaÒas
        query->SQLSetText( "SELECT TOP 7 CAMP_YEAR, CAMPAIGN FROM PAYMENT "
        "WHERE ACCOUNT=:ACCOUNT ORDER BY CAMP_YEAR DESC, CAMPAIGN DESC" );
        query->Param( "ACCOUNT" )->AsInteger( atol( eAcc->Text.c_str() ));
        query->Open();
        
        //Carga el resultado en memoria
        while( !query->AtEOF() ) {
        count++;
        Campaign camp( query->Field( "CAMP_YEAR" )->AsInteger(), query->Field( "CAMPAIGN" )->AsInteger());
        campSet.insert( camp );
        query->Next();
        }
        query->Close();
        
        //Valida que las representantes tengan un LOA mayor a 6 campaÒas.
        if(count <= 6){
        resp=1;
        //Log fprintf(f, "\n-->ERROR DE ANTIGUEDAD");
        }else{
        //Verificar que las campaÒas sean consecutivas
        CampaignSet::iterator campIter = campSet.begin();
        while( campIter != campSet.end() ) {
        camYearCur=campIter->campaignYear;
        campaignCur=campIter->campaign;
        campIter++;
        
        if( campIter != campSet.end() ){
        camYearNext=campIter->campaignYear;
        campaignNext=campIter->campaign;
        campIter--;
        
        if (camYearCur == camYearNext){
        if((campaignCur+1)!=campaignNext){
        //Log fprintf(f, "\n-->ERROR CAMPA—AS NO CONSECUTIVAS INACTIVIDAD");
        resp=2;
        break;
        }
        }else if (camYearNext == (camYearCur + 1) ){
        if(!(campaignCur==campFinal && campaignNext==1)){
        //Log fprintf(f, "\n-->ERROR DE CAMPA—AS POR CAMBIO A—O,CAMPA—AS NO CONSECUTIVAS INACTIVIDAD");
        resp=2;
        break;
        }
        }else{
        //Log fprintf(f, "\n-->CAMPA—AS NO CONSECUTIVAS INACTIVIDAD,ERROR A—OS NO SON CONSECUTIVOS");
        resp=2;
        break;
        }
        campIter++;
        } //fin del if para el ultimo ciclo
        } // fin del while
        
        //Si fueron consecutivas las campaÒas validar que no haya modificaciones del tipo 1 en esas ultimas 6 campaÒas
        if(resp!=2){
        /////validacion de modificaciones de tipo 1
        
        CampaignSet::iterator campIterIni = campSet.begin();
        long  camYearIni=campIterIni->campaignYear;
        long  campaignIni=campIterIni->campaign;
        
        CampaignSet::reverse_iterator campIterFin = campSet.rbegin();
        long  camYearFin=campIterFin->campaignYear;
        long  campaignFin=campIterFin->campaign;
        
        query->SQLSetText( "SELECT FR_CAMP FROM MFMODIF "
        "WHERE ACCOUNT=:ACCOUNT AND REASON='01' AND "
        "FR_CAMP BETWEEN :FR_CAMPI AND :FR_CAMPF ");
        query->Param( "ACCOUNT" )->AsInteger( atol( eAcc->Text.c_str() ));
        query->Param( "FR_CAMPI" )->AsInteger(
        100*camYearIni + campaignIni);
        query->Param( "FR_CAMPF" )->AsInteger(
        100*camYearFin + campaignFin);
        query->Open();
        
        long numMod=0;
        
        while( !query->AtEOF() ) {
        numMod++;
        campMsg = query->Field("FR_CAMP")->AsInteger();
        query->Next();
        break;
        }
        
        query->Close();
        
        if(numMod>0){
        //Log fprintf(f, "\n-->ERROR, UNA MODIFICACION DE ESTE TIPO YA EXISTE, NO SE PUEDE HACER MAS DE UNA MODIFICACION DEL TIPO 1 EN LAS ULTIMAS 6 CAMPA—AS");
        resp=3;
        }
        
        if(resp!=3){
        //Valida que no haya devoluciones completas en las ultimas campaÒas
        
        query->SQLSetText( "select top 7 CAMP_YEAR, CAMPAIGN FROM PAYMENT "
        "WHERE ACCOUNT=:ACCOUNT "
        "INTERSECT "
        "select CAMP_YEAR, CAMPAIGN FROM PAYMENTT "
        "WHERE DEVOL_RSN is NOT NULL AND ACCOUNT=:ACCOUNT order by CAMP_YEAR DESC, CAMPAIGN DESC ");
        
        query->Param( "ACCOUNT" )->AsInteger( atol( eAcc->Text.c_str() ));
        query->Open();
        
        long numDev=0;
        
        while( !query->AtEOF() ) {
        
        numDev++;
        campMsg = query->Field("CAMPAIGN")->AsInteger();
        query->Next();
        break;
        
        }
        
        query->Close();
        
        if(numDev>0){
        
        //fprintf(f, "\n-->ERROR, UNA MODIFICACION DE ESTE TIPO NO PERMITE QUE EXISTAN DEVOLUCIONES COMPLETAS EN LAS ULTIMAS 6 CAMPA—AS");
        resp=4;
        }
        }
        
        
        } //fin de if para validad numero de modificaciones tipo 1
        
        }//fin del if count
        
        return resp;
        
        }

     * 
     * 
     * 
     */
}