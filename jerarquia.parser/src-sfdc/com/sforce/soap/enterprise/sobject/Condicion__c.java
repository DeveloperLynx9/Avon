/**
 * Condicion__c.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Condicion__c  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String accion__c;

    private com.sforce.soap.enterprise.sobject.Accion__c accion__r;

    private com.sforce.soap.enterprise.QueryResult acciones__r;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.Boolean archivo_de_Listado__c;

    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String campana_Avon__c;

    private com.sforce.soap.enterprise.sobject.Campania_Avon__c campana_Avon__r;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private java.lang.String condiciones__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.Boolean division__c;

    private com.sforce.soap.enterprise.QueryResult duplicateRecordItems;

    private java.lang.String estrategia__c;

    private com.sforce.soap.enterprise.sobject.Estrategia__c estrategia__r;

    private java.lang.String etapa__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private java.util.Date fin_Campana__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.util.Date inicio_Campana__c;

    private java.lang.Boolean isDeleted;

    private java.lang.String LOA__c;

    private java.util.Date lastActivityDate;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastReferencedDate;

    private java.util.Calendar lastViewedDate;

    private com.sforce.soap.enterprise.QueryResult lookedUpFromActivities;

    private java.lang.String name;

    private java.lang.String nivel_Empresarias__c;

    private com.sforce.soap.enterprise.QueryResult notes;

    private com.sforce.soap.enterprise.QueryResult notesAndAttachments;

    private java.lang.String numero_de_linea__c;

    private com.sforce.soap.enterprise.sobject.Item__c numero_de_linea__r;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.String origen_de_la_Orden__c;

    private java.lang.String otro__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String rango_Club_de_Privilegios__c;

    private com.sforce.soap.enterprise.QueryResult recordAssociatedGroups;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String reingreso__c;

    private java.lang.String segmento_que_aplica__c;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private java.lang.String territorio__c;

    private java.lang.String tipo_Empresarias__c;

    private java.lang.String tipo_de_Contrato__c;

    private java.lang.Boolean todas__c;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String venta__c;

    private java.lang.String zona__c;

    public Condicion__c() {
    }

    public Condicion__c(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String accion__c,
           com.sforce.soap.enterprise.sobject.Accion__c accion__r,
           com.sforce.soap.enterprise.QueryResult acciones__r,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.Boolean archivo_de_Listado__c,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String campana_Avon__c,
           com.sforce.soap.enterprise.sobject.Campania_Avon__c campana_Avon__r,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           java.lang.String condiciones__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.Boolean division__c,
           com.sforce.soap.enterprise.QueryResult duplicateRecordItems,
           java.lang.String estrategia__c,
           com.sforce.soap.enterprise.sobject.Estrategia__c estrategia__r,
           java.lang.String etapa__c,
           com.sforce.soap.enterprise.QueryResult events,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           java.util.Date fin_Campana__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.util.Date inicio_Campana__c,
           java.lang.Boolean isDeleted,
           java.lang.String LOA__c,
           java.util.Date lastActivityDate,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastReferencedDate,
           java.util.Calendar lastViewedDate,
           com.sforce.soap.enterprise.QueryResult lookedUpFromActivities,
           java.lang.String name,
           java.lang.String nivel_Empresarias__c,
           com.sforce.soap.enterprise.QueryResult notes,
           com.sforce.soap.enterprise.QueryResult notesAndAttachments,
           java.lang.String numero_de_linea__c,
           com.sforce.soap.enterprise.sobject.Item__c numero_de_linea__r,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.String origen_de_la_Orden__c,
           java.lang.String otro__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String rango_Club_de_Privilegios__c,
           com.sforce.soap.enterprise.QueryResult recordAssociatedGroups,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String reingreso__c,
           java.lang.String segmento_que_aplica__c,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           java.lang.String territorio__c,
           java.lang.String tipo_Empresarias__c,
           java.lang.String tipo_de_Contrato__c,
           java.lang.Boolean todas__c,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String venta__c,
           java.lang.String zona__c) {
        super(
            fieldsToNull,
            id);
        this.accion__c = accion__c;
        this.accion__r = accion__r;
        this.acciones__r = acciones__r;
        this.activityHistories = activityHistories;
        this.archivo_de_Listado__c = archivo_de_Listado__c;
        this.attachedContentDocuments = attachedContentDocuments;
        this.attachments = attachments;
        this.campana_Avon__c = campana_Avon__c;
        this.campana_Avon__r = campana_Avon__r;
        this.combinedAttachments = combinedAttachments;
        this.condiciones__c = condiciones__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.division__c = division__c;
        this.duplicateRecordItems = duplicateRecordItems;
        this.estrategia__c = estrategia__c;
        this.estrategia__r = estrategia__r;
        this.etapa__c = etapa__c;
        this.events = events;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.fin_Campana__c = fin_Campana__c;
        this.histories = histories;
        this.inicio_Campana__c = inicio_Campana__c;
        this.isDeleted = isDeleted;
        this.LOA__c = LOA__c;
        this.lastActivityDate = lastActivityDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReferencedDate = lastReferencedDate;
        this.lastViewedDate = lastViewedDate;
        this.lookedUpFromActivities = lookedUpFromActivities;
        this.name = name;
        this.nivel_Empresarias__c = nivel_Empresarias__c;
        this.notes = notes;
        this.notesAndAttachments = notesAndAttachments;
        this.numero_de_linea__c = numero_de_linea__c;
        this.numero_de_linea__r = numero_de_linea__r;
        this.openActivities = openActivities;
        this.origen_de_la_Orden__c = origen_de_la_Orden__c;
        this.otro__c = otro__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.rango_Club_de_Privilegios__c = rango_Club_de_Privilegios__c;
        this.recordAssociatedGroups = recordAssociatedGroups;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.reingreso__c = reingreso__c;
        this.segmento_que_aplica__c = segmento_que_aplica__c;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.territorio__c = territorio__c;
        this.tipo_Empresarias__c = tipo_Empresarias__c;
        this.tipo_de_Contrato__c = tipo_de_Contrato__c;
        this.todas__c = todas__c;
        this.topicAssignments = topicAssignments;
        this.userRecordAccess = userRecordAccess;
        this.venta__c = venta__c;
        this.zona__c = zona__c;
    }


    /**
     * Gets the accion__c value for this Condicion__c.
     * 
     * @return accion__c
     */
    public java.lang.String getAccion__c() {
        return accion__c;
    }


    /**
     * Sets the accion__c value for this Condicion__c.
     * 
     * @param accion__c
     */
    public void setAccion__c(java.lang.String accion__c) {
        this.accion__c = accion__c;
    }


    /**
     * Gets the accion__r value for this Condicion__c.
     * 
     * @return accion__r
     */
    public com.sforce.soap.enterprise.sobject.Accion__c getAccion__r() {
        return accion__r;
    }


    /**
     * Sets the accion__r value for this Condicion__c.
     * 
     * @param accion__r
     */
    public void setAccion__r(com.sforce.soap.enterprise.sobject.Accion__c accion__r) {
        this.accion__r = accion__r;
    }


    /**
     * Gets the acciones__r value for this Condicion__c.
     * 
     * @return acciones__r
     */
    public com.sforce.soap.enterprise.QueryResult getAcciones__r() {
        return acciones__r;
    }


    /**
     * Sets the acciones__r value for this Condicion__c.
     * 
     * @param acciones__r
     */
    public void setAcciones__r(com.sforce.soap.enterprise.QueryResult acciones__r) {
        this.acciones__r = acciones__r;
    }


    /**
     * Gets the activityHistories value for this Condicion__c.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this Condicion__c.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the archivo_de_Listado__c value for this Condicion__c.
     * 
     * @return archivo_de_Listado__c
     */
    public java.lang.Boolean getArchivo_de_Listado__c() {
        return archivo_de_Listado__c;
    }


    /**
     * Sets the archivo_de_Listado__c value for this Condicion__c.
     * 
     * @param archivo_de_Listado__c
     */
    public void setArchivo_de_Listado__c(java.lang.Boolean archivo_de_Listado__c) {
        this.archivo_de_Listado__c = archivo_de_Listado__c;
    }


    /**
     * Gets the attachedContentDocuments value for this Condicion__c.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Condicion__c.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this Condicion__c.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this Condicion__c.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the campana_Avon__c value for this Condicion__c.
     * 
     * @return campana_Avon__c
     */
    public java.lang.String getCampana_Avon__c() {
        return campana_Avon__c;
    }


    /**
     * Sets the campana_Avon__c value for this Condicion__c.
     * 
     * @param campana_Avon__c
     */
    public void setCampana_Avon__c(java.lang.String campana_Avon__c) {
        this.campana_Avon__c = campana_Avon__c;
    }


    /**
     * Gets the campana_Avon__r value for this Condicion__c.
     * 
     * @return campana_Avon__r
     */
    public com.sforce.soap.enterprise.sobject.Campania_Avon__c getCampana_Avon__r() {
        return campana_Avon__r;
    }


    /**
     * Sets the campana_Avon__r value for this Condicion__c.
     * 
     * @param campana_Avon__r
     */
    public void setCampana_Avon__r(com.sforce.soap.enterprise.sobject.Campania_Avon__c campana_Avon__r) {
        this.campana_Avon__r = campana_Avon__r;
    }


    /**
     * Gets the combinedAttachments value for this Condicion__c.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Condicion__c.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the condiciones__c value for this Condicion__c.
     * 
     * @return condiciones__c
     */
    public java.lang.String getCondiciones__c() {
        return condiciones__c;
    }


    /**
     * Sets the condiciones__c value for this Condicion__c.
     * 
     * @param condiciones__c
     */
    public void setCondiciones__c(java.lang.String condiciones__c) {
        this.condiciones__c = condiciones__c;
    }


    /**
     * Gets the createdBy value for this Condicion__c.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Condicion__c.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Condicion__c.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Condicion__c.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Condicion__c.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Condicion__c.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the division__c value for this Condicion__c.
     * 
     * @return division__c
     */
    public java.lang.Boolean getDivision__c() {
        return division__c;
    }


    /**
     * Sets the division__c value for this Condicion__c.
     * 
     * @param division__c
     */
    public void setDivision__c(java.lang.Boolean division__c) {
        this.division__c = division__c;
    }


    /**
     * Gets the duplicateRecordItems value for this Condicion__c.
     * 
     * @return duplicateRecordItems
     */
    public com.sforce.soap.enterprise.QueryResult getDuplicateRecordItems() {
        return duplicateRecordItems;
    }


    /**
     * Sets the duplicateRecordItems value for this Condicion__c.
     * 
     * @param duplicateRecordItems
     */
    public void setDuplicateRecordItems(com.sforce.soap.enterprise.QueryResult duplicateRecordItems) {
        this.duplicateRecordItems = duplicateRecordItems;
    }


    /**
     * Gets the estrategia__c value for this Condicion__c.
     * 
     * @return estrategia__c
     */
    public java.lang.String getEstrategia__c() {
        return estrategia__c;
    }


    /**
     * Sets the estrategia__c value for this Condicion__c.
     * 
     * @param estrategia__c
     */
    public void setEstrategia__c(java.lang.String estrategia__c) {
        this.estrategia__c = estrategia__c;
    }


    /**
     * Gets the estrategia__r value for this Condicion__c.
     * 
     * @return estrategia__r
     */
    public com.sforce.soap.enterprise.sobject.Estrategia__c getEstrategia__r() {
        return estrategia__r;
    }


    /**
     * Sets the estrategia__r value for this Condicion__c.
     * 
     * @param estrategia__r
     */
    public void setEstrategia__r(com.sforce.soap.enterprise.sobject.Estrategia__c estrategia__r) {
        this.estrategia__r = estrategia__r;
    }


    /**
     * Gets the etapa__c value for this Condicion__c.
     * 
     * @return etapa__c
     */
    public java.lang.String getEtapa__c() {
        return etapa__c;
    }


    /**
     * Sets the etapa__c value for this Condicion__c.
     * 
     * @param etapa__c
     */
    public void setEtapa__c(java.lang.String etapa__c) {
        this.etapa__c = etapa__c;
    }


    /**
     * Gets the events value for this Condicion__c.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this Condicion__c.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this Condicion__c.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this Condicion__c.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the fin_Campana__c value for this Condicion__c.
     * 
     * @return fin_Campana__c
     */
    public java.util.Date getFin_Campana__c() {
        return fin_Campana__c;
    }


    /**
     * Sets the fin_Campana__c value for this Condicion__c.
     * 
     * @param fin_Campana__c
     */
    public void setFin_Campana__c(java.util.Date fin_Campana__c) {
        this.fin_Campana__c = fin_Campana__c;
    }


    /**
     * Gets the histories value for this Condicion__c.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this Condicion__c.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the inicio_Campana__c value for this Condicion__c.
     * 
     * @return inicio_Campana__c
     */
    public java.util.Date getInicio_Campana__c() {
        return inicio_Campana__c;
    }


    /**
     * Sets the inicio_Campana__c value for this Condicion__c.
     * 
     * @param inicio_Campana__c
     */
    public void setInicio_Campana__c(java.util.Date inicio_Campana__c) {
        this.inicio_Campana__c = inicio_Campana__c;
    }


    /**
     * Gets the isDeleted value for this Condicion__c.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this Condicion__c.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the LOA__c value for this Condicion__c.
     * 
     * @return LOA__c
     */
    public java.lang.String getLOA__c() {
        return LOA__c;
    }


    /**
     * Sets the LOA__c value for this Condicion__c.
     * 
     * @param LOA__c
     */
    public void setLOA__c(java.lang.String LOA__c) {
        this.LOA__c = LOA__c;
    }


    /**
     * Gets the lastActivityDate value for this Condicion__c.
     * 
     * @return lastActivityDate
     */
    public java.util.Date getLastActivityDate() {
        return lastActivityDate;
    }


    /**
     * Sets the lastActivityDate value for this Condicion__c.
     * 
     * @param lastActivityDate
     */
    public void setLastActivityDate(java.util.Date lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }


    /**
     * Gets the lastModifiedBy value for this Condicion__c.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Condicion__c.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Condicion__c.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Condicion__c.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Condicion__c.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Condicion__c.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReferencedDate value for this Condicion__c.
     * 
     * @return lastReferencedDate
     */
    public java.util.Calendar getLastReferencedDate() {
        return lastReferencedDate;
    }


    /**
     * Sets the lastReferencedDate value for this Condicion__c.
     * 
     * @param lastReferencedDate
     */
    public void setLastReferencedDate(java.util.Calendar lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }


    /**
     * Gets the lastViewedDate value for this Condicion__c.
     * 
     * @return lastViewedDate
     */
    public java.util.Calendar getLastViewedDate() {
        return lastViewedDate;
    }


    /**
     * Sets the lastViewedDate value for this Condicion__c.
     * 
     * @param lastViewedDate
     */
    public void setLastViewedDate(java.util.Calendar lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }


    /**
     * Gets the lookedUpFromActivities value for this Condicion__c.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this Condicion__c.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the name value for this Condicion__c.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Condicion__c.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nivel_Empresarias__c value for this Condicion__c.
     * 
     * @return nivel_Empresarias__c
     */
    public java.lang.String getNivel_Empresarias__c() {
        return nivel_Empresarias__c;
    }


    /**
     * Sets the nivel_Empresarias__c value for this Condicion__c.
     * 
     * @param nivel_Empresarias__c
     */
    public void setNivel_Empresarias__c(java.lang.String nivel_Empresarias__c) {
        this.nivel_Empresarias__c = nivel_Empresarias__c;
    }


    /**
     * Gets the notes value for this Condicion__c.
     * 
     * @return notes
     */
    public com.sforce.soap.enterprise.QueryResult getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Condicion__c.
     * 
     * @param notes
     */
    public void setNotes(com.sforce.soap.enterprise.QueryResult notes) {
        this.notes = notes;
    }


    /**
     * Gets the notesAndAttachments value for this Condicion__c.
     * 
     * @return notesAndAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getNotesAndAttachments() {
        return notesAndAttachments;
    }


    /**
     * Sets the notesAndAttachments value for this Condicion__c.
     * 
     * @param notesAndAttachments
     */
    public void setNotesAndAttachments(com.sforce.soap.enterprise.QueryResult notesAndAttachments) {
        this.notesAndAttachments = notesAndAttachments;
    }


    /**
     * Gets the numero_de_linea__c value for this Condicion__c.
     * 
     * @return numero_de_linea__c
     */
    public java.lang.String getNumero_de_linea__c() {
        return numero_de_linea__c;
    }


    /**
     * Sets the numero_de_linea__c value for this Condicion__c.
     * 
     * @param numero_de_linea__c
     */
    public void setNumero_de_linea__c(java.lang.String numero_de_linea__c) {
        this.numero_de_linea__c = numero_de_linea__c;
    }


    /**
     * Gets the numero_de_linea__r value for this Condicion__c.
     * 
     * @return numero_de_linea__r
     */
    public com.sforce.soap.enterprise.sobject.Item__c getNumero_de_linea__r() {
        return numero_de_linea__r;
    }


    /**
     * Sets the numero_de_linea__r value for this Condicion__c.
     * 
     * @param numero_de_linea__r
     */
    public void setNumero_de_linea__r(com.sforce.soap.enterprise.sobject.Item__c numero_de_linea__r) {
        this.numero_de_linea__r = numero_de_linea__r;
    }


    /**
     * Gets the openActivities value for this Condicion__c.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this Condicion__c.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the origen_de_la_Orden__c value for this Condicion__c.
     * 
     * @return origen_de_la_Orden__c
     */
    public java.lang.String getOrigen_de_la_Orden__c() {
        return origen_de_la_Orden__c;
    }


    /**
     * Sets the origen_de_la_Orden__c value for this Condicion__c.
     * 
     * @param origen_de_la_Orden__c
     */
    public void setOrigen_de_la_Orden__c(java.lang.String origen_de_la_Orden__c) {
        this.origen_de_la_Orden__c = origen_de_la_Orden__c;
    }


    /**
     * Gets the otro__c value for this Condicion__c.
     * 
     * @return otro__c
     */
    public java.lang.String getOtro__c() {
        return otro__c;
    }


    /**
     * Sets the otro__c value for this Condicion__c.
     * 
     * @param otro__c
     */
    public void setOtro__c(java.lang.String otro__c) {
        this.otro__c = otro__c;
    }


    /**
     * Gets the processInstances value for this Condicion__c.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this Condicion__c.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this Condicion__c.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this Condicion__c.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the rango_Club_de_Privilegios__c value for this Condicion__c.
     * 
     * @return rango_Club_de_Privilegios__c
     */
    public java.lang.String getRango_Club_de_Privilegios__c() {
        return rango_Club_de_Privilegios__c;
    }


    /**
     * Sets the rango_Club_de_Privilegios__c value for this Condicion__c.
     * 
     * @param rango_Club_de_Privilegios__c
     */
    public void setRango_Club_de_Privilegios__c(java.lang.String rango_Club_de_Privilegios__c) {
        this.rango_Club_de_Privilegios__c = rango_Club_de_Privilegios__c;
    }


    /**
     * Gets the recordAssociatedGroups value for this Condicion__c.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this Condicion__c.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the recordType value for this Condicion__c.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this Condicion__c.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this Condicion__c.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this Condicion__c.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the reingreso__c value for this Condicion__c.
     * 
     * @return reingreso__c
     */
    public java.lang.String getReingreso__c() {
        return reingreso__c;
    }


    /**
     * Sets the reingreso__c value for this Condicion__c.
     * 
     * @param reingreso__c
     */
    public void setReingreso__c(java.lang.String reingreso__c) {
        this.reingreso__c = reingreso__c;
    }


    /**
     * Gets the segmento_que_aplica__c value for this Condicion__c.
     * 
     * @return segmento_que_aplica__c
     */
    public java.lang.String getSegmento_que_aplica__c() {
        return segmento_que_aplica__c;
    }


    /**
     * Sets the segmento_que_aplica__c value for this Condicion__c.
     * 
     * @param segmento_que_aplica__c
     */
    public void setSegmento_que_aplica__c(java.lang.String segmento_que_aplica__c) {
        this.segmento_que_aplica__c = segmento_que_aplica__c;
    }


    /**
     * Gets the systemModstamp value for this Condicion__c.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Condicion__c.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this Condicion__c.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this Condicion__c.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the territorio__c value for this Condicion__c.
     * 
     * @return territorio__c
     */
    public java.lang.String getTerritorio__c() {
        return territorio__c;
    }


    /**
     * Sets the territorio__c value for this Condicion__c.
     * 
     * @param territorio__c
     */
    public void setTerritorio__c(java.lang.String territorio__c) {
        this.territorio__c = territorio__c;
    }


    /**
     * Gets the tipo_Empresarias__c value for this Condicion__c.
     * 
     * @return tipo_Empresarias__c
     */
    public java.lang.String getTipo_Empresarias__c() {
        return tipo_Empresarias__c;
    }


    /**
     * Sets the tipo_Empresarias__c value for this Condicion__c.
     * 
     * @param tipo_Empresarias__c
     */
    public void setTipo_Empresarias__c(java.lang.String tipo_Empresarias__c) {
        this.tipo_Empresarias__c = tipo_Empresarias__c;
    }


    /**
     * Gets the tipo_de_Contrato__c value for this Condicion__c.
     * 
     * @return tipo_de_Contrato__c
     */
    public java.lang.String getTipo_de_Contrato__c() {
        return tipo_de_Contrato__c;
    }


    /**
     * Sets the tipo_de_Contrato__c value for this Condicion__c.
     * 
     * @param tipo_de_Contrato__c
     */
    public void setTipo_de_Contrato__c(java.lang.String tipo_de_Contrato__c) {
        this.tipo_de_Contrato__c = tipo_de_Contrato__c;
    }


    /**
     * Gets the todas__c value for this Condicion__c.
     * 
     * @return todas__c
     */
    public java.lang.Boolean getTodas__c() {
        return todas__c;
    }


    /**
     * Sets the todas__c value for this Condicion__c.
     * 
     * @param todas__c
     */
    public void setTodas__c(java.lang.Boolean todas__c) {
        this.todas__c = todas__c;
    }


    /**
     * Gets the topicAssignments value for this Condicion__c.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this Condicion__c.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the userRecordAccess value for this Condicion__c.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this Condicion__c.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the venta__c value for this Condicion__c.
     * 
     * @return venta__c
     */
    public java.lang.String getVenta__c() {
        return venta__c;
    }


    /**
     * Sets the venta__c value for this Condicion__c.
     * 
     * @param venta__c
     */
    public void setVenta__c(java.lang.String venta__c) {
        this.venta__c = venta__c;
    }


    /**
     * Gets the zona__c value for this Condicion__c.
     * 
     * @return zona__c
     */
    public java.lang.String getZona__c() {
        return zona__c;
    }


    /**
     * Sets the zona__c value for this Condicion__c.
     * 
     * @param zona__c
     */
    public void setZona__c(java.lang.String zona__c) {
        this.zona__c = zona__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Condicion__c)) return false;
        Condicion__c other = (Condicion__c) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accion__c==null && other.getAccion__c()==null) || 
             (this.accion__c!=null &&
              this.accion__c.equals(other.getAccion__c()))) &&
            ((this.accion__r==null && other.getAccion__r()==null) || 
             (this.accion__r!=null &&
              this.accion__r.equals(other.getAccion__r()))) &&
            ((this.acciones__r==null && other.getAcciones__r()==null) || 
             (this.acciones__r!=null &&
              this.acciones__r.equals(other.getAcciones__r()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.archivo_de_Listado__c==null && other.getArchivo_de_Listado__c()==null) || 
             (this.archivo_de_Listado__c!=null &&
              this.archivo_de_Listado__c.equals(other.getArchivo_de_Listado__c()))) &&
            ((this.attachedContentDocuments==null && other.getAttachedContentDocuments()==null) || 
             (this.attachedContentDocuments!=null &&
              this.attachedContentDocuments.equals(other.getAttachedContentDocuments()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.campana_Avon__c==null && other.getCampana_Avon__c()==null) || 
             (this.campana_Avon__c!=null &&
              this.campana_Avon__c.equals(other.getCampana_Avon__c()))) &&
            ((this.campana_Avon__r==null && other.getCampana_Avon__r()==null) || 
             (this.campana_Avon__r!=null &&
              this.campana_Avon__r.equals(other.getCampana_Avon__r()))) &&
            ((this.combinedAttachments==null && other.getCombinedAttachments()==null) || 
             (this.combinedAttachments!=null &&
              this.combinedAttachments.equals(other.getCombinedAttachments()))) &&
            ((this.condiciones__c==null && other.getCondiciones__c()==null) || 
             (this.condiciones__c!=null &&
              this.condiciones__c.equals(other.getCondiciones__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.division__c==null && other.getDivision__c()==null) || 
             (this.division__c!=null &&
              this.division__c.equals(other.getDivision__c()))) &&
            ((this.duplicateRecordItems==null && other.getDuplicateRecordItems()==null) || 
             (this.duplicateRecordItems!=null &&
              this.duplicateRecordItems.equals(other.getDuplicateRecordItems()))) &&
            ((this.estrategia__c==null && other.getEstrategia__c()==null) || 
             (this.estrategia__c!=null &&
              this.estrategia__c.equals(other.getEstrategia__c()))) &&
            ((this.estrategia__r==null && other.getEstrategia__r()==null) || 
             (this.estrategia__r!=null &&
              this.estrategia__r.equals(other.getEstrategia__r()))) &&
            ((this.etapa__c==null && other.getEtapa__c()==null) || 
             (this.etapa__c!=null &&
              this.etapa__c.equals(other.getEtapa__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.fin_Campana__c==null && other.getFin_Campana__c()==null) || 
             (this.fin_Campana__c!=null &&
              this.fin_Campana__c.equals(other.getFin_Campana__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.inicio_Campana__c==null && other.getInicio_Campana__c()==null) || 
             (this.inicio_Campana__c!=null &&
              this.inicio_Campana__c.equals(other.getInicio_Campana__c()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.LOA__c==null && other.getLOA__c()==null) || 
             (this.LOA__c!=null &&
              this.LOA__c.equals(other.getLOA__c()))) &&
            ((this.lastActivityDate==null && other.getLastActivityDate()==null) || 
             (this.lastActivityDate!=null &&
              this.lastActivityDate.equals(other.getLastActivityDate()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastReferencedDate==null && other.getLastReferencedDate()==null) || 
             (this.lastReferencedDate!=null &&
              this.lastReferencedDate.equals(other.getLastReferencedDate()))) &&
            ((this.lastViewedDate==null && other.getLastViewedDate()==null) || 
             (this.lastViewedDate!=null &&
              this.lastViewedDate.equals(other.getLastViewedDate()))) &&
            ((this.lookedUpFromActivities==null && other.getLookedUpFromActivities()==null) || 
             (this.lookedUpFromActivities!=null &&
              this.lookedUpFromActivities.equals(other.getLookedUpFromActivities()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.nivel_Empresarias__c==null && other.getNivel_Empresarias__c()==null) || 
             (this.nivel_Empresarias__c!=null &&
              this.nivel_Empresarias__c.equals(other.getNivel_Empresarias__c()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.notesAndAttachments==null && other.getNotesAndAttachments()==null) || 
             (this.notesAndAttachments!=null &&
              this.notesAndAttachments.equals(other.getNotesAndAttachments()))) &&
            ((this.numero_de_linea__c==null && other.getNumero_de_linea__c()==null) || 
             (this.numero_de_linea__c!=null &&
              this.numero_de_linea__c.equals(other.getNumero_de_linea__c()))) &&
            ((this.numero_de_linea__r==null && other.getNumero_de_linea__r()==null) || 
             (this.numero_de_linea__r!=null &&
              this.numero_de_linea__r.equals(other.getNumero_de_linea__r()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.origen_de_la_Orden__c==null && other.getOrigen_de_la_Orden__c()==null) || 
             (this.origen_de_la_Orden__c!=null &&
              this.origen_de_la_Orden__c.equals(other.getOrigen_de_la_Orden__c()))) &&
            ((this.otro__c==null && other.getOtro__c()==null) || 
             (this.otro__c!=null &&
              this.otro__c.equals(other.getOtro__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.rango_Club_de_Privilegios__c==null && other.getRango_Club_de_Privilegios__c()==null) || 
             (this.rango_Club_de_Privilegios__c!=null &&
              this.rango_Club_de_Privilegios__c.equals(other.getRango_Club_de_Privilegios__c()))) &&
            ((this.recordAssociatedGroups==null && other.getRecordAssociatedGroups()==null) || 
             (this.recordAssociatedGroups!=null &&
              this.recordAssociatedGroups.equals(other.getRecordAssociatedGroups()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.reingreso__c==null && other.getReingreso__c()==null) || 
             (this.reingreso__c!=null &&
              this.reingreso__c.equals(other.getReingreso__c()))) &&
            ((this.segmento_que_aplica__c==null && other.getSegmento_que_aplica__c()==null) || 
             (this.segmento_que_aplica__c!=null &&
              this.segmento_que_aplica__c.equals(other.getSegmento_que_aplica__c()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.territorio__c==null && other.getTerritorio__c()==null) || 
             (this.territorio__c!=null &&
              this.territorio__c.equals(other.getTerritorio__c()))) &&
            ((this.tipo_Empresarias__c==null && other.getTipo_Empresarias__c()==null) || 
             (this.tipo_Empresarias__c!=null &&
              this.tipo_Empresarias__c.equals(other.getTipo_Empresarias__c()))) &&
            ((this.tipo_de_Contrato__c==null && other.getTipo_de_Contrato__c()==null) || 
             (this.tipo_de_Contrato__c!=null &&
              this.tipo_de_Contrato__c.equals(other.getTipo_de_Contrato__c()))) &&
            ((this.todas__c==null && other.getTodas__c()==null) || 
             (this.todas__c!=null &&
              this.todas__c.equals(other.getTodas__c()))) &&
            ((this.topicAssignments==null && other.getTopicAssignments()==null) || 
             (this.topicAssignments!=null &&
              this.topicAssignments.equals(other.getTopicAssignments()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.venta__c==null && other.getVenta__c()==null) || 
             (this.venta__c!=null &&
              this.venta__c.equals(other.getVenta__c()))) &&
            ((this.zona__c==null && other.getZona__c()==null) || 
             (this.zona__c!=null &&
              this.zona__c.equals(other.getZona__c())));
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
        if (getAccion__c() != null) {
            _hashCode += getAccion__c().hashCode();
        }
        if (getAccion__r() != null) {
            _hashCode += getAccion__r().hashCode();
        }
        if (getAcciones__r() != null) {
            _hashCode += getAcciones__r().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getArchivo_de_Listado__c() != null) {
            _hashCode += getArchivo_de_Listado__c().hashCode();
        }
        if (getAttachedContentDocuments() != null) {
            _hashCode += getAttachedContentDocuments().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getCampana_Avon__c() != null) {
            _hashCode += getCampana_Avon__c().hashCode();
        }
        if (getCampana_Avon__r() != null) {
            _hashCode += getCampana_Avon__r().hashCode();
        }
        if (getCombinedAttachments() != null) {
            _hashCode += getCombinedAttachments().hashCode();
        }
        if (getCondiciones__c() != null) {
            _hashCode += getCondiciones__c().hashCode();
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
        if (getDivision__c() != null) {
            _hashCode += getDivision__c().hashCode();
        }
        if (getDuplicateRecordItems() != null) {
            _hashCode += getDuplicateRecordItems().hashCode();
        }
        if (getEstrategia__c() != null) {
            _hashCode += getEstrategia__c().hashCode();
        }
        if (getEstrategia__r() != null) {
            _hashCode += getEstrategia__r().hashCode();
        }
        if (getEtapa__c() != null) {
            _hashCode += getEtapa__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFin_Campana__c() != null) {
            _hashCode += getFin_Campana__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getInicio_Campana__c() != null) {
            _hashCode += getInicio_Campana__c().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getLOA__c() != null) {
            _hashCode += getLOA__c().hashCode();
        }
        if (getLastActivityDate() != null) {
            _hashCode += getLastActivityDate().hashCode();
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
        if (getLastReferencedDate() != null) {
            _hashCode += getLastReferencedDate().hashCode();
        }
        if (getLastViewedDate() != null) {
            _hashCode += getLastViewedDate().hashCode();
        }
        if (getLookedUpFromActivities() != null) {
            _hashCode += getLookedUpFromActivities().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNivel_Empresarias__c() != null) {
            _hashCode += getNivel_Empresarias__c().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getNotesAndAttachments() != null) {
            _hashCode += getNotesAndAttachments().hashCode();
        }
        if (getNumero_de_linea__c() != null) {
            _hashCode += getNumero_de_linea__c().hashCode();
        }
        if (getNumero_de_linea__r() != null) {
            _hashCode += getNumero_de_linea__r().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOrigen_de_la_Orden__c() != null) {
            _hashCode += getOrigen_de_la_Orden__c().hashCode();
        }
        if (getOtro__c() != null) {
            _hashCode += getOtro__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getRango_Club_de_Privilegios__c() != null) {
            _hashCode += getRango_Club_de_Privilegios__c().hashCode();
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
        if (getReingreso__c() != null) {
            _hashCode += getReingreso__c().hashCode();
        }
        if (getSegmento_que_aplica__c() != null) {
            _hashCode += getSegmento_que_aplica__c().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTerritorio__c() != null) {
            _hashCode += getTerritorio__c().hashCode();
        }
        if (getTipo_Empresarias__c() != null) {
            _hashCode += getTipo_Empresarias__c().hashCode();
        }
        if (getTipo_de_Contrato__c() != null) {
            _hashCode += getTipo_de_Contrato__c().hashCode();
        }
        if (getTodas__c() != null) {
            _hashCode += getTodas__c().hashCode();
        }
        if (getTopicAssignments() != null) {
            _hashCode += getTopicAssignments().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getVenta__c() != null) {
            _hashCode += getVenta__c().hashCode();
        }
        if (getZona__c() != null) {
            _hashCode += getZona__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Condicion__c.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Condicion__c"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accion__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accion__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accion__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acciones__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Acciones__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("archivo_de_Listado__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Archivo_de_Listado__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("campana_Avon__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campana_Avon__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campana_Avon__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campana_Avon__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_Avon__c"));
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
        elemField.setFieldName("condiciones__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Condiciones__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("division__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Division__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("estrategia__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estrategia__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estrategia__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estrategia__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estrategia__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etapa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Etapa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("feedSubscriptionsForEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedSubscriptionsForEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fin_Campana__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fin_Campana__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("inicio_Campana__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Inicio_Campana__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
        elemField.setFieldName("lookedUpFromActivities");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LookedUpFromActivities"));
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
        elemField.setFieldName("nivel_Empresarias__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Nivel_Empresarias__c"));
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
        elemField.setFieldName("numero_de_linea__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_linea__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_de_linea__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_linea__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Item__c"));
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
        elemField.setFieldName("origen_de_la_Orden__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Origen_de_la_Orden__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otro__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Otro__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("rango_Club_de_Privilegios__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Rango_Club_de_Privilegios__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("reingreso__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reingreso__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmento_que_aplica__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Segmento_que_aplica__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("territorio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Territorio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_Empresarias__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_Empresarias__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_Contrato__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_Contrato__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("todas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Todas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("userRecordAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("venta__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Venta__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zona__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zona__c"));
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
