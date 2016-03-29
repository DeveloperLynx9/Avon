/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Contact  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.Double ACCUMULATED_SALES__c;

    private com.sforce.soap.enterprise.QueryResult acceptedEventRelations;

    private com.sforce.soap.enterprise.sobject.Account account;

    private com.sforce.soap.enterprise.QueryResult accountContactRoles;

    private java.lang.String accountId;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Boolean activo__c;

    private java.lang.String actualizacion_Telefono__c;

    private java.lang.String actualizacion_correo_electronico__c;

    private java.lang.Boolean afectaci_n__c;

    private com.sforce.soap.enterprise.QueryResult assets;

    private java.lang.String assistantName;

    private java.lang.String assistantPhone;

    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.util.Date birthdate;

    private java.lang.String CAMPAIGNEXPIRE_CP__c;

    private java.lang.String CAMPAIGNEXPIRE__c;

    private java.lang.String CAMPAIGN__c;

    private java.lang.Double COD__c;

    private com.sforce.soap.enterprise.QueryResult campaignMembers;

    private java.lang.String campania_Operativa2__c;

    private java.lang.String campania_Operativa__c;

    private com.sforce.soap.enterprise.QueryResult candidatos__r;

    private com.sforce.soap.enterprise.QueryResult caseContactRoles;

    private com.sforce.soap.enterprise.QueryResult cases;

    private com.sforce.soap.enterprise.QueryResult casos1__r;

    private com.sforce.soap.enterprise.QueryResult casos__r;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private com.sforce.soap.enterprise.QueryResult contractContactRoles;

    private com.sforce.soap.enterprise.QueryResult contractsSigned;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult cuentas__r;

    private com.sforce.soap.enterprise.QueryResult declinedEventRelations;

    private java.lang.String department;

    private java.lang.String description;

    private java.util.Date dias_de_bodega2__c;

    private java.util.Date dias_de_bodega__c;

    private java.lang.String digitos__c;

    private java.lang.String division__c;

    private com.sforce.soap.enterprise.QueryResult duplicateRecordItems;

    private java.lang.String email;

    private java.util.Calendar emailBouncedDate;

    private java.lang.String emailBouncedReason;

    private com.sforce.soap.enterprise.QueryResult emailStatuses;

    private com.sforce.soap.enterprise.QueryResult entitlementContacts;

    private com.sforce.soap.enterprise.QueryResult eventRelations;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String fax;

    private java.util.Date fecha_Proceso__c;

    private java.util.Date fecha_Ultimo_Reparto__c;

    private java.util.Date fecha_de_cierre_web2__c;

    private java.util.Date fecha_de_cierre_web__c;

    private java.util.Date fecha_de_facturacion2__c;

    private java.util.Date fecha_de_facturacion__c;

    private java.util.Date fecha_de_reparto2__c;

    private java.util.Date fecha_de_reparto__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.Double ficha__c;

    private java.lang.String firstName;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.String homePhone;

    private java.lang.String IDCOUNTRY__c;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isEmailBounced;

    private java.lang.String jigsaw;

    private java.lang.String jigsawContactId;

    private java.lang.String LEVEL__c;

    private java.lang.String LOA__c;

    private java.util.Date lastActivityDate;

    private java.util.Calendar lastCURequestDate;

    private java.util.Calendar lastCUUpdateDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.String lastName;

    private java.util.Calendar lastReferencedDate;

    private java.util.Calendar lastViewedDate;

    private java.lang.String leadSource;

    private com.sforce.soap.enterprise.QueryResult liveChatTranscripts;

    private com.sforce.soap.enterprise.QueryResult lookedUpFromActivities;

    private java.lang.String lote__c;

    private com.sforce.soap.enterprise.Address mailingAddress;

    private java.lang.String mailingCity;

    private java.lang.String mailingCountry;

    private java.lang.String mailingGeocodeAccuracy;

    private java.lang.Double mailingLatitude;

    private java.lang.Double mailingLongitude;

    private java.lang.String mailingPostalCode;

    private java.lang.String mailingState;

    private java.lang.String mailingStreet;

    private java.lang.String marcacion_Corta__c;

    private com.sforce.soap.enterprise.sobject.Contact masterRecord;

    private java.lang.String masterRecordId;

    private java.lang.String mobilePhone;

    private com.sforce.soap.enterprise.QueryResult movimientos__r;

    private java.lang.String name;

    private java.lang.String nivel__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String num_Campa_a_y_Ano__c;

    private java.lang.String num_Campa_a_y_Ano_de_Expiracion__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private com.sforce.soap.enterprise.QueryResult opportunities;

    private com.sforce.soap.enterprise.QueryResult opportunityContactRoles;

    private com.sforce.soap.enterprise.Address otherAddress;

    private java.lang.String otherCity;

    private java.lang.String otherCountry;

    private java.lang.String otherGeocodeAccuracy;

    private java.lang.Double otherLatitude;

    private java.lang.Double otherLongitude;

    private java.lang.String otherPhone;

    private java.lang.String otherPostalCode;

    private java.lang.String otherState;

    private java.lang.String otherStreet;

    private com.sforce.soap.enterprise.sobject.User owner;

    private java.lang.String ownerId;

    private java.lang.Double POINTSAVAILABLE_CP__c;

    private java.lang.Double POINTSAVAILABLE__c;

    private java.lang.Double POINTSEXPIRE_CP__c;

    private java.lang.Double POINTSEXPIRE__c;

    private java.lang.Double POINTSPENDING_CP__c;

    private java.lang.Double POINTSPENDING__c;

    private java.lang.Double POINTSSPENT_CP__c;

    private java.lang.Double POINTSSPENT__c;

    private com.sforce.soap.enterprise.QueryResult personas;

    private java.lang.String phone;

    private java.lang.String photoUrl;

    private com.sforce.soap.enterprise.QueryResult posts;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private com.sforce.soap.enterprise.QueryResult recordAssociatedGroups;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String region__c;

    private java.lang.String registro__c;

    private com.sforce.soap.enterprise.sobject.Contact reportsTo;

    private java.lang.String reportsToId;

    private java.lang.String salutation;

    private com.sforce.soap.enterprise.QueryResult serviceContracts;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String title;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.QueryResult undecidedEventRelations;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String YEAREXPIRE_CP__c;

    private java.lang.String YEAREXPIRE__c;

    private java.lang.String YEAR__c;

    public Contact() {
    }

    public Contact(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.Double ACCUMULATED_SALES__c,
           com.sforce.soap.enterprise.QueryResult acceptedEventRelations,
           com.sforce.soap.enterprise.sobject.Account account,
           com.sforce.soap.enterprise.QueryResult accountContactRoles,
           java.lang.String accountId,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Boolean activo__c,
           java.lang.String actualizacion_Telefono__c,
           java.lang.String actualizacion_correo_electronico__c,
           java.lang.Boolean afectaci_n__c,
           com.sforce.soap.enterprise.QueryResult assets,
           java.lang.String assistantName,
           java.lang.String assistantPhone,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.util.Date birthdate,
           java.lang.String CAMPAIGNEXPIRE_CP__c,
           java.lang.String CAMPAIGNEXPIRE__c,
           java.lang.String CAMPAIGN__c,
           java.lang.Double COD__c,
           com.sforce.soap.enterprise.QueryResult campaignMembers,
           java.lang.String campania_Operativa2__c,
           java.lang.String campania_Operativa__c,
           com.sforce.soap.enterprise.QueryResult candidatos__r,
           com.sforce.soap.enterprise.QueryResult caseContactRoles,
           com.sforce.soap.enterprise.QueryResult cases,
           com.sforce.soap.enterprise.QueryResult casos1__r,
           com.sforce.soap.enterprise.QueryResult casos__r,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           com.sforce.soap.enterprise.QueryResult contractContactRoles,
           com.sforce.soap.enterprise.QueryResult contractsSigned,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult cuentas__r,
           com.sforce.soap.enterprise.QueryResult declinedEventRelations,
           java.lang.String department,
           java.lang.String description,
           java.util.Date dias_de_bodega2__c,
           java.util.Date dias_de_bodega__c,
           java.lang.String digitos__c,
           java.lang.String division__c,
           com.sforce.soap.enterprise.QueryResult duplicateRecordItems,
           java.lang.String email,
           java.util.Calendar emailBouncedDate,
           java.lang.String emailBouncedReason,
           com.sforce.soap.enterprise.QueryResult emailStatuses,
           com.sforce.soap.enterprise.QueryResult entitlementContacts,
           com.sforce.soap.enterprise.QueryResult eventRelations,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String fax,
           java.util.Date fecha_Proceso__c,
           java.util.Date fecha_Ultimo_Reparto__c,
           java.util.Date fecha_de_cierre_web2__c,
           java.util.Date fecha_de_cierre_web__c,
           java.util.Date fecha_de_facturacion2__c,
           java.util.Date fecha_de_facturacion__c,
           java.util.Date fecha_de_reparto2__c,
           java.util.Date fecha_de_reparto__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.Double ficha__c,
           java.lang.String firstName,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.String homePhone,
           java.lang.String IDCOUNTRY__c,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isEmailBounced,
           java.lang.String jigsaw,
           java.lang.String jigsawContactId,
           java.lang.String LEVEL__c,
           java.lang.String LOA__c,
           java.util.Date lastActivityDate,
           java.util.Calendar lastCURequestDate,
           java.util.Calendar lastCUUpdateDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.String lastName,
           java.util.Calendar lastReferencedDate,
           java.util.Calendar lastViewedDate,
           java.lang.String leadSource,
           com.sforce.soap.enterprise.QueryResult liveChatTranscripts,
           com.sforce.soap.enterprise.QueryResult lookedUpFromActivities,
           java.lang.String lote__c,
           com.sforce.soap.enterprise.Address mailingAddress,
           java.lang.String mailingCity,
           java.lang.String mailingCountry,
           java.lang.String mailingGeocodeAccuracy,
           java.lang.Double mailingLatitude,
           java.lang.Double mailingLongitude,
           java.lang.String mailingPostalCode,
           java.lang.String mailingState,
           java.lang.String mailingStreet,
           java.lang.String marcacion_Corta__c,
           com.sforce.soap.enterprise.sobject.Contact masterRecord,
           java.lang.String masterRecordId,
           java.lang.String mobilePhone,
           com.sforce.soap.enterprise.QueryResult movimientos__r,
           java.lang.String name,
           java.lang.String nivel__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String num_Campa_a_y_Ano__c,
           java.lang.String num_Campa_a_y_Ano_de_Expiracion__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           com.sforce.soap.enterprise.QueryResult opportunities,
           com.sforce.soap.enterprise.QueryResult opportunityContactRoles,
           com.sforce.soap.enterprise.Address otherAddress,
           java.lang.String otherCity,
           java.lang.String otherCountry,
           java.lang.String otherGeocodeAccuracy,
           java.lang.Double otherLatitude,
           java.lang.Double otherLongitude,
           java.lang.String otherPhone,
           java.lang.String otherPostalCode,
           java.lang.String otherState,
           java.lang.String otherStreet,
           com.sforce.soap.enterprise.sobject.User owner,
           java.lang.String ownerId,
           java.lang.Double POINTSAVAILABLE_CP__c,
           java.lang.Double POINTSAVAILABLE__c,
           java.lang.Double POINTSEXPIRE_CP__c,
           java.lang.Double POINTSEXPIRE__c,
           java.lang.Double POINTSPENDING_CP__c,
           java.lang.Double POINTSPENDING__c,
           java.lang.Double POINTSSPENT_CP__c,
           java.lang.Double POINTSSPENT__c,
           com.sforce.soap.enterprise.QueryResult personas,
           java.lang.String phone,
           java.lang.String photoUrl,
           com.sforce.soap.enterprise.QueryResult posts,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           com.sforce.soap.enterprise.QueryResult recordAssociatedGroups,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String region__c,
           java.lang.String registro__c,
           com.sforce.soap.enterprise.sobject.Contact reportsTo,
           java.lang.String reportsToId,
           java.lang.String salutation,
           com.sforce.soap.enterprise.QueryResult serviceContracts,
           com.sforce.soap.enterprise.QueryResult shares,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String title,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.QueryResult undecidedEventRelations,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String YEAREXPIRE_CP__c,
           java.lang.String YEAREXPIRE__c,
           java.lang.String YEAR__c) {
        super(
            fieldsToNull,
            id);
        this.ACCUMULATED_SALES__c = ACCUMULATED_SALES__c;
        this.acceptedEventRelations = acceptedEventRelations;
        this.account = account;
        this.accountContactRoles = accountContactRoles;
        this.accountId = accountId;
        this.activityHistories = activityHistories;
        this.activo__c = activo__c;
        this.actualizacion_Telefono__c = actualizacion_Telefono__c;
        this.actualizacion_correo_electronico__c = actualizacion_correo_electronico__c;
        this.afectaci_n__c = afectaci_n__c;
        this.assets = assets;
        this.assistantName = assistantName;
        this.assistantPhone = assistantPhone;
        this.attachedContentDocuments = attachedContentDocuments;
        this.attachments = attachments;
        this.birthdate = birthdate;
        this.CAMPAIGNEXPIRE_CP__c = CAMPAIGNEXPIRE_CP__c;
        this.CAMPAIGNEXPIRE__c = CAMPAIGNEXPIRE__c;
        this.CAMPAIGN__c = CAMPAIGN__c;
        this.COD__c = COD__c;
        this.campaignMembers = campaignMembers;
        this.campania_Operativa2__c = campania_Operativa2__c;
        this.campania_Operativa__c = campania_Operativa__c;
        this.candidatos__r = candidatos__r;
        this.caseContactRoles = caseContactRoles;
        this.cases = cases;
        this.casos1__r = casos1__r;
        this.casos__r = casos__r;
        this.combinedAttachments = combinedAttachments;
        this.contractContactRoles = contractContactRoles;
        this.contractsSigned = contractsSigned;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.cuentas__r = cuentas__r;
        this.declinedEventRelations = declinedEventRelations;
        this.department = department;
        this.description = description;
        this.dias_de_bodega2__c = dias_de_bodega2__c;
        this.dias_de_bodega__c = dias_de_bodega__c;
        this.digitos__c = digitos__c;
        this.division__c = division__c;
        this.duplicateRecordItems = duplicateRecordItems;
        this.email = email;
        this.emailBouncedDate = emailBouncedDate;
        this.emailBouncedReason = emailBouncedReason;
        this.emailStatuses = emailStatuses;
        this.entitlementContacts = entitlementContacts;
        this.eventRelations = eventRelations;
        this.events = events;
        this.fax = fax;
        this.fecha_Proceso__c = fecha_Proceso__c;
        this.fecha_Ultimo_Reparto__c = fecha_Ultimo_Reparto__c;
        this.fecha_de_cierre_web2__c = fecha_de_cierre_web2__c;
        this.fecha_de_cierre_web__c = fecha_de_cierre_web__c;
        this.fecha_de_facturacion2__c = fecha_de_facturacion2__c;
        this.fecha_de_facturacion__c = fecha_de_facturacion__c;
        this.fecha_de_reparto2__c = fecha_de_reparto2__c;
        this.fecha_de_reparto__c = fecha_de_reparto__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.ficha__c = ficha__c;
        this.firstName = firstName;
        this.histories = histories;
        this.homePhone = homePhone;
        this.IDCOUNTRY__c = IDCOUNTRY__c;
        this.isDeleted = isDeleted;
        this.isEmailBounced = isEmailBounced;
        this.jigsaw = jigsaw;
        this.jigsawContactId = jigsawContactId;
        this.LEVEL__c = LEVEL__c;
        this.LOA__c = LOA__c;
        this.lastActivityDate = lastActivityDate;
        this.lastCURequestDate = lastCURequestDate;
        this.lastCUUpdateDate = lastCUUpdateDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastReferencedDate = lastReferencedDate;
        this.lastViewedDate = lastViewedDate;
        this.leadSource = leadSource;
        this.liveChatTranscripts = liveChatTranscripts;
        this.lookedUpFromActivities = lookedUpFromActivities;
        this.lote__c = lote__c;
        this.mailingAddress = mailingAddress;
        this.mailingCity = mailingCity;
        this.mailingCountry = mailingCountry;
        this.mailingGeocodeAccuracy = mailingGeocodeAccuracy;
        this.mailingLatitude = mailingLatitude;
        this.mailingLongitude = mailingLongitude;
        this.mailingPostalCode = mailingPostalCode;
        this.mailingState = mailingState;
        this.mailingStreet = mailingStreet;
        this.marcacion_Corta__c = marcacion_Corta__c;
        this.masterRecord = masterRecord;
        this.masterRecordId = masterRecordId;
        this.mobilePhone = mobilePhone;
        this.movimientos__r = movimientos__r;
        this.name = name;
        this.nivel__c = nivel__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.num_Campa_a_y_Ano__c = num_Campa_a_y_Ano__c;
        this.num_Campa_a_y_Ano_de_Expiracion__c = num_Campa_a_y_Ano_de_Expiracion__c;
        this.openActivities = openActivities;
        this.opportunities = opportunities;
        this.opportunityContactRoles = opportunityContactRoles;
        this.otherAddress = otherAddress;
        this.otherCity = otherCity;
        this.otherCountry = otherCountry;
        this.otherGeocodeAccuracy = otherGeocodeAccuracy;
        this.otherLatitude = otherLatitude;
        this.otherLongitude = otherLongitude;
        this.otherPhone = otherPhone;
        this.otherPostalCode = otherPostalCode;
        this.otherState = otherState;
        this.otherStreet = otherStreet;
        this.owner = owner;
        this.ownerId = ownerId;
        this.POINTSAVAILABLE_CP__c = POINTSAVAILABLE_CP__c;
        this.POINTSAVAILABLE__c = POINTSAVAILABLE__c;
        this.POINTSEXPIRE_CP__c = POINTSEXPIRE_CP__c;
        this.POINTSEXPIRE__c = POINTSEXPIRE__c;
        this.POINTSPENDING_CP__c = POINTSPENDING_CP__c;
        this.POINTSPENDING__c = POINTSPENDING__c;
        this.POINTSSPENT_CP__c = POINTSSPENT_CP__c;
        this.POINTSSPENT__c = POINTSSPENT__c;
        this.personas = personas;
        this.phone = phone;
        this.photoUrl = photoUrl;
        this.posts = posts;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.recordAssociatedGroups = recordAssociatedGroups;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.region__c = region__c;
        this.registro__c = registro__c;
        this.reportsTo = reportsTo;
        this.reportsToId = reportsToId;
        this.salutation = salutation;
        this.serviceContracts = serviceContracts;
        this.shares = shares;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.title = title;
        this.topicAssignments = topicAssignments;
        this.undecidedEventRelations = undecidedEventRelations;
        this.userRecordAccess = userRecordAccess;
        this.YEAREXPIRE_CP__c = YEAREXPIRE_CP__c;
        this.YEAREXPIRE__c = YEAREXPIRE__c;
        this.YEAR__c = YEAR__c;
    }


    /**
     * Gets the ACCUMULATED_SALES__c value for this Contact.
     * 
     * @return ACCUMULATED_SALES__c
     */
    public java.lang.Double getACCUMULATED_SALES__c() {
        return ACCUMULATED_SALES__c;
    }


    /**
     * Sets the ACCUMULATED_SALES__c value for this Contact.
     * 
     * @param ACCUMULATED_SALES__c
     */
    public void setACCUMULATED_SALES__c(java.lang.Double ACCUMULATED_SALES__c) {
        this.ACCUMULATED_SALES__c = ACCUMULATED_SALES__c;
    }


    /**
     * Gets the acceptedEventRelations value for this Contact.
     * 
     * @return acceptedEventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getAcceptedEventRelations() {
        return acceptedEventRelations;
    }


    /**
     * Sets the acceptedEventRelations value for this Contact.
     * 
     * @param acceptedEventRelations
     */
    public void setAcceptedEventRelations(com.sforce.soap.enterprise.QueryResult acceptedEventRelations) {
        this.acceptedEventRelations = acceptedEventRelations;
    }


    /**
     * Gets the account value for this Contact.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this Contact.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountContactRoles value for this Contact.
     * 
     * @return accountContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getAccountContactRoles() {
        return accountContactRoles;
    }


    /**
     * Sets the accountContactRoles value for this Contact.
     * 
     * @param accountContactRoles
     */
    public void setAccountContactRoles(com.sforce.soap.enterprise.QueryResult accountContactRoles) {
        this.accountContactRoles = accountContactRoles;
    }


    /**
     * Gets the accountId value for this Contact.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this Contact.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the activityHistories value for this Contact.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Contact.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the activo__c value for this Contact.
     * 
     * @return activo__c
     */
    public java.lang.Boolean getActivo__c() {
        return activo__c;
    }


    /**
     * Sets the activo__c value for this Contact.
     * 
     * @param activo__c
     */
    public void setActivo__c(java.lang.Boolean activo__c) {
        this.activo__c = activo__c;
    }


    /**
     * Gets the actualizacion_Telefono__c value for this Contact.
     * 
     * @return actualizacion_Telefono__c
     */
    public java.lang.String getActualizacion_Telefono__c() {
        return actualizacion_Telefono__c;
    }


    /**
     * Sets the actualizacion_Telefono__c value for this Contact.
     * 
     * @param actualizacion_Telefono__c
     */
    public void setActualizacion_Telefono__c(java.lang.String actualizacion_Telefono__c) {
        this.actualizacion_Telefono__c = actualizacion_Telefono__c;
    }


    /**
     * Gets the actualizacion_correo_electronico__c value for this Contact.
     * 
     * @return actualizacion_correo_electronico__c
     */
    public java.lang.String getActualizacion_correo_electronico__c() {
        return actualizacion_correo_electronico__c;
    }


    /**
     * Sets the actualizacion_correo_electronico__c value for this Contact.
     * 
     * @param actualizacion_correo_electronico__c
     */
    public void setActualizacion_correo_electronico__c(java.lang.String actualizacion_correo_electronico__c) {
        this.actualizacion_correo_electronico__c = actualizacion_correo_electronico__c;
    }


    /**
     * Gets the afectaci_n__c value for this Contact.
     * 
     * @return afectaci_n__c
     */
    public java.lang.Boolean getAfectaci_n__c() {
        return afectaci_n__c;
    }


    /**
     * Sets the afectaci_n__c value for this Contact.
     * 
     * @param afectaci_n__c
     */
    public void setAfectaci_n__c(java.lang.Boolean afectaci_n__c) {
        this.afectaci_n__c = afectaci_n__c;
    }


    /**
     * Gets the assets value for this Contact.
     * 
     * @return assets
     */
    public com.sforce.soap.enterprise.QueryResult getAssets() {
        return assets;
    }


    /**
     * Sets the assets value for this Contact.
     * 
     * @param assets
     */
    public void setAssets(com.sforce.soap.enterprise.QueryResult assets) {
        this.assets = assets;
    }


    /**
     * Gets the assistantName value for this Contact.
     * 
     * @return assistantName
     */
    public java.lang.String getAssistantName() {
        return assistantName;
    }


    /**
     * Sets the assistantName value for this Contact.
     * 
     * @param assistantName
     */
    public void setAssistantName(java.lang.String assistantName) {
        this.assistantName = assistantName;
    }


    /**
     * Gets the assistantPhone value for this Contact.
     * 
     * @return assistantPhone
     */
    public java.lang.String getAssistantPhone() {
        return assistantPhone;
    }


    /**
     * Sets the assistantPhone value for this Contact.
     * 
     * @param assistantPhone
     */
    public void setAssistantPhone(java.lang.String assistantPhone) {
        this.assistantPhone = assistantPhone;
    }


    /**
     * Gets the attachedContentDocuments value for this Contact.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Contact.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Contact.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Contact.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the birthdate value for this Contact.
     * 
     * @return birthdate
     */
    public java.util.Date getBirthdate() {
        return birthdate;
    }


    /**
     * Sets the birthdate value for this Contact.
     * 
     * @param birthdate
     */
    public void setBirthdate(java.util.Date birthdate) {
        this.birthdate = birthdate;
    }


    /**
     * Gets the CAMPAIGNEXPIRE_CP__c value for this Contact.
     * 
     * @return CAMPAIGNEXPIRE_CP__c
     */
    public java.lang.String getCAMPAIGNEXPIRE_CP__c() {
        return CAMPAIGNEXPIRE_CP__c;
    }


    /**
     * Sets the CAMPAIGNEXPIRE_CP__c value for this Contact.
     * 
     * @param CAMPAIGNEXPIRE_CP__c
     */
    public void setCAMPAIGNEXPIRE_CP__c(java.lang.String CAMPAIGNEXPIRE_CP__c) {
        this.CAMPAIGNEXPIRE_CP__c = CAMPAIGNEXPIRE_CP__c;
    }


    /**
     * Gets the CAMPAIGNEXPIRE__c value for this Contact.
     * 
     * @return CAMPAIGNEXPIRE__c
     */
    public java.lang.String getCAMPAIGNEXPIRE__c() {
        return CAMPAIGNEXPIRE__c;
    }


    /**
     * Sets the CAMPAIGNEXPIRE__c value for this Contact.
     * 
     * @param CAMPAIGNEXPIRE__c
     */
    public void setCAMPAIGNEXPIRE__c(java.lang.String CAMPAIGNEXPIRE__c) {
        this.CAMPAIGNEXPIRE__c = CAMPAIGNEXPIRE__c;
    }


    /**
     * Gets the CAMPAIGN__c value for this Contact.
     * 
     * @return CAMPAIGN__c
     */
    public java.lang.String getCAMPAIGN__c() {
        return CAMPAIGN__c;
    }


    /**
     * Sets the CAMPAIGN__c value for this Contact.
     * 
     * @param CAMPAIGN__c
     */
    public void setCAMPAIGN__c(java.lang.String CAMPAIGN__c) {
        this.CAMPAIGN__c = CAMPAIGN__c;
    }


    /**
     * Gets the COD__c value for this Contact.
     * 
     * @return COD__c
     */
    public java.lang.Double getCOD__c() {
        return COD__c;
    }


    /**
     * Sets the COD__c value for this Contact.
     * 
     * @param COD__c
     */
    public void setCOD__c(java.lang.Double COD__c) {
        this.COD__c = COD__c;
    }


    /**
     * Gets the campaignMembers value for this Contact.
     * 
     * @return campaignMembers
     */
    public com.sforce.soap.enterprise.QueryResult getCampaignMembers() {
        return campaignMembers;
    }


    /**
     * Sets the campaignMembers value for this Contact.
     * 
     * @param campaignMembers
     */
    public void setCampaignMembers(com.sforce.soap.enterprise.QueryResult campaignMembers) {
        this.campaignMembers = campaignMembers;
    }


    /**
     * Gets the campania_Operativa2__c value for this Contact.
     * 
     * @return campania_Operativa2__c
     */
    public java.lang.String getCampania_Operativa2__c() {
        return campania_Operativa2__c;
    }


    /**
     * Sets the campania_Operativa2__c value for this Contact.
     * 
     * @param campania_Operativa2__c
     */
    public void setCampania_Operativa2__c(java.lang.String campania_Operativa2__c) {
        this.campania_Operativa2__c = campania_Operativa2__c;
    }


    /**
     * Gets the campania_Operativa__c value for this Contact.
     * 
     * @return campania_Operativa__c
     */
    public java.lang.String getCampania_Operativa__c() {
        return campania_Operativa__c;
    }


    /**
     * Sets the campania_Operativa__c value for this Contact.
     * 
     * @param campania_Operativa__c
     */
    public void setCampania_Operativa__c(java.lang.String campania_Operativa__c) {
        this.campania_Operativa__c = campania_Operativa__c;
    }


    /**
     * Gets the candidatos__r value for this Contact.
     * 
     * @return candidatos__r
     */
    public com.sforce.soap.enterprise.QueryResult getCandidatos__r() {
        return candidatos__r;
    }


    /**
     * Sets the candidatos__r value for this Contact.
     * 
     * @param candidatos__r
     */
    public void setCandidatos__r(com.sforce.soap.enterprise.QueryResult candidatos__r) {
        this.candidatos__r = candidatos__r;
    }


    /**
     * Gets the caseContactRoles value for this Contact.
     * 
     * @return caseContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getCaseContactRoles() {
        return caseContactRoles;
    }


    /**
     * Sets the caseContactRoles value for this Contact.
     * 
     * @param caseContactRoles
     */
    public void setCaseContactRoles(com.sforce.soap.enterprise.QueryResult caseContactRoles) {
        this.caseContactRoles = caseContactRoles;
    }


    /**
     * Gets the cases value for this Contact.
     * 
     * @return cases
     */
    public com.sforce.soap.enterprise.QueryResult getCases() {
        return cases;
    }


    /**
     * Sets the cases value for this Contact.
     * 
     * @param cases
     */
    public void setCases(com.sforce.soap.enterprise.QueryResult cases) {
        this.cases = cases;
    }


    /**
     * Gets the casos1__r value for this Contact.
     * 
     * @return casos1__r
     */
    public com.sforce.soap.enterprise.QueryResult getCasos1__r() {
        return casos1__r;
    }


    /**
     * Sets the casos1__r value for this Contact.
     * 
     * @param casos1__r
     */
    public void setCasos1__r(com.sforce.soap.enterprise.QueryResult casos1__r) {
        this.casos1__r = casos1__r;
    }


    /**
     * Gets the casos__r value for this Contact.
     * 
     * @return casos__r
     */
    public com.sforce.soap.enterprise.QueryResult getCasos__r() {
        return casos__r;
    }


    /**
     * Sets the casos__r value for this Contact.
     * 
     * @param casos__r
     */
    public void setCasos__r(com.sforce.soap.enterprise.QueryResult casos__r) {
        this.casos__r = casos__r;
    }


    /**
     * Gets the combinedAttachments value for this Contact.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Contact.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the contractContactRoles value for this Contact.
     * 
     * @return contractContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getContractContactRoles() {
        return contractContactRoles;
    }


    /**
     * Sets the contractContactRoles value for this Contact.
     * 
     * @param contractContactRoles
     */
    public void setContractContactRoles(com.sforce.soap.enterprise.QueryResult contractContactRoles) {
        this.contractContactRoles = contractContactRoles;
    }


    /**
     * Gets the contractsSigned value for this Contact.
     * 
     * @return contractsSigned
     */
    public com.sforce.soap.enterprise.QueryResult getContractsSigned() {
        return contractsSigned;
    }


    /**
     * Sets the contractsSigned value for this Contact.
     * 
     * @param contractsSigned
     */
    public void setContractsSigned(com.sforce.soap.enterprise.QueryResult contractsSigned) {
        this.contractsSigned = contractsSigned;
    }


    /**
     * Gets the createdBy value for this Contact.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Contact.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Contact.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Contact.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Contact.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Contact.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the cuentas__r value for this Contact.
     * 
     * @return cuentas__r
     */
    public com.sforce.soap.enterprise.QueryResult getCuentas__r() {
        return cuentas__r;
    }


    /**
     * Sets the cuentas__r value for this Contact.
     * 
     * @param cuentas__r
     */
    public void setCuentas__r(com.sforce.soap.enterprise.QueryResult cuentas__r) {
        this.cuentas__r = cuentas__r;
    }


    /**
     * Gets the declinedEventRelations value for this Contact.
     * 
     * @return declinedEventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getDeclinedEventRelations() {
        return declinedEventRelations;
    }


    /**
     * Sets the declinedEventRelations value for this Contact.
     * 
     * @param declinedEventRelations
     */
    public void setDeclinedEventRelations(com.sforce.soap.enterprise.QueryResult declinedEventRelations) {
        this.declinedEventRelations = declinedEventRelations;
    }


    /**
     * Gets the department value for this Contact.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Contact.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the description value for this Contact.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Contact.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dias_de_bodega2__c value for this Contact.
     * 
     * @return dias_de_bodega2__c
     */
    public java.util.Date getDias_de_bodega2__c() {
        return dias_de_bodega2__c;
    }


    /**
     * Sets the dias_de_bodega2__c value for this Contact.
     * 
     * @param dias_de_bodega2__c
     */
    public void setDias_de_bodega2__c(java.util.Date dias_de_bodega2__c) {
        this.dias_de_bodega2__c = dias_de_bodega2__c;
    }


    /**
     * Gets the dias_de_bodega__c value for this Contact.
     * 
     * @return dias_de_bodega__c
     */
    public java.util.Date getDias_de_bodega__c() {
        return dias_de_bodega__c;
    }


    /**
     * Sets the dias_de_bodega__c value for this Contact.
     * 
     * @param dias_de_bodega__c
     */
    public void setDias_de_bodega__c(java.util.Date dias_de_bodega__c) {
        this.dias_de_bodega__c = dias_de_bodega__c;
    }


    /**
     * Gets the digitos__c value for this Contact.
     * 
     * @return digitos__c
     */
    public java.lang.String getDigitos__c() {
        return digitos__c;
    }


    /**
     * Sets the digitos__c value for this Contact.
     * 
     * @param digitos__c
     */
    public void setDigitos__c(java.lang.String digitos__c) {
        this.digitos__c = digitos__c;
    }


    /**
     * Gets the division__c value for this Contact.
     * 
     * @return division__c
     */
    public java.lang.String getDivision__c() {
        return division__c;
    }


    /**
     * Sets the division__c value for this Contact.
     * 
     * @param division__c
     */
    public void setDivision__c(java.lang.String division__c) {
        this.division__c = division__c;
    }


    /**
     * Gets the duplicateRecordItems value for this Contact.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Contact.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the email value for this Contact.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Contact.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emailBouncedDate value for this Contact.
     * 
     * @return emailBouncedDate
     */
    public java.util.Calendar getEmailBouncedDate() {
        return emailBouncedDate;
    }


    /**
     * Sets the emailBouncedDate value for this Contact.
     * 
     * @param emailBouncedDate
     */
    public void setEmailBouncedDate(java.util.Calendar emailBouncedDate) {
        this.emailBouncedDate = emailBouncedDate;
    }


    /**
     * Gets the emailBouncedReason value for this Contact.
     * 
     * @return emailBouncedReason
     */
    public java.lang.String getEmailBouncedReason() {
        return emailBouncedReason;
    }


    /**
     * Sets the emailBouncedReason value for this Contact.
     * 
     * @param emailBouncedReason
     */
    public void setEmailBouncedReason(java.lang.String emailBouncedReason) {
        this.emailBouncedReason = emailBouncedReason;
    }


    /**
     * Gets the emailStatuses value for this Contact.
     * 
     * @return emailStatuses
     */
    public com.sforce.soap.enterprise.QueryResult getEmailStatuses() {
        return emailStatuses;
    }


    /**
     * Sets the emailStatuses value for this Contact.
     * 
     * @param emailStatuses
     */
    public void setEmailStatuses(com.sforce.soap.enterprise.QueryResult emailStatuses) {
        this.emailStatuses = emailStatuses;
    }


    /**
     * Gets the entitlementContacts value for this Contact.
     * 
     * @return entitlementContacts
     */
    public com.sforce.soap.enterprise.QueryResult getEntitlementContacts() {
        return entitlementContacts;
    }


    /**
     * Sets the entitlementContacts value for this Contact.
     * 
     * @param entitlementContacts
     */
    public void setEntitlementContacts(com.sforce.soap.enterprise.QueryResult entitlementContacts) {
        this.entitlementContacts = entitlementContacts;
    }


    /**
     * Gets the eventRelations value for this Contact.
     * 
     * @return eventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getEventRelations() {
        return eventRelations;
    }


    /**
     * Sets the eventRelations value for this Contact.
     * 
     * @param eventRelations
     */
    public void setEventRelations(com.sforce.soap.enterprise.QueryResult eventRelations) {
        this.eventRelations = eventRelations;
    }


    /**
     * Gets the events value for this Contact.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Contact.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the fax value for this Contact.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Contact.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the fecha_Proceso__c value for this Contact.
     * 
     * @return fecha_Proceso__c
     */
    public java.util.Date getFecha_Proceso__c() {
        return fecha_Proceso__c;
    }


    /**
     * Sets the fecha_Proceso__c value for this Contact.
     * 
     * @param fecha_Proceso__c
     */
    public void setFecha_Proceso__c(java.util.Date fecha_Proceso__c) {
        this.fecha_Proceso__c = fecha_Proceso__c;
    }


    /**
     * Gets the fecha_Ultimo_Reparto__c value for this Contact.
     * 
     * @return fecha_Ultimo_Reparto__c
     */
    public java.util.Date getFecha_Ultimo_Reparto__c() {
        return fecha_Ultimo_Reparto__c;
    }


    /**
     * Sets the fecha_Ultimo_Reparto__c value for this Contact.
     * 
     * @param fecha_Ultimo_Reparto__c
     */
    public void setFecha_Ultimo_Reparto__c(java.util.Date fecha_Ultimo_Reparto__c) {
        this.fecha_Ultimo_Reparto__c = fecha_Ultimo_Reparto__c;
    }


    /**
     * Gets the fecha_de_cierre_web2__c value for this Contact.
     * 
     * @return fecha_de_cierre_web2__c
     */
    public java.util.Date getFecha_de_cierre_web2__c() {
        return fecha_de_cierre_web2__c;
    }


    /**
     * Sets the fecha_de_cierre_web2__c value for this Contact.
     * 
     * @param fecha_de_cierre_web2__c
     */
    public void setFecha_de_cierre_web2__c(java.util.Date fecha_de_cierre_web2__c) {
        this.fecha_de_cierre_web2__c = fecha_de_cierre_web2__c;
    }


    /**
     * Gets the fecha_de_cierre_web__c value for this Contact.
     * 
     * @return fecha_de_cierre_web__c
     */
    public java.util.Date getFecha_de_cierre_web__c() {
        return fecha_de_cierre_web__c;
    }


    /**
     * Sets the fecha_de_cierre_web__c value for this Contact.
     * 
     * @param fecha_de_cierre_web__c
     */
    public void setFecha_de_cierre_web__c(java.util.Date fecha_de_cierre_web__c) {
        this.fecha_de_cierre_web__c = fecha_de_cierre_web__c;
    }


    /**
     * Gets the fecha_de_facturacion2__c value for this Contact.
     * 
     * @return fecha_de_facturacion2__c
     */
    public java.util.Date getFecha_de_facturacion2__c() {
        return fecha_de_facturacion2__c;
    }


    /**
     * Sets the fecha_de_facturacion2__c value for this Contact.
     * 
     * @param fecha_de_facturacion2__c
     */
    public void setFecha_de_facturacion2__c(java.util.Date fecha_de_facturacion2__c) {
        this.fecha_de_facturacion2__c = fecha_de_facturacion2__c;
    }


    /**
     * Gets the fecha_de_facturacion__c value for this Contact.
     * 
     * @return fecha_de_facturacion__c
     */
    public java.util.Date getFecha_de_facturacion__c() {
        return fecha_de_facturacion__c;
    }


    /**
     * Sets the fecha_de_facturacion__c value for this Contact.
     * 
     * @param fecha_de_facturacion__c
     */
    public void setFecha_de_facturacion__c(java.util.Date fecha_de_facturacion__c) {
        this.fecha_de_facturacion__c = fecha_de_facturacion__c;
    }


    /**
     * Gets the fecha_de_reparto2__c value for this Contact.
     * 
     * @return fecha_de_reparto2__c
     */
    public java.util.Date getFecha_de_reparto2__c() {
        return fecha_de_reparto2__c;
    }


    /**
     * Sets the fecha_de_reparto2__c value for this Contact.
     * 
     * @param fecha_de_reparto2__c
     */
    public void setFecha_de_reparto2__c(java.util.Date fecha_de_reparto2__c) {
        this.fecha_de_reparto2__c = fecha_de_reparto2__c;
    }


    /**
     * Gets the fecha_de_reparto__c value for this Contact.
     * 
     * @return fecha_de_reparto__c
     */
    public java.util.Date getFecha_de_reparto__c() {
        return fecha_de_reparto__c;
    }


    /**
     * Sets the fecha_de_reparto__c value for this Contact.
     * 
     * @param fecha_de_reparto__c
     */
    public void setFecha_de_reparto__c(java.util.Date fecha_de_reparto__c) {
        this.fecha_de_reparto__c = fecha_de_reparto__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Contact.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Contact.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this Contact.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this Contact.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the ficha__c value for this Contact.
     * 
     * @return ficha__c
     */
    public java.lang.Double getFicha__c() {
        return ficha__c;
    }


    /**
     * Sets the ficha__c value for this Contact.
     * 
     * @param ficha__c
     */
    public void setFicha__c(java.lang.Double ficha__c) {
        this.ficha__c = ficha__c;
    }


    /**
     * Gets the firstName value for this Contact.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Contact.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the histories value for this Contact.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Contact.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the homePhone value for this Contact.
     * 
     * @return homePhone
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this Contact.
     * 
     * @param homePhone
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the IDCOUNTRY__c value for this Contact.
     * 
     * @return IDCOUNTRY__c
     */
    public java.lang.String getIDCOUNTRY__c() {
        return IDCOUNTRY__c;
    }


    /**
     * Sets the IDCOUNTRY__c value for this Contact.
     * 
     * @param IDCOUNTRY__c
     */
    public void setIDCOUNTRY__c(java.lang.String IDCOUNTRY__c) {
        this.IDCOUNTRY__c = IDCOUNTRY__c;
    }


    /**
     * Gets the isDeleted value for this Contact.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Contact.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isEmailBounced value for this Contact.
     * 
     * @return isEmailBounced
     */
    public java.lang.Boolean getIsEmailBounced() {
        return isEmailBounced;
    }


    /**
     * Sets the isEmailBounced value for this Contact.
     * 
     * @param isEmailBounced
     */
    public void setIsEmailBounced(java.lang.Boolean isEmailBounced) {
        this.isEmailBounced = isEmailBounced;
    }


    /**
     * Gets the jigsaw value for this Contact.
     * 
     * @return jigsaw
     */
    public java.lang.String getJigsaw() {
        return jigsaw;
    }


    /**
     * Sets the jigsaw value for this Contact.
     * 
     * @param jigsaw
     */
    public void setJigsaw(java.lang.String jigsaw) {
        this.jigsaw = jigsaw;
    }


    /**
     * Gets the jigsawContactId value for this Contact.
     * 
     * @return jigsawContactId
     */
    public java.lang.String getJigsawContactId() {
        return jigsawContactId;
    }


    /**
     * Sets the jigsawContactId value for this Contact.
     * 
     * @param jigsawContactId
     */
    public void setJigsawContactId(java.lang.String jigsawContactId) {
        this.jigsawContactId = jigsawContactId;
    }


    /**
     * Gets the LEVEL__c value for this Contact.
     * 
     * @return LEVEL__c
     */
    public java.lang.String getLEVEL__c() {
        return LEVEL__c;
    }


    /**
     * Sets the LEVEL__c value for this Contact.
     * 
     * @param LEVEL__c
     */
    public void setLEVEL__c(java.lang.String LEVEL__c) {
        this.LEVEL__c = LEVEL__c;
    }


    /**
     * Gets the LOA__c value for this Contact.
     * 
     * @return LOA__c
     */
    public java.lang.String getLOA__c() {
        return LOA__c;
    }


    /**
     * Sets the LOA__c value for this Contact.
     * 
     * @param LOA__c
     */
    public void setLOA__c(java.lang.String LOA__c) {
        this.LOA__c = LOA__c;
    }


    /**
     * Gets the lastActivityDate value for this Contact.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Contact.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastCURequestDate value for this Contact.
     * 
     * @return lastCURequestDate
     */
    public java.util.Calendar getLastCURequestDate() {
        return lastCURequestDate;
    }


    /**
     * Sets the lastCURequestDate value for this Contact.
     * 
     * @param lastCURequestDate
     */
    public void setLastCURequestDate(java.util.Calendar lastCURequestDate) {
        this.lastCURequestDate = lastCURequestDate;
    }


    /**
     * Gets the lastCUUpdateDate value for this Contact.
     * 
     * @return lastCUUpdateDate
     */
    public java.util.Calendar getLastCUUpdateDate() {
        return lastCUUpdateDate;
    }


    /**
     * Sets the lastCUUpdateDate value for this Contact.
     * 
     * @param lastCUUpdateDate
     */
    public void setLastCUUpdateDate(java.util.Calendar lastCUUpdateDate) {
        this.lastCUUpdateDate = lastCUUpdateDate;
    }


    /**
     * Gets the lastModifiedBy value for this Contact.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Contact.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Contact.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Contact.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Contact.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Contact.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this Contact.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Contact.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastReferencedDate value for this Contact.
     * 
     * @return lastReferencedDate
     */
    public java.util.Calendar getLastReferencedDate() {
        return lastReferencedDate;
    }


    /**
     * Sets the lastReferencedDate value for this Contact.
     * 
     * @param lastReferencedDate
     */
    public void setLastReferencedDate(java.util.Calendar lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }


    /**
     * Gets the lastViewedDate value for this Contact.
     * 
     * @return lastViewedDate
     */
    public java.util.Calendar getLastViewedDate() {
        return lastViewedDate;
    }


    /**
     * Sets the lastViewedDate value for this Contact.
     * 
     * @param lastViewedDate
     */
    public void setLastViewedDate(java.util.Calendar lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }


    /**
     * Gets the leadSource value for this Contact.
     * 
     * @return leadSource
     */
    public java.lang.String getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this Contact.
     * 
     * @param leadSource
     */
    public void setLeadSource(java.lang.String leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the liveChatTranscripts value for this Contact.
     * 
     * @return liveChatTranscripts
     */
    public com.sforce.soap.enterprise.QueryResult getLiveChatTranscripts() {
        return liveChatTranscripts;
    }


    /**
     * Sets the liveChatTranscripts value for this Contact.
     * 
     * @param liveChatTranscripts
     */
    public void setLiveChatTranscripts(com.sforce.soap.enterprise.QueryResult liveChatTranscripts) {
        this.liveChatTranscripts = liveChatTranscripts;
    }


    /**
     * Gets the lookedUpFromActivities value for this Contact.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Contact.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the lote__c value for this Contact.
     * 
     * @return lote__c
     */
    public java.lang.String getLote__c() {
        return lote__c;
    }


    /**
     * Sets the lote__c value for this Contact.
     * 
     * @param lote__c
     */
    public void setLote__c(java.lang.String lote__c) {
        this.lote__c = lote__c;
    }


    /**
     * Gets the mailingAddress value for this Contact.
     * 
     * @return mailingAddress
     */
    public com.sforce.soap.enterprise.Address getMailingAddress() {
        return mailingAddress;
    }


    /**
     * Sets the mailingAddress value for this Contact.
     * 
     * @param mailingAddress
     */
    public void setMailingAddress(com.sforce.soap.enterprise.Address mailingAddress) {
        this.mailingAddress = mailingAddress;
    }


    /**
     * Gets the mailingCity value for this Contact.
     * 
     * @return mailingCity
     */
    public java.lang.String getMailingCity() {
        return mailingCity;
    }


    /**
     * Sets the mailingCity value for this Contact.
     * 
     * @param mailingCity
     */
    public void setMailingCity(java.lang.String mailingCity) {
        this.mailingCity = mailingCity;
    }


    /**
     * Gets the mailingCountry value for this Contact.
     * 
     * @return mailingCountry
     */
    public java.lang.String getMailingCountry() {
        return mailingCountry;
    }


    /**
     * Sets the mailingCountry value for this Contact.
     * 
     * @param mailingCountry
     */
    public void setMailingCountry(java.lang.String mailingCountry) {
        this.mailingCountry = mailingCountry;
    }


    /**
     * Gets the mailingGeocodeAccuracy value for this Contact.
     * 
     * @return mailingGeocodeAccuracy
     */
    public java.lang.String getMailingGeocodeAccuracy() {
        return mailingGeocodeAccuracy;
    }


    /**
     * Sets the mailingGeocodeAccuracy value for this Contact.
     * 
     * @param mailingGeocodeAccuracy
     */
    public void setMailingGeocodeAccuracy(java.lang.String mailingGeocodeAccuracy) {
        this.mailingGeocodeAccuracy = mailingGeocodeAccuracy;
    }


    /**
     * Gets the mailingLatitude value for this Contact.
     * 
     * @return mailingLatitude
     */
    public java.lang.Double getMailingLatitude() {
        return mailingLatitude;
    }


    /**
     * Sets the mailingLatitude value for this Contact.
     * 
     * @param mailingLatitude
     */
    public void setMailingLatitude(java.lang.Double mailingLatitude) {
        this.mailingLatitude = mailingLatitude;
    }


    /**
     * Gets the mailingLongitude value for this Contact.
     * 
     * @return mailingLongitude
     */
    public java.lang.Double getMailingLongitude() {
        return mailingLongitude;
    }


    /**
     * Sets the mailingLongitude value for this Contact.
     * 
     * @param mailingLongitude
     */
    public void setMailingLongitude(java.lang.Double mailingLongitude) {
        this.mailingLongitude = mailingLongitude;
    }


    /**
     * Gets the mailingPostalCode value for this Contact.
     * 
     * @return mailingPostalCode
     */
    public java.lang.String getMailingPostalCode() {
        return mailingPostalCode;
    }


    /**
     * Sets the mailingPostalCode value for this Contact.
     * 
     * @param mailingPostalCode
     */
    public void setMailingPostalCode(java.lang.String mailingPostalCode) {
        this.mailingPostalCode = mailingPostalCode;
    }


    /**
     * Gets the mailingState value for this Contact.
     * 
     * @return mailingState
     */
    public java.lang.String getMailingState() {
        return mailingState;
    }


    /**
     * Sets the mailingState value for this Contact.
     * 
     * @param mailingState
     */
    public void setMailingState(java.lang.String mailingState) {
        this.mailingState = mailingState;
    }


    /**
     * Gets the mailingStreet value for this Contact.
     * 
     * @return mailingStreet
     */
    public java.lang.String getMailingStreet() {
        return mailingStreet;
    }


    /**
     * Sets the mailingStreet value for this Contact.
     * 
     * @param mailingStreet
     */
    public void setMailingStreet(java.lang.String mailingStreet) {
        this.mailingStreet = mailingStreet;
    }


    /**
     * Gets the marcacion_Corta__c value for this Contact.
     * 
     * @return marcacion_Corta__c
     */
    public java.lang.String getMarcacion_Corta__c() {
        return marcacion_Corta__c;
    }


    /**
     * Sets the marcacion_Corta__c value for this Contact.
     * 
     * @param marcacion_Corta__c
     */
    public void setMarcacion_Corta__c(java.lang.String marcacion_Corta__c) {
        this.marcacion_Corta__c = marcacion_Corta__c;
    }


    /**
     * Gets the masterRecord value for this Contact.
     * 
     * @return masterRecord
     */
    public com.sforce.soap.enterprise.sobject.Contact getMasterRecord() {
        return masterRecord;
    }


    /**
     * Sets the masterRecord value for this Contact.
     * 
     * @param masterRecord
     */
    public void setMasterRecord(com.sforce.soap.enterprise.sobject.Contact masterRecord) {
        this.masterRecord = masterRecord;
    }


    /**
     * Gets the masterRecordId value for this Contact.
     * 
     * @return masterRecordId
     */
    public java.lang.String getMasterRecordId() {
        return masterRecordId;
    }


    /**
     * Sets the masterRecordId value for this Contact.
     * 
     * @param masterRecordId
     */
    public void setMasterRecordId(java.lang.String masterRecordId) {
        this.masterRecordId = masterRecordId;
    }


    /**
     * Gets the mobilePhone value for this Contact.
     * 
     * @return mobilePhone
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this Contact.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the movimientos__r value for this Contact.
     * 
     * @return movimientos__r
     */
    public com.sforce.soap.enterprise.QueryResult getMovimientos__r() {
        return movimientos__r;
    }


    /**
     * Sets the movimientos__r value for this Contact.
     * 
     * @param movimientos__r
     */
    public void setMovimientos__r(com.sforce.soap.enterprise.QueryResult movimientos__r) {
        this.movimientos__r = movimientos__r;
    }


    /**
     * Gets the name value for this Contact.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Contact.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nivel__c value for this Contact.
     * 
     * @return nivel__c
     */
    public java.lang.String getNivel__c() {
        return nivel__c;
    }


    /**
     * Sets the nivel__c value for this Contact.
     * 
     * @param nivel__c
     */
    public void setNivel__c(java.lang.String nivel__c) {
        this.nivel__c = nivel__c;
    }


    /**
     * Gets the notes value for this Contact.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Contact.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Contact.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Contact.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the num_Campa_a_y_Ano__c value for this Contact.
     * 
     * @return num_Campa_a_y_Ano__c
     */
    public java.lang.String getNum_Campa_a_y_Ano__c() {
        return num_Campa_a_y_Ano__c;
    }


    /**
     * Sets the num_Campa_a_y_Ano__c value for this Contact.
     * 
     * @param num_Campa_a_y_Ano__c
     */
    public void setNum_Campa_a_y_Ano__c(java.lang.String num_Campa_a_y_Ano__c) {
        this.num_Campa_a_y_Ano__c = num_Campa_a_y_Ano__c;
    }


    /**
     * Gets the num_Campa_a_y_Ano_de_Expiracion__c value for this Contact.
     * 
     * @return num_Campa_a_y_Ano_de_Expiracion__c
     */
    public java.lang.String getNum_Campa_a_y_Ano_de_Expiracion__c() {
        return num_Campa_a_y_Ano_de_Expiracion__c;
    }


    /**
     * Sets the num_Campa_a_y_Ano_de_Expiracion__c value for this Contact.
     * 
     * @param num_Campa_a_y_Ano_de_Expiracion__c
     */
    public void setNum_Campa_a_y_Ano_de_Expiracion__c(java.lang.String num_Campa_a_y_Ano_de_Expiracion__c) {
        this.num_Campa_a_y_Ano_de_Expiracion__c = num_Campa_a_y_Ano_de_Expiracion__c;
    }


    /**
     * Gets the openActivities value for this Contact.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Contact.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the opportunities value for this Contact.
     * 
     * @return opportunities
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunities() {
        return opportunities;
    }


    /**
     * Sets the opportunities value for this Contact.
     * 
     * @param opportunities
     */
    public void setOpportunities(com.sforce.soap.enterprise.QueryResult opportunities) {
        this.opportunities = opportunities;
    }


    /**
     * Gets the opportunityContactRoles value for this Contact.
     * 
     * @return opportunityContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getOpportunityContactRoles() {
        return opportunityContactRoles;
    }


    /**
     * Sets the opportunityContactRoles value for this Contact.
     * 
     * @param opportunityContactRoles
     */
    public void setOpportunityContactRoles(com.sforce.soap.enterprise.QueryResult opportunityContactRoles) {
        this.opportunityContactRoles = opportunityContactRoles;
    }


    /**
     * Gets the otherAddress value for this Contact.
     * 
     * @return otherAddress
     */
    public com.sforce.soap.enterprise.Address getOtherAddress() {
        return otherAddress;
    }


    /**
     * Sets the otherAddress value for this Contact.
     * 
     * @param otherAddress
     */
    public void setOtherAddress(com.sforce.soap.enterprise.Address otherAddress) {
        this.otherAddress = otherAddress;
    }


    /**
     * Gets the otherCity value for this Contact.
     * 
     * @return otherCity
     */
    public java.lang.String getOtherCity() {
        return otherCity;
    }


    /**
     * Sets the otherCity value for this Contact.
     * 
     * @param otherCity
     */
    public void setOtherCity(java.lang.String otherCity) {
        this.otherCity = otherCity;
    }


    /**
     * Gets the otherCountry value for this Contact.
     * 
     * @return otherCountry
     */
    public java.lang.String getOtherCountry() {
        return otherCountry;
    }


    /**
     * Sets the otherCountry value for this Contact.
     * 
     * @param otherCountry
     */
    public void setOtherCountry(java.lang.String otherCountry) {
        this.otherCountry = otherCountry;
    }


    /**
     * Gets the otherGeocodeAccuracy value for this Contact.
     * 
     * @return otherGeocodeAccuracy
     */
    public java.lang.String getOtherGeocodeAccuracy() {
        return otherGeocodeAccuracy;
    }


    /**
     * Sets the otherGeocodeAccuracy value for this Contact.
     * 
     * @param otherGeocodeAccuracy
     */
    public void setOtherGeocodeAccuracy(java.lang.String otherGeocodeAccuracy) {
        this.otherGeocodeAccuracy = otherGeocodeAccuracy;
    }


    /**
     * Gets the otherLatitude value for this Contact.
     * 
     * @return otherLatitude
     */
    public java.lang.Double getOtherLatitude() {
        return otherLatitude;
    }


    /**
     * Sets the otherLatitude value for this Contact.
     * 
     * @param otherLatitude
     */
    public void setOtherLatitude(java.lang.Double otherLatitude) {
        this.otherLatitude = otherLatitude;
    }


    /**
     * Gets the otherLongitude value for this Contact.
     * 
     * @return otherLongitude
     */
    public java.lang.Double getOtherLongitude() {
        return otherLongitude;
    }


    /**
     * Sets the otherLongitude value for this Contact.
     * 
     * @param otherLongitude
     */
    public void setOtherLongitude(java.lang.Double otherLongitude) {
        this.otherLongitude = otherLongitude;
    }


    /**
     * Gets the otherPhone value for this Contact.
     * 
     * @return otherPhone
     */
    public java.lang.String getOtherPhone() {
        return otherPhone;
    }


    /**
     * Sets the otherPhone value for this Contact.
     * 
     * @param otherPhone
     */
    public void setOtherPhone(java.lang.String otherPhone) {
        this.otherPhone = otherPhone;
    }


    /**
     * Gets the otherPostalCode value for this Contact.
     * 
     * @return otherPostalCode
     */
    public java.lang.String getOtherPostalCode() {
        return otherPostalCode;
    }


    /**
     * Sets the otherPostalCode value for this Contact.
     * 
     * @param otherPostalCode
     */
    public void setOtherPostalCode(java.lang.String otherPostalCode) {
        this.otherPostalCode = otherPostalCode;
    }


    /**
     * Gets the otherState value for this Contact.
     * 
     * @return otherState
     */
    public java.lang.String getOtherState() {
        return otherState;
    }


    /**
     * Sets the otherState value for this Contact.
     * 
     * @param otherState
     */
    public void setOtherState(java.lang.String otherState) {
        this.otherState = otherState;
    }


    /**
     * Gets the otherStreet value for this Contact.
     * 
     * @return otherStreet
     */
    public java.lang.String getOtherStreet() {
        return otherStreet;
    }


    /**
     * Sets the otherStreet value for this Contact.
     * 
     * @param otherStreet
     */
    public void setOtherStreet(java.lang.String otherStreet) {
        this.otherStreet = otherStreet;
    }


    /**
     * Gets the owner value for this Contact.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.User getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Contact.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.User owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this Contact.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this Contact.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the POINTSAVAILABLE_CP__c value for this Contact.
     * 
     * @return POINTSAVAILABLE_CP__c
     */
    public java.lang.Double getPOINTSAVAILABLE_CP__c() {
        return POINTSAVAILABLE_CP__c;
    }


    /**
     * Sets the POINTSAVAILABLE_CP__c value for this Contact.
     * 
     * @param POINTSAVAILABLE_CP__c
     */
    public void setPOINTSAVAILABLE_CP__c(java.lang.Double POINTSAVAILABLE_CP__c) {
        this.POINTSAVAILABLE_CP__c = POINTSAVAILABLE_CP__c;
    }


    /**
     * Gets the POINTSAVAILABLE__c value for this Contact.
     * 
     * @return POINTSAVAILABLE__c
     */
    public java.lang.Double getPOINTSAVAILABLE__c() {
        return POINTSAVAILABLE__c;
    }


    /**
     * Sets the POINTSAVAILABLE__c value for this Contact.
     * 
     * @param POINTSAVAILABLE__c
     */
    public void setPOINTSAVAILABLE__c(java.lang.Double POINTSAVAILABLE__c) {
        this.POINTSAVAILABLE__c = POINTSAVAILABLE__c;
    }


    /**
     * Gets the POINTSEXPIRE_CP__c value for this Contact.
     * 
     * @return POINTSEXPIRE_CP__c
     */
    public java.lang.Double getPOINTSEXPIRE_CP__c() {
        return POINTSEXPIRE_CP__c;
    }


    /**
     * Sets the POINTSEXPIRE_CP__c value for this Contact.
     * 
     * @param POINTSEXPIRE_CP__c
     */
    public void setPOINTSEXPIRE_CP__c(java.lang.Double POINTSEXPIRE_CP__c) {
        this.POINTSEXPIRE_CP__c = POINTSEXPIRE_CP__c;
    }


    /**
     * Gets the POINTSEXPIRE__c value for this Contact.
     * 
     * @return POINTSEXPIRE__c
     */
    public java.lang.Double getPOINTSEXPIRE__c() {
        return POINTSEXPIRE__c;
    }


    /**
     * Sets the POINTSEXPIRE__c value for this Contact.
     * 
     * @param POINTSEXPIRE__c
     */
    public void setPOINTSEXPIRE__c(java.lang.Double POINTSEXPIRE__c) {
        this.POINTSEXPIRE__c = POINTSEXPIRE__c;
    }


    /**
     * Gets the POINTSPENDING_CP__c value for this Contact.
     * 
     * @return POINTSPENDING_CP__c
     */
    public java.lang.Double getPOINTSPENDING_CP__c() {
        return POINTSPENDING_CP__c;
    }


    /**
     * Sets the POINTSPENDING_CP__c value for this Contact.
     * 
     * @param POINTSPENDING_CP__c
     */
    public void setPOINTSPENDING_CP__c(java.lang.Double POINTSPENDING_CP__c) {
        this.POINTSPENDING_CP__c = POINTSPENDING_CP__c;
    }


    /**
     * Gets the POINTSPENDING__c value for this Contact.
     * 
     * @return POINTSPENDING__c
     */
    public java.lang.Double getPOINTSPENDING__c() {
        return POINTSPENDING__c;
    }


    /**
     * Sets the POINTSPENDING__c value for this Contact.
     * 
     * @param POINTSPENDING__c
     */
    public void setPOINTSPENDING__c(java.lang.Double POINTSPENDING__c) {
        this.POINTSPENDING__c = POINTSPENDING__c;
    }


    /**
     * Gets the POINTSSPENT_CP__c value for this Contact.
     * 
     * @return POINTSSPENT_CP__c
     */
    public java.lang.Double getPOINTSSPENT_CP__c() {
        return POINTSSPENT_CP__c;
    }


    /**
     * Sets the POINTSSPENT_CP__c value for this Contact.
     * 
     * @param POINTSSPENT_CP__c
     */
    public void setPOINTSSPENT_CP__c(java.lang.Double POINTSSPENT_CP__c) {
        this.POINTSSPENT_CP__c = POINTSSPENT_CP__c;
    }


    /**
     * Gets the POINTSSPENT__c value for this Contact.
     * 
     * @return POINTSSPENT__c
     */
    public java.lang.Double getPOINTSSPENT__c() {
        return POINTSSPENT__c;
    }


    /**
     * Sets the POINTSSPENT__c value for this Contact.
     * 
     * @param POINTSSPENT__c
     */
    public void setPOINTSSPENT__c(java.lang.Double POINTSSPENT__c) {
        this.POINTSSPENT__c = POINTSSPENT__c;
    }


    /**
     * Gets the personas value for this Contact.
     * 
     * @return personas
     */
    public com.sforce.soap.enterprise.QueryResult getPersonas() {
        return personas;
    }


    /**
     * Sets the personas value for this Contact.
     * 
     * @param personas
     */
    public void setPersonas(com.sforce.soap.enterprise.QueryResult personas) {
        this.personas = personas;
    }


    /**
     * Gets the phone value for this Contact.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Contact.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the photoUrl value for this Contact.
     * 
     * @return photoUrl
     */
    public java.lang.String getPhotoUrl() {
        return photoUrl;
    }


    /**
     * Sets the photoUrl value for this Contact.
     * 
     * @param photoUrl
     */
    public void setPhotoUrl(java.lang.String photoUrl) {
        this.photoUrl = photoUrl;
    }


    /**
     * Gets the posts value for this Contact.
     * 
     * @return posts
     */
    public com.sforce.soap.enterprise.QueryResult getPosts() {
        return posts;
    }


    /**
     * Sets the posts value for this Contact.
     * 
     * @param posts
     */
    public void setPosts(com.sforce.soap.enterprise.QueryResult posts) {
        this.posts = posts;
    }


    /**
     * Gets the processInstances value for this Contact.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Contact.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Contact.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Contact.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the recordAssociatedGroups value for this Contact.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Contact.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the recordType value for this Contact.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Contact.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Contact.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Contact.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the region__c value for this Contact.
     * 
     * @return region__c
     */
    public java.lang.String getRegion__c() {
        return region__c;
    }


    /**
     * Sets the region__c value for this Contact.
     * 
     * @param region__c
     */
    public void setRegion__c(java.lang.String region__c) {
        this.region__c = region__c;
    }


    /**
     * Gets the registro__c value for this Contact.
     * 
     * @return registro__c
     */
    public java.lang.String getRegistro__c() {
        return registro__c;
    }


    /**
     * Sets the registro__c value for this Contact.
     * 
     * @param registro__c
     */
    public void setRegistro__c(java.lang.String registro__c) {
        this.registro__c = registro__c;
    }


    /**
     * Gets the reportsTo value for this Contact.
     * 
     * @return reportsTo
     */
    public com.sforce.soap.enterprise.sobject.Contact getReportsTo() {
        return reportsTo;
    }


    /**
     * Sets the reportsTo value for this Contact.
     * 
     * @param reportsTo
     */
    public void setReportsTo(com.sforce.soap.enterprise.sobject.Contact reportsTo) {
        this.reportsTo = reportsTo;
    }


    /**
     * Gets the reportsToId value for this Contact.
     * 
     * @return reportsToId
     */
    public java.lang.String getReportsToId() {
        return reportsToId;
    }


    /**
     * Sets the reportsToId value for this Contact.
     * 
     * @param reportsToId
     */
    public void setReportsToId(java.lang.String reportsToId) {
        this.reportsToId = reportsToId;
    }


    /**
     * Gets the salutation value for this Contact.
     * 
     * @return salutation
     */
    public java.lang.String getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this Contact.
     * 
     * @param salutation
     */
    public void setSalutation(java.lang.String salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the serviceContracts value for this Contact.
     * 
     * @return serviceContracts
     */
    public com.sforce.soap.enterprise.QueryResult getServiceContracts() {
        return serviceContracts;
    }


    /**
     * Sets the serviceContracts value for this Contact.
     * 
     * @param serviceContracts
     */
    public void setServiceContracts(com.sforce.soap.enterprise.QueryResult serviceContracts) {
        this.serviceContracts = serviceContracts;
    }


    /**
     * Gets the shares value for this Contact.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this Contact.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the systemModstamp value for this Contact.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Contact.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Contact.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Contact.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the title value for this Contact.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Contact.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the topicAssignments value for this Contact.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Contact.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the undecidedEventRelations value for this Contact.
     * 
     * @return undecidedEventRelations
     */
    public com.sforce.soap.enterprise.QueryResult getUndecidedEventRelations() {
        return undecidedEventRelations;
    }


    /**
     * Sets the undecidedEventRelations value for this Contact.
     * 
     * @param undecidedEventRelations
     */
    public void setUndecidedEventRelations(com.sforce.soap.enterprise.QueryResult undecidedEventRelations) {
        this.undecidedEventRelations = undecidedEventRelations;
    }


    /**
     * Gets the userRecordAccess value for this Contact.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Contact.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the YEAREXPIRE_CP__c value for this Contact.
     * 
     * @return YEAREXPIRE_CP__c
     */
    public java.lang.String getYEAREXPIRE_CP__c() {
        return YEAREXPIRE_CP__c;
    }


    /**
     * Sets the YEAREXPIRE_CP__c value for this Contact.
     * 
     * @param YEAREXPIRE_CP__c
     */
    public void setYEAREXPIRE_CP__c(java.lang.String YEAREXPIRE_CP__c) {
        this.YEAREXPIRE_CP__c = YEAREXPIRE_CP__c;
    }


    /**
     * Gets the YEAREXPIRE__c value for this Contact.
     * 
     * @return YEAREXPIRE__c
     */
    public java.lang.String getYEAREXPIRE__c() {
        return YEAREXPIRE__c;
    }


    /**
     * Sets the YEAREXPIRE__c value for this Contact.
     * 
     * @param YEAREXPIRE__c
     */
    public void setYEAREXPIRE__c(java.lang.String YEAREXPIRE__c) {
        this.YEAREXPIRE__c = YEAREXPIRE__c;
    }


    /**
     * Gets the YEAR__c value for this Contact.
     * 
     * @return YEAR__c
     */
    public java.lang.String getYEAR__c() {
        return YEAR__c;
    }


    /**
     * Sets the YEAR__c value for this Contact.
     * 
     * @param YEAR__c
     */
    public void setYEAR__c(java.lang.String YEAR__c) {
        this.YEAR__c = YEAR__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ACCUMULATED_SALES__c==null && other.getACCUMULATED_SALES__c()==null) || 
             (this.ACCUMULATED_SALES__c!=null &&
              this.ACCUMULATED_SALES__c.equals(other.getACCUMULATED_SALES__c()))) &&
            ((this.acceptedEventRelations==null && other.getAcceptedEventRelations()==null) || 
             (this.acceptedEventRelations!=null &&
              this.acceptedEventRelations.equals(other.getAcceptedEventRelations()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountContactRoles==null && other.getAccountContactRoles()==null) || 
             (this.accountContactRoles!=null &&
              this.accountContactRoles.equals(other.getAccountContactRoles()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.activo__c==null && other.getActivo__c()==null) || 
             (this.activo__c!=null &&
              this.activo__c.equals(other.getActivo__c()))) &&
            ((this.actualizacion_Telefono__c==null && other.getActualizacion_Telefono__c()==null) || 
             (this.actualizacion_Telefono__c!=null &&
              this.actualizacion_Telefono__c.equals(other.getActualizacion_Telefono__c()))) &&
            ((this.actualizacion_correo_electronico__c==null && other.getActualizacion_correo_electronico__c()==null) || 
             (this.actualizacion_correo_electronico__c!=null &&
              this.actualizacion_correo_electronico__c.equals(other.getActualizacion_correo_electronico__c()))) &&
            ((this.afectaci_n__c==null && other.getAfectaci_n__c()==null) || 
             (this.afectaci_n__c!=null &&
              this.afectaci_n__c.equals(other.getAfectaci_n__c()))) &&
            ((this.assets==null && other.getAssets()==null) || 
             (this.assets!=null &&
              this.assets.equals(other.getAssets()))) &&
            ((this.assistantName==null && other.getAssistantName()==null) || 
             (this.assistantName!=null &&
              this.assistantName.equals(other.getAssistantName()))) &&
            ((this.assistantPhone==null && other.getAssistantPhone()==null) || 
             (this.assistantPhone!=null &&
              this.assistantPhone.equals(other.getAssistantPhone()))) &&
            ((this.attachedContentDocuments==null && other.getAttachedContentDocuments()==null) || 
             (this.attachedContentDocuments!=null &&
              this.attachedContentDocuments.equals(other.getAttachedContentDocuments()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.birthdate==null && other.getBirthdate()==null) || 
             (this.birthdate!=null &&
              this.birthdate.equals(other.getBirthdate()))) &&
            ((this.CAMPAIGNEXPIRE_CP__c==null && other.getCAMPAIGNEXPIRE_CP__c()==null) || 
             (this.CAMPAIGNEXPIRE_CP__c!=null &&
              this.CAMPAIGNEXPIRE_CP__c.equals(other.getCAMPAIGNEXPIRE_CP__c()))) &&
            ((this.CAMPAIGNEXPIRE__c==null && other.getCAMPAIGNEXPIRE__c()==null) || 
             (this.CAMPAIGNEXPIRE__c!=null &&
              this.CAMPAIGNEXPIRE__c.equals(other.getCAMPAIGNEXPIRE__c()))) &&
            ((this.CAMPAIGN__c==null && other.getCAMPAIGN__c()==null) || 
             (this.CAMPAIGN__c!=null &&
              this.CAMPAIGN__c.equals(other.getCAMPAIGN__c()))) &&
            ((this.COD__c==null && other.getCOD__c()==null) || 
             (this.COD__c!=null &&
              this.COD__c.equals(other.getCOD__c()))) &&
            ((this.campaignMembers==null && other.getCampaignMembers()==null) || 
             (this.campaignMembers!=null &&
              this.campaignMembers.equals(other.getCampaignMembers()))) &&
            ((this.campania_Operativa2__c==null && other.getCampania_Operativa2__c()==null) || 
             (this.campania_Operativa2__c!=null &&
              this.campania_Operativa2__c.equals(other.getCampania_Operativa2__c()))) &&
            ((this.campania_Operativa__c==null && other.getCampania_Operativa__c()==null) || 
             (this.campania_Operativa__c!=null &&
              this.campania_Operativa__c.equals(other.getCampania_Operativa__c()))) &&
            ((this.candidatos__r==null && other.getCandidatos__r()==null) || 
             (this.candidatos__r!=null &&
              this.candidatos__r.equals(other.getCandidatos__r()))) &&
            ((this.caseContactRoles==null && other.getCaseContactRoles()==null) || 
             (this.caseContactRoles!=null &&
              this.caseContactRoles.equals(other.getCaseContactRoles()))) &&
            ((this.cases==null && other.getCases()==null) || 
             (this.cases!=null &&
              this.cases.equals(other.getCases()))) &&
            ((this.casos1__r==null && other.getCasos1__r()==null) || 
             (this.casos1__r!=null &&
              this.casos1__r.equals(other.getCasos1__r()))) &&
            ((this.casos__r==null && other.getCasos__r()==null) || 
             (this.casos__r!=null &&
              this.casos__r.equals(other.getCasos__r()))) &&
            ((this.combinedAttachments==null && other.getCombinedAttachments()==null) || 
             (this.combinedAttachments!=null &&
              this.combinedAttachments.equals(other.getCombinedAttachments()))) &&
            ((this.contractContactRoles==null && other.getContractContactRoles()==null) || 
             (this.contractContactRoles!=null &&
              this.contractContactRoles.equals(other.getContractContactRoles()))) &&
            ((this.contractsSigned==null && other.getContractsSigned()==null) || 
             (this.contractsSigned!=null &&
              this.contractsSigned.equals(other.getContractsSigned()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.cuentas__r==null && other.getCuentas__r()==null) || 
             (this.cuentas__r!=null &&
              this.cuentas__r.equals(other.getCuentas__r()))) &&
            ((this.declinedEventRelations==null && other.getDeclinedEventRelations()==null) || 
             (this.declinedEventRelations!=null &&
              this.declinedEventRelations.equals(other.getDeclinedEventRelations()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dias_de_bodega2__c==null && other.getDias_de_bodega2__c()==null) || 
             (this.dias_de_bodega2__c!=null &&
              this.dias_de_bodega2__c.equals(other.getDias_de_bodega2__c()))) &&
            ((this.dias_de_bodega__c==null && other.getDias_de_bodega__c()==null) || 
             (this.dias_de_bodega__c!=null &&
              this.dias_de_bodega__c.equals(other.getDias_de_bodega__c()))) &&
            ((this.digitos__c==null && other.getDigitos__c()==null) || 
             (this.digitos__c!=null &&
              this.digitos__c.equals(other.getDigitos__c()))) &&
            ((this.division__c==null && other.getDivision__c()==null) || 
             (this.division__c!=null &&
              this.division__c.equals(other.getDivision__c()))) &&
            ((this.duplicateRecordItems==null && other.getDuplicateRecordItems()==null) || 
             (this.duplicateRecordItems!=null &&
              this.duplicateRecordItems.equals(other.getDuplicateRecordItems()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emailBouncedDate==null && other.getEmailBouncedDate()==null) || 
             (this.emailBouncedDate!=null &&
              this.emailBouncedDate.equals(other.getEmailBouncedDate()))) &&
            ((this.emailBouncedReason==null && other.getEmailBouncedReason()==null) || 
             (this.emailBouncedReason!=null &&
              this.emailBouncedReason.equals(other.getEmailBouncedReason()))) &&
            ((this.emailStatuses==null && other.getEmailStatuses()==null) || 
             (this.emailStatuses!=null &&
              this.emailStatuses.equals(other.getEmailStatuses()))) &&
            ((this.entitlementContacts==null && other.getEntitlementContacts()==null) || 
             (this.entitlementContacts!=null &&
              this.entitlementContacts.equals(other.getEntitlementContacts()))) &&
            ((this.eventRelations==null && other.getEventRelations()==null) || 
             (this.eventRelations!=null &&
              this.eventRelations.equals(other.getEventRelations()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.fecha_Proceso__c==null && other.getFecha_Proceso__c()==null) || 
             (this.fecha_Proceso__c!=null &&
              this.fecha_Proceso__c.equals(other.getFecha_Proceso__c()))) &&
            ((this.fecha_Ultimo_Reparto__c==null && other.getFecha_Ultimo_Reparto__c()==null) || 
             (this.fecha_Ultimo_Reparto__c!=null &&
              this.fecha_Ultimo_Reparto__c.equals(other.getFecha_Ultimo_Reparto__c()))) &&
            ((this.fecha_de_cierre_web2__c==null && other.getFecha_de_cierre_web2__c()==null) || 
             (this.fecha_de_cierre_web2__c!=null &&
              this.fecha_de_cierre_web2__c.equals(other.getFecha_de_cierre_web2__c()))) &&
            ((this.fecha_de_cierre_web__c==null && other.getFecha_de_cierre_web__c()==null) || 
             (this.fecha_de_cierre_web__c!=null &&
              this.fecha_de_cierre_web__c.equals(other.getFecha_de_cierre_web__c()))) &&
            ((this.fecha_de_facturacion2__c==null && other.getFecha_de_facturacion2__c()==null) || 
             (this.fecha_de_facturacion2__c!=null &&
              this.fecha_de_facturacion2__c.equals(other.getFecha_de_facturacion2__c()))) &&
            ((this.fecha_de_facturacion__c==null && other.getFecha_de_facturacion__c()==null) || 
             (this.fecha_de_facturacion__c!=null &&
              this.fecha_de_facturacion__c.equals(other.getFecha_de_facturacion__c()))) &&
            ((this.fecha_de_reparto2__c==null && other.getFecha_de_reparto2__c()==null) || 
             (this.fecha_de_reparto2__c!=null &&
              this.fecha_de_reparto2__c.equals(other.getFecha_de_reparto2__c()))) &&
            ((this.fecha_de_reparto__c==null && other.getFecha_de_reparto__c()==null) || 
             (this.fecha_de_reparto__c!=null &&
              this.fecha_de_reparto__c.equals(other.getFecha_de_reparto__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.ficha__c==null && other.getFicha__c()==null) || 
             (this.ficha__c!=null &&
              this.ficha__c.equals(other.getFicha__c()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.IDCOUNTRY__c==null && other.getIDCOUNTRY__c()==null) || 
             (this.IDCOUNTRY__c!=null &&
              this.IDCOUNTRY__c.equals(other.getIDCOUNTRY__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isEmailBounced==null && other.getIsEmailBounced()==null) || 
             (this.isEmailBounced!=null &&
              this.isEmailBounced.equals(other.getIsEmailBounced()))) &&
            ((this.jigsaw==null && other.getJigsaw()==null) || 
             (this.jigsaw!=null &&
              this.jigsaw.equals(other.getJigsaw()))) &&
            ((this.jigsawContactId==null && other.getJigsawContactId()==null) || 
             (this.jigsawContactId!=null &&
              this.jigsawContactId.equals(other.getJigsawContactId()))) &&
            ((this.LEVEL__c==null && other.getLEVEL__c()==null) || 
             (this.LEVEL__c!=null &&
              this.LEVEL__c.equals(other.getLEVEL__c()))) &&
            ((this.LOA__c==null && other.getLOA__c()==null) || 
             (this.LOA__c!=null &&
              this.LOA__c.equals(other.getLOA__c()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.lastCURequestDate==null && other.getLastCURequestDate()==null) || 
             (this.lastCURequestDate!=null &&
              this.lastCURequestDate.equals(other.getLastCURequestDate()))) &&
            ((this.lastCUUpdateDate==null && other.getLastCUUpdateDate()==null) || 
             (this.lastCUUpdateDate!=null &&
              this.lastCUUpdateDate.equals(other.getLastCUUpdateDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastReferencedDate==null && other.getLastReferencedDate()==null) || 
             (this.lastReferencedDate!=null &&
              this.lastReferencedDate.equals(other.getLastReferencedDate()))) &&
            ((this.lastViewedDate==null && other.getLastViewedDate()==null) || 
             (this.lastViewedDate!=null &&
              this.lastViewedDate.equals(other.getLastViewedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.liveChatTranscripts==null && other.getLiveChatTranscripts()==null) || 
             (this.liveChatTranscripts!=null &&
              this.liveChatTranscripts.equals(other.getLiveChatTranscripts()))) &&
            ((this.lookedUpFromActivities==null && other.getLookedUpFromActivities()==null) || 
             (this.lookedUpFromActivities!=null &&
              this.lookedUpFromActivities.equals(other.getLookedUpFromActivities()))) &&
            ((this.lote__c==null && other.getLote__c()==null) || 
             (this.lote__c!=null &&
              this.lote__c.equals(other.getLote__c()))) &&
            ((this.mailingAddress==null && other.getMailingAddress()==null) || 
             (this.mailingAddress!=null &&
              this.mailingAddress.equals(other.getMailingAddress()))) &&
            ((this.mailingCity==null && other.getMailingCity()==null) || 
             (this.mailingCity!=null &&
              this.mailingCity.equals(other.getMailingCity()))) &&
            ((this.mailingCountry==null && other.getMailingCountry()==null) || 
             (this.mailingCountry!=null &&
              this.mailingCountry.equals(other.getMailingCountry()))) &&
            ((this.mailingGeocodeAccuracy==null && other.getMailingGeocodeAccuracy()==null) || 
             (this.mailingGeocodeAccuracy!=null &&
              this.mailingGeocodeAccuracy.equals(other.getMailingGeocodeAccuracy()))) &&
            ((this.mailingLatitude==null && other.getMailingLatitude()==null) || 
             (this.mailingLatitude!=null &&
              this.mailingLatitude.equals(other.getMailingLatitude()))) &&
            ((this.mailingLongitude==null && other.getMailingLongitude()==null) || 
             (this.mailingLongitude!=null &&
              this.mailingLongitude.equals(other.getMailingLongitude()))) &&
            ((this.mailingPostalCode==null && other.getMailingPostalCode()==null) || 
             (this.mailingPostalCode!=null &&
              this.mailingPostalCode.equals(other.getMailingPostalCode()))) &&
            ((this.mailingState==null && other.getMailingState()==null) || 
             (this.mailingState!=null &&
              this.mailingState.equals(other.getMailingState()))) &&
            ((this.mailingStreet==null && other.getMailingStreet()==null) || 
             (this.mailingStreet!=null &&
              this.mailingStreet.equals(other.getMailingStreet()))) &&
            ((this.marcacion_Corta__c==null && other.getMarcacion_Corta__c()==null) || 
             (this.marcacion_Corta__c!=null &&
              this.marcacion_Corta__c.equals(other.getMarcacion_Corta__c()))) &&
            ((this.masterRecord==null && other.getMasterRecord()==null) || 
             (this.masterRecord!=null &&
              this.masterRecord.equals(other.getMasterRecord()))) &&
            ((this.masterRecordId==null && other.getMasterRecordId()==null) || 
             (this.masterRecordId!=null &&
              this.masterRecordId.equals(other.getMasterRecordId()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.movimientos__r==null && other.getMovimientos__r()==null) || 
             (this.movimientos__r!=null &&
              this.movimientos__r.equals(other.getMovimientos__r()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nivel__c==null && other.getNivel__c()==null) || 
             (this.nivel__c!=null &&
              this.nivel__c.equals(other.getNivel__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.num_Campa_a_y_Ano__c==null && other.getNum_Campa_a_y_Ano__c()==null) || 
             (this.num_Campa_a_y_Ano__c!=null &&
              this.num_Campa_a_y_Ano__c.equals(other.getNum_Campa_a_y_Ano__c()))) &&
            ((this.num_Campa_a_y_Ano_de_Expiracion__c==null && other.getNum_Campa_a_y_Ano_de_Expiracion__c()==null) || 
             (this.num_Campa_a_y_Ano_de_Expiracion__c!=null &&
              this.num_Campa_a_y_Ano_de_Expiracion__c.equals(other.getNum_Campa_a_y_Ano_de_Expiracion__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.opportunities==null && other.getOpportunities()==null) || 
             (this.opportunities!=null &&
              this.opportunities.equals(other.getOpportunities()))) &&
            ((this.opportunityContactRoles==null && other.getOpportunityContactRoles()==null) || 
             (this.opportunityContactRoles!=null &&
              this.opportunityContactRoles.equals(other.getOpportunityContactRoles()))) &&
            ((this.otherAddress==null && other.getOtherAddress()==null) || 
             (this.otherAddress!=null &&
              this.otherAddress.equals(other.getOtherAddress()))) &&
            ((this.otherCity==null && other.getOtherCity()==null) || 
             (this.otherCity!=null &&
              this.otherCity.equals(other.getOtherCity()))) &&
            ((this.otherCountry==null && other.getOtherCountry()==null) || 
             (this.otherCountry!=null &&
              this.otherCountry.equals(other.getOtherCountry()))) &&
            ((this.otherGeocodeAccuracy==null && other.getOtherGeocodeAccuracy()==null) || 
             (this.otherGeocodeAccuracy!=null &&
              this.otherGeocodeAccuracy.equals(other.getOtherGeocodeAccuracy()))) &&
            ((this.otherLatitude==null && other.getOtherLatitude()==null) || 
             (this.otherLatitude!=null &&
              this.otherLatitude.equals(other.getOtherLatitude()))) &&
            ((this.otherLongitude==null && other.getOtherLongitude()==null) || 
             (this.otherLongitude!=null &&
              this.otherLongitude.equals(other.getOtherLongitude()))) &&
            ((this.otherPhone==null && other.getOtherPhone()==null) || 
             (this.otherPhone!=null &&
              this.otherPhone.equals(other.getOtherPhone()))) &&
            ((this.otherPostalCode==null && other.getOtherPostalCode()==null) || 
             (this.otherPostalCode!=null &&
              this.otherPostalCode.equals(other.getOtherPostalCode()))) &&
            ((this.otherState==null && other.getOtherState()==null) || 
             (this.otherState!=null &&
              this.otherState.equals(other.getOtherState()))) &&
            ((this.otherStreet==null && other.getOtherStreet()==null) || 
             (this.otherStreet!=null &&
              this.otherStreet.equals(other.getOtherStreet()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.POINTSAVAILABLE_CP__c==null && other.getPOINTSAVAILABLE_CP__c()==null) || 
             (this.POINTSAVAILABLE_CP__c!=null &&
              this.POINTSAVAILABLE_CP__c.equals(other.getPOINTSAVAILABLE_CP__c()))) &&
            ((this.POINTSAVAILABLE__c==null && other.getPOINTSAVAILABLE__c()==null) || 
             (this.POINTSAVAILABLE__c!=null &&
              this.POINTSAVAILABLE__c.equals(other.getPOINTSAVAILABLE__c()))) &&
            ((this.POINTSEXPIRE_CP__c==null && other.getPOINTSEXPIRE_CP__c()==null) || 
             (this.POINTSEXPIRE_CP__c!=null &&
              this.POINTSEXPIRE_CP__c.equals(other.getPOINTSEXPIRE_CP__c()))) &&
            ((this.POINTSEXPIRE__c==null && other.getPOINTSEXPIRE__c()==null) || 
             (this.POINTSEXPIRE__c!=null &&
              this.POINTSEXPIRE__c.equals(other.getPOINTSEXPIRE__c()))) &&
            ((this.POINTSPENDING_CP__c==null && other.getPOINTSPENDING_CP__c()==null) || 
             (this.POINTSPENDING_CP__c!=null &&
              this.POINTSPENDING_CP__c.equals(other.getPOINTSPENDING_CP__c()))) &&
            ((this.POINTSPENDING__c==null && other.getPOINTSPENDING__c()==null) || 
             (this.POINTSPENDING__c!=null &&
              this.POINTSPENDING__c.equals(other.getPOINTSPENDING__c()))) &&
            ((this.POINTSSPENT_CP__c==null && other.getPOINTSSPENT_CP__c()==null) || 
             (this.POINTSSPENT_CP__c!=null &&
              this.POINTSSPENT_CP__c.equals(other.getPOINTSSPENT_CP__c()))) &&
            ((this.POINTSSPENT__c==null && other.getPOINTSSPENT__c()==null) || 
             (this.POINTSSPENT__c!=null &&
              this.POINTSSPENT__c.equals(other.getPOINTSSPENT__c()))) &&
            ((this.personas==null && other.getPersonas()==null) || 
             (this.personas!=null &&
              this.personas.equals(other.getPersonas()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.photoUrl==null && other.getPhotoUrl()==null) || 
             (this.photoUrl!=null &&
              this.photoUrl.equals(other.getPhotoUrl()))) &&
            ((this.posts==null && other.getPosts()==null) || 
             (this.posts!=null &&
              this.posts.equals(other.getPosts()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.recordAssociatedGroups==null && other.getRecordAssociatedGroups()==null) || 
             (this.recordAssociatedGroups!=null &&
              this.recordAssociatedGroups.equals(other.getRecordAssociatedGroups()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.region__c==null && other.getRegion__c()==null) || 
             (this.region__c!=null &&
              this.region__c.equals(other.getRegion__c()))) &&
            ((this.registro__c==null && other.getRegistro__c()==null) || 
             (this.registro__c!=null &&
              this.registro__c.equals(other.getRegistro__c()))) &&
            ((this.reportsTo==null && other.getReportsTo()==null) || 
             (this.reportsTo!=null &&
              this.reportsTo.equals(other.getReportsTo()))) &&
            ((this.reportsToId==null && other.getReportsToId()==null) || 
             (this.reportsToId!=null &&
              this.reportsToId.equals(other.getReportsToId()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.serviceContracts==null && other.getServiceContracts()==null) || 
             (this.serviceContracts!=null &&
              this.serviceContracts.equals(other.getServiceContracts()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.topicAssignments==null && other.getTopicAssignments()==null) || 
             (this.topicAssignments!=null &&
              this.topicAssignments.equals(other.getTopicAssignments()))) &&
            ((this.undecidedEventRelations==null && other.getUndecidedEventRelations()==null) || 
             (this.undecidedEventRelations!=null &&
              this.undecidedEventRelations.equals(other.getUndecidedEventRelations()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.YEAREXPIRE_CP__c==null && other.getYEAREXPIRE_CP__c()==null) || 
             (this.YEAREXPIRE_CP__c!=null &&
              this.YEAREXPIRE_CP__c.equals(other.getYEAREXPIRE_CP__c()))) &&
            ((this.YEAREXPIRE__c==null && other.getYEAREXPIRE__c()==null) || 
             (this.YEAREXPIRE__c!=null &&
              this.YEAREXPIRE__c.equals(other.getYEAREXPIRE__c()))) &&
            ((this.YEAR__c==null && other.getYEAR__c()==null) || 
             (this.YEAR__c!=null &&
              this.YEAR__c.equals(other.getYEAR__c())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getACCUMULATED_SALES__c() != null) {
            _hashCode += getACCUMULATED_SALES__c().hashCode();
        }
        if (getAcceptedEventRelations() != null) {
            _hashCode += getAcceptedEventRelations().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountContactRoles() != null) {
            _hashCode += getAccountContactRoles().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getActivo__c() != null) {
            _hashCode += getActivo__c().hashCode();
        }
        if (getActualizacion_Telefono__c() != null) {
            _hashCode += getActualizacion_Telefono__c().hashCode();
        }
        if (getActualizacion_correo_electronico__c() != null) {
            _hashCode += getActualizacion_correo_electronico__c().hashCode();
        }
        if (getAfectaci_n__c() != null) {
            _hashCode += getAfectaci_n__c().hashCode();
        }
        if (getAssets() != null) {
            _hashCode += getAssets().hashCode();
        }
        if (getAssistantName() != null) {
            _hashCode += getAssistantName().hashCode();
        }
        if (getAssistantPhone() != null) {
            _hashCode += getAssistantPhone().hashCode();
        }
        if (getAttachedContentDocuments() != null) {
            _hashCode += getAttachedContentDocuments().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getBirthdate() != null) {
            _hashCode += getBirthdate().hashCode();
        }
        if (getCAMPAIGNEXPIRE_CP__c() != null) {
            _hashCode += getCAMPAIGNEXPIRE_CP__c().hashCode();
        }
        if (getCAMPAIGNEXPIRE__c() != null) {
            _hashCode += getCAMPAIGNEXPIRE__c().hashCode();
        }
        if (getCAMPAIGN__c() != null) {
            _hashCode += getCAMPAIGN__c().hashCode();
        }
        if (getCOD__c() != null) {
            _hashCode += getCOD__c().hashCode();
        }
        if (getCampaignMembers() != null) {
            _hashCode += getCampaignMembers().hashCode();
        }
        if (getCampania_Operativa2__c() != null) {
            _hashCode += getCampania_Operativa2__c().hashCode();
        }
        if (getCampania_Operativa__c() != null) {
            _hashCode += getCampania_Operativa__c().hashCode();
        }
        if (getCandidatos__r() != null) {
            _hashCode += getCandidatos__r().hashCode();
        }
        if (getCaseContactRoles() != null) {
            _hashCode += getCaseContactRoles().hashCode();
        }
        if (getCases() != null) {
            _hashCode += getCases().hashCode();
        }
        if (getCasos1__r() != null) {
            _hashCode += getCasos1__r().hashCode();
        }
        if (getCasos__r() != null) {
            _hashCode += getCasos__r().hashCode();
        }
        if (getCombinedAttachments() != null) {
            _hashCode += getCombinedAttachments().hashCode();
        }
        if (getContractContactRoles() != null) {
            _hashCode += getContractContactRoles().hashCode();
        }
        if (getContractsSigned() != null) {
            _hashCode += getContractsSigned().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getCuentas__r() != null) {
            _hashCode += getCuentas__r().hashCode();
        }
        if (getDeclinedEventRelations() != null) {
            _hashCode += getDeclinedEventRelations().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDias_de_bodega2__c() != null) {
            _hashCode += getDias_de_bodega2__c().hashCode();
        }
        if (getDias_de_bodega__c() != null) {
            _hashCode += getDias_de_bodega__c().hashCode();
        }
        if (getDigitos__c() != null) {
            _hashCode += getDigitos__c().hashCode();
        }
        if (getDivision__c() != null) {
            _hashCode += getDivision__c().hashCode();
        }
        if (getDuplicateRecordItems() != null) {
            _hashCode += getDuplicateRecordItems().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmailBouncedDate() != null) {
            _hashCode += getEmailBouncedDate().hashCode();
        }
        if (getEmailBouncedReason() != null) {
            _hashCode += getEmailBouncedReason().hashCode();
        }
        if (getEmailStatuses() != null) {
            _hashCode += getEmailStatuses().hashCode();
        }
        if (getEntitlementContacts() != null) {
            _hashCode += getEntitlementContacts().hashCode();
        }
        if (getEventRelations() != null) {
            _hashCode += getEventRelations().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getFecha_Proceso__c() != null) {
            _hashCode += getFecha_Proceso__c().hashCode();
        }
        if (getFecha_Ultimo_Reparto__c() != null) {
            _hashCode += getFecha_Ultimo_Reparto__c().hashCode();
        }
        if (getFecha_de_cierre_web2__c() != null) {
            _hashCode += getFecha_de_cierre_web2__c().hashCode();
        }
        if (getFecha_de_cierre_web__c() != null) {
            _hashCode += getFecha_de_cierre_web__c().hashCode();
        }
        if (getFecha_de_facturacion2__c() != null) {
            _hashCode += getFecha_de_facturacion2__c().hashCode();
        }
        if (getFecha_de_facturacion__c() != null) {
            _hashCode += getFecha_de_facturacion__c().hashCode();
        }
        if (getFecha_de_reparto2__c() != null) {
            _hashCode += getFecha_de_reparto2__c().hashCode();
        }
        if (getFecha_de_reparto__c() != null) {
            _hashCode += getFecha_de_reparto__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFicha__c() != null) {
            _hashCode += getFicha__c().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getIDCOUNTRY__c() != null) {
            _hashCode += getIDCOUNTRY__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsEmailBounced() != null) {
            _hashCode += getIsEmailBounced().hashCode();
        }
        if (getJigsaw() != null) {
            _hashCode += getJigsaw().hashCode();
        }
        if (getJigsawContactId() != null) {
            _hashCode += getJigsawContactId().hashCode();
        }
        if (getLEVEL__c() != null) {
            _hashCode += getLEVEL__c().hashCode();
        }
        if (getLOA__c() != null) {
            _hashCode += getLOA__c().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
        }
        if (getLastCURequestDate() != null) {
            _hashCode += getLastCURequestDate().hashCode();
        }
        if (getLastCUUpdateDate() != null) {
            _hashCode += getLastCUUpdateDate().hashCode();
        }
        if (getLastModifiedBy() != null) {
            _hashCode += getLastModifiedBy().hashCode();
        }
        if (getLastModifiedById() != null) {
            _hashCode += getLastModifiedById().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLastReferencedDate() != null) {
            _hashCode += getLastReferencedDate().hashCode();
        }
        if (getLastViewedDate() != null) {
            _hashCode += getLastViewedDate().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getLiveChatTranscripts() != null) {
            _hashCode += getLiveChatTranscripts().hashCode();
        }
        if (getLookedUpFromActivities() != null) {
            _hashCode += getLookedUpFromActivities().hashCode();
        }
        if (getLote__c() != null) {
            _hashCode += getLote__c().hashCode();
        }
        if (getMailingAddress() != null) {
            _hashCode += getMailingAddress().hashCode();
        }
        if (getMailingCity() != null) {
            _hashCode += getMailingCity().hashCode();
        }
        if (getMailingCountry() != null) {
            _hashCode += getMailingCountry().hashCode();
        }
        if (getMailingGeocodeAccuracy() != null) {
            _hashCode += getMailingGeocodeAccuracy().hashCode();
        }
        if (getMailingLatitude() != null) {
            _hashCode += getMailingLatitude().hashCode();
        }
        if (getMailingLongitude() != null) {
            _hashCode += getMailingLongitude().hashCode();
        }
        if (getMailingPostalCode() != null) {
            _hashCode += getMailingPostalCode().hashCode();
        }
        if (getMailingState() != null) {
            _hashCode += getMailingState().hashCode();
        }
        if (getMailingStreet() != null) {
            _hashCode += getMailingStreet().hashCode();
        }
        if (getMarcacion_Corta__c() != null) {
            _hashCode += getMarcacion_Corta__c().hashCode();
        }
        if (getMasterRecord() != null) {
            _hashCode += getMasterRecord().hashCode();
        }
        if (getMasterRecordId() != null) {
            _hashCode += getMasterRecordId().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getMovimientos__r() != null) {
            _hashCode += getMovimientos__r().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNivel__c() != null) {
            _hashCode += getNivel__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getNum_Campa_a_y_Ano__c() != null) {
            _hashCode += getNum_Campa_a_y_Ano__c().hashCode();
        }
        if (getNum_Campa_a_y_Ano_de_Expiracion__c() != null) {
            _hashCode += getNum_Campa_a_y_Ano_de_Expiracion__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOpportunities() != null) {
            _hashCode += getOpportunities().hashCode();
        }
        if (getOpportunityContactRoles() != null) {
            _hashCode += getOpportunityContactRoles().hashCode();
        }
        if (getOtherAddress() != null) {
            _hashCode += getOtherAddress().hashCode();
        }
        if (getOtherCity() != null) {
            _hashCode += getOtherCity().hashCode();
        }
        if (getOtherCountry() != null) {
            _hashCode += getOtherCountry().hashCode();
        }
        if (getOtherGeocodeAccuracy() != null) {
            _hashCode += getOtherGeocodeAccuracy().hashCode();
        }
        if (getOtherLatitude() != null) {
            _hashCode += getOtherLatitude().hashCode();
        }
        if (getOtherLongitude() != null) {
            _hashCode += getOtherLongitude().hashCode();
        }
        if (getOtherPhone() != null) {
            _hashCode += getOtherPhone().hashCode();
        }
        if (getOtherPostalCode() != null) {
            _hashCode += getOtherPostalCode().hashCode();
        }
        if (getOtherState() != null) {
            _hashCode += getOtherState().hashCode();
        }
        if (getOtherStreet() != null) {
            _hashCode += getOtherStreet().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getPOINTSAVAILABLE_CP__c() != null) {
            _hashCode += getPOINTSAVAILABLE_CP__c().hashCode();
        }
        if (getPOINTSAVAILABLE__c() != null) {
            _hashCode += getPOINTSAVAILABLE__c().hashCode();
        }
        if (getPOINTSEXPIRE_CP__c() != null) {
            _hashCode += getPOINTSEXPIRE_CP__c().hashCode();
        }
        if (getPOINTSEXPIRE__c() != null) {
            _hashCode += getPOINTSEXPIRE__c().hashCode();
        }
        if (getPOINTSPENDING_CP__c() != null) {
            _hashCode += getPOINTSPENDING_CP__c().hashCode();
        }
        if (getPOINTSPENDING__c() != null) {
            _hashCode += getPOINTSPENDING__c().hashCode();
        }
        if (getPOINTSSPENT_CP__c() != null) {
            _hashCode += getPOINTSSPENT_CP__c().hashCode();
        }
        if (getPOINTSSPENT__c() != null) {
            _hashCode += getPOINTSSPENT__c().hashCode();
        }
        if (getPersonas() != null) {
            _hashCode += getPersonas().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPhotoUrl() != null) {
            _hashCode += getPhotoUrl().hashCode();
        }
        if (getPosts() != null) {
            _hashCode += getPosts().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRecordAssociatedGroups() != null) {
            _hashCode += getRecordAssociatedGroups().hashCode();
        }
        if (getRecordType() != null) {
            _hashCode += getRecordType().hashCode();
        }
        if (getRecordTypeId() != null) {
            _hashCode += getRecordTypeId().hashCode();
        }
        if (getRegion__c() != null) {
            _hashCode += getRegion__c().hashCode();
        }
        if (getRegistro__c() != null) {
            _hashCode += getRegistro__c().hashCode();
        }
        if (getReportsTo() != null) {
            _hashCode += getReportsTo().hashCode();
        }
        if (getReportsToId() != null) {
            _hashCode += getReportsToId().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getServiceContracts() != null) {
            _hashCode += getServiceContracts().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getTopicAssignments() != null) {
            _hashCode += getTopicAssignments().hashCode();
        }
        if (getUndecidedEventRelations() != null) {
            _hashCode += getUndecidedEventRelations().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getYEAREXPIRE_CP__c() != null) {
            _hashCode += getYEAREXPIRE_CP__c().hashCode();
        }
        if (getYEAREXPIRE__c() != null) {
            _hashCode += getYEAREXPIRE__c().hashCode();
        }
        if (getYEAR__c() != null) {
            _hashCode += getYEAR__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCUMULATED_SALES__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ACCUMULATED_SALES__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptedEventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AcceptedEventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activityHistories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Activo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualizacion_Telefono__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actualizacion_Telefono__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualizacion_correo_electronico__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Actualizacion_correo_electronico__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("afectaci_n__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Afectaci_n__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assistantName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssistantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assistantPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssistantPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachedContentDocuments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AttachedContentDocuments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthdate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Birthdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAMPAIGNEXPIRE_CP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CAMPAIGNEXPIRE_CP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAMPAIGNEXPIRE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CAMPAIGNEXPIRE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAMPAIGN__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CAMPAIGN__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COD__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "COD__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campania_Operativa2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_Operativa2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campania_Operativa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_Operativa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidatos__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Candidatos__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casos1__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Casos1__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("casos__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Casos__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinedAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CombinedAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractsSigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractsSigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentas__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cuentas__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("declinedEventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeclinedEventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dias_de_bodega2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dias_de_bodega2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dias_de_bodega__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dias_de_bodega__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitos__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Digitos__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Division__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateRecordItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DuplicateRecordItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailBouncedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailBouncedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailBouncedReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailBouncedReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailStatuses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailStatuses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementContacts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntitlementContacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_Proceso__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_Proceso__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_Ultimo_Reparto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_Ultimo_Reparto__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_cierre_web2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_cierre_web2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_cierre_web__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_cierre_web__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_facturacion2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_facturacion2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_facturacion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_facturacion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_reparto2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_reparto2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_reparto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_reparto__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Feeds"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ficha__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ficha__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("histories");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Histories"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "HomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDCOUNTRY__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IDCOUNTRY__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDeleted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsDeleted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEmailBounced");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsEmailBounced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jigsaw");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Jigsaw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jigsawContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "JigsawContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LEVEL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LEVEL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LOA__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LOA__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCURequestDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastCURequestDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCUUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastCUUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedById"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReferencedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastReferencedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastViewedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastViewedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveChatTranscripts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatTranscripts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lookedUpFromActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LookedUpFromActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lote__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lote__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingGeocodeAccuracy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingGeocodeAccuracy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingLatitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingLatitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailingStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marcacion_Corta__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Marcacion_Corta__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterRecordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MasterRecordId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movimientos__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Movimientos__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivel__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Nivel__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notesAndAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NotesAndAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_Campa_a_y_Ano__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Num_Campa_a_y_Ano__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num_Campa_a_y_Ano_de_Expiracion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Num_Campa_a_y_Ano_de_Expiracion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunities"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityContactRoles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityContactRoles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherGeocodeAccuracy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherGeocodeAccuracy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherLatitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherLatitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherLongitude");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherLongitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OtherStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTSAVAILABLE_CP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POINTSAVAILABLE_CP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTSAVAILABLE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POINTSAVAILABLE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTSEXPIRE_CP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POINTSEXPIRE_CP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTSEXPIRE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POINTSEXPIRE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTSPENDING_CP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POINTSPENDING_CP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTSPENDING__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POINTSPENDING__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTSSPENT_CP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POINTSSPENT_CP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POINTSSPENT__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "POINTSSPENT__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personas");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Personas"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("photoUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PhotoUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Posts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processInstances");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstances"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processSteps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessSteps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordAssociatedGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordAssociatedGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Region__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Registro__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportsTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReportsTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportsToId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReportsToId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceContracts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceContracts"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shares");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Shares"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topicAssignments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TopicAssignments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undecidedEventRelations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UndecidedEventRelations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRecordAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YEAREXPIRE_CP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "YEAREXPIRE_CP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YEAREXPIRE__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "YEAREXPIRE__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("YEAR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "YEAR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
