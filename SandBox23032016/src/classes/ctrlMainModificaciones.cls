/*******************************************************************************
Copyright © 2016 Lynx9. All rights reserved. 
Author: Aranzazu Sereno
Email: sf@lynx9.com
Description: Lógica para la consulta de los movimientos tipo "Modificaciones"
********************************************************************************/
public class ctrlMainModificaciones {

    public String registro {get;set;}
    public String regionId{get;set;}
    public String divisionId {get;set;}
    public String zonaId {get;set;}
    public String bodegaId {get;set;}
    public String campaniaId {get;set;}
    public String usuarioId {get;set;}
    
    public List<SelectOption> listCampanias {get;set;}
    public List<SelectOption> listBodegas {get;set;}
    public List<SelectOption> listRegiones {get;set;}
    public List<SelectOption> listDivisiones {get;set;}
    public List<SelectOption> listZonas {get;set;}
    public List<SelectOption> listUsuarios {get;set;}
    
    public Movimiento__c mov {get;set;}
    
    List<MovWrapper> modificaciones {get;set;}
    
    public ctrlMainModificaciones(){
        mov = new Movimiento__c();
        
        regionId = '';
        queryUsuarios();
        queryCampaigns();
        queryBodegas();
        queryRegiones();
        queryDivisiones();
        queryZonas();
    }
    
    public void search(){
        con = null;
    }
    
    public PageReference add(){
        return new PageReference('/apex/modificaciones');
    }
    
    public void createFile(){
        
    }
    
    public void onChangeRegion(){
        queryDivisiones();
        queryZonas();
    }
    
    public void onChangeDivision(){
        queryZonas();
    }
    
    public class MovWrapper{
        public String index {get;set;}
        public Boolean selected {get;set;}
        public Movimiento__c mov {get;set;}
        public MovWrapper(Integer row, Movimiento__c mov){
            index = String.valueOf(row);
            this.mov = mov;
            selected = false;
        }
    }
    
    public List<MovWrapper> getModificaciones(){
        Integer index=0;
        modificaciones = new List<MovWrapper>();
        for (Movimiento__c mov : (List<Movimiento__c>)con.getRecords()){
            modificaciones.add(new MovWrapper(index, mov));
            index++;
        }
        System.debug('Index:' + index);
        return modificaciones;
    }
    
    /*
     * CONSULTAS A CATALOGOS
     */
    public String queryMovimientos(){
        String query = 'Select Id, Name, Representante__c, Representante__r.Region__c,' +
            'Representante__r.Division__c, Representante__r.Account.Name, Representante__r.Registro__c, ' +
            'Motivo__c, De_Valor__c, A_Valor__c, Diferencia__c, CreatedDate, Estado__c, ' +
            'Tipo_Modificacion__c ' +
            'From Movimiento__c ';
        
        String filters = '';
        if(String.isNotBlank(registro)){
            filters = ' Where Representante__r.Registro__c = \'' + registro + '\' ';
        }
        if(String.isNotBlank(mov.Estado__c)){
            if(filters.length()==0){filters = 'Where';}else{filters += ' And ';}
            filters += ' Estado__c = \'' + mov.Estado__c + '\'';
        }
        if(String.isNotBlank(mov.Tipo_Modificacion__c)){
            if(filters.length()==0){filters = 'Where';}else{filters += ' And ';}
            filters += ' Tipo_Modificacion__c = \'' + mov.Tipo_Modificacion__c + '\'';
        }
        if(String.isNotBlank(zonaId)){
            if(filters.length()==0){filters = 'Where';}else{filters += ' And ';}
            filters += ' Representante__r.AccountId = \'' + zonaId + '\'';
        }
        if(String.isNotBlank(divisionId)){
            if(filters.length()==0){filters = 'Where';}else{filters += ' And ';}
            filters += ' Representante__r.Account.ParentId = \'' + divisionId + '\'';
        }
        if(String.isNotBlank(regionId)){
            if(filters.length()==0){filters = 'Where';}else{filters += ' And ';}
            filters += ' Representante__r.Account.Parent.ParentId=\'' + regionId + '\'';
        }
        if(String.isNotBlank(regionId)){
            if(filters.length()==0){filters = 'Where';}else{filters += ' And ';}
            filters += ' Representante__r.Account.Parent.ParentId=\'' + regionId + '\'';
        }
        if(String.isNotBlank(campaniaId)){
            if(filters.length()==0){filters = 'Where';}else{filters += ' And ';}
            filters += ' (A_Campania__c = \'' + campaniaId + '\' Or ' +
                'De_Campania__c=\'' + campaniaId + '\' Or Campana_de_Pago__c=\'' +
                campaniaId + '\') ';
        }
        
        if(filters.length()>0){
            query += filters;
        }
        
        query += ' Order By CreatedDate DESC';
        
        System.debug('Query:' + query);
        return query;
        
        /*
        List<SObject> results = Database.query(query);
        Integer index = 0;
        for(SObject obj:results){
            if(obj==null){
                continue;
            }
            Movimiento__c mov = (Movimiento__c)obj;
            MovWrapper wrapper = new MovWrapper(index, mov);
            modificaciones.add(wrapper);
            index++;
        }
		*/
    }
    
    /*
     * INICIO PAGINACIÓN
     */
    public ApexPages.StandardSetController con {
        get {
            if(con==null){
                String query = queryMovimientos();
                con = new ApexPages.StandardSetController(
                    Database.getQueryLocator(query)
                );
                con.setPageSize(10);
            }
            System.debug('Total:' + con.getResultSize());
            return con;
        }
        set;
    }
    
    public Boolean hasNext {
        get {return con==null?false:con.getHasNext();}
        set;
    }
    
    public Boolean hasPrevious {
        get { return con==null?false:con.getHasPrevious();}
        set;
    }
    
    public Integer noOfRecords {
        get { return con==null?0:con.getResultSize();}
        set;
    }
    public Integer pageNumber {
        get { return con==null?0:con.getPageNumber();}
        set;
    } 
    
    public Integer pageSize {
        get { return con==null?0:(Integer)Math.floor(con.getPageSize()/con.getResultSize());}
        set;
    }
    
    public void first() {
        if(con==null)return; else con.first();
    }
    
    public void last() {
        if(con==null)return; else con.last();
    }
    
    public void previous() {
        if(con==null)return; else con.previous();
    }
    
    public void next() {
        con.next();
    }
    
    public void cancel() {
        if(con==null)return; else con.cancel();
    }
    
    /*
     * FIN PAGINACIÓN
     */
    
    public void queryUsuarios(){
        listUsuarios = new List<SelectOption>();
        listUsuarios.add(new SelectOption('','-- Seleccione --'));
    }
    public void queryCampaigns(){
        Date startDate = System.today().addDays(-183);
        Date endDate = System.today().addDays(183);
        
        List<Campania_Avon__c> results = [Select Id, Name From Campania_Avon__c 
                                          Where Fecha_Inicio__c >= :startDate
                                          And Fecha_Fin__c <= :endDate
                                          Order By Name ASC];
        
        listCampanias = new List<SelectOption>();
        listCampanias.add(new SelectOption('','-- Seleccione --'));
        for(Campania_Avon__c res:results){
            listCampanias.add(new SelectOption(res.Id, res.Name));
        }
    }
    
    private void queryBodegas(){
        List<Account> results = [Select Id, Name From Account 
                                 Where RecordType.Name = 'Bodega'
                                 Order by Name ASC];
        listBodegas = new List<SelectOption>();
        listBodegas.add(new SelectOption('','-- Seleccione --'));
        for(Account res:results){
            listBodegas.add(new SelectOption(res.Id, res.Name));
        }
    }
    
    private void queryRegiones(){
        List<Account> results = [Select Id, Name From Account 
                                 Where RecordType.Name = 'Región'
                                 Order by Name ASC];
        listRegiones = new List<SelectOption>();
        listRegiones.add(new SelectOption('','-- Seleccione --'));
        for(Account res:results){
            listRegiones.add(new SelectOption(res.Id, res.Name));
        }
        
    }
    
    private void queryDivisiones(){
        listDivisiones = new List<SelectOption>();
        listDivisiones.add(new SelectOption('','-- Seleccione --'));

        if(regionId==null){
            return;
        }
        List<Account> results = [Select Id, Name From Account 
                                 Where RecordType.Name = 'División'
                                 And ParentId =:regionId
                                 Order by Name ASC];
        for(Account res:results){
            listDivisiones.add(new SelectOption(res.Id, res.Name));
        }
    }
    
    private void queryZonas(){
        listZonas = new List<SelectOption>();
        listZonas.add(new SelectOption('','-- Seleccione --'));

        if(divisionId==null){
            return;
        }
        List<Account> results = [Select Id, Name From Account 
                                 Where RecordType.Name = 'Zona'
                                 And ParentId = :divisionId
                                 Order by Name ASC];
        for(Account res:results){
            listZonas.add(new SelectOption(res.Id, res.Name));
        }
    }
}