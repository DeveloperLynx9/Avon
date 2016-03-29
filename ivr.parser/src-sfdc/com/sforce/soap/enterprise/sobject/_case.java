/**
 * _case.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class _case  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.Account account;

    private java.lang.String accountId;

    private java.lang.String acepto_pago_en_efectivo__c;

    private java.lang.String acepto_sustituto__c;

    private com.sforce.soap.enterprise.QueryResult activityHistories;

    private java.lang.String agencia_de_cobranza__c;

    private java.lang.String apellido_Materno__c;

    private java.lang.String apellido_Paterno__c;

    private java.lang.String aprobo_gerente_de_zona__c;

    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private com.sforce.soap.enterprise.QueryResult attachments;

    private java.lang.String autoriza_acumulado__c;

    private java.lang.String autorizador__c;

    private java.lang.String banco__c;

    private com.sforce.soap.enterprise.sobject.BusinessHours businessHours;

    private java.lang.String businessHoursId;

    private java.lang.String CURP__c;

    private java.lang.String campa_a_de_aplicaci_n__c;

    private java.lang.String campana__c;

    private java.lang.String campania_Avon__c;

    private com.sforce.soap.enterprise.sobject.Campania_Avon__c campania_Avon__r;

    private java.lang.String campania_de_envio__c;

    private java.lang.Double cantidad__c;

    private java.lang.Double cantidad_a_recibir__c;

    private java.lang.Double cantidad_recibida__c;

    private java.lang.String cargo_por__c;

    private com.sforce.soap.enterprise.QueryResult caseComments;

    private com.sforce.soap.enterprise.QueryResult caseContactRoles;

    private com.sforce.soap.enterprise.QueryResult caseMilestones;

    private java.lang.String caseNumber;

    private com.sforce.soap.enterprise.QueryResult caseSolutions;

    private com.sforce.soap.enterprise.QueryResult cases;

    private java.lang.String categoria__c;

    private java.lang.String causa_Ajuste__c;

    private java.util.Calendar closedDate;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private java.util.Calendar completion_Date__c;

    private java.lang.String concepto__c;

    private com.sforce.soap.enterprise.sobject.Contact contact;

    private java.lang.String contactId;

    private java.lang.String correo_Electr_nico__c;

    private java.lang.String correo_Gerente_Divisional__c;

    private java.lang.String correo_Gerente_Regional__c;

    private java.lang.String correo_Gerente_de_Zona__c;

    private java.lang.String correo_electronico__c;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String descripci_n_del_premio__c;

    private java.lang.String descripcion_del_pedido__c;

    private java.lang.String descripcion_producto__c;

    private java.lang.String description;

    private java.util.Calendar detenido_desde_custom__c;

    private java.lang.String digitos_de_bodega__c;

    private java.lang.String direccion__c;

    private com.sforce.soap.enterprise.QueryResult emailMessages;

    private com.sforce.soap.enterprise.sobject.Entitlement entitlement;

    private java.lang.String entitlementId;

    private java.lang.Boolean enviado_a_PROFECO__c;

    private java.lang.String error_en_modificacion__c;

    private java.lang.String es_caja_completa__c;

    private java.lang.String estatus_Rep_Emp__c;

    private com.sforce.soap.enterprise.QueryResult events;

    private java.lang.String evidencia_Incidencia__c;

    private java.lang.Boolean excepcion__c;

    private java.lang.String existencia__c;

    private java.lang.String FSC_Sustituto__c;

    private java.lang.String FS_Code__c;

    private java.util.Date fecha_Web__c;

    private java.util.Date fecha_de_Pago__c;

    private java.util.Date fecha_de_captura__c;

    private java.util.Date fecha_de_envio__c;

    private java.util.Date fecha_de_facturacion__c;

    private java.util.Date fecha_de_ingreso__c;

    private java.util.Date fecha_de_ingreso_al_sistema__c;

    private java.util.Date fecha_de_ingreso_de_la_orden__c;

    private java.util.Date fecha_de_ingreso_del_pedido__c;

    private java.util.Date fecha_de_registro__c;

    private java.util.Date fecha_recompra__c;

    private com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity;

    private com.sforce.soap.enterprise.QueryResult feeds;

    private java.lang.String folio_Sistema_Externo__c;

    private java.lang.String folleto__c;

    private java.lang.String hay_solucion__c;

    private com.sforce.soap.enterprise.QueryResult histories;

    private java.lang.Double importe__c;

    private java.lang.Double importe_facturacion__c;

    private java.lang.Double importe_pago__c;

    private java.lang.Double importe_transaccion__c;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean isClosedOnCreate;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isEscalated;

    private java.lang.Boolean isStopped;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.util.Calendar lastReferencedDate;

    private java.util.Calendar lastViewedDate;

    private com.sforce.soap.enterprise.QueryResult liveChatTranscripts;

    private com.sforce.soap.enterprise.QueryResult lookedUpFromActivities;

    private java.lang.String medio_de_pago__c;

    private java.lang.String milestoneStatus;

    private java.lang.String monto_Estimado_de_la_orden__c;

    private java.lang.Double monto__c;

    private java.lang.String motivo_condonacion__c;

    private java.lang.String motivo_de_Cancelaci_n__c;

    private java.lang.String n_mero_de_Orden_Web_o_IVR__c;

    private java.lang.String no_Clave_modificacion__c;

    private java.lang.String nombre__c;

    private java.lang.String numero_de_confirmacion_de_la_orden__c;

    private java.lang.String numero_de_folio__c;

    private java.lang.String numero_de_linea__c;

    private java.lang.String numero_de_monedero__c;

    private java.lang.String numero_de_orden__c;

    private java.lang.String numero_de_pago__c;

    private java.lang.String numero_de_siniestro__c;

    private java.lang.String numero_de_tarjeta__c;

    private java.lang.String numero_referencia_del_pago__c;

    private com.sforce.soap.enterprise.QueryResult openActivities;

    private java.lang.String origin;

    private com.sforce.soap.enterprise.sobject.Name owner;

    private java.lang.String ownerId;

    private com.sforce.soap.enterprise.sobject._case parent;

    private java.lang.String parentId;

    private java.lang.Double paso__c;

    private java.lang.Double porcentaje_de_cr_dito__c;

    private com.sforce.soap.enterprise.QueryResult posts;

    private java.lang.String premio_grande__c;

    private java.lang.String priority;

    private java.lang.String procede__c;

    private com.sforce.soap.enterprise.QueryResult processInstances;

    private com.sforce.soap.enterprise.QueryResult processSteps;

    private java.lang.String programa2__c;

    private com.sforce.soap.enterprise.sobject.Programa__c programa2__r;

    private java.lang.String programa__c;

    private java.lang.String razon_No_Procede__c;

    private java.lang.String razon_Procede__c;

    private java.lang.String reason;

    private com.sforce.soap.enterprise.QueryResult recordAssociatedGroups;

    private com.sforce.soap.enterprise.sobject.RecordType recordType;

    private java.lang.String recordTypeId;

    private java.lang.String red__c;

    private java.lang.String region__c;

    private java.lang.String registro_Destino__c;

    private com.sforce.soap.enterprise.sobject.Contact registro_Destino__r;

    private java.lang.String registro_Origen__c;

    private com.sforce.soap.enterprise.sobject.Contact registro_Origen__r;

    private java.lang.String registro_Web__c;

    private java.lang.String registro__c;

    private java.lang.String reporte_Acompaniame__c;

    private java.lang.String reporte__c;

    private java.lang.String resoluci_n_Supervisor__c;

    private java.lang.String resolucion_incidencia__c;

    private java.lang.String respuesta_del_solicitante__c;

    private java.lang.String resultado_Incentivos_MX__c;

    private java.lang.String resultado__c;

    private java.lang.String SKU__c;

    private java.lang.String saldo_Digito__c;

    private com.sforce.soap.enterprise.QueryResult shares;

    private java.util.Calendar slaExitDate;

    private java.util.Calendar slaStartDate;

    private com.sforce.soap.enterprise.QueryResult solutions;

    private java.lang.String status;

    private java.util.Calendar stopStartDate;

    private java.lang.String sub_Razon_Procede__c;

    private java.lang.String sub_Tipificacion__c;

    private java.lang.String subject;

    private java.lang.String suppliedCompany;

    private java.lang.String suppliedEmail;

    private java.lang.String suppliedName;

    private java.lang.String suppliedPhone;

    private java.util.Calendar systemModstamp;

    private com.sforce.soap.enterprise.QueryResult tasks;

    private com.sforce.soap.enterprise.QueryResult teamMembers;

    private com.sforce.soap.enterprise.QueryResult teamTemplateRecords;

    private java.lang.String tel_fono_de_Casa__c;

    private java.lang.String tel_fono_de_Celular__c;

    private java.lang.String telefono__c;

    private java.lang.String tempOwnerId__c;

    private java.lang.String ticket_Remedy__c;

    private java.lang.String tipificacion__c;

    private java.lang.String tipo_Aclaracion__c;

    private java.lang.String tipo_Envio__c;

    private java.lang.String tipo_Faltante_Afectaci_n__c;

    private java.lang.String tipo_Informativo__c;

    private java.lang.String tipo_PFP__c;

    private java.lang.String tipo_actualizacion__c;

    private java.lang.String tipo_acumulado__c;

    private java.lang.String tipo_componente__c;

    private java.lang.String tipo_contacto__c;

    private java.lang.String tipo_de_asignaci_n__c;

    private java.lang.String tipo_de_bono_apoyo__c;

    private java.lang.String tipo_de_incentivo__c;

    private java.lang.String tipo_de_incidencia__c;

    private java.lang.String tipo_de_material__c;

    private java.lang.String tipo_de_pedido__c;

    private java.lang.String tipo_de_red__c;

    private java.lang.String tipo_de_reporte__c;

    private java.lang.String tipo_de_robo_extravio__c;

    private java.lang.String tipo_de_transferencia__c;

    private java.lang.String tipo_incidencia_monedero__c;

    private java.lang.String tipo_solicitante__c;

    private com.sforce.soap.enterprise.QueryResult topicAssignments;

    private java.lang.String total_de_claves__c;

    private java.lang.String type;

    private java.lang.String URL__c;

    private java.lang.Double unidades_Faltantes__c;

    private java.lang.Double unidades__c;

    private java.lang.Double unidades_aclaradas__c;

    private com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess;

    private java.lang.String VEA__c;

    private java.lang.String zona_Destino__c;

    private java.lang.String zona__c;

    private java.lang.String zona_de_Envio__c;

    private java.lang.String area__c;

    public _case() {
    }

    public _case(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.Account account,
           java.lang.String accountId,
           java.lang.String acepto_pago_en_efectivo__c,
           java.lang.String acepto_sustituto__c,
           com.sforce.soap.enterprise.QueryResult activityHistories,
           java.lang.String agencia_de_cobranza__c,
           java.lang.String apellido_Materno__c,
           java.lang.String apellido_Paterno__c,
           java.lang.String aprobo_gerente_de_zona__c,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           com.sforce.soap.enterprise.QueryResult attachments,
           java.lang.String autoriza_acumulado__c,
           java.lang.String autorizador__c,
           java.lang.String banco__c,
           com.sforce.soap.enterprise.sobject.BusinessHours businessHours,
           java.lang.String businessHoursId,
           java.lang.String CURP__c,
           java.lang.String campa_a_de_aplicaci_n__c,
           java.lang.String campana__c,
           java.lang.String campania_Avon__c,
           com.sforce.soap.enterprise.sobject.Campania_Avon__c campania_Avon__r,
           java.lang.String campania_de_envio__c,
           java.lang.Double cantidad__c,
           java.lang.Double cantidad_a_recibir__c,
           java.lang.Double cantidad_recibida__c,
           java.lang.String cargo_por__c,
           com.sforce.soap.enterprise.QueryResult caseComments,
           com.sforce.soap.enterprise.QueryResult caseContactRoles,
           com.sforce.soap.enterprise.QueryResult caseMilestones,
           java.lang.String caseNumber,
           com.sforce.soap.enterprise.QueryResult caseSolutions,
           com.sforce.soap.enterprise.QueryResult cases,
           java.lang.String categoria__c,
           java.lang.String causa_Ajuste__c,
           java.util.Calendar closedDate,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           java.util.Calendar completion_Date__c,
           java.lang.String concepto__c,
           com.sforce.soap.enterprise.sobject.Contact contact,
           java.lang.String contactId,
           java.lang.String correo_Electr_nico__c,
           java.lang.String correo_Gerente_Divisional__c,
           java.lang.String correo_Gerente_Regional__c,
           java.lang.String correo_Gerente_de_Zona__c,
           java.lang.String correo_electronico__c,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String descripci_n_del_premio__c,
           java.lang.String descripcion_del_pedido__c,
           java.lang.String descripcion_producto__c,
           java.lang.String description,
           java.util.Calendar detenido_desde_custom__c,
           java.lang.String digitos_de_bodega__c,
           java.lang.String direccion__c,
           com.sforce.soap.enterprise.QueryResult emailMessages,
           com.sforce.soap.enterprise.sobject.Entitlement entitlement,
           java.lang.String entitlementId,
           java.lang.Boolean enviado_a_PROFECO__c,
           java.lang.String error_en_modificacion__c,
           java.lang.String es_caja_completa__c,
           java.lang.String estatus_Rep_Emp__c,
           com.sforce.soap.enterprise.QueryResult events,
           java.lang.String evidencia_Incidencia__c,
           java.lang.Boolean excepcion__c,
           java.lang.String existencia__c,
           java.lang.String FSC_Sustituto__c,
           java.lang.String FS_Code__c,
           java.util.Date fecha_Web__c,
           java.util.Date fecha_de_Pago__c,
           java.util.Date fecha_de_captura__c,
           java.util.Date fecha_de_envio__c,
           java.util.Date fecha_de_facturacion__c,
           java.util.Date fecha_de_ingreso__c,
           java.util.Date fecha_de_ingreso_al_sistema__c,
           java.util.Date fecha_de_ingreso_de_la_orden__c,
           java.util.Date fecha_de_ingreso_del_pedido__c,
           java.util.Date fecha_de_registro__c,
           java.util.Date fecha_recompra__c,
           com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity,
           com.sforce.soap.enterprise.QueryResult feeds,
           java.lang.String folio_Sistema_Externo__c,
           java.lang.String folleto__c,
           java.lang.String hay_solucion__c,
           com.sforce.soap.enterprise.QueryResult histories,
           java.lang.Double importe__c,
           java.lang.Double importe_facturacion__c,
           java.lang.Double importe_pago__c,
           java.lang.Double importe_transaccion__c,
           java.lang.Boolean isClosed,
           java.lang.Boolean isClosedOnCreate,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isEscalated,
           java.lang.Boolean isStopped,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.util.Calendar lastReferencedDate,
           java.util.Calendar lastViewedDate,
           com.sforce.soap.enterprise.QueryResult liveChatTranscripts,
           com.sforce.soap.enterprise.QueryResult lookedUpFromActivities,
           java.lang.String medio_de_pago__c,
           java.lang.String milestoneStatus,
           java.lang.String monto_Estimado_de_la_orden__c,
           java.lang.Double monto__c,
           java.lang.String motivo_condonacion__c,
           java.lang.String motivo_de_Cancelaci_n__c,
           java.lang.String n_mero_de_Orden_Web_o_IVR__c,
           java.lang.String no_Clave_modificacion__c,
           java.lang.String nombre__c,
           java.lang.String numero_de_confirmacion_de_la_orden__c,
           java.lang.String numero_de_folio__c,
           java.lang.String numero_de_linea__c,
           java.lang.String numero_de_monedero__c,
           java.lang.String numero_de_orden__c,
           java.lang.String numero_de_pago__c,
           java.lang.String numero_de_siniestro__c,
           java.lang.String numero_de_tarjeta__c,
           java.lang.String numero_referencia_del_pago__c,
           com.sforce.soap.enterprise.QueryResult openActivities,
           java.lang.String origin,
           com.sforce.soap.enterprise.sobject.Name owner,
           java.lang.String ownerId,
           com.sforce.soap.enterprise.sobject._case parent,
           java.lang.String parentId,
           java.lang.Double paso__c,
           java.lang.Double porcentaje_de_cr_dito__c,
           com.sforce.soap.enterprise.QueryResult posts,
           java.lang.String premio_grande__c,
           java.lang.String priority,
           java.lang.String procede__c,
           com.sforce.soap.enterprise.QueryResult processInstances,
           com.sforce.soap.enterprise.QueryResult processSteps,
           java.lang.String programa2__c,
           com.sforce.soap.enterprise.sobject.Programa__c programa2__r,
           java.lang.String programa__c,
           java.lang.String razon_No_Procede__c,
           java.lang.String razon_Procede__c,
           java.lang.String reason,
           com.sforce.soap.enterprise.QueryResult recordAssociatedGroups,
           com.sforce.soap.enterprise.sobject.RecordType recordType,
           java.lang.String recordTypeId,
           java.lang.String red__c,
           java.lang.String region__c,
           java.lang.String registro_Destino__c,
           com.sforce.soap.enterprise.sobject.Contact registro_Destino__r,
           java.lang.String registro_Origen__c,
           com.sforce.soap.enterprise.sobject.Contact registro_Origen__r,
           java.lang.String registro_Web__c,
           java.lang.String registro__c,
           java.lang.String reporte_Acompaniame__c,
           java.lang.String reporte__c,
           java.lang.String resoluci_n_Supervisor__c,
           java.lang.String resolucion_incidencia__c,
           java.lang.String respuesta_del_solicitante__c,
           java.lang.String resultado_Incentivos_MX__c,
           java.lang.String resultado__c,
           java.lang.String SKU__c,
           java.lang.String saldo_Digito__c,
           com.sforce.soap.enterprise.QueryResult shares,
           java.util.Calendar slaExitDate,
           java.util.Calendar slaStartDate,
           com.sforce.soap.enterprise.QueryResult solutions,
           java.lang.String status,
           java.util.Calendar stopStartDate,
           java.lang.String sub_Razon_Procede__c,
           java.lang.String sub_Tipificacion__c,
           java.lang.String subject,
           java.lang.String suppliedCompany,
           java.lang.String suppliedEmail,
           java.lang.String suppliedName,
           java.lang.String suppliedPhone,
           java.util.Calendar systemModstamp,
           com.sforce.soap.enterprise.QueryResult tasks,
           com.sforce.soap.enterprise.QueryResult teamMembers,
           com.sforce.soap.enterprise.QueryResult teamTemplateRecords,
           java.lang.String tel_fono_de_Casa__c,
           java.lang.String tel_fono_de_Celular__c,
           java.lang.String telefono__c,
           java.lang.String tempOwnerId__c,
           java.lang.String ticket_Remedy__c,
           java.lang.String tipificacion__c,
           java.lang.String tipo_Aclaracion__c,
           java.lang.String tipo_Envio__c,
           java.lang.String tipo_Faltante_Afectaci_n__c,
           java.lang.String tipo_Informativo__c,
           java.lang.String tipo_PFP__c,
           java.lang.String tipo_actualizacion__c,
           java.lang.String tipo_acumulado__c,
           java.lang.String tipo_componente__c,
           java.lang.String tipo_contacto__c,
           java.lang.String tipo_de_asignaci_n__c,
           java.lang.String tipo_de_bono_apoyo__c,
           java.lang.String tipo_de_incentivo__c,
           java.lang.String tipo_de_incidencia__c,
           java.lang.String tipo_de_material__c,
           java.lang.String tipo_de_pedido__c,
           java.lang.String tipo_de_red__c,
           java.lang.String tipo_de_reporte__c,
           java.lang.String tipo_de_robo_extravio__c,
           java.lang.String tipo_de_transferencia__c,
           java.lang.String tipo_incidencia_monedero__c,
           java.lang.String tipo_solicitante__c,
           com.sforce.soap.enterprise.QueryResult topicAssignments,
           java.lang.String total_de_claves__c,
           java.lang.String type,
           java.lang.String URL__c,
           java.lang.Double unidades_Faltantes__c,
           java.lang.Double unidades__c,
           java.lang.Double unidades_aclaradas__c,
           com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess,
           java.lang.String VEA__c,
           java.lang.String zona_Destino__c,
           java.lang.String zona__c,
           java.lang.String zona_de_Envio__c,
           java.lang.String area__c) {
        super(
            fieldsToNull,
            id);
        this.account = account;
        this.accountId = accountId;
        this.acepto_pago_en_efectivo__c = acepto_pago_en_efectivo__c;
        this.acepto_sustituto__c = acepto_sustituto__c;
        this.activityHistories = activityHistories;
        this.agencia_de_cobranza__c = agencia_de_cobranza__c;
        this.apellido_Materno__c = apellido_Materno__c;
        this.apellido_Paterno__c = apellido_Paterno__c;
        this.aprobo_gerente_de_zona__c = aprobo_gerente_de_zona__c;
        this.attachedContentDocuments = attachedContentDocuments;
        this.attachments = attachments;
        this.autoriza_acumulado__c = autoriza_acumulado__c;
        this.autorizador__c = autorizador__c;
        this.banco__c = banco__c;
        this.businessHours = businessHours;
        this.businessHoursId = businessHoursId;
        this.CURP__c = CURP__c;
        this.campa_a_de_aplicaci_n__c = campa_a_de_aplicaci_n__c;
        this.campana__c = campana__c;
        this.campania_Avon__c = campania_Avon__c;
        this.campania_Avon__r = campania_Avon__r;
        this.campania_de_envio__c = campania_de_envio__c;
        this.cantidad__c = cantidad__c;
        this.cantidad_a_recibir__c = cantidad_a_recibir__c;
        this.cantidad_recibida__c = cantidad_recibida__c;
        this.cargo_por__c = cargo_por__c;
        this.caseComments = caseComments;
        this.caseContactRoles = caseContactRoles;
        this.caseMilestones = caseMilestones;
        this.caseNumber = caseNumber;
        this.caseSolutions = caseSolutions;
        this.cases = cases;
        this.categoria__c = categoria__c;
        this.causa_Ajuste__c = causa_Ajuste__c;
        this.closedDate = closedDate;
        this.combinedAttachments = combinedAttachments;
        this.completion_Date__c = completion_Date__c;
        this.concepto__c = concepto__c;
        this.contact = contact;
        this.contactId = contactId;
        this.correo_Electr_nico__c = correo_Electr_nico__c;
        this.correo_Gerente_Divisional__c = correo_Gerente_Divisional__c;
        this.correo_Gerente_Regional__c = correo_Gerente_Regional__c;
        this.correo_Gerente_de_Zona__c = correo_Gerente_de_Zona__c;
        this.correo_electronico__c = correo_electronico__c;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.descripci_n_del_premio__c = descripci_n_del_premio__c;
        this.descripcion_del_pedido__c = descripcion_del_pedido__c;
        this.descripcion_producto__c = descripcion_producto__c;
        this.description = description;
        this.detenido_desde_custom__c = detenido_desde_custom__c;
        this.digitos_de_bodega__c = digitos_de_bodega__c;
        this.direccion__c = direccion__c;
        this.emailMessages = emailMessages;
        this.entitlement = entitlement;
        this.entitlementId = entitlementId;
        this.enviado_a_PROFECO__c = enviado_a_PROFECO__c;
        this.error_en_modificacion__c = error_en_modificacion__c;
        this.es_caja_completa__c = es_caja_completa__c;
        this.estatus_Rep_Emp__c = estatus_Rep_Emp__c;
        this.events = events;
        this.evidencia_Incidencia__c = evidencia_Incidencia__c;
        this.excepcion__c = excepcion__c;
        this.existencia__c = existencia__c;
        this.FSC_Sustituto__c = FSC_Sustituto__c;
        this.FS_Code__c = FS_Code__c;
        this.fecha_Web__c = fecha_Web__c;
        this.fecha_de_Pago__c = fecha_de_Pago__c;
        this.fecha_de_captura__c = fecha_de_captura__c;
        this.fecha_de_envio__c = fecha_de_envio__c;
        this.fecha_de_facturacion__c = fecha_de_facturacion__c;
        this.fecha_de_ingreso__c = fecha_de_ingreso__c;
        this.fecha_de_ingreso_al_sistema__c = fecha_de_ingreso_al_sistema__c;
        this.fecha_de_ingreso_de_la_orden__c = fecha_de_ingreso_de_la_orden__c;
        this.fecha_de_ingreso_del_pedido__c = fecha_de_ingreso_del_pedido__c;
        this.fecha_de_registro__c = fecha_de_registro__c;
        this.fecha_recompra__c = fecha_recompra__c;
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
        this.feeds = feeds;
        this.folio_Sistema_Externo__c = folio_Sistema_Externo__c;
        this.folleto__c = folleto__c;
        this.hay_solucion__c = hay_solucion__c;
        this.histories = histories;
        this.importe__c = importe__c;
        this.importe_facturacion__c = importe_facturacion__c;
        this.importe_pago__c = importe_pago__c;
        this.importe_transaccion__c = importe_transaccion__c;
        this.isClosed = isClosed;
        this.isClosedOnCreate = isClosedOnCreate;
        this.isDeleted = isDeleted;
        this.isEscalated = isEscalated;
        this.isStopped = isStopped;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReferencedDate = lastReferencedDate;
        this.lastViewedDate = lastViewedDate;
        this.liveChatTranscripts = liveChatTranscripts;
        this.lookedUpFromActivities = lookedUpFromActivities;
        this.medio_de_pago__c = medio_de_pago__c;
        this.milestoneStatus = milestoneStatus;
        this.monto_Estimado_de_la_orden__c = monto_Estimado_de_la_orden__c;
        this.monto__c = monto__c;
        this.motivo_condonacion__c = motivo_condonacion__c;
        this.motivo_de_Cancelaci_n__c = motivo_de_Cancelaci_n__c;
        this.n_mero_de_Orden_Web_o_IVR__c = n_mero_de_Orden_Web_o_IVR__c;
        this.no_Clave_modificacion__c = no_Clave_modificacion__c;
        this.nombre__c = nombre__c;
        this.numero_de_confirmacion_de_la_orden__c = numero_de_confirmacion_de_la_orden__c;
        this.numero_de_folio__c = numero_de_folio__c;
        this.numero_de_linea__c = numero_de_linea__c;
        this.numero_de_monedero__c = numero_de_monedero__c;
        this.numero_de_orden__c = numero_de_orden__c;
        this.numero_de_pago__c = numero_de_pago__c;
        this.numero_de_siniestro__c = numero_de_siniestro__c;
        this.numero_de_tarjeta__c = numero_de_tarjeta__c;
        this.numero_referencia_del_pago__c = numero_referencia_del_pago__c;
        this.openActivities = openActivities;
        this.origin = origin;
        this.owner = owner;
        this.ownerId = ownerId;
        this.parent = parent;
        this.parentId = parentId;
        this.paso__c = paso__c;
        this.porcentaje_de_cr_dito__c = porcentaje_de_cr_dito__c;
        this.posts = posts;
        this.premio_grande__c = premio_grande__c;
        this.priority = priority;
        this.procede__c = procede__c;
        this.processInstances = processInstances;
        this.processSteps = processSteps;
        this.programa2__c = programa2__c;
        this.programa2__r = programa2__r;
        this.programa__c = programa__c;
        this.razon_No_Procede__c = razon_No_Procede__c;
        this.razon_Procede__c = razon_Procede__c;
        this.reason = reason;
        this.recordAssociatedGroups = recordAssociatedGroups;
        this.recordType = recordType;
        this.recordTypeId = recordTypeId;
        this.red__c = red__c;
        this.region__c = region__c;
        this.registro_Destino__c = registro_Destino__c;
        this.registro_Destino__r = registro_Destino__r;
        this.registro_Origen__c = registro_Origen__c;
        this.registro_Origen__r = registro_Origen__r;
        this.registro_Web__c = registro_Web__c;
        this.registro__c = registro__c;
        this.reporte_Acompaniame__c = reporte_Acompaniame__c;
        this.reporte__c = reporte__c;
        this.resoluci_n_Supervisor__c = resoluci_n_Supervisor__c;
        this.resolucion_incidencia__c = resolucion_incidencia__c;
        this.respuesta_del_solicitante__c = respuesta_del_solicitante__c;
        this.resultado_Incentivos_MX__c = resultado_Incentivos_MX__c;
        this.resultado__c = resultado__c;
        this.SKU__c = SKU__c;
        this.saldo_Digito__c = saldo_Digito__c;
        this.shares = shares;
        this.slaExitDate = slaExitDate;
        this.slaStartDate = slaStartDate;
        this.solutions = solutions;
        this.status = status;
        this.stopStartDate = stopStartDate;
        this.sub_Razon_Procede__c = sub_Razon_Procede__c;
        this.sub_Tipificacion__c = sub_Tipificacion__c;
        this.subject = subject;
        this.suppliedCompany = suppliedCompany;
        this.suppliedEmail = suppliedEmail;
        this.suppliedName = suppliedName;
        this.suppliedPhone = suppliedPhone;
        this.systemModstamp = systemModstamp;
        this.tasks = tasks;
        this.teamMembers = teamMembers;
        this.teamTemplateRecords = teamTemplateRecords;
        this.tel_fono_de_Casa__c = tel_fono_de_Casa__c;
        this.tel_fono_de_Celular__c = tel_fono_de_Celular__c;
        this.telefono__c = telefono__c;
        this.tempOwnerId__c = tempOwnerId__c;
        this.ticket_Remedy__c = ticket_Remedy__c;
        this.tipificacion__c = tipificacion__c;
        this.tipo_Aclaracion__c = tipo_Aclaracion__c;
        this.tipo_Envio__c = tipo_Envio__c;
        this.tipo_Faltante_Afectaci_n__c = tipo_Faltante_Afectaci_n__c;
        this.tipo_Informativo__c = tipo_Informativo__c;
        this.tipo_PFP__c = tipo_PFP__c;
        this.tipo_actualizacion__c = tipo_actualizacion__c;
        this.tipo_acumulado__c = tipo_acumulado__c;
        this.tipo_componente__c = tipo_componente__c;
        this.tipo_contacto__c = tipo_contacto__c;
        this.tipo_de_asignaci_n__c = tipo_de_asignaci_n__c;
        this.tipo_de_bono_apoyo__c = tipo_de_bono_apoyo__c;
        this.tipo_de_incentivo__c = tipo_de_incentivo__c;
        this.tipo_de_incidencia__c = tipo_de_incidencia__c;
        this.tipo_de_material__c = tipo_de_material__c;
        this.tipo_de_pedido__c = tipo_de_pedido__c;
        this.tipo_de_red__c = tipo_de_red__c;
        this.tipo_de_reporte__c = tipo_de_reporte__c;
        this.tipo_de_robo_extravio__c = tipo_de_robo_extravio__c;
        this.tipo_de_transferencia__c = tipo_de_transferencia__c;
        this.tipo_incidencia_monedero__c = tipo_incidencia_monedero__c;
        this.tipo_solicitante__c = tipo_solicitante__c;
        this.topicAssignments = topicAssignments;
        this.total_de_claves__c = total_de_claves__c;
        this.type = type;
        this.URL__c = URL__c;
        this.unidades_Faltantes__c = unidades_Faltantes__c;
        this.unidades__c = unidades__c;
        this.unidades_aclaradas__c = unidades_aclaradas__c;
        this.userRecordAccess = userRecordAccess;
        this.VEA__c = VEA__c;
        this.zona_Destino__c = zona_Destino__c;
        this.zona__c = zona__c;
        this.zona_de_Envio__c = zona_de_Envio__c;
        this.area__c = area__c;
    }


    /**
     * Gets the account value for this _case.
     * 
     * @return account
     */
    public com.sforce.soap.enterprise.sobject.Account getAccount() {
        return account;
    }


    /**
     * Sets the account value for this _case.
     * 
     * @param account
     */
    public void setAccount(com.sforce.soap.enterprise.sobject.Account account) {
        this.account = account;
    }


    /**
     * Gets the accountId value for this _case.
     * 
     * @return accountId
     */
    public java.lang.String getAccountId() {
        return accountId;
    }


    /**
     * Sets the accountId value for this _case.
     * 
     * @param accountId
     */
    public void setAccountId(java.lang.String accountId) {
        this.accountId = accountId;
    }


    /**
     * Gets the acepto_pago_en_efectivo__c value for this _case.
     * 
     * @return acepto_pago_en_efectivo__c
     */
    public java.lang.String getAcepto_pago_en_efectivo__c() {
        return acepto_pago_en_efectivo__c;
    }


    /**
     * Sets the acepto_pago_en_efectivo__c value for this _case.
     * 
     * @param acepto_pago_en_efectivo__c
     */
    public void setAcepto_pago_en_efectivo__c(java.lang.String acepto_pago_en_efectivo__c) {
        this.acepto_pago_en_efectivo__c = acepto_pago_en_efectivo__c;
    }


    /**
     * Gets the acepto_sustituto__c value for this _case.
     * 
     * @return acepto_sustituto__c
     */
    public java.lang.String getAcepto_sustituto__c() {
        return acepto_sustituto__c;
    }


    /**
     * Sets the acepto_sustituto__c value for this _case.
     * 
     * @param acepto_sustituto__c
     */
    public void setAcepto_sustituto__c(java.lang.String acepto_sustituto__c) {
        this.acepto_sustituto__c = acepto_sustituto__c;
    }


    /**
     * Gets the activityHistories value for this _case.
     * 
     * @return activityHistories
     */
    public com.sforce.soap.enterprise.QueryResult getActivityHistories() {
        return activityHistories;
    }


    /**
     * Sets the activityHistories value for this _case.
     * 
     * @param activityHistories
     */
    public void setActivityHistories(com.sforce.soap.enterprise.QueryResult activityHistories) {
        this.activityHistories = activityHistories;
    }


    /**
     * Gets the agencia_de_cobranza__c value for this _case.
     * 
     * @return agencia_de_cobranza__c
     */
    public java.lang.String getAgencia_de_cobranza__c() {
        return agencia_de_cobranza__c;
    }


    /**
     * Sets the agencia_de_cobranza__c value for this _case.
     * 
     * @param agencia_de_cobranza__c
     */
    public void setAgencia_de_cobranza__c(java.lang.String agencia_de_cobranza__c) {
        this.agencia_de_cobranza__c = agencia_de_cobranza__c;
    }


    /**
     * Gets the apellido_Materno__c value for this _case.
     * 
     * @return apellido_Materno__c
     */
    public java.lang.String getApellido_Materno__c() {
        return apellido_Materno__c;
    }


    /**
     * Sets the apellido_Materno__c value for this _case.
     * 
     * @param apellido_Materno__c
     */
    public void setApellido_Materno__c(java.lang.String apellido_Materno__c) {
        this.apellido_Materno__c = apellido_Materno__c;
    }


    /**
     * Gets the apellido_Paterno__c value for this _case.
     * 
     * @return apellido_Paterno__c
     */
    public java.lang.String getApellido_Paterno__c() {
        return apellido_Paterno__c;
    }


    /**
     * Sets the apellido_Paterno__c value for this _case.
     * 
     * @param apellido_Paterno__c
     */
    public void setApellido_Paterno__c(java.lang.String apellido_Paterno__c) {
        this.apellido_Paterno__c = apellido_Paterno__c;
    }


    /**
     * Gets the aprobo_gerente_de_zona__c value for this _case.
     * 
     * @return aprobo_gerente_de_zona__c
     */
    public java.lang.String getAprobo_gerente_de_zona__c() {
        return aprobo_gerente_de_zona__c;
    }


    /**
     * Sets the aprobo_gerente_de_zona__c value for this _case.
     * 
     * @param aprobo_gerente_de_zona__c
     */
    public void setAprobo_gerente_de_zona__c(java.lang.String aprobo_gerente_de_zona__c) {
        this.aprobo_gerente_de_zona__c = aprobo_gerente_de_zona__c;
    }


    /**
     * Gets the attachedContentDocuments value for this _case.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this _case.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the attachments value for this _case.
     * 
     * @return attachments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this _case.
     * 
     * @param attachments
     */
    public void setAttachments(com.sforce.soap.enterprise.QueryResult attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the autoriza_acumulado__c value for this _case.
     * 
     * @return autoriza_acumulado__c
     */
    public java.lang.String getAutoriza_acumulado__c() {
        return autoriza_acumulado__c;
    }


    /**
     * Sets the autoriza_acumulado__c value for this _case.
     * 
     * @param autoriza_acumulado__c
     */
    public void setAutoriza_acumulado__c(java.lang.String autoriza_acumulado__c) {
        this.autoriza_acumulado__c = autoriza_acumulado__c;
    }


    /**
     * Gets the autorizador__c value for this _case.
     * 
     * @return autorizador__c
     */
    public java.lang.String getAutorizador__c() {
        return autorizador__c;
    }


    /**
     * Sets the autorizador__c value for this _case.
     * 
     * @param autorizador__c
     */
    public void setAutorizador__c(java.lang.String autorizador__c) {
        this.autorizador__c = autorizador__c;
    }


    /**
     * Gets the banco__c value for this _case.
     * 
     * @return banco__c
     */
    public java.lang.String getBanco__c() {
        return banco__c;
    }


    /**
     * Sets the banco__c value for this _case.
     * 
     * @param banco__c
     */
    public void setBanco__c(java.lang.String banco__c) {
        this.banco__c = banco__c;
    }


    /**
     * Gets the businessHours value for this _case.
     * 
     * @return businessHours
     */
    public com.sforce.soap.enterprise.sobject.BusinessHours getBusinessHours() {
        return businessHours;
    }


    /**
     * Sets the businessHours value for this _case.
     * 
     * @param businessHours
     */
    public void setBusinessHours(com.sforce.soap.enterprise.sobject.BusinessHours businessHours) {
        this.businessHours = businessHours;
    }


    /**
     * Gets the businessHoursId value for this _case.
     * 
     * @return businessHoursId
     */
    public java.lang.String getBusinessHoursId() {
        return businessHoursId;
    }


    /**
     * Sets the businessHoursId value for this _case.
     * 
     * @param businessHoursId
     */
    public void setBusinessHoursId(java.lang.String businessHoursId) {
        this.businessHoursId = businessHoursId;
    }


    /**
     * Gets the CURP__c value for this _case.
     * 
     * @return CURP__c
     */
    public java.lang.String getCURP__c() {
        return CURP__c;
    }


    /**
     * Sets the CURP__c value for this _case.
     * 
     * @param CURP__c
     */
    public void setCURP__c(java.lang.String CURP__c) {
        this.CURP__c = CURP__c;
    }


    /**
     * Gets the campa_a_de_aplicaci_n__c value for this _case.
     * 
     * @return campa_a_de_aplicaci_n__c
     */
    public java.lang.String getCampa_a_de_aplicaci_n__c() {
        return campa_a_de_aplicaci_n__c;
    }


    /**
     * Sets the campa_a_de_aplicaci_n__c value for this _case.
     * 
     * @param campa_a_de_aplicaci_n__c
     */
    public void setCampa_a_de_aplicaci_n__c(java.lang.String campa_a_de_aplicaci_n__c) {
        this.campa_a_de_aplicaci_n__c = campa_a_de_aplicaci_n__c;
    }


    /**
     * Gets the campana__c value for this _case.
     * 
     * @return campana__c
     */
    public java.lang.String getCampana__c() {
        return campana__c;
    }


    /**
     * Sets the campana__c value for this _case.
     * 
     * @param campana__c
     */
    public void setCampana__c(java.lang.String campana__c) {
        this.campana__c = campana__c;
    }


    /**
     * Gets the campania_Avon__c value for this _case.
     * 
     * @return campania_Avon__c
     */
    public java.lang.String getCampania_Avon__c() {
        return campania_Avon__c;
    }


    /**
     * Sets the campania_Avon__c value for this _case.
     * 
     * @param campania_Avon__c
     */
    public void setCampania_Avon__c(java.lang.String campania_Avon__c) {
        this.campania_Avon__c = campania_Avon__c;
    }


    /**
     * Gets the campania_Avon__r value for this _case.
     * 
     * @return campania_Avon__r
     */
    public com.sforce.soap.enterprise.sobject.Campania_Avon__c getCampania_Avon__r() {
        return campania_Avon__r;
    }


    /**
     * Sets the campania_Avon__r value for this _case.
     * 
     * @param campania_Avon__r
     */
    public void setCampania_Avon__r(com.sforce.soap.enterprise.sobject.Campania_Avon__c campania_Avon__r) {
        this.campania_Avon__r = campania_Avon__r;
    }


    /**
     * Gets the campania_de_envio__c value for this _case.
     * 
     * @return campania_de_envio__c
     */
    public java.lang.String getCampania_de_envio__c() {
        return campania_de_envio__c;
    }


    /**
     * Sets the campania_de_envio__c value for this _case.
     * 
     * @param campania_de_envio__c
     */
    public void setCampania_de_envio__c(java.lang.String campania_de_envio__c) {
        this.campania_de_envio__c = campania_de_envio__c;
    }


    /**
     * Gets the cantidad__c value for this _case.
     * 
     * @return cantidad__c
     */
    public java.lang.Double getCantidad__c() {
        return cantidad__c;
    }


    /**
     * Sets the cantidad__c value for this _case.
     * 
     * @param cantidad__c
     */
    public void setCantidad__c(java.lang.Double cantidad__c) {
        this.cantidad__c = cantidad__c;
    }


    /**
     * Gets the cantidad_a_recibir__c value for this _case.
     * 
     * @return cantidad_a_recibir__c
     */
    public java.lang.Double getCantidad_a_recibir__c() {
        return cantidad_a_recibir__c;
    }


    /**
     * Sets the cantidad_a_recibir__c value for this _case.
     * 
     * @param cantidad_a_recibir__c
     */
    public void setCantidad_a_recibir__c(java.lang.Double cantidad_a_recibir__c) {
        this.cantidad_a_recibir__c = cantidad_a_recibir__c;
    }


    /**
     * Gets the cantidad_recibida__c value for this _case.
     * 
     * @return cantidad_recibida__c
     */
    public java.lang.Double getCantidad_recibida__c() {
        return cantidad_recibida__c;
    }


    /**
     * Sets the cantidad_recibida__c value for this _case.
     * 
     * @param cantidad_recibida__c
     */
    public void setCantidad_recibida__c(java.lang.Double cantidad_recibida__c) {
        this.cantidad_recibida__c = cantidad_recibida__c;
    }


    /**
     * Gets the cargo_por__c value for this _case.
     * 
     * @return cargo_por__c
     */
    public java.lang.String getCargo_por__c() {
        return cargo_por__c;
    }


    /**
     * Sets the cargo_por__c value for this _case.
     * 
     * @param cargo_por__c
     */
    public void setCargo_por__c(java.lang.String cargo_por__c) {
        this.cargo_por__c = cargo_por__c;
    }


    /**
     * Gets the caseComments value for this _case.
     * 
     * @return caseComments
     */
    public com.sforce.soap.enterprise.QueryResult getCaseComments() {
        return caseComments;
    }


    /**
     * Sets the caseComments value for this _case.
     * 
     * @param caseComments
     */
    public void setCaseComments(com.sforce.soap.enterprise.QueryResult caseComments) {
        this.caseComments = caseComments;
    }


    /**
     * Gets the caseContactRoles value for this _case.
     * 
     * @return caseContactRoles
     */
    public com.sforce.soap.enterprise.QueryResult getCaseContactRoles() {
        return caseContactRoles;
    }


    /**
     * Sets the caseContactRoles value for this _case.
     * 
     * @param caseContactRoles
     */
    public void setCaseContactRoles(com.sforce.soap.enterprise.QueryResult caseContactRoles) {
        this.caseContactRoles = caseContactRoles;
    }


    /**
     * Gets the caseMilestones value for this _case.
     * 
     * @return caseMilestones
     */
    public com.sforce.soap.enterprise.QueryResult getCaseMilestones() {
        return caseMilestones;
    }


    /**
     * Sets the caseMilestones value for this _case.
     * 
     * @param caseMilestones
     */
    public void setCaseMilestones(com.sforce.soap.enterprise.QueryResult caseMilestones) {
        this.caseMilestones = caseMilestones;
    }


    /**
     * Gets the caseNumber value for this _case.
     * 
     * @return caseNumber
     */
    public java.lang.String getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this _case.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(java.lang.String caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the caseSolutions value for this _case.
     * 
     * @return caseSolutions
     */
    public com.sforce.soap.enterprise.QueryResult getCaseSolutions() {
        return caseSolutions;
    }


    /**
     * Sets the caseSolutions value for this _case.
     * 
     * @param caseSolutions
     */
    public void setCaseSolutions(com.sforce.soap.enterprise.QueryResult caseSolutions) {
        this.caseSolutions = caseSolutions;
    }


    /**
     * Gets the cases value for this _case.
     * 
     * @return cases
     */
    public com.sforce.soap.enterprise.QueryResult getCases() {
        return cases;
    }


    /**
     * Sets the cases value for this _case.
     * 
     * @param cases
     */
    public void setCases(com.sforce.soap.enterprise.QueryResult cases) {
        this.cases = cases;
    }


    /**
     * Gets the categoria__c value for this _case.
     * 
     * @return categoria__c
     */
    public java.lang.String getCategoria__c() {
        return categoria__c;
    }


    /**
     * Sets the categoria__c value for this _case.
     * 
     * @param categoria__c
     */
    public void setCategoria__c(java.lang.String categoria__c) {
        this.categoria__c = categoria__c;
    }


    /**
     * Gets the causa_Ajuste__c value for this _case.
     * 
     * @return causa_Ajuste__c
     */
    public java.lang.String getCausa_Ajuste__c() {
        return causa_Ajuste__c;
    }


    /**
     * Sets the causa_Ajuste__c value for this _case.
     * 
     * @param causa_Ajuste__c
     */
    public void setCausa_Ajuste__c(java.lang.String causa_Ajuste__c) {
        this.causa_Ajuste__c = causa_Ajuste__c;
    }


    /**
     * Gets the closedDate value for this _case.
     * 
     * @return closedDate
     */
    public java.util.Calendar getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this _case.
     * 
     * @param closedDate
     */
    public void setClosedDate(java.util.Calendar closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the combinedAttachments value for this _case.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this _case.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the completion_Date__c value for this _case.
     * 
     * @return completion_Date__c
     */
    public java.util.Calendar getCompletion_Date__c() {
        return completion_Date__c;
    }


    /**
     * Sets the completion_Date__c value for this _case.
     * 
     * @param completion_Date__c
     */
    public void setCompletion_Date__c(java.util.Calendar completion_Date__c) {
        this.completion_Date__c = completion_Date__c;
    }


    /**
     * Gets the concepto__c value for this _case.
     * 
     * @return concepto__c
     */
    public java.lang.String getConcepto__c() {
        return concepto__c;
    }


    /**
     * Sets the concepto__c value for this _case.
     * 
     * @param concepto__c
     */
    public void setConcepto__c(java.lang.String concepto__c) {
        this.concepto__c = concepto__c;
    }


    /**
     * Gets the contact value for this _case.
     * 
     * @return contact
     */
    public com.sforce.soap.enterprise.sobject.Contact getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this _case.
     * 
     * @param contact
     */
    public void setContact(com.sforce.soap.enterprise.sobject.Contact contact) {
        this.contact = contact;
    }


    /**
     * Gets the contactId value for this _case.
     * 
     * @return contactId
     */
    public java.lang.String getContactId() {
        return contactId;
    }


    /**
     * Sets the contactId value for this _case.
     * 
     * @param contactId
     */
    public void setContactId(java.lang.String contactId) {
        this.contactId = contactId;
    }


    /**
     * Gets the correo_Electr_nico__c value for this _case.
     * 
     * @return correo_Electr_nico__c
     */
    public java.lang.String getCorreo_Electr_nico__c() {
        return correo_Electr_nico__c;
    }


    /**
     * Sets the correo_Electr_nico__c value for this _case.
     * 
     * @param correo_Electr_nico__c
     */
    public void setCorreo_Electr_nico__c(java.lang.String correo_Electr_nico__c) {
        this.correo_Electr_nico__c = correo_Electr_nico__c;
    }


    /**
     * Gets the correo_Gerente_Divisional__c value for this _case.
     * 
     * @return correo_Gerente_Divisional__c
     */
    public java.lang.String getCorreo_Gerente_Divisional__c() {
        return correo_Gerente_Divisional__c;
    }


    /**
     * Sets the correo_Gerente_Divisional__c value for this _case.
     * 
     * @param correo_Gerente_Divisional__c
     */
    public void setCorreo_Gerente_Divisional__c(java.lang.String correo_Gerente_Divisional__c) {
        this.correo_Gerente_Divisional__c = correo_Gerente_Divisional__c;
    }


    /**
     * Gets the correo_Gerente_Regional__c value for this _case.
     * 
     * @return correo_Gerente_Regional__c
     */
    public java.lang.String getCorreo_Gerente_Regional__c() {
        return correo_Gerente_Regional__c;
    }


    /**
     * Sets the correo_Gerente_Regional__c value for this _case.
     * 
     * @param correo_Gerente_Regional__c
     */
    public void setCorreo_Gerente_Regional__c(java.lang.String correo_Gerente_Regional__c) {
        this.correo_Gerente_Regional__c = correo_Gerente_Regional__c;
    }


    /**
     * Gets the correo_Gerente_de_Zona__c value for this _case.
     * 
     * @return correo_Gerente_de_Zona__c
     */
    public java.lang.String getCorreo_Gerente_de_Zona__c() {
        return correo_Gerente_de_Zona__c;
    }


    /**
     * Sets the correo_Gerente_de_Zona__c value for this _case.
     * 
     * @param correo_Gerente_de_Zona__c
     */
    public void setCorreo_Gerente_de_Zona__c(java.lang.String correo_Gerente_de_Zona__c) {
        this.correo_Gerente_de_Zona__c = correo_Gerente_de_Zona__c;
    }


    /**
     * Gets the correo_electronico__c value for this _case.
     * 
     * @return correo_electronico__c
     */
    public java.lang.String getCorreo_electronico__c() {
        return correo_electronico__c;
    }


    /**
     * Sets the correo_electronico__c value for this _case.
     * 
     * @param correo_electronico__c
     */
    public void setCorreo_electronico__c(java.lang.String correo_electronico__c) {
        this.correo_electronico__c = correo_electronico__c;
    }


    /**
     * Gets the createdBy value for this _case.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this _case.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this _case.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this _case.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this _case.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this _case.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the descripci_n_del_premio__c value for this _case.
     * 
     * @return descripci_n_del_premio__c
     */
    public java.lang.String getDescripci_n_del_premio__c() {
        return descripci_n_del_premio__c;
    }


    /**
     * Sets the descripci_n_del_premio__c value for this _case.
     * 
     * @param descripci_n_del_premio__c
     */
    public void setDescripci_n_del_premio__c(java.lang.String descripci_n_del_premio__c) {
        this.descripci_n_del_premio__c = descripci_n_del_premio__c;
    }


    /**
     * Gets the descripcion_del_pedido__c value for this _case.
     * 
     * @return descripcion_del_pedido__c
     */
    public java.lang.String getDescripcion_del_pedido__c() {
        return descripcion_del_pedido__c;
    }


    /**
     * Sets the descripcion_del_pedido__c value for this _case.
     * 
     * @param descripcion_del_pedido__c
     */
    public void setDescripcion_del_pedido__c(java.lang.String descripcion_del_pedido__c) {
        this.descripcion_del_pedido__c = descripcion_del_pedido__c;
    }


    /**
     * Gets the descripcion_producto__c value for this _case.
     * 
     * @return descripcion_producto__c
     */
    public java.lang.String getDescripcion_producto__c() {
        return descripcion_producto__c;
    }


    /**
     * Sets the descripcion_producto__c value for this _case.
     * 
     * @param descripcion_producto__c
     */
    public void setDescripcion_producto__c(java.lang.String descripcion_producto__c) {
        this.descripcion_producto__c = descripcion_producto__c;
    }


    /**
     * Gets the description value for this _case.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this _case.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the detenido_desde_custom__c value for this _case.
     * 
     * @return detenido_desde_custom__c
     */
    public java.util.Calendar getDetenido_desde_custom__c() {
        return detenido_desde_custom__c;
    }


    /**
     * Sets the detenido_desde_custom__c value for this _case.
     * 
     * @param detenido_desde_custom__c
     */
    public void setDetenido_desde_custom__c(java.util.Calendar detenido_desde_custom__c) {
        this.detenido_desde_custom__c = detenido_desde_custom__c;
    }


    /**
     * Gets the digitos_de_bodega__c value for this _case.
     * 
     * @return digitos_de_bodega__c
     */
    public java.lang.String getDigitos_de_bodega__c() {
        return digitos_de_bodega__c;
    }


    /**
     * Sets the digitos_de_bodega__c value for this _case.
     * 
     * @param digitos_de_bodega__c
     */
    public void setDigitos_de_bodega__c(java.lang.String digitos_de_bodega__c) {
        this.digitos_de_bodega__c = digitos_de_bodega__c;
    }


    /**
     * Gets the direccion__c value for this _case.
     * 
     * @return direccion__c
     */
    public java.lang.String getDireccion__c() {
        return direccion__c;
    }


    /**
     * Sets the direccion__c value for this _case.
     * 
     * @param direccion__c
     */
    public void setDireccion__c(java.lang.String direccion__c) {
        this.direccion__c = direccion__c;
    }


    /**
     * Gets the emailMessages value for this _case.
     * 
     * @return emailMessages
     */
    public com.sforce.soap.enterprise.QueryResult getEmailMessages() {
        return emailMessages;
    }


    /**
     * Sets the emailMessages value for this _case.
     * 
     * @param emailMessages
     */
    public void setEmailMessages(com.sforce.soap.enterprise.QueryResult emailMessages) {
        this.emailMessages = emailMessages;
    }


    /**
     * Gets the entitlement value for this _case.
     * 
     * @return entitlement
     */
    public com.sforce.soap.enterprise.sobject.Entitlement getEntitlement() {
        return entitlement;
    }


    /**
     * Sets the entitlement value for this _case.
     * 
     * @param entitlement
     */
    public void setEntitlement(com.sforce.soap.enterprise.sobject.Entitlement entitlement) {
        this.entitlement = entitlement;
    }


    /**
     * Gets the entitlementId value for this _case.
     * 
     * @return entitlementId
     */
    public java.lang.String getEntitlementId() {
        return entitlementId;
    }


    /**
     * Sets the entitlementId value for this _case.
     * 
     * @param entitlementId
     */
    public void setEntitlementId(java.lang.String entitlementId) {
        this.entitlementId = entitlementId;
    }


    /**
     * Gets the enviado_a_PROFECO__c value for this _case.
     * 
     * @return enviado_a_PROFECO__c
     */
    public java.lang.Boolean getEnviado_a_PROFECO__c() {
        return enviado_a_PROFECO__c;
    }


    /**
     * Sets the enviado_a_PROFECO__c value for this _case.
     * 
     * @param enviado_a_PROFECO__c
     */
    public void setEnviado_a_PROFECO__c(java.lang.Boolean enviado_a_PROFECO__c) {
        this.enviado_a_PROFECO__c = enviado_a_PROFECO__c;
    }


    /**
     * Gets the error_en_modificacion__c value for this _case.
     * 
     * @return error_en_modificacion__c
     */
    public java.lang.String getError_en_modificacion__c() {
        return error_en_modificacion__c;
    }


    /**
     * Sets the error_en_modificacion__c value for this _case.
     * 
     * @param error_en_modificacion__c
     */
    public void setError_en_modificacion__c(java.lang.String error_en_modificacion__c) {
        this.error_en_modificacion__c = error_en_modificacion__c;
    }


    /**
     * Gets the es_caja_completa__c value for this _case.
     * 
     * @return es_caja_completa__c
     */
    public java.lang.String getEs_caja_completa__c() {
        return es_caja_completa__c;
    }


    /**
     * Sets the es_caja_completa__c value for this _case.
     * 
     * @param es_caja_completa__c
     */
    public void setEs_caja_completa__c(java.lang.String es_caja_completa__c) {
        this.es_caja_completa__c = es_caja_completa__c;
    }


    /**
     * Gets the estatus_Rep_Emp__c value for this _case.
     * 
     * @return estatus_Rep_Emp__c
     */
    public java.lang.String getEstatus_Rep_Emp__c() {
        return estatus_Rep_Emp__c;
    }


    /**
     * Sets the estatus_Rep_Emp__c value for this _case.
     * 
     * @param estatus_Rep_Emp__c
     */
    public void setEstatus_Rep_Emp__c(java.lang.String estatus_Rep_Emp__c) {
        this.estatus_Rep_Emp__c = estatus_Rep_Emp__c;
    }


    /**
     * Gets the events value for this _case.
     * 
     * @return events
     */
    public com.sforce.soap.enterprise.QueryResult getEvents() {
        return events;
    }


    /**
     * Sets the events value for this _case.
     * 
     * @param events
     */
    public void setEvents(com.sforce.soap.enterprise.QueryResult events) {
        this.events = events;
    }


    /**
     * Gets the evidencia_Incidencia__c value for this _case.
     * 
     * @return evidencia_Incidencia__c
     */
    public java.lang.String getEvidencia_Incidencia__c() {
        return evidencia_Incidencia__c;
    }


    /**
     * Sets the evidencia_Incidencia__c value for this _case.
     * 
     * @param evidencia_Incidencia__c
     */
    public void setEvidencia_Incidencia__c(java.lang.String evidencia_Incidencia__c) {
        this.evidencia_Incidencia__c = evidencia_Incidencia__c;
    }


    /**
     * Gets the excepcion__c value for this _case.
     * 
     * @return excepcion__c
     */
    public java.lang.Boolean getExcepcion__c() {
        return excepcion__c;
    }


    /**
     * Sets the excepcion__c value for this _case.
     * 
     * @param excepcion__c
     */
    public void setExcepcion__c(java.lang.Boolean excepcion__c) {
        this.excepcion__c = excepcion__c;
    }


    /**
     * Gets the existencia__c value for this _case.
     * 
     * @return existencia__c
     */
    public java.lang.String getExistencia__c() {
        return existencia__c;
    }


    /**
     * Sets the existencia__c value for this _case.
     * 
     * @param existencia__c
     */
    public void setExistencia__c(java.lang.String existencia__c) {
        this.existencia__c = existencia__c;
    }


    /**
     * Gets the FSC_Sustituto__c value for this _case.
     * 
     * @return FSC_Sustituto__c
     */
    public java.lang.String getFSC_Sustituto__c() {
        return FSC_Sustituto__c;
    }


    /**
     * Sets the FSC_Sustituto__c value for this _case.
     * 
     * @param FSC_Sustituto__c
     */
    public void setFSC_Sustituto__c(java.lang.String FSC_Sustituto__c) {
        this.FSC_Sustituto__c = FSC_Sustituto__c;
    }


    /**
     * Gets the FS_Code__c value for this _case.
     * 
     * @return FS_Code__c
     */
    public java.lang.String getFS_Code__c() {
        return FS_Code__c;
    }


    /**
     * Sets the FS_Code__c value for this _case.
     * 
     * @param FS_Code__c
     */
    public void setFS_Code__c(java.lang.String FS_Code__c) {
        this.FS_Code__c = FS_Code__c;
    }


    /**
     * Gets the fecha_Web__c value for this _case.
     * 
     * @return fecha_Web__c
     */
    public java.util.Date getFecha_Web__c() {
        return fecha_Web__c;
    }


    /**
     * Sets the fecha_Web__c value for this _case.
     * 
     * @param fecha_Web__c
     */
    public void setFecha_Web__c(java.util.Date fecha_Web__c) {
        this.fecha_Web__c = fecha_Web__c;
    }


    /**
     * Gets the fecha_de_Pago__c value for this _case.
     * 
     * @return fecha_de_Pago__c
     */
    public java.util.Date getFecha_de_Pago__c() {
        return fecha_de_Pago__c;
    }


    /**
     * Sets the fecha_de_Pago__c value for this _case.
     * 
     * @param fecha_de_Pago__c
     */
    public void setFecha_de_Pago__c(java.util.Date fecha_de_Pago__c) {
        this.fecha_de_Pago__c = fecha_de_Pago__c;
    }


    /**
     * Gets the fecha_de_captura__c value for this _case.
     * 
     * @return fecha_de_captura__c
     */
    public java.util.Date getFecha_de_captura__c() {
        return fecha_de_captura__c;
    }


    /**
     * Sets the fecha_de_captura__c value for this _case.
     * 
     * @param fecha_de_captura__c
     */
    public void setFecha_de_captura__c(java.util.Date fecha_de_captura__c) {
        this.fecha_de_captura__c = fecha_de_captura__c;
    }


    /**
     * Gets the fecha_de_envio__c value for this _case.
     * 
     * @return fecha_de_envio__c
     */
    public java.util.Date getFecha_de_envio__c() {
        return fecha_de_envio__c;
    }


    /**
     * Sets the fecha_de_envio__c value for this _case.
     * 
     * @param fecha_de_envio__c
     */
    public void setFecha_de_envio__c(java.util.Date fecha_de_envio__c) {
        this.fecha_de_envio__c = fecha_de_envio__c;
    }


    /**
     * Gets the fecha_de_facturacion__c value for this _case.
     * 
     * @return fecha_de_facturacion__c
     */
    public java.util.Date getFecha_de_facturacion__c() {
        return fecha_de_facturacion__c;
    }


    /**
     * Sets the fecha_de_facturacion__c value for this _case.
     * 
     * @param fecha_de_facturacion__c
     */
    public void setFecha_de_facturacion__c(java.util.Date fecha_de_facturacion__c) {
        this.fecha_de_facturacion__c = fecha_de_facturacion__c;
    }


    /**
     * Gets the fecha_de_ingreso__c value for this _case.
     * 
     * @return fecha_de_ingreso__c
     */
    public java.util.Date getFecha_de_ingreso__c() {
        return fecha_de_ingreso__c;
    }


    /**
     * Sets the fecha_de_ingreso__c value for this _case.
     * 
     * @param fecha_de_ingreso__c
     */
    public void setFecha_de_ingreso__c(java.util.Date fecha_de_ingreso__c) {
        this.fecha_de_ingreso__c = fecha_de_ingreso__c;
    }


    /**
     * Gets the fecha_de_ingreso_al_sistema__c value for this _case.
     * 
     * @return fecha_de_ingreso_al_sistema__c
     */
    public java.util.Date getFecha_de_ingreso_al_sistema__c() {
        return fecha_de_ingreso_al_sistema__c;
    }


    /**
     * Sets the fecha_de_ingreso_al_sistema__c value for this _case.
     * 
     * @param fecha_de_ingreso_al_sistema__c
     */
    public void setFecha_de_ingreso_al_sistema__c(java.util.Date fecha_de_ingreso_al_sistema__c) {
        this.fecha_de_ingreso_al_sistema__c = fecha_de_ingreso_al_sistema__c;
    }


    /**
     * Gets the fecha_de_ingreso_de_la_orden__c value for this _case.
     * 
     * @return fecha_de_ingreso_de_la_orden__c
     */
    public java.util.Date getFecha_de_ingreso_de_la_orden__c() {
        return fecha_de_ingreso_de_la_orden__c;
    }


    /**
     * Sets the fecha_de_ingreso_de_la_orden__c value for this _case.
     * 
     * @param fecha_de_ingreso_de_la_orden__c
     */
    public void setFecha_de_ingreso_de_la_orden__c(java.util.Date fecha_de_ingreso_de_la_orden__c) {
        this.fecha_de_ingreso_de_la_orden__c = fecha_de_ingreso_de_la_orden__c;
    }


    /**
     * Gets the fecha_de_ingreso_del_pedido__c value for this _case.
     * 
     * @return fecha_de_ingreso_del_pedido__c
     */
    public java.util.Date getFecha_de_ingreso_del_pedido__c() {
        return fecha_de_ingreso_del_pedido__c;
    }


    /**
     * Sets the fecha_de_ingreso_del_pedido__c value for this _case.
     * 
     * @param fecha_de_ingreso_del_pedido__c
     */
    public void setFecha_de_ingreso_del_pedido__c(java.util.Date fecha_de_ingreso_del_pedido__c) {
        this.fecha_de_ingreso_del_pedido__c = fecha_de_ingreso_del_pedido__c;
    }


    /**
     * Gets the fecha_de_registro__c value for this _case.
     * 
     * @return fecha_de_registro__c
     */
    public java.util.Date getFecha_de_registro__c() {
        return fecha_de_registro__c;
    }


    /**
     * Sets the fecha_de_registro__c value for this _case.
     * 
     * @param fecha_de_registro__c
     */
    public void setFecha_de_registro__c(java.util.Date fecha_de_registro__c) {
        this.fecha_de_registro__c = fecha_de_registro__c;
    }


    /**
     * Gets the fecha_recompra__c value for this _case.
     * 
     * @return fecha_recompra__c
     */
    public java.util.Date getFecha_recompra__c() {
        return fecha_recompra__c;
    }


    /**
     * Sets the fecha_recompra__c value for this _case.
     * 
     * @param fecha_recompra__c
     */
    public void setFecha_recompra__c(java.util.Date fecha_recompra__c) {
        this.fecha_recompra__c = fecha_recompra__c;
    }


    /**
     * Gets the feedSubscriptionsForEntity value for this _case.
     * 
     * @return feedSubscriptionsForEntity
     */
    public com.sforce.soap.enterprise.QueryResult getFeedSubscriptionsForEntity() {
        return feedSubscriptionsForEntity;
    }


    /**
     * Sets the feedSubscriptionsForEntity value for this _case.
     * 
     * @param feedSubscriptionsForEntity
     */
    public void setFeedSubscriptionsForEntity(com.sforce.soap.enterprise.QueryResult feedSubscriptionsForEntity) {
        this.feedSubscriptionsForEntity = feedSubscriptionsForEntity;
    }


    /**
     * Gets the feeds value for this _case.
     * 
     * @return feeds
     */
    public com.sforce.soap.enterprise.QueryResult getFeeds() {
        return feeds;
    }


    /**
     * Sets the feeds value for this _case.
     * 
     * @param feeds
     */
    public void setFeeds(com.sforce.soap.enterprise.QueryResult feeds) {
        this.feeds = feeds;
    }


    /**
     * Gets the folio_Sistema_Externo__c value for this _case.
     * 
     * @return folio_Sistema_Externo__c
     */
    public java.lang.String getFolio_Sistema_Externo__c() {
        return folio_Sistema_Externo__c;
    }


    /**
     * Sets the folio_Sistema_Externo__c value for this _case.
     * 
     * @param folio_Sistema_Externo__c
     */
    public void setFolio_Sistema_Externo__c(java.lang.String folio_Sistema_Externo__c) {
        this.folio_Sistema_Externo__c = folio_Sistema_Externo__c;
    }


    /**
     * Gets the folleto__c value for this _case.
     * 
     * @return folleto__c
     */
    public java.lang.String getFolleto__c() {
        return folleto__c;
    }


    /**
     * Sets the folleto__c value for this _case.
     * 
     * @param folleto__c
     */
    public void setFolleto__c(java.lang.String folleto__c) {
        this.folleto__c = folleto__c;
    }


    /**
     * Gets the hay_solucion__c value for this _case.
     * 
     * @return hay_solucion__c
     */
    public java.lang.String getHay_solucion__c() {
        return hay_solucion__c;
    }


    /**
     * Sets the hay_solucion__c value for this _case.
     * 
     * @param hay_solucion__c
     */
    public void setHay_solucion__c(java.lang.String hay_solucion__c) {
        this.hay_solucion__c = hay_solucion__c;
    }


    /**
     * Gets the histories value for this _case.
     * 
     * @return histories
     */
    public com.sforce.soap.enterprise.QueryResult getHistories() {
        return histories;
    }


    /**
     * Sets the histories value for this _case.
     * 
     * @param histories
     */
    public void setHistories(com.sforce.soap.enterprise.QueryResult histories) {
        this.histories = histories;
    }


    /**
     * Gets the importe__c value for this _case.
     * 
     * @return importe__c
     */
    public java.lang.Double getImporte__c() {
        return importe__c;
    }


    /**
     * Sets the importe__c value for this _case.
     * 
     * @param importe__c
     */
    public void setImporte__c(java.lang.Double importe__c) {
        this.importe__c = importe__c;
    }


    /**
     * Gets the importe_facturacion__c value for this _case.
     * 
     * @return importe_facturacion__c
     */
    public java.lang.Double getImporte_facturacion__c() {
        return importe_facturacion__c;
    }


    /**
     * Sets the importe_facturacion__c value for this _case.
     * 
     * @param importe_facturacion__c
     */
    public void setImporte_facturacion__c(java.lang.Double importe_facturacion__c) {
        this.importe_facturacion__c = importe_facturacion__c;
    }


    /**
     * Gets the importe_pago__c value for this _case.
     * 
     * @return importe_pago__c
     */
    public java.lang.Double getImporte_pago__c() {
        return importe_pago__c;
    }


    /**
     * Sets the importe_pago__c value for this _case.
     * 
     * @param importe_pago__c
     */
    public void setImporte_pago__c(java.lang.Double importe_pago__c) {
        this.importe_pago__c = importe_pago__c;
    }


    /**
     * Gets the importe_transaccion__c value for this _case.
     * 
     * @return importe_transaccion__c
     */
    public java.lang.Double getImporte_transaccion__c() {
        return importe_transaccion__c;
    }


    /**
     * Sets the importe_transaccion__c value for this _case.
     * 
     * @param importe_transaccion__c
     */
    public void setImporte_transaccion__c(java.lang.Double importe_transaccion__c) {
        this.importe_transaccion__c = importe_transaccion__c;
    }


    /**
     * Gets the isClosed value for this _case.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this _case.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isClosedOnCreate value for this _case.
     * 
     * @return isClosedOnCreate
     */
    public java.lang.Boolean getIsClosedOnCreate() {
        return isClosedOnCreate;
    }


    /**
     * Sets the isClosedOnCreate value for this _case.
     * 
     * @param isClosedOnCreate
     */
    public void setIsClosedOnCreate(java.lang.Boolean isClosedOnCreate) {
        this.isClosedOnCreate = isClosedOnCreate;
    }


    /**
     * Gets the isDeleted value for this _case.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this _case.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isEscalated value for this _case.
     * 
     * @return isEscalated
     */
    public java.lang.Boolean getIsEscalated() {
        return isEscalated;
    }


    /**
     * Sets the isEscalated value for this _case.
     * 
     * @param isEscalated
     */
    public void setIsEscalated(java.lang.Boolean isEscalated) {
        this.isEscalated = isEscalated;
    }


    /**
     * Gets the isStopped value for this _case.
     * 
     * @return isStopped
     */
    public java.lang.Boolean getIsStopped() {
        return isStopped;
    }


    /**
     * Sets the isStopped value for this _case.
     * 
     * @param isStopped
     */
    public void setIsStopped(java.lang.Boolean isStopped) {
        this.isStopped = isStopped;
    }


    /**
     * Gets the lastModifiedBy value for this _case.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this _case.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this _case.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this _case.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this _case.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this _case.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReferencedDate value for this _case.
     * 
     * @return lastReferencedDate
     */
    public java.util.Calendar getLastReferencedDate() {
        return lastReferencedDate;
    }


    /**
     * Sets the lastReferencedDate value for this _case.
     * 
     * @param lastReferencedDate
     */
    public void setLastReferencedDate(java.util.Calendar lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }


    /**
     * Gets the lastViewedDate value for this _case.
     * 
     * @return lastViewedDate
     */
    public java.util.Calendar getLastViewedDate() {
        return lastViewedDate;
    }


    /**
     * Sets the lastViewedDate value for this _case.
     * 
     * @param lastViewedDate
     */
    public void setLastViewedDate(java.util.Calendar lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }


    /**
     * Gets the liveChatTranscripts value for this _case.
     * 
     * @return liveChatTranscripts
     */
    public com.sforce.soap.enterprise.QueryResult getLiveChatTranscripts() {
        return liveChatTranscripts;
    }


    /**
     * Sets the liveChatTranscripts value for this _case.
     * 
     * @param liveChatTranscripts
     */
    public void setLiveChatTranscripts(com.sforce.soap.enterprise.QueryResult liveChatTranscripts) {
        this.liveChatTranscripts = liveChatTranscripts;
    }


    /**
     * Gets the lookedUpFromActivities value for this _case.
     * 
     * @return lookedUpFromActivities
     */
    public com.sforce.soap.enterprise.QueryResult getLookedUpFromActivities() {
        return lookedUpFromActivities;
    }


    /**
     * Sets the lookedUpFromActivities value for this _case.
     * 
     * @param lookedUpFromActivities
     */
    public void setLookedUpFromActivities(com.sforce.soap.enterprise.QueryResult lookedUpFromActivities) {
        this.lookedUpFromActivities = lookedUpFromActivities;
    }


    /**
     * Gets the medio_de_pago__c value for this _case.
     * 
     * @return medio_de_pago__c
     */
    public java.lang.String getMedio_de_pago__c() {
        return medio_de_pago__c;
    }


    /**
     * Sets the medio_de_pago__c value for this _case.
     * 
     * @param medio_de_pago__c
     */
    public void setMedio_de_pago__c(java.lang.String medio_de_pago__c) {
        this.medio_de_pago__c = medio_de_pago__c;
    }


    /**
     * Gets the milestoneStatus value for this _case.
     * 
     * @return milestoneStatus
     */
    public java.lang.String getMilestoneStatus() {
        return milestoneStatus;
    }


    /**
     * Sets the milestoneStatus value for this _case.
     * 
     * @param milestoneStatus
     */
    public void setMilestoneStatus(java.lang.String milestoneStatus) {
        this.milestoneStatus = milestoneStatus;
    }


    /**
     * Gets the monto_Estimado_de_la_orden__c value for this _case.
     * 
     * @return monto_Estimado_de_la_orden__c
     */
    public java.lang.String getMonto_Estimado_de_la_orden__c() {
        return monto_Estimado_de_la_orden__c;
    }


    /**
     * Sets the monto_Estimado_de_la_orden__c value for this _case.
     * 
     * @param monto_Estimado_de_la_orden__c
     */
    public void setMonto_Estimado_de_la_orden__c(java.lang.String monto_Estimado_de_la_orden__c) {
        this.monto_Estimado_de_la_orden__c = monto_Estimado_de_la_orden__c;
    }


    /**
     * Gets the monto__c value for this _case.
     * 
     * @return monto__c
     */
    public java.lang.Double getMonto__c() {
        return monto__c;
    }


    /**
     * Sets the monto__c value for this _case.
     * 
     * @param monto__c
     */
    public void setMonto__c(java.lang.Double monto__c) {
        this.monto__c = monto__c;
    }


    /**
     * Gets the motivo_condonacion__c value for this _case.
     * 
     * @return motivo_condonacion__c
     */
    public java.lang.String getMotivo_condonacion__c() {
        return motivo_condonacion__c;
    }


    /**
     * Sets the motivo_condonacion__c value for this _case.
     * 
     * @param motivo_condonacion__c
     */
    public void setMotivo_condonacion__c(java.lang.String motivo_condonacion__c) {
        this.motivo_condonacion__c = motivo_condonacion__c;
    }


    /**
     * Gets the motivo_de_Cancelaci_n__c value for this _case.
     * 
     * @return motivo_de_Cancelaci_n__c
     */
    public java.lang.String getMotivo_de_Cancelaci_n__c() {
        return motivo_de_Cancelaci_n__c;
    }


    /**
     * Sets the motivo_de_Cancelaci_n__c value for this _case.
     * 
     * @param motivo_de_Cancelaci_n__c
     */
    public void setMotivo_de_Cancelaci_n__c(java.lang.String motivo_de_Cancelaci_n__c) {
        this.motivo_de_Cancelaci_n__c = motivo_de_Cancelaci_n__c;
    }


    /**
     * Gets the n_mero_de_Orden_Web_o_IVR__c value for this _case.
     * 
     * @return n_mero_de_Orden_Web_o_IVR__c
     */
    public java.lang.String getN_mero_de_Orden_Web_o_IVR__c() {
        return n_mero_de_Orden_Web_o_IVR__c;
    }


    /**
     * Sets the n_mero_de_Orden_Web_o_IVR__c value for this _case.
     * 
     * @param n_mero_de_Orden_Web_o_IVR__c
     */
    public void setN_mero_de_Orden_Web_o_IVR__c(java.lang.String n_mero_de_Orden_Web_o_IVR__c) {
        this.n_mero_de_Orden_Web_o_IVR__c = n_mero_de_Orden_Web_o_IVR__c;
    }


    /**
     * Gets the no_Clave_modificacion__c value for this _case.
     * 
     * @return no_Clave_modificacion__c
     */
    public java.lang.String getNo_Clave_modificacion__c() {
        return no_Clave_modificacion__c;
    }


    /**
     * Sets the no_Clave_modificacion__c value for this _case.
     * 
     * @param no_Clave_modificacion__c
     */
    public void setNo_Clave_modificacion__c(java.lang.String no_Clave_modificacion__c) {
        this.no_Clave_modificacion__c = no_Clave_modificacion__c;
    }


    /**
     * Gets the nombre__c value for this _case.
     * 
     * @return nombre__c
     */
    public java.lang.String getNombre__c() {
        return nombre__c;
    }


    /**
     * Sets the nombre__c value for this _case.
     * 
     * @param nombre__c
     */
    public void setNombre__c(java.lang.String nombre__c) {
        this.nombre__c = nombre__c;
    }


    /**
     * Gets the numero_de_confirmacion_de_la_orden__c value for this _case.
     * 
     * @return numero_de_confirmacion_de_la_orden__c
     */
    public java.lang.String getNumero_de_confirmacion_de_la_orden__c() {
        return numero_de_confirmacion_de_la_orden__c;
    }


    /**
     * Sets the numero_de_confirmacion_de_la_orden__c value for this _case.
     * 
     * @param numero_de_confirmacion_de_la_orden__c
     */
    public void setNumero_de_confirmacion_de_la_orden__c(java.lang.String numero_de_confirmacion_de_la_orden__c) {
        this.numero_de_confirmacion_de_la_orden__c = numero_de_confirmacion_de_la_orden__c;
    }


    /**
     * Gets the numero_de_folio__c value for this _case.
     * 
     * @return numero_de_folio__c
     */
    public java.lang.String getNumero_de_folio__c() {
        return numero_de_folio__c;
    }


    /**
     * Sets the numero_de_folio__c value for this _case.
     * 
     * @param numero_de_folio__c
     */
    public void setNumero_de_folio__c(java.lang.String numero_de_folio__c) {
        this.numero_de_folio__c = numero_de_folio__c;
    }


    /**
     * Gets the numero_de_linea__c value for this _case.
     * 
     * @return numero_de_linea__c
     */
    public java.lang.String getNumero_de_linea__c() {
        return numero_de_linea__c;
    }


    /**
     * Sets the numero_de_linea__c value for this _case.
     * 
     * @param numero_de_linea__c
     */
    public void setNumero_de_linea__c(java.lang.String numero_de_linea__c) {
        this.numero_de_linea__c = numero_de_linea__c;
    }


    /**
     * Gets the numero_de_monedero__c value for this _case.
     * 
     * @return numero_de_monedero__c
     */
    public java.lang.String getNumero_de_monedero__c() {
        return numero_de_monedero__c;
    }


    /**
     * Sets the numero_de_monedero__c value for this _case.
     * 
     * @param numero_de_monedero__c
     */
    public void setNumero_de_monedero__c(java.lang.String numero_de_monedero__c) {
        this.numero_de_monedero__c = numero_de_monedero__c;
    }


    /**
     * Gets the numero_de_orden__c value for this _case.
     * 
     * @return numero_de_orden__c
     */
    public java.lang.String getNumero_de_orden__c() {
        return numero_de_orden__c;
    }


    /**
     * Sets the numero_de_orden__c value for this _case.
     * 
     * @param numero_de_orden__c
     */
    public void setNumero_de_orden__c(java.lang.String numero_de_orden__c) {
        this.numero_de_orden__c = numero_de_orden__c;
    }


    /**
     * Gets the numero_de_pago__c value for this _case.
     * 
     * @return numero_de_pago__c
     */
    public java.lang.String getNumero_de_pago__c() {
        return numero_de_pago__c;
    }


    /**
     * Sets the numero_de_pago__c value for this _case.
     * 
     * @param numero_de_pago__c
     */
    public void setNumero_de_pago__c(java.lang.String numero_de_pago__c) {
        this.numero_de_pago__c = numero_de_pago__c;
    }


    /**
     * Gets the numero_de_siniestro__c value for this _case.
     * 
     * @return numero_de_siniestro__c
     */
    public java.lang.String getNumero_de_siniestro__c() {
        return numero_de_siniestro__c;
    }


    /**
     * Sets the numero_de_siniestro__c value for this _case.
     * 
     * @param numero_de_siniestro__c
     */
    public void setNumero_de_siniestro__c(java.lang.String numero_de_siniestro__c) {
        this.numero_de_siniestro__c = numero_de_siniestro__c;
    }


    /**
     * Gets the numero_de_tarjeta__c value for this _case.
     * 
     * @return numero_de_tarjeta__c
     */
    public java.lang.String getNumero_de_tarjeta__c() {
        return numero_de_tarjeta__c;
    }


    /**
     * Sets the numero_de_tarjeta__c value for this _case.
     * 
     * @param numero_de_tarjeta__c
     */
    public void setNumero_de_tarjeta__c(java.lang.String numero_de_tarjeta__c) {
        this.numero_de_tarjeta__c = numero_de_tarjeta__c;
    }


    /**
     * Gets the numero_referencia_del_pago__c value for this _case.
     * 
     * @return numero_referencia_del_pago__c
     */
    public java.lang.String getNumero_referencia_del_pago__c() {
        return numero_referencia_del_pago__c;
    }


    /**
     * Sets the numero_referencia_del_pago__c value for this _case.
     * 
     * @param numero_referencia_del_pago__c
     */
    public void setNumero_referencia_del_pago__c(java.lang.String numero_referencia_del_pago__c) {
        this.numero_referencia_del_pago__c = numero_referencia_del_pago__c;
    }


    /**
     * Gets the openActivities value for this _case.
     * 
     * @return openActivities
     */
    public com.sforce.soap.enterprise.QueryResult getOpenActivities() {
        return openActivities;
    }


    /**
     * Sets the openActivities value for this _case.
     * 
     * @param openActivities
     */
    public void setOpenActivities(com.sforce.soap.enterprise.QueryResult openActivities) {
        this.openActivities = openActivities;
    }


    /**
     * Gets the origin value for this _case.
     * 
     * @return origin
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this _case.
     * 
     * @param origin
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the owner value for this _case.
     * 
     * @return owner
     */
    public com.sforce.soap.enterprise.sobject.Name getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this _case.
     * 
     * @param owner
     */
    public void setOwner(com.sforce.soap.enterprise.sobject.Name owner) {
        this.owner = owner;
    }


    /**
     * Gets the ownerId value for this _case.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this _case.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the parent value for this _case.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject._case getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this _case.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject._case parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this _case.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this _case.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the paso__c value for this _case.
     * 
     * @return paso__c
     */
    public java.lang.Double getPaso__c() {
        return paso__c;
    }


    /**
     * Sets the paso__c value for this _case.
     * 
     * @param paso__c
     */
    public void setPaso__c(java.lang.Double paso__c) {
        this.paso__c = paso__c;
    }


    /**
     * Gets the porcentaje_de_cr_dito__c value for this _case.
     * 
     * @return porcentaje_de_cr_dito__c
     */
    public java.lang.Double getPorcentaje_de_cr_dito__c() {
        return porcentaje_de_cr_dito__c;
    }


    /**
     * Sets the porcentaje_de_cr_dito__c value for this _case.
     * 
     * @param porcentaje_de_cr_dito__c
     */
    public void setPorcentaje_de_cr_dito__c(java.lang.Double porcentaje_de_cr_dito__c) {
        this.porcentaje_de_cr_dito__c = porcentaje_de_cr_dito__c;
    }


    /**
     * Gets the posts value for this _case.
     * 
     * @return posts
     */
    public com.sforce.soap.enterprise.QueryResult getPosts() {
        return posts;
    }


    /**
     * Sets the posts value for this _case.
     * 
     * @param posts
     */
    public void setPosts(com.sforce.soap.enterprise.QueryResult posts) {
        this.posts = posts;
    }


    /**
     * Gets the premio_grande__c value for this _case.
     * 
     * @return premio_grande__c
     */
    public java.lang.String getPremio_grande__c() {
        return premio_grande__c;
    }


    /**
     * Sets the premio_grande__c value for this _case.
     * 
     * @param premio_grande__c
     */
    public void setPremio_grande__c(java.lang.String premio_grande__c) {
        this.premio_grande__c = premio_grande__c;
    }


    /**
     * Gets the priority value for this _case.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this _case.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the procede__c value for this _case.
     * 
     * @return procede__c
     */
    public java.lang.String getProcede__c() {
        return procede__c;
    }


    /**
     * Sets the procede__c value for this _case.
     * 
     * @param procede__c
     */
    public void setProcede__c(java.lang.String procede__c) {
        this.procede__c = procede__c;
    }


    /**
     * Gets the processInstances value for this _case.
     * 
     * @return processInstances
     */
    public com.sforce.soap.enterprise.QueryResult getProcessInstances() {
        return processInstances;
    }


    /**
     * Sets the processInstances value for this _case.
     * 
     * @param processInstances
     */
    public void setProcessInstances(com.sforce.soap.enterprise.QueryResult processInstances) {
        this.processInstances = processInstances;
    }


    /**
     * Gets the processSteps value for this _case.
     * 
     * @return processSteps
     */
    public com.sforce.soap.enterprise.QueryResult getProcessSteps() {
        return processSteps;
    }


    /**
     * Sets the processSteps value for this _case.
     * 
     * @param processSteps
     */
    public void setProcessSteps(com.sforce.soap.enterprise.QueryResult processSteps) {
        this.processSteps = processSteps;
    }


    /**
     * Gets the programa2__c value for this _case.
     * 
     * @return programa2__c
     */
    public java.lang.String getPrograma2__c() {
        return programa2__c;
    }


    /**
     * Sets the programa2__c value for this _case.
     * 
     * @param programa2__c
     */
    public void setPrograma2__c(java.lang.String programa2__c) {
        this.programa2__c = programa2__c;
    }


    /**
     * Gets the programa2__r value for this _case.
     * 
     * @return programa2__r
     */
    public com.sforce.soap.enterprise.sobject.Programa__c getPrograma2__r() {
        return programa2__r;
    }


    /**
     * Sets the programa2__r value for this _case.
     * 
     * @param programa2__r
     */
    public void setPrograma2__r(com.sforce.soap.enterprise.sobject.Programa__c programa2__r) {
        this.programa2__r = programa2__r;
    }


    /**
     * Gets the programa__c value for this _case.
     * 
     * @return programa__c
     */
    public java.lang.String getPrograma__c() {
        return programa__c;
    }


    /**
     * Sets the programa__c value for this _case.
     * 
     * @param programa__c
     */
    public void setPrograma__c(java.lang.String programa__c) {
        this.programa__c = programa__c;
    }


    /**
     * Gets the razon_No_Procede__c value for this _case.
     * 
     * @return razon_No_Procede__c
     */
    public java.lang.String getRazon_No_Procede__c() {
        return razon_No_Procede__c;
    }


    /**
     * Sets the razon_No_Procede__c value for this _case.
     * 
     * @param razon_No_Procede__c
     */
    public void setRazon_No_Procede__c(java.lang.String razon_No_Procede__c) {
        this.razon_No_Procede__c = razon_No_Procede__c;
    }


    /**
     * Gets the razon_Procede__c value for this _case.
     * 
     * @return razon_Procede__c
     */
    public java.lang.String getRazon_Procede__c() {
        return razon_Procede__c;
    }


    /**
     * Sets the razon_Procede__c value for this _case.
     * 
     * @param razon_Procede__c
     */
    public void setRazon_Procede__c(java.lang.String razon_Procede__c) {
        this.razon_Procede__c = razon_Procede__c;
    }


    /**
     * Gets the reason value for this _case.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this _case.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the recordAssociatedGroups value for this _case.
     * 
     * @return recordAssociatedGroups
     */
    public com.sforce.soap.enterprise.QueryResult getRecordAssociatedGroups() {
        return recordAssociatedGroups;
    }


    /**
     * Sets the recordAssociatedGroups value for this _case.
     * 
     * @param recordAssociatedGroups
     */
    public void setRecordAssociatedGroups(com.sforce.soap.enterprise.QueryResult recordAssociatedGroups) {
        this.recordAssociatedGroups = recordAssociatedGroups;
    }


    /**
     * Gets the recordType value for this _case.
     * 
     * @return recordType
     */
    public com.sforce.soap.enterprise.sobject.RecordType getRecordType() {
        return recordType;
    }


    /**
     * Sets the recordType value for this _case.
     * 
     * @param recordType
     */
    public void setRecordType(com.sforce.soap.enterprise.sobject.RecordType recordType) {
        this.recordType = recordType;
    }


    /**
     * Gets the recordTypeId value for this _case.
     * 
     * @return recordTypeId
     */
    public java.lang.String getRecordTypeId() {
        return recordTypeId;
    }


    /**
     * Sets the recordTypeId value for this _case.
     * 
     * @param recordTypeId
     */
    public void setRecordTypeId(java.lang.String recordTypeId) {
        this.recordTypeId = recordTypeId;
    }


    /**
     * Gets the red__c value for this _case.
     * 
     * @return red__c
     */
    public java.lang.String getRed__c() {
        return red__c;
    }


    /**
     * Sets the red__c value for this _case.
     * 
     * @param red__c
     */
    public void setRed__c(java.lang.String red__c) {
        this.red__c = red__c;
    }


    /**
     * Gets the region__c value for this _case.
     * 
     * @return region__c
     */
    public java.lang.String getRegion__c() {
        return region__c;
    }


    /**
     * Sets the region__c value for this _case.
     * 
     * @param region__c
     */
    public void setRegion__c(java.lang.String region__c) {
        this.region__c = region__c;
    }


    /**
     * Gets the registro_Destino__c value for this _case.
     * 
     * @return registro_Destino__c
     */
    public java.lang.String getRegistro_Destino__c() {
        return registro_Destino__c;
    }


    /**
     * Sets the registro_Destino__c value for this _case.
     * 
     * @param registro_Destino__c
     */
    public void setRegistro_Destino__c(java.lang.String registro_Destino__c) {
        this.registro_Destino__c = registro_Destino__c;
    }


    /**
     * Gets the registro_Destino__r value for this _case.
     * 
     * @return registro_Destino__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getRegistro_Destino__r() {
        return registro_Destino__r;
    }


    /**
     * Sets the registro_Destino__r value for this _case.
     * 
     * @param registro_Destino__r
     */
    public void setRegistro_Destino__r(com.sforce.soap.enterprise.sobject.Contact registro_Destino__r) {
        this.registro_Destino__r = registro_Destino__r;
    }


    /**
     * Gets the registro_Origen__c value for this _case.
     * 
     * @return registro_Origen__c
     */
    public java.lang.String getRegistro_Origen__c() {
        return registro_Origen__c;
    }


    /**
     * Sets the registro_Origen__c value for this _case.
     * 
     * @param registro_Origen__c
     */
    public void setRegistro_Origen__c(java.lang.String registro_Origen__c) {
        this.registro_Origen__c = registro_Origen__c;
    }


    /**
     * Gets the registro_Origen__r value for this _case.
     * 
     * @return registro_Origen__r
     */
    public com.sforce.soap.enterprise.sobject.Contact getRegistro_Origen__r() {
        return registro_Origen__r;
    }


    /**
     * Sets the registro_Origen__r value for this _case.
     * 
     * @param registro_Origen__r
     */
    public void setRegistro_Origen__r(com.sforce.soap.enterprise.sobject.Contact registro_Origen__r) {
        this.registro_Origen__r = registro_Origen__r;
    }


    /**
     * Gets the registro_Web__c value for this _case.
     * 
     * @return registro_Web__c
     */
    public java.lang.String getRegistro_Web__c() {
        return registro_Web__c;
    }


    /**
     * Sets the registro_Web__c value for this _case.
     * 
     * @param registro_Web__c
     */
    public void setRegistro_Web__c(java.lang.String registro_Web__c) {
        this.registro_Web__c = registro_Web__c;
    }


    /**
     * Gets the registro__c value for this _case.
     * 
     * @return registro__c
     */
    public java.lang.String getRegistro__c() {
        return registro__c;
    }


    /**
     * Sets the registro__c value for this _case.
     * 
     * @param registro__c
     */
    public void setRegistro__c(java.lang.String registro__c) {
        this.registro__c = registro__c;
    }


    /**
     * Gets the reporte_Acompaniame__c value for this _case.
     * 
     * @return reporte_Acompaniame__c
     */
    public java.lang.String getReporte_Acompaniame__c() {
        return reporte_Acompaniame__c;
    }


    /**
     * Sets the reporte_Acompaniame__c value for this _case.
     * 
     * @param reporte_Acompaniame__c
     */
    public void setReporte_Acompaniame__c(java.lang.String reporte_Acompaniame__c) {
        this.reporte_Acompaniame__c = reporte_Acompaniame__c;
    }


    /**
     * Gets the reporte__c value for this _case.
     * 
     * @return reporte__c
     */
    public java.lang.String getReporte__c() {
        return reporte__c;
    }


    /**
     * Sets the reporte__c value for this _case.
     * 
     * @param reporte__c
     */
    public void setReporte__c(java.lang.String reporte__c) {
        this.reporte__c = reporte__c;
    }


    /**
     * Gets the resoluci_n_Supervisor__c value for this _case.
     * 
     * @return resoluci_n_Supervisor__c
     */
    public java.lang.String getResoluci_n_Supervisor__c() {
        return resoluci_n_Supervisor__c;
    }


    /**
     * Sets the resoluci_n_Supervisor__c value for this _case.
     * 
     * @param resoluci_n_Supervisor__c
     */
    public void setResoluci_n_Supervisor__c(java.lang.String resoluci_n_Supervisor__c) {
        this.resoluci_n_Supervisor__c = resoluci_n_Supervisor__c;
    }


    /**
     * Gets the resolucion_incidencia__c value for this _case.
     * 
     * @return resolucion_incidencia__c
     */
    public java.lang.String getResolucion_incidencia__c() {
        return resolucion_incidencia__c;
    }


    /**
     * Sets the resolucion_incidencia__c value for this _case.
     * 
     * @param resolucion_incidencia__c
     */
    public void setResolucion_incidencia__c(java.lang.String resolucion_incidencia__c) {
        this.resolucion_incidencia__c = resolucion_incidencia__c;
    }


    /**
     * Gets the respuesta_del_solicitante__c value for this _case.
     * 
     * @return respuesta_del_solicitante__c
     */
    public java.lang.String getRespuesta_del_solicitante__c() {
        return respuesta_del_solicitante__c;
    }


    /**
     * Sets the respuesta_del_solicitante__c value for this _case.
     * 
     * @param respuesta_del_solicitante__c
     */
    public void setRespuesta_del_solicitante__c(java.lang.String respuesta_del_solicitante__c) {
        this.respuesta_del_solicitante__c = respuesta_del_solicitante__c;
    }


    /**
     * Gets the resultado_Incentivos_MX__c value for this _case.
     * 
     * @return resultado_Incentivos_MX__c
     */
    public java.lang.String getResultado_Incentivos_MX__c() {
        return resultado_Incentivos_MX__c;
    }


    /**
     * Sets the resultado_Incentivos_MX__c value for this _case.
     * 
     * @param resultado_Incentivos_MX__c
     */
    public void setResultado_Incentivos_MX__c(java.lang.String resultado_Incentivos_MX__c) {
        this.resultado_Incentivos_MX__c = resultado_Incentivos_MX__c;
    }


    /**
     * Gets the resultado__c value for this _case.
     * 
     * @return resultado__c
     */
    public java.lang.String getResultado__c() {
        return resultado__c;
    }


    /**
     * Sets the resultado__c value for this _case.
     * 
     * @param resultado__c
     */
    public void setResultado__c(java.lang.String resultado__c) {
        this.resultado__c = resultado__c;
    }


    /**
     * Gets the SKU__c value for this _case.
     * 
     * @return SKU__c
     */
    public java.lang.String getSKU__c() {
        return SKU__c;
    }


    /**
     * Sets the SKU__c value for this _case.
     * 
     * @param SKU__c
     */
    public void setSKU__c(java.lang.String SKU__c) {
        this.SKU__c = SKU__c;
    }


    /**
     * Gets the saldo_Digito__c value for this _case.
     * 
     * @return saldo_Digito__c
     */
    public java.lang.String getSaldo_Digito__c() {
        return saldo_Digito__c;
    }


    /**
     * Sets the saldo_Digito__c value for this _case.
     * 
     * @param saldo_Digito__c
     */
    public void setSaldo_Digito__c(java.lang.String saldo_Digito__c) {
        this.saldo_Digito__c = saldo_Digito__c;
    }


    /**
     * Gets the shares value for this _case.
     * 
     * @return shares
     */
    public com.sforce.soap.enterprise.QueryResult getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this _case.
     * 
     * @param shares
     */
    public void setShares(com.sforce.soap.enterprise.QueryResult shares) {
        this.shares = shares;
    }


    /**
     * Gets the slaExitDate value for this _case.
     * 
     * @return slaExitDate
     */
    public java.util.Calendar getSlaExitDate() {
        return slaExitDate;
    }


    /**
     * Sets the slaExitDate value for this _case.
     * 
     * @param slaExitDate
     */
    public void setSlaExitDate(java.util.Calendar slaExitDate) {
        this.slaExitDate = slaExitDate;
    }


    /**
     * Gets the slaStartDate value for this _case.
     * 
     * @return slaStartDate
     */
    public java.util.Calendar getSlaStartDate() {
        return slaStartDate;
    }


    /**
     * Sets the slaStartDate value for this _case.
     * 
     * @param slaStartDate
     */
    public void setSlaStartDate(java.util.Calendar slaStartDate) {
        this.slaStartDate = slaStartDate;
    }


    /**
     * Gets the solutions value for this _case.
     * 
     * @return solutions
     */
    public com.sforce.soap.enterprise.QueryResult getSolutions() {
        return solutions;
    }


    /**
     * Sets the solutions value for this _case.
     * 
     * @param solutions
     */
    public void setSolutions(com.sforce.soap.enterprise.QueryResult solutions) {
        this.solutions = solutions;
    }


    /**
     * Gets the status value for this _case.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this _case.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the stopStartDate value for this _case.
     * 
     * @return stopStartDate
     */
    public java.util.Calendar getStopStartDate() {
        return stopStartDate;
    }


    /**
     * Sets the stopStartDate value for this _case.
     * 
     * @param stopStartDate
     */
    public void setStopStartDate(java.util.Calendar stopStartDate) {
        this.stopStartDate = stopStartDate;
    }


    /**
     * Gets the sub_Razon_Procede__c value for this _case.
     * 
     * @return sub_Razon_Procede__c
     */
    public java.lang.String getSub_Razon_Procede__c() {
        return sub_Razon_Procede__c;
    }


    /**
     * Sets the sub_Razon_Procede__c value for this _case.
     * 
     * @param sub_Razon_Procede__c
     */
    public void setSub_Razon_Procede__c(java.lang.String sub_Razon_Procede__c) {
        this.sub_Razon_Procede__c = sub_Razon_Procede__c;
    }


    /**
     * Gets the sub_Tipificacion__c value for this _case.
     * 
     * @return sub_Tipificacion__c
     */
    public java.lang.String getSub_Tipificacion__c() {
        return sub_Tipificacion__c;
    }


    /**
     * Sets the sub_Tipificacion__c value for this _case.
     * 
     * @param sub_Tipificacion__c
     */
    public void setSub_Tipificacion__c(java.lang.String sub_Tipificacion__c) {
        this.sub_Tipificacion__c = sub_Tipificacion__c;
    }


    /**
     * Gets the subject value for this _case.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this _case.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the suppliedCompany value for this _case.
     * 
     * @return suppliedCompany
     */
    public java.lang.String getSuppliedCompany() {
        return suppliedCompany;
    }


    /**
     * Sets the suppliedCompany value for this _case.
     * 
     * @param suppliedCompany
     */
    public void setSuppliedCompany(java.lang.String suppliedCompany) {
        this.suppliedCompany = suppliedCompany;
    }


    /**
     * Gets the suppliedEmail value for this _case.
     * 
     * @return suppliedEmail
     */
    public java.lang.String getSuppliedEmail() {
        return suppliedEmail;
    }


    /**
     * Sets the suppliedEmail value for this _case.
     * 
     * @param suppliedEmail
     */
    public void setSuppliedEmail(java.lang.String suppliedEmail) {
        this.suppliedEmail = suppliedEmail;
    }


    /**
     * Gets the suppliedName value for this _case.
     * 
     * @return suppliedName
     */
    public java.lang.String getSuppliedName() {
        return suppliedName;
    }


    /**
     * Sets the suppliedName value for this _case.
     * 
     * @param suppliedName
     */
    public void setSuppliedName(java.lang.String suppliedName) {
        this.suppliedName = suppliedName;
    }


    /**
     * Gets the suppliedPhone value for this _case.
     * 
     * @return suppliedPhone
     */
    public java.lang.String getSuppliedPhone() {
        return suppliedPhone;
    }


    /**
     * Sets the suppliedPhone value for this _case.
     * 
     * @param suppliedPhone
     */
    public void setSuppliedPhone(java.lang.String suppliedPhone) {
        this.suppliedPhone = suppliedPhone;
    }


    /**
     * Gets the systemModstamp value for this _case.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this _case.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the tasks value for this _case.
     * 
     * @return tasks
     */
    public com.sforce.soap.enterprise.QueryResult getTasks() {
        return tasks;
    }


    /**
     * Sets the tasks value for this _case.
     * 
     * @param tasks
     */
    public void setTasks(com.sforce.soap.enterprise.QueryResult tasks) {
        this.tasks = tasks;
    }


    /**
     * Gets the teamMembers value for this _case.
     * 
     * @return teamMembers
     */
    public com.sforce.soap.enterprise.QueryResult getTeamMembers() {
        return teamMembers;
    }


    /**
     * Sets the teamMembers value for this _case.
     * 
     * @param teamMembers
     */
    public void setTeamMembers(com.sforce.soap.enterprise.QueryResult teamMembers) {
        this.teamMembers = teamMembers;
    }


    /**
     * Gets the teamTemplateRecords value for this _case.
     * 
     * @return teamTemplateRecords
     */
    public com.sforce.soap.enterprise.QueryResult getTeamTemplateRecords() {
        return teamTemplateRecords;
    }


    /**
     * Sets the teamTemplateRecords value for this _case.
     * 
     * @param teamTemplateRecords
     */
    public void setTeamTemplateRecords(com.sforce.soap.enterprise.QueryResult teamTemplateRecords) {
        this.teamTemplateRecords = teamTemplateRecords;
    }


    /**
     * Gets the tel_fono_de_Casa__c value for this _case.
     * 
     * @return tel_fono_de_Casa__c
     */
    public java.lang.String getTel_fono_de_Casa__c() {
        return tel_fono_de_Casa__c;
    }


    /**
     * Sets the tel_fono_de_Casa__c value for this _case.
     * 
     * @param tel_fono_de_Casa__c
     */
    public void setTel_fono_de_Casa__c(java.lang.String tel_fono_de_Casa__c) {
        this.tel_fono_de_Casa__c = tel_fono_de_Casa__c;
    }


    /**
     * Gets the tel_fono_de_Celular__c value for this _case.
     * 
     * @return tel_fono_de_Celular__c
     */
    public java.lang.String getTel_fono_de_Celular__c() {
        return tel_fono_de_Celular__c;
    }


    /**
     * Sets the tel_fono_de_Celular__c value for this _case.
     * 
     * @param tel_fono_de_Celular__c
     */
    public void setTel_fono_de_Celular__c(java.lang.String tel_fono_de_Celular__c) {
        this.tel_fono_de_Celular__c = tel_fono_de_Celular__c;
    }


    /**
     * Gets the telefono__c value for this _case.
     * 
     * @return telefono__c
     */
    public java.lang.String getTelefono__c() {
        return telefono__c;
    }


    /**
     * Sets the telefono__c value for this _case.
     * 
     * @param telefono__c
     */
    public void setTelefono__c(java.lang.String telefono__c) {
        this.telefono__c = telefono__c;
    }


    /**
     * Gets the tempOwnerId__c value for this _case.
     * 
     * @return tempOwnerId__c
     */
    public java.lang.String getTempOwnerId__c() {
        return tempOwnerId__c;
    }


    /**
     * Sets the tempOwnerId__c value for this _case.
     * 
     * @param tempOwnerId__c
     */
    public void setTempOwnerId__c(java.lang.String tempOwnerId__c) {
        this.tempOwnerId__c = tempOwnerId__c;
    }


    /**
     * Gets the ticket_Remedy__c value for this _case.
     * 
     * @return ticket_Remedy__c
     */
    public java.lang.String getTicket_Remedy__c() {
        return ticket_Remedy__c;
    }


    /**
     * Sets the ticket_Remedy__c value for this _case.
     * 
     * @param ticket_Remedy__c
     */
    public void setTicket_Remedy__c(java.lang.String ticket_Remedy__c) {
        this.ticket_Remedy__c = ticket_Remedy__c;
    }


    /**
     * Gets the tipificacion__c value for this _case.
     * 
     * @return tipificacion__c
     */
    public java.lang.String getTipificacion__c() {
        return tipificacion__c;
    }


    /**
     * Sets the tipificacion__c value for this _case.
     * 
     * @param tipificacion__c
     */
    public void setTipificacion__c(java.lang.String tipificacion__c) {
        this.tipificacion__c = tipificacion__c;
    }


    /**
     * Gets the tipo_Aclaracion__c value for this _case.
     * 
     * @return tipo_Aclaracion__c
     */
    public java.lang.String getTipo_Aclaracion__c() {
        return tipo_Aclaracion__c;
    }


    /**
     * Sets the tipo_Aclaracion__c value for this _case.
     * 
     * @param tipo_Aclaracion__c
     */
    public void setTipo_Aclaracion__c(java.lang.String tipo_Aclaracion__c) {
        this.tipo_Aclaracion__c = tipo_Aclaracion__c;
    }


    /**
     * Gets the tipo_Envio__c value for this _case.
     * 
     * @return tipo_Envio__c
     */
    public java.lang.String getTipo_Envio__c() {
        return tipo_Envio__c;
    }


    /**
     * Sets the tipo_Envio__c value for this _case.
     * 
     * @param tipo_Envio__c
     */
    public void setTipo_Envio__c(java.lang.String tipo_Envio__c) {
        this.tipo_Envio__c = tipo_Envio__c;
    }


    /**
     * Gets the tipo_Faltante_Afectaci_n__c value for this _case.
     * 
     * @return tipo_Faltante_Afectaci_n__c
     */
    public java.lang.String getTipo_Faltante_Afectaci_n__c() {
        return tipo_Faltante_Afectaci_n__c;
    }


    /**
     * Sets the tipo_Faltante_Afectaci_n__c value for this _case.
     * 
     * @param tipo_Faltante_Afectaci_n__c
     */
    public void setTipo_Faltante_Afectaci_n__c(java.lang.String tipo_Faltante_Afectaci_n__c) {
        this.tipo_Faltante_Afectaci_n__c = tipo_Faltante_Afectaci_n__c;
    }


    /**
     * Gets the tipo_Informativo__c value for this _case.
     * 
     * @return tipo_Informativo__c
     */
    public java.lang.String getTipo_Informativo__c() {
        return tipo_Informativo__c;
    }


    /**
     * Sets the tipo_Informativo__c value for this _case.
     * 
     * @param tipo_Informativo__c
     */
    public void setTipo_Informativo__c(java.lang.String tipo_Informativo__c) {
        this.tipo_Informativo__c = tipo_Informativo__c;
    }


    /**
     * Gets the tipo_PFP__c value for this _case.
     * 
     * @return tipo_PFP__c
     */
    public java.lang.String getTipo_PFP__c() {
        return tipo_PFP__c;
    }


    /**
     * Sets the tipo_PFP__c value for this _case.
     * 
     * @param tipo_PFP__c
     */
    public void setTipo_PFP__c(java.lang.String tipo_PFP__c) {
        this.tipo_PFP__c = tipo_PFP__c;
    }


    /**
     * Gets the tipo_actualizacion__c value for this _case.
     * 
     * @return tipo_actualizacion__c
     */
    public java.lang.String getTipo_actualizacion__c() {
        return tipo_actualizacion__c;
    }


    /**
     * Sets the tipo_actualizacion__c value for this _case.
     * 
     * @param tipo_actualizacion__c
     */
    public void setTipo_actualizacion__c(java.lang.String tipo_actualizacion__c) {
        this.tipo_actualizacion__c = tipo_actualizacion__c;
    }


    /**
     * Gets the tipo_acumulado__c value for this _case.
     * 
     * @return tipo_acumulado__c
     */
    public java.lang.String getTipo_acumulado__c() {
        return tipo_acumulado__c;
    }


    /**
     * Sets the tipo_acumulado__c value for this _case.
     * 
     * @param tipo_acumulado__c
     */
    public void setTipo_acumulado__c(java.lang.String tipo_acumulado__c) {
        this.tipo_acumulado__c = tipo_acumulado__c;
    }


    /**
     * Gets the tipo_componente__c value for this _case.
     * 
     * @return tipo_componente__c
     */
    public java.lang.String getTipo_componente__c() {
        return tipo_componente__c;
    }


    /**
     * Sets the tipo_componente__c value for this _case.
     * 
     * @param tipo_componente__c
     */
    public void setTipo_componente__c(java.lang.String tipo_componente__c) {
        this.tipo_componente__c = tipo_componente__c;
    }


    /**
     * Gets the tipo_contacto__c value for this _case.
     * 
     * @return tipo_contacto__c
     */
    public java.lang.String getTipo_contacto__c() {
        return tipo_contacto__c;
    }


    /**
     * Sets the tipo_contacto__c value for this _case.
     * 
     * @param tipo_contacto__c
     */
    public void setTipo_contacto__c(java.lang.String tipo_contacto__c) {
        this.tipo_contacto__c = tipo_contacto__c;
    }


    /**
     * Gets the tipo_de_asignaci_n__c value for this _case.
     * 
     * @return tipo_de_asignaci_n__c
     */
    public java.lang.String getTipo_de_asignaci_n__c() {
        return tipo_de_asignaci_n__c;
    }


    /**
     * Sets the tipo_de_asignaci_n__c value for this _case.
     * 
     * @param tipo_de_asignaci_n__c
     */
    public void setTipo_de_asignaci_n__c(java.lang.String tipo_de_asignaci_n__c) {
        this.tipo_de_asignaci_n__c = tipo_de_asignaci_n__c;
    }


    /**
     * Gets the tipo_de_bono_apoyo__c value for this _case.
     * 
     * @return tipo_de_bono_apoyo__c
     */
    public java.lang.String getTipo_de_bono_apoyo__c() {
        return tipo_de_bono_apoyo__c;
    }


    /**
     * Sets the tipo_de_bono_apoyo__c value for this _case.
     * 
     * @param tipo_de_bono_apoyo__c
     */
    public void setTipo_de_bono_apoyo__c(java.lang.String tipo_de_bono_apoyo__c) {
        this.tipo_de_bono_apoyo__c = tipo_de_bono_apoyo__c;
    }


    /**
     * Gets the tipo_de_incentivo__c value for this _case.
     * 
     * @return tipo_de_incentivo__c
     */
    public java.lang.String getTipo_de_incentivo__c() {
        return tipo_de_incentivo__c;
    }


    /**
     * Sets the tipo_de_incentivo__c value for this _case.
     * 
     * @param tipo_de_incentivo__c
     */
    public void setTipo_de_incentivo__c(java.lang.String tipo_de_incentivo__c) {
        this.tipo_de_incentivo__c = tipo_de_incentivo__c;
    }


    /**
     * Gets the tipo_de_incidencia__c value for this _case.
     * 
     * @return tipo_de_incidencia__c
     */
    public java.lang.String getTipo_de_incidencia__c() {
        return tipo_de_incidencia__c;
    }


    /**
     * Sets the tipo_de_incidencia__c value for this _case.
     * 
     * @param tipo_de_incidencia__c
     */
    public void setTipo_de_incidencia__c(java.lang.String tipo_de_incidencia__c) {
        this.tipo_de_incidencia__c = tipo_de_incidencia__c;
    }


    /**
     * Gets the tipo_de_material__c value for this _case.
     * 
     * @return tipo_de_material__c
     */
    public java.lang.String getTipo_de_material__c() {
        return tipo_de_material__c;
    }


    /**
     * Sets the tipo_de_material__c value for this _case.
     * 
     * @param tipo_de_material__c
     */
    public void setTipo_de_material__c(java.lang.String tipo_de_material__c) {
        this.tipo_de_material__c = tipo_de_material__c;
    }


    /**
     * Gets the tipo_de_pedido__c value for this _case.
     * 
     * @return tipo_de_pedido__c
     */
    public java.lang.String getTipo_de_pedido__c() {
        return tipo_de_pedido__c;
    }


    /**
     * Sets the tipo_de_pedido__c value for this _case.
     * 
     * @param tipo_de_pedido__c
     */
    public void setTipo_de_pedido__c(java.lang.String tipo_de_pedido__c) {
        this.tipo_de_pedido__c = tipo_de_pedido__c;
    }


    /**
     * Gets the tipo_de_red__c value for this _case.
     * 
     * @return tipo_de_red__c
     */
    public java.lang.String getTipo_de_red__c() {
        return tipo_de_red__c;
    }


    /**
     * Sets the tipo_de_red__c value for this _case.
     * 
     * @param tipo_de_red__c
     */
    public void setTipo_de_red__c(java.lang.String tipo_de_red__c) {
        this.tipo_de_red__c = tipo_de_red__c;
    }


    /**
     * Gets the tipo_de_reporte__c value for this _case.
     * 
     * @return tipo_de_reporte__c
     */
    public java.lang.String getTipo_de_reporte__c() {
        return tipo_de_reporte__c;
    }


    /**
     * Sets the tipo_de_reporte__c value for this _case.
     * 
     * @param tipo_de_reporte__c
     */
    public void setTipo_de_reporte__c(java.lang.String tipo_de_reporte__c) {
        this.tipo_de_reporte__c = tipo_de_reporte__c;
    }


    /**
     * Gets the tipo_de_robo_extravio__c value for this _case.
     * 
     * @return tipo_de_robo_extravio__c
     */
    public java.lang.String getTipo_de_robo_extravio__c() {
        return tipo_de_robo_extravio__c;
    }


    /**
     * Sets the tipo_de_robo_extravio__c value for this _case.
     * 
     * @param tipo_de_robo_extravio__c
     */
    public void setTipo_de_robo_extravio__c(java.lang.String tipo_de_robo_extravio__c) {
        this.tipo_de_robo_extravio__c = tipo_de_robo_extravio__c;
    }


    /**
     * Gets the tipo_de_transferencia__c value for this _case.
     * 
     * @return tipo_de_transferencia__c
     */
    public java.lang.String getTipo_de_transferencia__c() {
        return tipo_de_transferencia__c;
    }


    /**
     * Sets the tipo_de_transferencia__c value for this _case.
     * 
     * @param tipo_de_transferencia__c
     */
    public void setTipo_de_transferencia__c(java.lang.String tipo_de_transferencia__c) {
        this.tipo_de_transferencia__c = tipo_de_transferencia__c;
    }


    /**
     * Gets the tipo_incidencia_monedero__c value for this _case.
     * 
     * @return tipo_incidencia_monedero__c
     */
    public java.lang.String getTipo_incidencia_monedero__c() {
        return tipo_incidencia_monedero__c;
    }


    /**
     * Sets the tipo_incidencia_monedero__c value for this _case.
     * 
     * @param tipo_incidencia_monedero__c
     */
    public void setTipo_incidencia_monedero__c(java.lang.String tipo_incidencia_monedero__c) {
        this.tipo_incidencia_monedero__c = tipo_incidencia_monedero__c;
    }


    /**
     * Gets the tipo_solicitante__c value for this _case.
     * 
     * @return tipo_solicitante__c
     */
    public java.lang.String getTipo_solicitante__c() {
        return tipo_solicitante__c;
    }


    /**
     * Sets the tipo_solicitante__c value for this _case.
     * 
     * @param tipo_solicitante__c
     */
    public void setTipo_solicitante__c(java.lang.String tipo_solicitante__c) {
        this.tipo_solicitante__c = tipo_solicitante__c;
    }


    /**
     * Gets the topicAssignments value for this _case.
     * 
     * @return topicAssignments
     */
    public com.sforce.soap.enterprise.QueryResult getTopicAssignments() {
        return topicAssignments;
    }


    /**
     * Sets the topicAssignments value for this _case.
     * 
     * @param topicAssignments
     */
    public void setTopicAssignments(com.sforce.soap.enterprise.QueryResult topicAssignments) {
        this.topicAssignments = topicAssignments;
    }


    /**
     * Gets the total_de_claves__c value for this _case.
     * 
     * @return total_de_claves__c
     */
    public java.lang.String getTotal_de_claves__c() {
        return total_de_claves__c;
    }


    /**
     * Sets the total_de_claves__c value for this _case.
     * 
     * @param total_de_claves__c
     */
    public void setTotal_de_claves__c(java.lang.String total_de_claves__c) {
        this.total_de_claves__c = total_de_claves__c;
    }


    /**
     * Gets the type value for this _case.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this _case.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the URL__c value for this _case.
     * 
     * @return URL__c
     */
    public java.lang.String getURL__c() {
        return URL__c;
    }


    /**
     * Sets the URL__c value for this _case.
     * 
     * @param URL__c
     */
    public void setURL__c(java.lang.String URL__c) {
        this.URL__c = URL__c;
    }


    /**
     * Gets the unidades_Faltantes__c value for this _case.
     * 
     * @return unidades_Faltantes__c
     */
    public java.lang.Double getUnidades_Faltantes__c() {
        return unidades_Faltantes__c;
    }


    /**
     * Sets the unidades_Faltantes__c value for this _case.
     * 
     * @param unidades_Faltantes__c
     */
    public void setUnidades_Faltantes__c(java.lang.Double unidades_Faltantes__c) {
        this.unidades_Faltantes__c = unidades_Faltantes__c;
    }


    /**
     * Gets the unidades__c value for this _case.
     * 
     * @return unidades__c
     */
    public java.lang.Double getUnidades__c() {
        return unidades__c;
    }


    /**
     * Sets the unidades__c value for this _case.
     * 
     * @param unidades__c
     */
    public void setUnidades__c(java.lang.Double unidades__c) {
        this.unidades__c = unidades__c;
    }


    /**
     * Gets the unidades_aclaradas__c value for this _case.
     * 
     * @return unidades_aclaradas__c
     */
    public java.lang.Double getUnidades_aclaradas__c() {
        return unidades_aclaradas__c;
    }


    /**
     * Sets the unidades_aclaradas__c value for this _case.
     * 
     * @param unidades_aclaradas__c
     */
    public void setUnidades_aclaradas__c(java.lang.Double unidades_aclaradas__c) {
        this.unidades_aclaradas__c = unidades_aclaradas__c;
    }


    /**
     * Gets the userRecordAccess value for this _case.
     * 
     * @return userRecordAccess
     */
    public com.sforce.soap.enterprise.sobject.UserRecordAccess getUserRecordAccess() {
        return userRecordAccess;
    }


    /**
     * Sets the userRecordAccess value for this _case.
     * 
     * @param userRecordAccess
     */
    public void setUserRecordAccess(com.sforce.soap.enterprise.sobject.UserRecordAccess userRecordAccess) {
        this.userRecordAccess = userRecordAccess;
    }


    /**
     * Gets the VEA__c value for this _case.
     * 
     * @return VEA__c
     */
    public java.lang.String getVEA__c() {
        return VEA__c;
    }


    /**
     * Sets the VEA__c value for this _case.
     * 
     * @param VEA__c
     */
    public void setVEA__c(java.lang.String VEA__c) {
        this.VEA__c = VEA__c;
    }


    /**
     * Gets the zona_Destino__c value for this _case.
     * 
     * @return zona_Destino__c
     */
    public java.lang.String getZona_Destino__c() {
        return zona_Destino__c;
    }


    /**
     * Sets the zona_Destino__c value for this _case.
     * 
     * @param zona_Destino__c
     */
    public void setZona_Destino__c(java.lang.String zona_Destino__c) {
        this.zona_Destino__c = zona_Destino__c;
    }


    /**
     * Gets the zona__c value for this _case.
     * 
     * @return zona__c
     */
    public java.lang.String getZona__c() {
        return zona__c;
    }


    /**
     * Sets the zona__c value for this _case.
     * 
     * @param zona__c
     */
    public void setZona__c(java.lang.String zona__c) {
        this.zona__c = zona__c;
    }


    /**
     * Gets the zona_de_Envio__c value for this _case.
     * 
     * @return zona_de_Envio__c
     */
    public java.lang.String getZona_de_Envio__c() {
        return zona_de_Envio__c;
    }


    /**
     * Sets the zona_de_Envio__c value for this _case.
     * 
     * @param zona_de_Envio__c
     */
    public void setZona_de_Envio__c(java.lang.String zona_de_Envio__c) {
        this.zona_de_Envio__c = zona_de_Envio__c;
    }


    /**
     * Gets the area__c value for this _case.
     * 
     * @return area__c
     */
    public java.lang.String getArea__c() {
        return area__c;
    }


    /**
     * Sets the area__c value for this _case.
     * 
     * @param area__c
     */
    public void setArea__c(java.lang.String area__c) {
        this.area__c = area__c;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _case)) return false;
        _case other = (_case) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountId==null && other.getAccountId()==null) || 
             (this.accountId!=null &&
              this.accountId.equals(other.getAccountId()))) &&
            ((this.acepto_pago_en_efectivo__c==null && other.getAcepto_pago_en_efectivo__c()==null) || 
             (this.acepto_pago_en_efectivo__c!=null &&
              this.acepto_pago_en_efectivo__c.equals(other.getAcepto_pago_en_efectivo__c()))) &&
            ((this.acepto_sustituto__c==null && other.getAcepto_sustituto__c()==null) || 
             (this.acepto_sustituto__c!=null &&
              this.acepto_sustituto__c.equals(other.getAcepto_sustituto__c()))) &&
            ((this.activityHistories==null && other.getActivityHistories()==null) || 
             (this.activityHistories!=null &&
              this.activityHistories.equals(other.getActivityHistories()))) &&
            ((this.agencia_de_cobranza__c==null && other.getAgencia_de_cobranza__c()==null) || 
             (this.agencia_de_cobranza__c!=null &&
              this.agencia_de_cobranza__c.equals(other.getAgencia_de_cobranza__c()))) &&
            ((this.apellido_Materno__c==null && other.getApellido_Materno__c()==null) || 
             (this.apellido_Materno__c!=null &&
              this.apellido_Materno__c.equals(other.getApellido_Materno__c()))) &&
            ((this.apellido_Paterno__c==null && other.getApellido_Paterno__c()==null) || 
             (this.apellido_Paterno__c!=null &&
              this.apellido_Paterno__c.equals(other.getApellido_Paterno__c()))) &&
            ((this.aprobo_gerente_de_zona__c==null && other.getAprobo_gerente_de_zona__c()==null) || 
             (this.aprobo_gerente_de_zona__c!=null &&
              this.aprobo_gerente_de_zona__c.equals(other.getAprobo_gerente_de_zona__c()))) &&
            ((this.attachedContentDocuments==null && other.getAttachedContentDocuments()==null) || 
             (this.attachedContentDocuments!=null &&
              this.attachedContentDocuments.equals(other.getAttachedContentDocuments()))) &&
            ((this.attachments==null && other.getAttachments()==null) || 
             (this.attachments!=null &&
              this.attachments.equals(other.getAttachments()))) &&
            ((this.autoriza_acumulado__c==null && other.getAutoriza_acumulado__c()==null) || 
             (this.autoriza_acumulado__c!=null &&
              this.autoriza_acumulado__c.equals(other.getAutoriza_acumulado__c()))) &&
            ((this.autorizador__c==null && other.getAutorizador__c()==null) || 
             (this.autorizador__c!=null &&
              this.autorizador__c.equals(other.getAutorizador__c()))) &&
            ((this.banco__c==null && other.getBanco__c()==null) || 
             (this.banco__c!=null &&
              this.banco__c.equals(other.getBanco__c()))) &&
            ((this.businessHours==null && other.getBusinessHours()==null) || 
             (this.businessHours!=null &&
              this.businessHours.equals(other.getBusinessHours()))) &&
            ((this.businessHoursId==null && other.getBusinessHoursId()==null) || 
             (this.businessHoursId!=null &&
              this.businessHoursId.equals(other.getBusinessHoursId()))) &&
            ((this.CURP__c==null && other.getCURP__c()==null) || 
             (this.CURP__c!=null &&
              this.CURP__c.equals(other.getCURP__c()))) &&
            ((this.campa_a_de_aplicaci_n__c==null && other.getCampa_a_de_aplicaci_n__c()==null) || 
             (this.campa_a_de_aplicaci_n__c!=null &&
              this.campa_a_de_aplicaci_n__c.equals(other.getCampa_a_de_aplicaci_n__c()))) &&
            ((this.campana__c==null && other.getCampana__c()==null) || 
             (this.campana__c!=null &&
              this.campana__c.equals(other.getCampana__c()))) &&
            ((this.campania_Avon__c==null && other.getCampania_Avon__c()==null) || 
             (this.campania_Avon__c!=null &&
              this.campania_Avon__c.equals(other.getCampania_Avon__c()))) &&
            ((this.campania_Avon__r==null && other.getCampania_Avon__r()==null) || 
             (this.campania_Avon__r!=null &&
              this.campania_Avon__r.equals(other.getCampania_Avon__r()))) &&
            ((this.campania_de_envio__c==null && other.getCampania_de_envio__c()==null) || 
             (this.campania_de_envio__c!=null &&
              this.campania_de_envio__c.equals(other.getCampania_de_envio__c()))) &&
            ((this.cantidad__c==null && other.getCantidad__c()==null) || 
             (this.cantidad__c!=null &&
              this.cantidad__c.equals(other.getCantidad__c()))) &&
            ((this.cantidad_a_recibir__c==null && other.getCantidad_a_recibir__c()==null) || 
             (this.cantidad_a_recibir__c!=null &&
              this.cantidad_a_recibir__c.equals(other.getCantidad_a_recibir__c()))) &&
            ((this.cantidad_recibida__c==null && other.getCantidad_recibida__c()==null) || 
             (this.cantidad_recibida__c!=null &&
              this.cantidad_recibida__c.equals(other.getCantidad_recibida__c()))) &&
            ((this.cargo_por__c==null && other.getCargo_por__c()==null) || 
             (this.cargo_por__c!=null &&
              this.cargo_por__c.equals(other.getCargo_por__c()))) &&
            ((this.caseComments==null && other.getCaseComments()==null) || 
             (this.caseComments!=null &&
              this.caseComments.equals(other.getCaseComments()))) &&
            ((this.caseContactRoles==null && other.getCaseContactRoles()==null) || 
             (this.caseContactRoles!=null &&
              this.caseContactRoles.equals(other.getCaseContactRoles()))) &&
            ((this.caseMilestones==null && other.getCaseMilestones()==null) || 
             (this.caseMilestones!=null &&
              this.caseMilestones.equals(other.getCaseMilestones()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.caseSolutions==null && other.getCaseSolutions()==null) || 
             (this.caseSolutions!=null &&
              this.caseSolutions.equals(other.getCaseSolutions()))) &&
            ((this.cases==null && other.getCases()==null) || 
             (this.cases!=null &&
              this.cases.equals(other.getCases()))) &&
            ((this.categoria__c==null && other.getCategoria__c()==null) || 
             (this.categoria__c!=null &&
              this.categoria__c.equals(other.getCategoria__c()))) &&
            ((this.causa_Ajuste__c==null && other.getCausa_Ajuste__c()==null) || 
             (this.causa_Ajuste__c!=null &&
              this.causa_Ajuste__c.equals(other.getCausa_Ajuste__c()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.combinedAttachments==null && other.getCombinedAttachments()==null) || 
             (this.combinedAttachments!=null &&
              this.combinedAttachments.equals(other.getCombinedAttachments()))) &&
            ((this.completion_Date__c==null && other.getCompletion_Date__c()==null) || 
             (this.completion_Date__c!=null &&
              this.completion_Date__c.equals(other.getCompletion_Date__c()))) &&
            ((this.concepto__c==null && other.getConcepto__c()==null) || 
             (this.concepto__c!=null &&
              this.concepto__c.equals(other.getConcepto__c()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.contactId==null && other.getContactId()==null) || 
             (this.contactId!=null &&
              this.contactId.equals(other.getContactId()))) &&
            ((this.correo_Electr_nico__c==null && other.getCorreo_Electr_nico__c()==null) || 
             (this.correo_Electr_nico__c!=null &&
              this.correo_Electr_nico__c.equals(other.getCorreo_Electr_nico__c()))) &&
            ((this.correo_Gerente_Divisional__c==null && other.getCorreo_Gerente_Divisional__c()==null) || 
             (this.correo_Gerente_Divisional__c!=null &&
              this.correo_Gerente_Divisional__c.equals(other.getCorreo_Gerente_Divisional__c()))) &&
            ((this.correo_Gerente_Regional__c==null && other.getCorreo_Gerente_Regional__c()==null) || 
             (this.correo_Gerente_Regional__c!=null &&
              this.correo_Gerente_Regional__c.equals(other.getCorreo_Gerente_Regional__c()))) &&
            ((this.correo_Gerente_de_Zona__c==null && other.getCorreo_Gerente_de_Zona__c()==null) || 
             (this.correo_Gerente_de_Zona__c!=null &&
              this.correo_Gerente_de_Zona__c.equals(other.getCorreo_Gerente_de_Zona__c()))) &&
            ((this.correo_electronico__c==null && other.getCorreo_electronico__c()==null) || 
             (this.correo_electronico__c!=null &&
              this.correo_electronico__c.equals(other.getCorreo_electronico__c()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.descripci_n_del_premio__c==null && other.getDescripci_n_del_premio__c()==null) || 
             (this.descripci_n_del_premio__c!=null &&
              this.descripci_n_del_premio__c.equals(other.getDescripci_n_del_premio__c()))) &&
            ((this.descripcion_del_pedido__c==null && other.getDescripcion_del_pedido__c()==null) || 
             (this.descripcion_del_pedido__c!=null &&
              this.descripcion_del_pedido__c.equals(other.getDescripcion_del_pedido__c()))) &&
            ((this.descripcion_producto__c==null && other.getDescripcion_producto__c()==null) || 
             (this.descripcion_producto__c!=null &&
              this.descripcion_producto__c.equals(other.getDescripcion_producto__c()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.detenido_desde_custom__c==null && other.getDetenido_desde_custom__c()==null) || 
             (this.detenido_desde_custom__c!=null &&
              this.detenido_desde_custom__c.equals(other.getDetenido_desde_custom__c()))) &&
            ((this.digitos_de_bodega__c==null && other.getDigitos_de_bodega__c()==null) || 
             (this.digitos_de_bodega__c!=null &&
              this.digitos_de_bodega__c.equals(other.getDigitos_de_bodega__c()))) &&
            ((this.direccion__c==null && other.getDireccion__c()==null) || 
             (this.direccion__c!=null &&
              this.direccion__c.equals(other.getDireccion__c()))) &&
            ((this.emailMessages==null && other.getEmailMessages()==null) || 
             (this.emailMessages!=null &&
              this.emailMessages.equals(other.getEmailMessages()))) &&
            ((this.entitlement==null && other.getEntitlement()==null) || 
             (this.entitlement!=null &&
              this.entitlement.equals(other.getEntitlement()))) &&
            ((this.entitlementId==null && other.getEntitlementId()==null) || 
             (this.entitlementId!=null &&
              this.entitlementId.equals(other.getEntitlementId()))) &&
            ((this.enviado_a_PROFECO__c==null && other.getEnviado_a_PROFECO__c()==null) || 
             (this.enviado_a_PROFECO__c!=null &&
              this.enviado_a_PROFECO__c.equals(other.getEnviado_a_PROFECO__c()))) &&
            ((this.error_en_modificacion__c==null && other.getError_en_modificacion__c()==null) || 
             (this.error_en_modificacion__c!=null &&
              this.error_en_modificacion__c.equals(other.getError_en_modificacion__c()))) &&
            ((this.es_caja_completa__c==null && other.getEs_caja_completa__c()==null) || 
             (this.es_caja_completa__c!=null &&
              this.es_caja_completa__c.equals(other.getEs_caja_completa__c()))) &&
            ((this.estatus_Rep_Emp__c==null && other.getEstatus_Rep_Emp__c()==null) || 
             (this.estatus_Rep_Emp__c!=null &&
              this.estatus_Rep_Emp__c.equals(other.getEstatus_Rep_Emp__c()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              this.events.equals(other.getEvents()))) &&
            ((this.evidencia_Incidencia__c==null && other.getEvidencia_Incidencia__c()==null) || 
             (this.evidencia_Incidencia__c!=null &&
              this.evidencia_Incidencia__c.equals(other.getEvidencia_Incidencia__c()))) &&
            ((this.excepcion__c==null && other.getExcepcion__c()==null) || 
             (this.excepcion__c!=null &&
              this.excepcion__c.equals(other.getExcepcion__c()))) &&
            ((this.existencia__c==null && other.getExistencia__c()==null) || 
             (this.existencia__c!=null &&
              this.existencia__c.equals(other.getExistencia__c()))) &&
            ((this.FSC_Sustituto__c==null && other.getFSC_Sustituto__c()==null) || 
             (this.FSC_Sustituto__c!=null &&
              this.FSC_Sustituto__c.equals(other.getFSC_Sustituto__c()))) &&
            ((this.FS_Code__c==null && other.getFS_Code__c()==null) || 
             (this.FS_Code__c!=null &&
              this.FS_Code__c.equals(other.getFS_Code__c()))) &&
            ((this.fecha_Web__c==null && other.getFecha_Web__c()==null) || 
             (this.fecha_Web__c!=null &&
              this.fecha_Web__c.equals(other.getFecha_Web__c()))) &&
            ((this.fecha_de_Pago__c==null && other.getFecha_de_Pago__c()==null) || 
             (this.fecha_de_Pago__c!=null &&
              this.fecha_de_Pago__c.equals(other.getFecha_de_Pago__c()))) &&
            ((this.fecha_de_captura__c==null && other.getFecha_de_captura__c()==null) || 
             (this.fecha_de_captura__c!=null &&
              this.fecha_de_captura__c.equals(other.getFecha_de_captura__c()))) &&
            ((this.fecha_de_envio__c==null && other.getFecha_de_envio__c()==null) || 
             (this.fecha_de_envio__c!=null &&
              this.fecha_de_envio__c.equals(other.getFecha_de_envio__c()))) &&
            ((this.fecha_de_facturacion__c==null && other.getFecha_de_facturacion__c()==null) || 
             (this.fecha_de_facturacion__c!=null &&
              this.fecha_de_facturacion__c.equals(other.getFecha_de_facturacion__c()))) &&
            ((this.fecha_de_ingreso__c==null && other.getFecha_de_ingreso__c()==null) || 
             (this.fecha_de_ingreso__c!=null &&
              this.fecha_de_ingreso__c.equals(other.getFecha_de_ingreso__c()))) &&
            ((this.fecha_de_ingreso_al_sistema__c==null && other.getFecha_de_ingreso_al_sistema__c()==null) || 
             (this.fecha_de_ingreso_al_sistema__c!=null &&
              this.fecha_de_ingreso_al_sistema__c.equals(other.getFecha_de_ingreso_al_sistema__c()))) &&
            ((this.fecha_de_ingreso_de_la_orden__c==null && other.getFecha_de_ingreso_de_la_orden__c()==null) || 
             (this.fecha_de_ingreso_de_la_orden__c!=null &&
              this.fecha_de_ingreso_de_la_orden__c.equals(other.getFecha_de_ingreso_de_la_orden__c()))) &&
            ((this.fecha_de_ingreso_del_pedido__c==null && other.getFecha_de_ingreso_del_pedido__c()==null) || 
             (this.fecha_de_ingreso_del_pedido__c!=null &&
              this.fecha_de_ingreso_del_pedido__c.equals(other.getFecha_de_ingreso_del_pedido__c()))) &&
            ((this.fecha_de_registro__c==null && other.getFecha_de_registro__c()==null) || 
             (this.fecha_de_registro__c!=null &&
              this.fecha_de_registro__c.equals(other.getFecha_de_registro__c()))) &&
            ((this.fecha_recompra__c==null && other.getFecha_recompra__c()==null) || 
             (this.fecha_recompra__c!=null &&
              this.fecha_recompra__c.equals(other.getFecha_recompra__c()))) &&
            ((this.feedSubscriptionsForEntity==null && other.getFeedSubscriptionsForEntity()==null) || 
             (this.feedSubscriptionsForEntity!=null &&
              this.feedSubscriptionsForEntity.equals(other.getFeedSubscriptionsForEntity()))) &&
            ((this.feeds==null && other.getFeeds()==null) || 
             (this.feeds!=null &&
              this.feeds.equals(other.getFeeds()))) &&
            ((this.folio_Sistema_Externo__c==null && other.getFolio_Sistema_Externo__c()==null) || 
             (this.folio_Sistema_Externo__c!=null &&
              this.folio_Sistema_Externo__c.equals(other.getFolio_Sistema_Externo__c()))) &&
            ((this.folleto__c==null && other.getFolleto__c()==null) || 
             (this.folleto__c!=null &&
              this.folleto__c.equals(other.getFolleto__c()))) &&
            ((this.hay_solucion__c==null && other.getHay_solucion__c()==null) || 
             (this.hay_solucion__c!=null &&
              this.hay_solucion__c.equals(other.getHay_solucion__c()))) &&
            ((this.histories==null && other.getHistories()==null) || 
             (this.histories!=null &&
              this.histories.equals(other.getHistories()))) &&
            ((this.importe__c==null && other.getImporte__c()==null) || 
             (this.importe__c!=null &&
              this.importe__c.equals(other.getImporte__c()))) &&
            ((this.importe_facturacion__c==null && other.getImporte_facturacion__c()==null) || 
             (this.importe_facturacion__c!=null &&
              this.importe_facturacion__c.equals(other.getImporte_facturacion__c()))) &&
            ((this.importe_pago__c==null && other.getImporte_pago__c()==null) || 
             (this.importe_pago__c!=null &&
              this.importe_pago__c.equals(other.getImporte_pago__c()))) &&
            ((this.importe_transaccion__c==null && other.getImporte_transaccion__c()==null) || 
             (this.importe_transaccion__c!=null &&
              this.importe_transaccion__c.equals(other.getImporte_transaccion__c()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isClosedOnCreate==null && other.getIsClosedOnCreate()==null) || 
             (this.isClosedOnCreate!=null &&
              this.isClosedOnCreate.equals(other.getIsClosedOnCreate()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isEscalated==null && other.getIsEscalated()==null) || 
             (this.isEscalated!=null &&
              this.isEscalated.equals(other.getIsEscalated()))) &&
            ((this.isStopped==null && other.getIsStopped()==null) || 
             (this.isStopped!=null &&
              this.isStopped.equals(other.getIsStopped()))) &&
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
            ((this.liveChatTranscripts==null && other.getLiveChatTranscripts()==null) || 
             (this.liveChatTranscripts!=null &&
              this.liveChatTranscripts.equals(other.getLiveChatTranscripts()))) &&
            ((this.lookedUpFromActivities==null && other.getLookedUpFromActivities()==null) || 
             (this.lookedUpFromActivities!=null &&
              this.lookedUpFromActivities.equals(other.getLookedUpFromActivities()))) &&
            ((this.medio_de_pago__c==null && other.getMedio_de_pago__c()==null) || 
             (this.medio_de_pago__c!=null &&
              this.medio_de_pago__c.equals(other.getMedio_de_pago__c()))) &&
            ((this.milestoneStatus==null && other.getMilestoneStatus()==null) || 
             (this.milestoneStatus!=null &&
              this.milestoneStatus.equals(other.getMilestoneStatus()))) &&
            ((this.monto_Estimado_de_la_orden__c==null && other.getMonto_Estimado_de_la_orden__c()==null) || 
             (this.monto_Estimado_de_la_orden__c!=null &&
              this.monto_Estimado_de_la_orden__c.equals(other.getMonto_Estimado_de_la_orden__c()))) &&
            ((this.monto__c==null && other.getMonto__c()==null) || 
             (this.monto__c!=null &&
              this.monto__c.equals(other.getMonto__c()))) &&
            ((this.motivo_condonacion__c==null && other.getMotivo_condonacion__c()==null) || 
             (this.motivo_condonacion__c!=null &&
              this.motivo_condonacion__c.equals(other.getMotivo_condonacion__c()))) &&
            ((this.motivo_de_Cancelaci_n__c==null && other.getMotivo_de_Cancelaci_n__c()==null) || 
             (this.motivo_de_Cancelaci_n__c!=null &&
              this.motivo_de_Cancelaci_n__c.equals(other.getMotivo_de_Cancelaci_n__c()))) &&
            ((this.n_mero_de_Orden_Web_o_IVR__c==null && other.getN_mero_de_Orden_Web_o_IVR__c()==null) || 
             (this.n_mero_de_Orden_Web_o_IVR__c!=null &&
              this.n_mero_de_Orden_Web_o_IVR__c.equals(other.getN_mero_de_Orden_Web_o_IVR__c()))) &&
            ((this.no_Clave_modificacion__c==null && other.getNo_Clave_modificacion__c()==null) || 
             (this.no_Clave_modificacion__c!=null &&
              this.no_Clave_modificacion__c.equals(other.getNo_Clave_modificacion__c()))) &&
            ((this.nombre__c==null && other.getNombre__c()==null) || 
             (this.nombre__c!=null &&
              this.nombre__c.equals(other.getNombre__c()))) &&
            ((this.numero_de_confirmacion_de_la_orden__c==null && other.getNumero_de_confirmacion_de_la_orden__c()==null) || 
             (this.numero_de_confirmacion_de_la_orden__c!=null &&
              this.numero_de_confirmacion_de_la_orden__c.equals(other.getNumero_de_confirmacion_de_la_orden__c()))) &&
            ((this.numero_de_folio__c==null && other.getNumero_de_folio__c()==null) || 
             (this.numero_de_folio__c!=null &&
              this.numero_de_folio__c.equals(other.getNumero_de_folio__c()))) &&
            ((this.numero_de_linea__c==null && other.getNumero_de_linea__c()==null) || 
             (this.numero_de_linea__c!=null &&
              this.numero_de_linea__c.equals(other.getNumero_de_linea__c()))) &&
            ((this.numero_de_monedero__c==null && other.getNumero_de_monedero__c()==null) || 
             (this.numero_de_monedero__c!=null &&
              this.numero_de_monedero__c.equals(other.getNumero_de_monedero__c()))) &&
            ((this.numero_de_orden__c==null && other.getNumero_de_orden__c()==null) || 
             (this.numero_de_orden__c!=null &&
              this.numero_de_orden__c.equals(other.getNumero_de_orden__c()))) &&
            ((this.numero_de_pago__c==null && other.getNumero_de_pago__c()==null) || 
             (this.numero_de_pago__c!=null &&
              this.numero_de_pago__c.equals(other.getNumero_de_pago__c()))) &&
            ((this.numero_de_siniestro__c==null && other.getNumero_de_siniestro__c()==null) || 
             (this.numero_de_siniestro__c!=null &&
              this.numero_de_siniestro__c.equals(other.getNumero_de_siniestro__c()))) &&
            ((this.numero_de_tarjeta__c==null && other.getNumero_de_tarjeta__c()==null) || 
             (this.numero_de_tarjeta__c!=null &&
              this.numero_de_tarjeta__c.equals(other.getNumero_de_tarjeta__c()))) &&
            ((this.numero_referencia_del_pago__c==null && other.getNumero_referencia_del_pago__c()==null) || 
             (this.numero_referencia_del_pago__c!=null &&
              this.numero_referencia_del_pago__c.equals(other.getNumero_referencia_del_pago__c()))) &&
            ((this.openActivities==null && other.getOpenActivities()==null) || 
             (this.openActivities!=null &&
              this.openActivities.equals(other.getOpenActivities()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.paso__c==null && other.getPaso__c()==null) || 
             (this.paso__c!=null &&
              this.paso__c.equals(other.getPaso__c()))) &&
            ((this.porcentaje_de_cr_dito__c==null && other.getPorcentaje_de_cr_dito__c()==null) || 
             (this.porcentaje_de_cr_dito__c!=null &&
              this.porcentaje_de_cr_dito__c.equals(other.getPorcentaje_de_cr_dito__c()))) &&
            ((this.posts==null && other.getPosts()==null) || 
             (this.posts!=null &&
              this.posts.equals(other.getPosts()))) &&
            ((this.premio_grande__c==null && other.getPremio_grande__c()==null) || 
             (this.premio_grande__c!=null &&
              this.premio_grande__c.equals(other.getPremio_grande__c()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.procede__c==null && other.getProcede__c()==null) || 
             (this.procede__c!=null &&
              this.procede__c.equals(other.getProcede__c()))) &&
            ((this.processInstances==null && other.getProcessInstances()==null) || 
             (this.processInstances!=null &&
              this.processInstances.equals(other.getProcessInstances()))) &&
            ((this.processSteps==null && other.getProcessSteps()==null) || 
             (this.processSteps!=null &&
              this.processSteps.equals(other.getProcessSteps()))) &&
            ((this.programa2__c==null && other.getPrograma2__c()==null) || 
             (this.programa2__c!=null &&
              this.programa2__c.equals(other.getPrograma2__c()))) &&
            ((this.programa2__r==null && other.getPrograma2__r()==null) || 
             (this.programa2__r!=null &&
              this.programa2__r.equals(other.getPrograma2__r()))) &&
            ((this.programa__c==null && other.getPrograma__c()==null) || 
             (this.programa__c!=null &&
              this.programa__c.equals(other.getPrograma__c()))) &&
            ((this.razon_No_Procede__c==null && other.getRazon_No_Procede__c()==null) || 
             (this.razon_No_Procede__c!=null &&
              this.razon_No_Procede__c.equals(other.getRazon_No_Procede__c()))) &&
            ((this.razon_Procede__c==null && other.getRazon_Procede__c()==null) || 
             (this.razon_Procede__c!=null &&
              this.razon_Procede__c.equals(other.getRazon_Procede__c()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.recordAssociatedGroups==null && other.getRecordAssociatedGroups()==null) || 
             (this.recordAssociatedGroups!=null &&
              this.recordAssociatedGroups.equals(other.getRecordAssociatedGroups()))) &&
            ((this.recordType==null && other.getRecordType()==null) || 
             (this.recordType!=null &&
              this.recordType.equals(other.getRecordType()))) &&
            ((this.recordTypeId==null && other.getRecordTypeId()==null) || 
             (this.recordTypeId!=null &&
              this.recordTypeId.equals(other.getRecordTypeId()))) &&
            ((this.red__c==null && other.getRed__c()==null) || 
             (this.red__c!=null &&
              this.red__c.equals(other.getRed__c()))) &&
            ((this.region__c==null && other.getRegion__c()==null) || 
             (this.region__c!=null &&
              this.region__c.equals(other.getRegion__c()))) &&
            ((this.registro_Destino__c==null && other.getRegistro_Destino__c()==null) || 
             (this.registro_Destino__c!=null &&
              this.registro_Destino__c.equals(other.getRegistro_Destino__c()))) &&
            ((this.registro_Destino__r==null && other.getRegistro_Destino__r()==null) || 
             (this.registro_Destino__r!=null &&
              this.registro_Destino__r.equals(other.getRegistro_Destino__r()))) &&
            ((this.registro_Origen__c==null && other.getRegistro_Origen__c()==null) || 
             (this.registro_Origen__c!=null &&
              this.registro_Origen__c.equals(other.getRegistro_Origen__c()))) &&
            ((this.registro_Origen__r==null && other.getRegistro_Origen__r()==null) || 
             (this.registro_Origen__r!=null &&
              this.registro_Origen__r.equals(other.getRegistro_Origen__r()))) &&
            ((this.registro_Web__c==null && other.getRegistro_Web__c()==null) || 
             (this.registro_Web__c!=null &&
              this.registro_Web__c.equals(other.getRegistro_Web__c()))) &&
            ((this.registro__c==null && other.getRegistro__c()==null) || 
             (this.registro__c!=null &&
              this.registro__c.equals(other.getRegistro__c()))) &&
            ((this.reporte_Acompaniame__c==null && other.getReporte_Acompaniame__c()==null) || 
             (this.reporte_Acompaniame__c!=null &&
              this.reporte_Acompaniame__c.equals(other.getReporte_Acompaniame__c()))) &&
            ((this.reporte__c==null && other.getReporte__c()==null) || 
             (this.reporte__c!=null &&
              this.reporte__c.equals(other.getReporte__c()))) &&
            ((this.resoluci_n_Supervisor__c==null && other.getResoluci_n_Supervisor__c()==null) || 
             (this.resoluci_n_Supervisor__c!=null &&
              this.resoluci_n_Supervisor__c.equals(other.getResoluci_n_Supervisor__c()))) &&
            ((this.resolucion_incidencia__c==null && other.getResolucion_incidencia__c()==null) || 
             (this.resolucion_incidencia__c!=null &&
              this.resolucion_incidencia__c.equals(other.getResolucion_incidencia__c()))) &&
            ((this.respuesta_del_solicitante__c==null && other.getRespuesta_del_solicitante__c()==null) || 
             (this.respuesta_del_solicitante__c!=null &&
              this.respuesta_del_solicitante__c.equals(other.getRespuesta_del_solicitante__c()))) &&
            ((this.resultado_Incentivos_MX__c==null && other.getResultado_Incentivos_MX__c()==null) || 
             (this.resultado_Incentivos_MX__c!=null &&
              this.resultado_Incentivos_MX__c.equals(other.getResultado_Incentivos_MX__c()))) &&
            ((this.resultado__c==null && other.getResultado__c()==null) || 
             (this.resultado__c!=null &&
              this.resultado__c.equals(other.getResultado__c()))) &&
            ((this.SKU__c==null && other.getSKU__c()==null) || 
             (this.SKU__c!=null &&
              this.SKU__c.equals(other.getSKU__c()))) &&
            ((this.saldo_Digito__c==null && other.getSaldo_Digito__c()==null) || 
             (this.saldo_Digito__c!=null &&
              this.saldo_Digito__c.equals(other.getSaldo_Digito__c()))) &&
            ((this.shares==null && other.getShares()==null) || 
             (this.shares!=null &&
              this.shares.equals(other.getShares()))) &&
            ((this.slaExitDate==null && other.getSlaExitDate()==null) || 
             (this.slaExitDate!=null &&
              this.slaExitDate.equals(other.getSlaExitDate()))) &&
            ((this.slaStartDate==null && other.getSlaStartDate()==null) || 
             (this.slaStartDate!=null &&
              this.slaStartDate.equals(other.getSlaStartDate()))) &&
            ((this.solutions==null && other.getSolutions()==null) || 
             (this.solutions!=null &&
              this.solutions.equals(other.getSolutions()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.stopStartDate==null && other.getStopStartDate()==null) || 
             (this.stopStartDate!=null &&
              this.stopStartDate.equals(other.getStopStartDate()))) &&
            ((this.sub_Razon_Procede__c==null && other.getSub_Razon_Procede__c()==null) || 
             (this.sub_Razon_Procede__c!=null &&
              this.sub_Razon_Procede__c.equals(other.getSub_Razon_Procede__c()))) &&
            ((this.sub_Tipificacion__c==null && other.getSub_Tipificacion__c()==null) || 
             (this.sub_Tipificacion__c!=null &&
              this.sub_Tipificacion__c.equals(other.getSub_Tipificacion__c()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.suppliedCompany==null && other.getSuppliedCompany()==null) || 
             (this.suppliedCompany!=null &&
              this.suppliedCompany.equals(other.getSuppliedCompany()))) &&
            ((this.suppliedEmail==null && other.getSuppliedEmail()==null) || 
             (this.suppliedEmail!=null &&
              this.suppliedEmail.equals(other.getSuppliedEmail()))) &&
            ((this.suppliedName==null && other.getSuppliedName()==null) || 
             (this.suppliedName!=null &&
              this.suppliedName.equals(other.getSuppliedName()))) &&
            ((this.suppliedPhone==null && other.getSuppliedPhone()==null) || 
             (this.suppliedPhone!=null &&
              this.suppliedPhone.equals(other.getSuppliedPhone()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.tasks==null && other.getTasks()==null) || 
             (this.tasks!=null &&
              this.tasks.equals(other.getTasks()))) &&
            ((this.teamMembers==null && other.getTeamMembers()==null) || 
             (this.teamMembers!=null &&
              this.teamMembers.equals(other.getTeamMembers()))) &&
            ((this.teamTemplateRecords==null && other.getTeamTemplateRecords()==null) || 
             (this.teamTemplateRecords!=null &&
              this.teamTemplateRecords.equals(other.getTeamTemplateRecords()))) &&
            ((this.tel_fono_de_Casa__c==null && other.getTel_fono_de_Casa__c()==null) || 
             (this.tel_fono_de_Casa__c!=null &&
              this.tel_fono_de_Casa__c.equals(other.getTel_fono_de_Casa__c()))) &&
            ((this.tel_fono_de_Celular__c==null && other.getTel_fono_de_Celular__c()==null) || 
             (this.tel_fono_de_Celular__c!=null &&
              this.tel_fono_de_Celular__c.equals(other.getTel_fono_de_Celular__c()))) &&
            ((this.telefono__c==null && other.getTelefono__c()==null) || 
             (this.telefono__c!=null &&
              this.telefono__c.equals(other.getTelefono__c()))) &&
            ((this.tempOwnerId__c==null && other.getTempOwnerId__c()==null) || 
             (this.tempOwnerId__c!=null &&
              this.tempOwnerId__c.equals(other.getTempOwnerId__c()))) &&
            ((this.ticket_Remedy__c==null && other.getTicket_Remedy__c()==null) || 
             (this.ticket_Remedy__c!=null &&
              this.ticket_Remedy__c.equals(other.getTicket_Remedy__c()))) &&
            ((this.tipificacion__c==null && other.getTipificacion__c()==null) || 
             (this.tipificacion__c!=null &&
              this.tipificacion__c.equals(other.getTipificacion__c()))) &&
            ((this.tipo_Aclaracion__c==null && other.getTipo_Aclaracion__c()==null) || 
             (this.tipo_Aclaracion__c!=null &&
              this.tipo_Aclaracion__c.equals(other.getTipo_Aclaracion__c()))) &&
            ((this.tipo_Envio__c==null && other.getTipo_Envio__c()==null) || 
             (this.tipo_Envio__c!=null &&
              this.tipo_Envio__c.equals(other.getTipo_Envio__c()))) &&
            ((this.tipo_Faltante_Afectaci_n__c==null && other.getTipo_Faltante_Afectaci_n__c()==null) || 
             (this.tipo_Faltante_Afectaci_n__c!=null &&
              this.tipo_Faltante_Afectaci_n__c.equals(other.getTipo_Faltante_Afectaci_n__c()))) &&
            ((this.tipo_Informativo__c==null && other.getTipo_Informativo__c()==null) || 
             (this.tipo_Informativo__c!=null &&
              this.tipo_Informativo__c.equals(other.getTipo_Informativo__c()))) &&
            ((this.tipo_PFP__c==null && other.getTipo_PFP__c()==null) || 
             (this.tipo_PFP__c!=null &&
              this.tipo_PFP__c.equals(other.getTipo_PFP__c()))) &&
            ((this.tipo_actualizacion__c==null && other.getTipo_actualizacion__c()==null) || 
             (this.tipo_actualizacion__c!=null &&
              this.tipo_actualizacion__c.equals(other.getTipo_actualizacion__c()))) &&
            ((this.tipo_acumulado__c==null && other.getTipo_acumulado__c()==null) || 
             (this.tipo_acumulado__c!=null &&
              this.tipo_acumulado__c.equals(other.getTipo_acumulado__c()))) &&
            ((this.tipo_componente__c==null && other.getTipo_componente__c()==null) || 
             (this.tipo_componente__c!=null &&
              this.tipo_componente__c.equals(other.getTipo_componente__c()))) &&
            ((this.tipo_contacto__c==null && other.getTipo_contacto__c()==null) || 
             (this.tipo_contacto__c!=null &&
              this.tipo_contacto__c.equals(other.getTipo_contacto__c()))) &&
            ((this.tipo_de_asignaci_n__c==null && other.getTipo_de_asignaci_n__c()==null) || 
             (this.tipo_de_asignaci_n__c!=null &&
              this.tipo_de_asignaci_n__c.equals(other.getTipo_de_asignaci_n__c()))) &&
            ((this.tipo_de_bono_apoyo__c==null && other.getTipo_de_bono_apoyo__c()==null) || 
             (this.tipo_de_bono_apoyo__c!=null &&
              this.tipo_de_bono_apoyo__c.equals(other.getTipo_de_bono_apoyo__c()))) &&
            ((this.tipo_de_incentivo__c==null && other.getTipo_de_incentivo__c()==null) || 
             (this.tipo_de_incentivo__c!=null &&
              this.tipo_de_incentivo__c.equals(other.getTipo_de_incentivo__c()))) &&
            ((this.tipo_de_incidencia__c==null && other.getTipo_de_incidencia__c()==null) || 
             (this.tipo_de_incidencia__c!=null &&
              this.tipo_de_incidencia__c.equals(other.getTipo_de_incidencia__c()))) &&
            ((this.tipo_de_material__c==null && other.getTipo_de_material__c()==null) || 
             (this.tipo_de_material__c!=null &&
              this.tipo_de_material__c.equals(other.getTipo_de_material__c()))) &&
            ((this.tipo_de_pedido__c==null && other.getTipo_de_pedido__c()==null) || 
             (this.tipo_de_pedido__c!=null &&
              this.tipo_de_pedido__c.equals(other.getTipo_de_pedido__c()))) &&
            ((this.tipo_de_red__c==null && other.getTipo_de_red__c()==null) || 
             (this.tipo_de_red__c!=null &&
              this.tipo_de_red__c.equals(other.getTipo_de_red__c()))) &&
            ((this.tipo_de_reporte__c==null && other.getTipo_de_reporte__c()==null) || 
             (this.tipo_de_reporte__c!=null &&
              this.tipo_de_reporte__c.equals(other.getTipo_de_reporte__c()))) &&
            ((this.tipo_de_robo_extravio__c==null && other.getTipo_de_robo_extravio__c()==null) || 
             (this.tipo_de_robo_extravio__c!=null &&
              this.tipo_de_robo_extravio__c.equals(other.getTipo_de_robo_extravio__c()))) &&
            ((this.tipo_de_transferencia__c==null && other.getTipo_de_transferencia__c()==null) || 
             (this.tipo_de_transferencia__c!=null &&
              this.tipo_de_transferencia__c.equals(other.getTipo_de_transferencia__c()))) &&
            ((this.tipo_incidencia_monedero__c==null && other.getTipo_incidencia_monedero__c()==null) || 
             (this.tipo_incidencia_monedero__c!=null &&
              this.tipo_incidencia_monedero__c.equals(other.getTipo_incidencia_monedero__c()))) &&
            ((this.tipo_solicitante__c==null && other.getTipo_solicitante__c()==null) || 
             (this.tipo_solicitante__c!=null &&
              this.tipo_solicitante__c.equals(other.getTipo_solicitante__c()))) &&
            ((this.topicAssignments==null && other.getTopicAssignments()==null) || 
             (this.topicAssignments!=null &&
              this.topicAssignments.equals(other.getTopicAssignments()))) &&
            ((this.total_de_claves__c==null && other.getTotal_de_claves__c()==null) || 
             (this.total_de_claves__c!=null &&
              this.total_de_claves__c.equals(other.getTotal_de_claves__c()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.URL__c==null && other.getURL__c()==null) || 
             (this.URL__c!=null &&
              this.URL__c.equals(other.getURL__c()))) &&
            ((this.unidades_Faltantes__c==null && other.getUnidades_Faltantes__c()==null) || 
             (this.unidades_Faltantes__c!=null &&
              this.unidades_Faltantes__c.equals(other.getUnidades_Faltantes__c()))) &&
            ((this.unidades__c==null && other.getUnidades__c()==null) || 
             (this.unidades__c!=null &&
              this.unidades__c.equals(other.getUnidades__c()))) &&
            ((this.unidades_aclaradas__c==null && other.getUnidades_aclaradas__c()==null) || 
             (this.unidades_aclaradas__c!=null &&
              this.unidades_aclaradas__c.equals(other.getUnidades_aclaradas__c()))) &&
            ((this.userRecordAccess==null && other.getUserRecordAccess()==null) || 
             (this.userRecordAccess!=null &&
              this.userRecordAccess.equals(other.getUserRecordAccess()))) &&
            ((this.VEA__c==null && other.getVEA__c()==null) || 
             (this.VEA__c!=null &&
              this.VEA__c.equals(other.getVEA__c()))) &&
            ((this.zona_Destino__c==null && other.getZona_Destino__c()==null) || 
             (this.zona_Destino__c!=null &&
              this.zona_Destino__c.equals(other.getZona_Destino__c()))) &&
            ((this.zona__c==null && other.getZona__c()==null) || 
             (this.zona__c!=null &&
              this.zona__c.equals(other.getZona__c()))) &&
            ((this.zona_de_Envio__c==null && other.getZona_de_Envio__c()==null) || 
             (this.zona_de_Envio__c!=null &&
              this.zona_de_Envio__c.equals(other.getZona_de_Envio__c()))) &&
            ((this.area__c==null && other.getArea__c()==null) || 
             (this.area__c!=null &&
              this.area__c.equals(other.getArea__c())));
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountId() != null) {
            _hashCode += getAccountId().hashCode();
        }
        if (getAcepto_pago_en_efectivo__c() != null) {
            _hashCode += getAcepto_pago_en_efectivo__c().hashCode();
        }
        if (getAcepto_sustituto__c() != null) {
            _hashCode += getAcepto_sustituto__c().hashCode();
        }
        if (getActivityHistories() != null) {
            _hashCode += getActivityHistories().hashCode();
        }
        if (getAgencia_de_cobranza__c() != null) {
            _hashCode += getAgencia_de_cobranza__c().hashCode();
        }
        if (getApellido_Materno__c() != null) {
            _hashCode += getApellido_Materno__c().hashCode();
        }
        if (getApellido_Paterno__c() != null) {
            _hashCode += getApellido_Paterno__c().hashCode();
        }
        if (getAprobo_gerente_de_zona__c() != null) {
            _hashCode += getAprobo_gerente_de_zona__c().hashCode();
        }
        if (getAttachedContentDocuments() != null) {
            _hashCode += getAttachedContentDocuments().hashCode();
        }
        if (getAttachments() != null) {
            _hashCode += getAttachments().hashCode();
        }
        if (getAutoriza_acumulado__c() != null) {
            _hashCode += getAutoriza_acumulado__c().hashCode();
        }
        if (getAutorizador__c() != null) {
            _hashCode += getAutorizador__c().hashCode();
        }
        if (getBanco__c() != null) {
            _hashCode += getBanco__c().hashCode();
        }
        if (getBusinessHours() != null) {
            _hashCode += getBusinessHours().hashCode();
        }
        if (getBusinessHoursId() != null) {
            _hashCode += getBusinessHoursId().hashCode();
        }
        if (getCURP__c() != null) {
            _hashCode += getCURP__c().hashCode();
        }
        if (getCampa_a_de_aplicaci_n__c() != null) {
            _hashCode += getCampa_a_de_aplicaci_n__c().hashCode();
        }
        if (getCampana__c() != null) {
            _hashCode += getCampana__c().hashCode();
        }
        if (getCampania_Avon__c() != null) {
            _hashCode += getCampania_Avon__c().hashCode();
        }
        if (getCampania_Avon__r() != null) {
            _hashCode += getCampania_Avon__r().hashCode();
        }
        if (getCampania_de_envio__c() != null) {
            _hashCode += getCampania_de_envio__c().hashCode();
        }
        if (getCantidad__c() != null) {
            _hashCode += getCantidad__c().hashCode();
        }
        if (getCantidad_a_recibir__c() != null) {
            _hashCode += getCantidad_a_recibir__c().hashCode();
        }
        if (getCantidad_recibida__c() != null) {
            _hashCode += getCantidad_recibida__c().hashCode();
        }
        if (getCargo_por__c() != null) {
            _hashCode += getCargo_por__c().hashCode();
        }
        if (getCaseComments() != null) {
            _hashCode += getCaseComments().hashCode();
        }
        if (getCaseContactRoles() != null) {
            _hashCode += getCaseContactRoles().hashCode();
        }
        if (getCaseMilestones() != null) {
            _hashCode += getCaseMilestones().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getCaseSolutions() != null) {
            _hashCode += getCaseSolutions().hashCode();
        }
        if (getCases() != null) {
            _hashCode += getCases().hashCode();
        }
        if (getCategoria__c() != null) {
            _hashCode += getCategoria__c().hashCode();
        }
        if (getCausa_Ajuste__c() != null) {
            _hashCode += getCausa_Ajuste__c().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getCombinedAttachments() != null) {
            _hashCode += getCombinedAttachments().hashCode();
        }
        if (getCompletion_Date__c() != null) {
            _hashCode += getCompletion_Date__c().hashCode();
        }
        if (getConcepto__c() != null) {
            _hashCode += getConcepto__c().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getContactId() != null) {
            _hashCode += getContactId().hashCode();
        }
        if (getCorreo_Electr_nico__c() != null) {
            _hashCode += getCorreo_Electr_nico__c().hashCode();
        }
        if (getCorreo_Gerente_Divisional__c() != null) {
            _hashCode += getCorreo_Gerente_Divisional__c().hashCode();
        }
        if (getCorreo_Gerente_Regional__c() != null) {
            _hashCode += getCorreo_Gerente_Regional__c().hashCode();
        }
        if (getCorreo_Gerente_de_Zona__c() != null) {
            _hashCode += getCorreo_Gerente_de_Zona__c().hashCode();
        }
        if (getCorreo_electronico__c() != null) {
            _hashCode += getCorreo_electronico__c().hashCode();
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
        if (getDescripci_n_del_premio__c() != null) {
            _hashCode += getDescripci_n_del_premio__c().hashCode();
        }
        if (getDescripcion_del_pedido__c() != null) {
            _hashCode += getDescripcion_del_pedido__c().hashCode();
        }
        if (getDescripcion_producto__c() != null) {
            _hashCode += getDescripcion_producto__c().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDetenido_desde_custom__c() != null) {
            _hashCode += getDetenido_desde_custom__c().hashCode();
        }
        if (getDigitos_de_bodega__c() != null) {
            _hashCode += getDigitos_de_bodega__c().hashCode();
        }
        if (getDireccion__c() != null) {
            _hashCode += getDireccion__c().hashCode();
        }
        if (getEmailMessages() != null) {
            _hashCode += getEmailMessages().hashCode();
        }
        if (getEntitlement() != null) {
            _hashCode += getEntitlement().hashCode();
        }
        if (getEntitlementId() != null) {
            _hashCode += getEntitlementId().hashCode();
        }
        if (getEnviado_a_PROFECO__c() != null) {
            _hashCode += getEnviado_a_PROFECO__c().hashCode();
        }
        if (getError_en_modificacion__c() != null) {
            _hashCode += getError_en_modificacion__c().hashCode();
        }
        if (getEs_caja_completa__c() != null) {
            _hashCode += getEs_caja_completa__c().hashCode();
        }
        if (getEstatus_Rep_Emp__c() != null) {
            _hashCode += getEstatus_Rep_Emp__c().hashCode();
        }
        if (getEvents() != null) {
            _hashCode += getEvents().hashCode();
        }
        if (getEvidencia_Incidencia__c() != null) {
            _hashCode += getEvidencia_Incidencia__c().hashCode();
        }
        if (getExcepcion__c() != null) {
            _hashCode += getExcepcion__c().hashCode();
        }
        if (getExistencia__c() != null) {
            _hashCode += getExistencia__c().hashCode();
        }
        if (getFSC_Sustituto__c() != null) {
            _hashCode += getFSC_Sustituto__c().hashCode();
        }
        if (getFS_Code__c() != null) {
            _hashCode += getFS_Code__c().hashCode();
        }
        if (getFecha_Web__c() != null) {
            _hashCode += getFecha_Web__c().hashCode();
        }
        if (getFecha_de_Pago__c() != null) {
            _hashCode += getFecha_de_Pago__c().hashCode();
        }
        if (getFecha_de_captura__c() != null) {
            _hashCode += getFecha_de_captura__c().hashCode();
        }
        if (getFecha_de_envio__c() != null) {
            _hashCode += getFecha_de_envio__c().hashCode();
        }
        if (getFecha_de_facturacion__c() != null) {
            _hashCode += getFecha_de_facturacion__c().hashCode();
        }
        if (getFecha_de_ingreso__c() != null) {
            _hashCode += getFecha_de_ingreso__c().hashCode();
        }
        if (getFecha_de_ingreso_al_sistema__c() != null) {
            _hashCode += getFecha_de_ingreso_al_sistema__c().hashCode();
        }
        if (getFecha_de_ingreso_de_la_orden__c() != null) {
            _hashCode += getFecha_de_ingreso_de_la_orden__c().hashCode();
        }
        if (getFecha_de_ingreso_del_pedido__c() != null) {
            _hashCode += getFecha_de_ingreso_del_pedido__c().hashCode();
        }
        if (getFecha_de_registro__c() != null) {
            _hashCode += getFecha_de_registro__c().hashCode();
        }
        if (getFecha_recompra__c() != null) {
            _hashCode += getFecha_recompra__c().hashCode();
        }
        if (getFeedSubscriptionsForEntity() != null) {
            _hashCode += getFeedSubscriptionsForEntity().hashCode();
        }
        if (getFeeds() != null) {
            _hashCode += getFeeds().hashCode();
        }
        if (getFolio_Sistema_Externo__c() != null) {
            _hashCode += getFolio_Sistema_Externo__c().hashCode();
        }
        if (getFolleto__c() != null) {
            _hashCode += getFolleto__c().hashCode();
        }
        if (getHay_solucion__c() != null) {
            _hashCode += getHay_solucion__c().hashCode();
        }
        if (getHistories() != null) {
            _hashCode += getHistories().hashCode();
        }
        if (getImporte__c() != null) {
            _hashCode += getImporte__c().hashCode();
        }
        if (getImporte_facturacion__c() != null) {
            _hashCode += getImporte_facturacion__c().hashCode();
        }
        if (getImporte_pago__c() != null) {
            _hashCode += getImporte_pago__c().hashCode();
        }
        if (getImporte_transaccion__c() != null) {
            _hashCode += getImporte_transaccion__c().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsClosedOnCreate() != null) {
            _hashCode += getIsClosedOnCreate().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsEscalated() != null) {
            _hashCode += getIsEscalated().hashCode();
        }
        if (getIsStopped() != null) {
            _hashCode += getIsStopped().hashCode();
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
        if (getLiveChatTranscripts() != null) {
            _hashCode += getLiveChatTranscripts().hashCode();
        }
        if (getLookedUpFromActivities() != null) {
            _hashCode += getLookedUpFromActivities().hashCode();
        }
        if (getMedio_de_pago__c() != null) {
            _hashCode += getMedio_de_pago__c().hashCode();
        }
        if (getMilestoneStatus() != null) {
            _hashCode += getMilestoneStatus().hashCode();
        }
        if (getMonto_Estimado_de_la_orden__c() != null) {
            _hashCode += getMonto_Estimado_de_la_orden__c().hashCode();
        }
        if (getMonto__c() != null) {
            _hashCode += getMonto__c().hashCode();
        }
        if (getMotivo_condonacion__c() != null) {
            _hashCode += getMotivo_condonacion__c().hashCode();
        }
        if (getMotivo_de_Cancelaci_n__c() != null) {
            _hashCode += getMotivo_de_Cancelaci_n__c().hashCode();
        }
        if (getN_mero_de_Orden_Web_o_IVR__c() != null) {
            _hashCode += getN_mero_de_Orden_Web_o_IVR__c().hashCode();
        }
        if (getNo_Clave_modificacion__c() != null) {
            _hashCode += getNo_Clave_modificacion__c().hashCode();
        }
        if (getNombre__c() != null) {
            _hashCode += getNombre__c().hashCode();
        }
        if (getNumero_de_confirmacion_de_la_orden__c() != null) {
            _hashCode += getNumero_de_confirmacion_de_la_orden__c().hashCode();
        }
        if (getNumero_de_folio__c() != null) {
            _hashCode += getNumero_de_folio__c().hashCode();
        }
        if (getNumero_de_linea__c() != null) {
            _hashCode += getNumero_de_linea__c().hashCode();
        }
        if (getNumero_de_monedero__c() != null) {
            _hashCode += getNumero_de_monedero__c().hashCode();
        }
        if (getNumero_de_orden__c() != null) {
            _hashCode += getNumero_de_orden__c().hashCode();
        }
        if (getNumero_de_pago__c() != null) {
            _hashCode += getNumero_de_pago__c().hashCode();
        }
        if (getNumero_de_siniestro__c() != null) {
            _hashCode += getNumero_de_siniestro__c().hashCode();
        }
        if (getNumero_de_tarjeta__c() != null) {
            _hashCode += getNumero_de_tarjeta__c().hashCode();
        }
        if (getNumero_referencia_del_pago__c() != null) {
            _hashCode += getNumero_referencia_del_pago__c().hashCode();
        }
        if (getOpenActivities() != null) {
            _hashCode += getOpenActivities().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getPaso__c() != null) {
            _hashCode += getPaso__c().hashCode();
        }
        if (getPorcentaje_de_cr_dito__c() != null) {
            _hashCode += getPorcentaje_de_cr_dito__c().hashCode();
        }
        if (getPosts() != null) {
            _hashCode += getPosts().hashCode();
        }
        if (getPremio_grande__c() != null) {
            _hashCode += getPremio_grande__c().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProcede__c() != null) {
            _hashCode += getProcede__c().hashCode();
        }
        if (getProcessInstances() != null) {
            _hashCode += getProcessInstances().hashCode();
        }
        if (getProcessSteps() != null) {
            _hashCode += getProcessSteps().hashCode();
        }
        if (getPrograma2__c() != null) {
            _hashCode += getPrograma2__c().hashCode();
        }
        if (getPrograma2__r() != null) {
            _hashCode += getPrograma2__r().hashCode();
        }
        if (getPrograma__c() != null) {
            _hashCode += getPrograma__c().hashCode();
        }
        if (getRazon_No_Procede__c() != null) {
            _hashCode += getRazon_No_Procede__c().hashCode();
        }
        if (getRazon_Procede__c() != null) {
            _hashCode += getRazon_Procede__c().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
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
        if (getRed__c() != null) {
            _hashCode += getRed__c().hashCode();
        }
        if (getRegion__c() != null) {
            _hashCode += getRegion__c().hashCode();
        }
        if (getRegistro_Destino__c() != null) {
            _hashCode += getRegistro_Destino__c().hashCode();
        }
        if (getRegistro_Destino__r() != null) {
            _hashCode += getRegistro_Destino__r().hashCode();
        }
        if (getRegistro_Origen__c() != null) {
            _hashCode += getRegistro_Origen__c().hashCode();
        }
        if (getRegistro_Origen__r() != null) {
            _hashCode += getRegistro_Origen__r().hashCode();
        }
        if (getRegistro_Web__c() != null) {
            _hashCode += getRegistro_Web__c().hashCode();
        }
        if (getRegistro__c() != null) {
            _hashCode += getRegistro__c().hashCode();
        }
        if (getReporte_Acompaniame__c() != null) {
            _hashCode += getReporte_Acompaniame__c().hashCode();
        }
        if (getReporte__c() != null) {
            _hashCode += getReporte__c().hashCode();
        }
        if (getResoluci_n_Supervisor__c() != null) {
            _hashCode += getResoluci_n_Supervisor__c().hashCode();
        }
        if (getResolucion_incidencia__c() != null) {
            _hashCode += getResolucion_incidencia__c().hashCode();
        }
        if (getRespuesta_del_solicitante__c() != null) {
            _hashCode += getRespuesta_del_solicitante__c().hashCode();
        }
        if (getResultado_Incentivos_MX__c() != null) {
            _hashCode += getResultado_Incentivos_MX__c().hashCode();
        }
        if (getResultado__c() != null) {
            _hashCode += getResultado__c().hashCode();
        }
        if (getSKU__c() != null) {
            _hashCode += getSKU__c().hashCode();
        }
        if (getSaldo_Digito__c() != null) {
            _hashCode += getSaldo_Digito__c().hashCode();
        }
        if (getShares() != null) {
            _hashCode += getShares().hashCode();
        }
        if (getSlaExitDate() != null) {
            _hashCode += getSlaExitDate().hashCode();
        }
        if (getSlaStartDate() != null) {
            _hashCode += getSlaStartDate().hashCode();
        }
        if (getSolutions() != null) {
            _hashCode += getSolutions().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStopStartDate() != null) {
            _hashCode += getStopStartDate().hashCode();
        }
        if (getSub_Razon_Procede__c() != null) {
            _hashCode += getSub_Razon_Procede__c().hashCode();
        }
        if (getSub_Tipificacion__c() != null) {
            _hashCode += getSub_Tipificacion__c().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getSuppliedCompany() != null) {
            _hashCode += getSuppliedCompany().hashCode();
        }
        if (getSuppliedEmail() != null) {
            _hashCode += getSuppliedEmail().hashCode();
        }
        if (getSuppliedName() != null) {
            _hashCode += getSuppliedName().hashCode();
        }
        if (getSuppliedPhone() != null) {
            _hashCode += getSuppliedPhone().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTasks() != null) {
            _hashCode += getTasks().hashCode();
        }
        if (getTeamMembers() != null) {
            _hashCode += getTeamMembers().hashCode();
        }
        if (getTeamTemplateRecords() != null) {
            _hashCode += getTeamTemplateRecords().hashCode();
        }
        if (getTel_fono_de_Casa__c() != null) {
            _hashCode += getTel_fono_de_Casa__c().hashCode();
        }
        if (getTel_fono_de_Celular__c() != null) {
            _hashCode += getTel_fono_de_Celular__c().hashCode();
        }
        if (getTelefono__c() != null) {
            _hashCode += getTelefono__c().hashCode();
        }
        if (getTempOwnerId__c() != null) {
            _hashCode += getTempOwnerId__c().hashCode();
        }
        if (getTicket_Remedy__c() != null) {
            _hashCode += getTicket_Remedy__c().hashCode();
        }
        if (getTipificacion__c() != null) {
            _hashCode += getTipificacion__c().hashCode();
        }
        if (getTipo_Aclaracion__c() != null) {
            _hashCode += getTipo_Aclaracion__c().hashCode();
        }
        if (getTipo_Envio__c() != null) {
            _hashCode += getTipo_Envio__c().hashCode();
        }
        if (getTipo_Faltante_Afectaci_n__c() != null) {
            _hashCode += getTipo_Faltante_Afectaci_n__c().hashCode();
        }
        if (getTipo_Informativo__c() != null) {
            _hashCode += getTipo_Informativo__c().hashCode();
        }
        if (getTipo_PFP__c() != null) {
            _hashCode += getTipo_PFP__c().hashCode();
        }
        if (getTipo_actualizacion__c() != null) {
            _hashCode += getTipo_actualizacion__c().hashCode();
        }
        if (getTipo_acumulado__c() != null) {
            _hashCode += getTipo_acumulado__c().hashCode();
        }
        if (getTipo_componente__c() != null) {
            _hashCode += getTipo_componente__c().hashCode();
        }
        if (getTipo_contacto__c() != null) {
            _hashCode += getTipo_contacto__c().hashCode();
        }
        if (getTipo_de_asignaci_n__c() != null) {
            _hashCode += getTipo_de_asignaci_n__c().hashCode();
        }
        if (getTipo_de_bono_apoyo__c() != null) {
            _hashCode += getTipo_de_bono_apoyo__c().hashCode();
        }
        if (getTipo_de_incentivo__c() != null) {
            _hashCode += getTipo_de_incentivo__c().hashCode();
        }
        if (getTipo_de_incidencia__c() != null) {
            _hashCode += getTipo_de_incidencia__c().hashCode();
        }
        if (getTipo_de_material__c() != null) {
            _hashCode += getTipo_de_material__c().hashCode();
        }
        if (getTipo_de_pedido__c() != null) {
            _hashCode += getTipo_de_pedido__c().hashCode();
        }
        if (getTipo_de_red__c() != null) {
            _hashCode += getTipo_de_red__c().hashCode();
        }
        if (getTipo_de_reporte__c() != null) {
            _hashCode += getTipo_de_reporte__c().hashCode();
        }
        if (getTipo_de_robo_extravio__c() != null) {
            _hashCode += getTipo_de_robo_extravio__c().hashCode();
        }
        if (getTipo_de_transferencia__c() != null) {
            _hashCode += getTipo_de_transferencia__c().hashCode();
        }
        if (getTipo_incidencia_monedero__c() != null) {
            _hashCode += getTipo_incidencia_monedero__c().hashCode();
        }
        if (getTipo_solicitante__c() != null) {
            _hashCode += getTipo_solicitante__c().hashCode();
        }
        if (getTopicAssignments() != null) {
            _hashCode += getTopicAssignments().hashCode();
        }
        if (getTotal_de_claves__c() != null) {
            _hashCode += getTotal_de_claves__c().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getURL__c() != null) {
            _hashCode += getURL__c().hashCode();
        }
        if (getUnidades_Faltantes__c() != null) {
            _hashCode += getUnidades_Faltantes__c().hashCode();
        }
        if (getUnidades__c() != null) {
            _hashCode += getUnidades__c().hashCode();
        }
        if (getUnidades_aclaradas__c() != null) {
            _hashCode += getUnidades_aclaradas__c().hashCode();
        }
        if (getUserRecordAccess() != null) {
            _hashCode += getUserRecordAccess().hashCode();
        }
        if (getVEA__c() != null) {
            _hashCode += getVEA__c().hashCode();
        }
        if (getZona_Destino__c() != null) {
            _hashCode += getZona_Destino__c().hashCode();
        }
        if (getZona__c() != null) {
            _hashCode += getZona__c().hashCode();
        }
        if (getZona_de_Envio__c() != null) {
            _hashCode += getZona_de_Envio__c().hashCode();
        }
        if (getArea__c() != null) {
            _hashCode += getArea__c().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(_case.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account"));
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
        elemField.setFieldName("acepto_pago_en_efectivo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Acepto_pago_en_efectivo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acepto_sustituto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Acepto_sustituto__c"));
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
        elemField.setFieldName("agencia_de_cobranza__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Agencia_de_cobranza__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido_Materno__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Apellido_Materno__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellido_Paterno__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Apellido_Paterno__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aprobo_gerente_de_zona__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Aprobo_gerente_de_zona__c"));
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
        elemField.setFieldName("autoriza_acumulado__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Autoriza_acumulado__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorizador__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Autorizador__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banco__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Banco__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessHoursId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHoursId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CURP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CURP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campa_a_de_aplicaci_n__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campa_a_de_aplicaci_n__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campana__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campana__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campania_Avon__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_Avon__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campania_Avon__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_Avon__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_Avon__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campania_de_envio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_de_envio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cantidad__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad_a_recibir__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cantidad_a_recibir__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantidad_recibida__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cantidad_recibida__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo_por__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Cargo_por__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseComments"));
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
        elemField.setFieldName("caseMilestones");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseMilestones"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseSolutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseSolutions"));
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
        elemField.setFieldName("categoria__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Categoria__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("causa_Ajuste__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Causa_Ajuste__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("completion_Date__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Completion_Date__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("concepto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Concepto__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo_Electr_nico__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correo_Electr_nico__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo_Gerente_Divisional__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correo_Gerente_Divisional__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo_Gerente_Regional__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correo_Gerente_Regional__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo_Gerente_de_Zona__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correo_Gerente_de_Zona__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo_electronico__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Correo_electronico__c"));
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
        elemField.setFieldName("descripci_n_del_premio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Descripci_n_del_premio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion_del_pedido__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Descripcion_del_pedido__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion_producto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Descripcion_producto__c"));
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
        elemField.setFieldName("detenido_desde_custom__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Detenido_desde_custom__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digitos_de_bodega__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Digitos_de_bodega__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Direccion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Entitlement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Entitlement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitlementId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntitlementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enviado_a_PROFECO__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Enviado_a_PROFECO__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error_en_modificacion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Error_en_modificacion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("es_caja_completa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Es_caja_completa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatus_Rep_Emp__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estatus_Rep_Emp__c"));
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
        elemField.setFieldName("evidencia_Incidencia__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Evidencia_Incidencia__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excepcion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Excepcion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existencia__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Existencia__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FSC_Sustituto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FSC_Sustituto__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FS_Code__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FS_Code__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_Web__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_Web__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_Pago__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_Pago__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_captura__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_captura__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_envio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_envio__c"));
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
        elemField.setFieldName("fecha_de_ingreso__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_ingreso__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_ingreso_al_sistema__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_ingreso_al_sistema__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_ingreso_de_la_orden__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_ingreso_de_la_orden__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_ingreso_del_pedido__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_ingreso_del_pedido__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_de_registro__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_de_registro__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha_recompra__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Fecha_recompra__c"));
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
        elemField.setFieldName("folio_Sistema_Externo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Folio_Sistema_Externo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folleto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Folleto__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hay_solucion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Hay_solucion__c"));
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
        elemField.setFieldName("importe__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Importe__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importe_facturacion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Importe_facturacion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importe_pago__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Importe_pago__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importe_transaccion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Importe_transaccion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosedOnCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsClosedOnCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("isEscalated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsEscalated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isStopped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsStopped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("medio_de_pago__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Medio_de_pago__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("milestoneStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MilestoneStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto_Estimado_de_la_orden__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Monto_Estimado_de_la_orden__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Monto__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo_condonacion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Motivo_condonacion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo_de_Cancelaci_n__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Motivo_de_Cancelaci_n__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("n_mero_de_Orden_Web_o_IVR__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "N_mero_de_Orden_Web_o_IVR__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_Clave_modificacion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "No_Clave_modificacion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Nombre__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_de_confirmacion_de_la_orden__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_confirmacion_de_la_orden__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_de_folio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_folio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("numero_de_monedero__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_monedero__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_de_orden__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_orden__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_de_pago__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_pago__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_de_siniestro__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_siniestro__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_de_tarjeta__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_de_tarjeta__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero_referencia_del_pago__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Numero_referencia_del_pago__c"));
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
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ParentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paso__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Paso__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentaje_de_cr_dito__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Porcentaje_de_cr_dito__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("premio_grande__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Premio_grande__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procede__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Procede__c"));
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
        elemField.setFieldName("programa2__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Programa2__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programa2__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Programa2__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Programa__c"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Programa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razon_No_Procede__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Razon_No_Procede__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razon_Procede__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Razon_Procede__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reason"));
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
        elemField.setFieldName("red__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Red__c"));
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
        elemField.setFieldName("registro_Destino__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Registro_Destino__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro_Destino__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Registro_Destino__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro_Origen__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Registro_Origen__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro_Origen__r");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Registro_Origen__r"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("registro_Web__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Registro_Web__c"));
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
        elemField.setFieldName("reporte_Acompaniame__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reporte_Acompaniame__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reporte__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Reporte__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resoluci_n_Supervisor__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Resoluci_n_Supervisor__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolucion_incidencia__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Resolucion_incidencia__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuesta_del_solicitante__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Respuesta_del_solicitante__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado_Incentivos_MX__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Resultado_Incentivos_MX__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultado__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Resultado__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SKU__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SKU__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldo_Digito__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Saldo_Digito__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("slaExitDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SlaExitDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slaStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SlaStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StopStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub_Razon_Procede__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sub_Razon_Procede__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub_Tipificacion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Sub_Tipificacion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppliedCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SuppliedCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppliedEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SuppliedEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppliedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SuppliedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppliedPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SuppliedPhone"));
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
        elemField.setFieldName("teamMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TeamMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("teamTemplateRecords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TeamTemplateRecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tel_fono_de_Casa__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tel_fono_de_Casa__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tel_fono_de_Celular__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tel_fono_de_Celular__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Telefono__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tempOwnerId__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TempOwnerId__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticket_Remedy__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Ticket_Remedy__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipificacion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipificacion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_Aclaracion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_Aclaracion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_Envio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_Envio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_Faltante_Afectaci_n__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_Faltante_Afectaci_n__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_Informativo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_Informativo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_PFP__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_PFP__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_actualizacion__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_actualizacion__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_acumulado__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_acumulado__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_componente__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_componente__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_contacto__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_contacto__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_asignaci_n__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_asignaci_n__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_bono_apoyo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_bono_apoyo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_incentivo__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_incentivo__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_incidencia__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_incidencia__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_material__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_material__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_pedido__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_pedido__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_red__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_red__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_reporte__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_reporte__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_robo_extravio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_robo_extravio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_de_transferencia__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_de_transferencia__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_incidencia_monedero__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_incidencia_monedero__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo_solicitante__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Tipo_solicitante__c"));
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
        elemField.setFieldName("total_de_claves__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Total_de_claves__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "URL__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidades_Faltantes__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unidades_Faltantes__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidades__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unidades__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidades_aclaradas__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Unidades_aclaradas__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("VEA__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VEA__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zona_Destino__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zona_Destino__c"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zona_de_Envio__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Zona_de_Envio__c"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("area__c");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "area__c"));
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
