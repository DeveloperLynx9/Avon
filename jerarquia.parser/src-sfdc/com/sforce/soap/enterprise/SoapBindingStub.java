/**
 * SoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise;

public class SoapBindingStub extends org.apache.axis.client.Stub implements com.sforce.soap.enterprise.Soap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[54];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">login"), com.sforce.soap.enterprise.Login.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">loginResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.LoginResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "loginResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault"),
                      "com.sforce.soap.enterprise.fault.LoginFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObject");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSObject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObject"), com.sforce.soap.enterprise.DescribeSObject.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSObjectResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSObjectResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObjects");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSObjects"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjects"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSObjectResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSObjectsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeGlobal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeGlobal"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobal"), com.sforce.soap.enterprise.DescribeGlobal.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobalResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeGlobalResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeGlobalResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeDataCategoryGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeDataCategoryGroups"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroups"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeDataCategoryGroupsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeDataCategoryGroupStructures");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeDataCategoryGroupStructures"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupStructures"), com.sforce.soap.enterprise.DescribeDataCategoryGroupStructures.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupStructuresResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeDataCategoryGroupStructuresResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeKnowledgeSettings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeKnowledgeSettings"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeKnowledgeSettings"), com.sforce.soap.enterprise.DescribeKnowledgeSettings.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeKnowledgeSettingsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeKnowledgeSettingsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeKnowledgeSettingsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeFlexiPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeFlexiPages"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeFlexiPages"), com.sforce.soap.enterprise.DescribeFlexiPages.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeFlexiPagesResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeFlexiPageResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeFlexiPagesResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeAppMenu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeAppMenu"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAppMenu"), com.sforce.soap.enterprise.DescribeAppMenu.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAppMenuResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeAppMenuResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeAppMenuResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeGlobalTheme");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeGlobalTheme"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobalTheme"), com.sforce.soap.enterprise.DescribeGlobalThemeType1.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobalThemeResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeGlobalThemeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeGlobalThemeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeTheme");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeTheme"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeTheme"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sobjectType"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeThemeResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeThemeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeThemeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeLayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeLayout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeLayout"), com.sforce.soap.enterprise.DescribeLayoutType0.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeLayoutResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeLayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeLayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSoftphoneLayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSoftphoneLayout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoftphoneLayout"), com.sforce.soap.enterprise.DescribeSoftphoneLayout.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoftphoneLayoutResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSoftphoneLayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSearchLayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSearchLayouts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchLayouts"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchLayoutsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSearchLayoutResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSearchLayoutsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSearchScopeOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSearchScopeOrder"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchScopeOrder"), com.sforce.soap.enterprise.DescribeSearchScopeOrder.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchScopeOrderResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSearchScopeOrderResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeCompactLayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeCompactLayouts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeCompactLayouts"), com.sforce.soap.enterprise.DescribeCompactLayouts.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeCompactLayoutsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeCompactLayoutsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeCompactLayoutsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describePathAssistants");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describePathAssistants"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describePathAssistants"), com.sforce.soap.enterprise.DescribePathAssistants.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describePathAssistantsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribePathAssistantsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describePathAssistantsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeApprovalLayout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeApprovalLayout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeApprovalLayout"), com.sforce.soap.enterprise.DescribeApprovalLayoutType2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeApprovalLayoutResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeApprovalLayoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeApprovalLayoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSoqlListViews");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSoqlListViews"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoqlListViews"), com.sforce.soap.enterprise.DescribeSoqlListViews.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoqlListViewsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSoqlListViewsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSoqlListViewsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("executeListView");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "executeListView"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">executeListView"), com.sforce.soap.enterprise.ExecuteListView.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">executeListViewResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.ExecuteListViewResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "executeListViewResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeSObjectListViews");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSObjectListViews"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectListViews"), com.sforce.soap.enterprise.DescribeSObjectListViews.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectListViewsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeSObjectListViewsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSObjectListViewsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeTabs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeTabs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeTabs"), com.sforce.soap.enterprise.DescribeTabs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeTabsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeTabSetResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeTabsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeAllTabs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeAllTabs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAllTabs"), com.sforce.soap.enterprise.DescribeAllTabs.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAllTabsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeTab[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeAllTabsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describePrimaryCompactLayouts");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describePrimaryCompactLayouts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describePrimaryCompactLayouts"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectTypes"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describePrimaryCompactLayoutsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeCompactLayout[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describePrimaryCompactLayoutsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("create");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "create"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">create"), com.sforce.soap.enterprise.sobject.SObject[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">createResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "createResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "update"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">update"), com.sforce.soap.enterprise.sobject.SObject[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">updateResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.SaveResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "updateResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("upsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "upsert"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">upsert"), com.sforce.soap.enterprise.Upsert.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">upsertResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.UpsertResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "upsertResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("merge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "merge"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">merge"), com.sforce.soap.enterprise.MergeRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "request"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">mergeResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.MergeResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "mergeResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("delete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "delete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">delete"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">deleteResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "deleteResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("undelete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "undelete"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">undelete"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">undeleteResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.UndeleteResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "undeleteResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("emptyRecycleBin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "emptyRecycleBin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">emptyRecycleBin"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">emptyRecycleBinResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.EmptyRecycleBinResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "emptyRecycleBinResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieve");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "retrieve"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieve"), com.sforce.soap.enterprise.Retrieve.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieveResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.sobject.SObject[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "retrieveResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("process");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "process"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">process"), com.sforce.soap.enterprise.ProcessRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "actions"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">processResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.ProcessResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "processResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("convertLead");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "convertLead"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">convertLead"), com.sforce.soap.enterprise.LeadConvert[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "leadConverts"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">convertLeadResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.LeadConvertResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "convertLeadResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "logout"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">logout"), com.sforce.soap.enterprise.Logout.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">logoutResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.LogoutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "logoutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invalidateSessions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "invalidateSessions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">invalidateSessions"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sessionIds"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">invalidateSessionsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.InvalidateSessionsResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "invalidateSessionsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDeleted");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getDeleted"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getDeleted"), com.sforce.soap.enterprise.GetDeleted.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getDeletedResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetDeletedResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getDeletedResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUpdated");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getUpdated"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUpdated"), com.sforce.soap.enterprise.GetUpdated.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUpdatedResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetUpdatedResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getUpdatedResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("query");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">query"), com.sforce.soap.enterprise.Query.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryAll");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryAll"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryAll"), com.sforce.soap.enterprise.QueryAll.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryAllResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryAllResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryAllResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryMore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryMore"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryMore"), com.sforce.soap.enterprise.QueryMore.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryMoreResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.QueryMoreResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "queryMoreResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"),
                      "com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"),
                      "com.sforce.soap.enterprise.fault.MalformedQueryFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "search"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">search"), com.sforce.soap.enterprise.Search.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">searchResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.SearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "searchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"),
                      "com.sforce.soap.enterprise.fault.InvalidSObjectFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"),
                      "com.sforce.soap.enterprise.fault.InvalidFieldFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault"),
                      "com.sforce.soap.enterprise.fault.MalformedSearchFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getServerTimestamp");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getServerTimestamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getServerTimestamp"), com.sforce.soap.enterprise.GetServerTimestamp.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getServerTimestampResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetServerTimestampResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getServerTimestampResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "setPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">setPassword"), com.sforce.soap.enterprise.SetPassword.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">setPasswordResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.SetPasswordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "setPasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault"),
                      "com.sforce.soap.enterprise.fault.InvalidNewPasswordFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("resetPassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "resetPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">resetPassword"), com.sforce.soap.enterprise.ResetPassword.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">resetPasswordResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.ResetPasswordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "resetPasswordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"),
                      "com.sforce.soap.enterprise.fault.InvalidIdFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getUserInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUserInfo"), com.sforce.soap.enterprise.GetUserInfo.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUserInfoResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.GetUserInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "getUserInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendEmailMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sendEmailMessage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailMessage"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailMessageResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.SendEmailResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sendEmailMessageResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sendEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmail"), com.sforce.soap.enterprise.Email[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "messages"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.SendEmailResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sendEmailResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("renderEmailTemplate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "renderEmailTemplate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">renderEmailTemplate"), com.sforce.soap.enterprise.RenderEmailTemplateRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "renderRequests"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">renderEmailTemplateResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.RenderEmailTemplateResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "renderEmailTemplateResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"),
                      "com.sforce.soap.enterprise.fault.UnexpectedErrorFault",
                      new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("performQuickActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "performQuickActions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">performQuickActions"), com.sforce.soap.enterprise.PerformQuickActionRequest[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "quickActions"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">performQuickActionsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.PerformQuickActionResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "performQuickActionsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeQuickActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeQuickActions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeQuickActions"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "quickActions"));
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeQuickActionsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeQuickActionResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeQuickActionsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeAvailableQuickActions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeAvailableQuickActions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAvailableQuickActions"), com.sforce.soap.enterprise.DescribeAvailableQuickActions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAvailableQuickActionsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeAvailableQuickActionResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeAvailableQuickActionsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("retrieveQuickActionTemplates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "retrieveQuickActionTemplates"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieveQuickActionTemplates"), com.sforce.soap.enterprise.RetrieveQuickActionTemplates.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieveQuickActionTemplatesResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.QuickActionTemplateResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "retrieveQuickActionTemplatesResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("describeNouns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeNouns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeNouns"), com.sforce.soap.enterprise.DescribeNouns.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeNounsResponse"));
        oper.setReturnClass(com.sforce.soap.enterprise.DescribeNounResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeNounsResponse"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

    }

    public SoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public SoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public SoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
        addBindings5();
        addBindings6();
        addBindings7();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">AllOrNoneHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AllOrNoneHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">AllowFieldTruncationHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AllowFieldTruncationHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">AssignmentRuleHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AssignmentRuleHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">convertLead");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvert[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvert");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "leadConverts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">convertLeadResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvertResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvertResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">create");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">createResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SaveResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">DebuggingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebuggingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">DebuggingInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebuggingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">delete");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">deleteResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeleteResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DeleteResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAllTabs");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeAllTabs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAllTabsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTab[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeTab");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAppMenu");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeAppMenu.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAppMenuResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeAppMenuResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeApprovalLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeApprovalLayoutType2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeApprovalLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeApprovalLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAvailableQuickActions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeAvailableQuickActions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeAvailableQuickActionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeAvailableQuickActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeAvailableQuickActionResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeCompactLayouts");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeCompactLayouts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeCompactLayoutsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeCompactLayoutsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupStructures");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupStructures.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeDataCategoryGroupStructuresResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupStructureResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeFlexiPages");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeFlexiPages.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeFlexiPagesResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeFlexiPageResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeFlexiPageResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobal");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobalResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobalTheme");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalThemeType1.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeGlobalThemeResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalThemeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeKnowledgeSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeKnowledgeSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeKnowledgeSettingsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeKnowledgeSettingsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutType0.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeNouns");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeNouns.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeNounsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeNounResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeNounResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describePathAssistants");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribePathAssistants.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describePathAssistantsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribePathAssistantsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describePrimaryCompactLayouts");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectTypes");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describePrimaryCompactLayoutsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeCompactLayout[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeCompactLayout");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeQuickActions");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "quickActions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeQuickActionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeQuickActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeQuickActionResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchLayouts");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchLayoutsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSearchLayoutResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSearchLayoutResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchScopeOrder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSearchScopeOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSearchScopeOrderResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSearchScopeOrderResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectListViews");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectListViews.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectListViewsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectListViewsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjects");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSObjectsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSObjectResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoftphoneLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoftphoneLayoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoqlListViews");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoqlListViews.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeSoqlListViewsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoqlListViewsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeTabs");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabs.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeTabsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabSetResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeTabSetResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeTheme");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sobjectType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">describeThemeResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeThemeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">DisableFeedTrackingHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DisableFeedTrackingHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">DuplicateRuleHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DuplicateRuleHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">EmailHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">emptyRecycleBin");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">emptyRecycleBinResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmptyRecycleBinResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmptyRecycleBinResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">executeListView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ExecuteListView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">executeListViewResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ExecuteListViewResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getDeleted");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeleted.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getDeletedResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeletedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getServerTimestamp");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestamp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getServerTimestampResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestampResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUpdated");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdated.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUpdatedResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdatedResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUserInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">getUserInfoResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">invalidateSessions");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sessionIds");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">invalidateSessionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.InvalidateSessionsResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "InvalidateSessionsResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">LimitInfoHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LimitInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LimitInfo");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "limitInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">LocaleOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LocaleOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">login");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Login.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">loginResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">LoginScopeHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginScopeHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">logout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Logout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">logoutResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LogoutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">merge");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeRequest");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "request");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">mergeResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">MruHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MruHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">OwnerChangeOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.OwnerChangeOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "OwnerChangeOption");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "options");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">PackageVersionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PackageVersion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PackageVersion");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "packageVersions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">performQuickActions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PerformQuickActionRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PerformQuickActionRequest");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "quickActions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">performQuickActionsResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PerformQuickActionResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PerformQuickActionResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">process");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessRequest");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "actions");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">processResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">query");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Query.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryAll");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryAllResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryAllResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryMore");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryMore.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryMoreResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryMoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">QueryOptions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">queryResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">renderEmailTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RenderEmailTemplateRequest[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RenderEmailTemplateRequest");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "renderRequests");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">renderEmailTemplateResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RenderEmailTemplateResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RenderEmailTemplateResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">resetPassword");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">resetPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieve");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Retrieve.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieveQuickActionTemplates");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RetrieveQuickActionTemplates.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieveQuickActionTemplatesResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QuickActionTemplateResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QuickActionTemplateResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">retrieveResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">search");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Search.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">searchResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmail");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Email[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Email");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "messages");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailMessage");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailMessageResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">sendEmailResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">SessionHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SessionHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">setPassword");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPassword.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">setPasswordResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPasswordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">StreamingEnabledHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.StreamingEnabledHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">undelete");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">undeleteResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UndeleteResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UndeleteResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">update");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "sObjects");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">updateResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SaveResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">upsert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Upsert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">upsertResponse");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UpsertResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UpsertResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "result");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", ">UserTerritoryDeleteHeader");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UserTerritoryDeleteHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ActionOverride");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ActionOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "AdditionalInformationMap");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AdditionalInformationMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "address");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "AnalyticsCloudComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AnalyticsCloudComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "AppMenuType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.AppMenuType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Article");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Article.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Canvas");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Canvas.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "CaseType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.CaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ChildRelationship");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ChildRelationship.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "CustomLinkComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.CustomLinkComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DataCategory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DataCategory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DataCategoryGroupSobjectTypePair");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DataCategoryGroupSobjectTypePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DebugLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DebugLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DeletedRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeletedRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DeleteResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeAppMenuItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeAppMenuItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeAppMenuResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeAppMenuItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeAppMenuItem");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "appMenuItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeApprovalLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeApprovalLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeApprovalLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeApprovalLayout[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeApprovalLayout");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "approvalLayouts");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeAvailableQuickActionResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeAvailableQuickActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeColor");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeColor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeCompactLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeCompactLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeCompactLayoutsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeCompactLayoutsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeComponentInstance");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeComponentInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeComponentInstanceProperty");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeComponentInstanceProperty.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeDataCategoryGroupStructureResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeFlexiPageRegion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeFlexiPageRegion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeFlexiPageResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeFlexiPageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeGlobalResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeGlobalSObjectResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalSObjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeGlobalTheme");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeGlobalTheme.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeIcon");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeIcon.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutButton");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutButton.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutButtonSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutButton[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutButton");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "detailButtons");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutFeedFilter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutFeedFilter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutFeedView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutFeedFilter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutFeedFilter");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "feedFilters");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutRow");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeNounResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeNounResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribePathAssistant");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribePathAssistant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribePathAssistantField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribePathAssistantField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribePathAssistantsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribePathAssistant[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribePathAssistant");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "pathAssistants");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribePathAssistantStep");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribePathAssistantStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeQuickActionDefaultValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeQuickActionDefaultValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeQuickActionListItemResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeQuickActionListItemResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeQuickActionListResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeQuickActionListItemResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeQuickActionListItemResult");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "quickActionListItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeQuickActionResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeQuickActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeRelatedContentItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeRelatedContentItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSearchLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSearchLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSearchScopeOrderResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSearchScopeOrderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSObjectResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSObjectResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutCallType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutCallType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutInfoField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutInfoField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneLayoutSection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneLayoutSection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoftphoneScreenPopOption");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoftphoneScreenPopOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoqlListView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoqlListView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoqlListViewParams");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoqlListViewParams.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoqlListViewResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoqlListView[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoqlListView");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "describeSoqlListViews");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoqlListViewsRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeSoqlListViewParams[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeSoqlListViewParams");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "listViewParams");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeTab");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTab.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeTabSetResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeTabSetResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeThemeItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeThemeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeThemeResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeThemeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeThemeItem");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "themeItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "differenceType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DifferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DuplicateError");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DuplicateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DuplicateResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DuplicateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Email");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Email.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmailFileAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailFileAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmailPriority");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmailPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "EmptyRecycleBinResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.EmptyRecycleBinResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Error");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Error.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ExecuteListViewRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ExecuteListViewRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ExecuteListViewResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ExecuteListViewResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "FeedLayoutFilterType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FeedLayoutFilterType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Field");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Field.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "FieldComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FieldComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "FieldDiff");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FieldDiff.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "FieldLayoutComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FieldLayoutComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "fieldType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FieldType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "FilteredLookupInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FilteredLookupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "FlexipageContext");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FlexipageContext.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "FlexipageContextTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.FlexipageContextTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Gender");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Gender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetDeletedResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetDeletedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetServerTimestampResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetServerTimestampResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetUpdatedResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUpdatedResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GetUserInfoResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GetUserInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "GrammaticalNumber");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.GrammaticalNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ID");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "InvalidateSessionsResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.InvalidateSessionsResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "KnowledgeLanguageItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.KnowledgeLanguageItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "KnowledgeSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.KnowledgeSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "layoutComponentType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LayoutComponentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvert");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvert.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LeadConvertResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LeadConvertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LimitInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LimitInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ListViewColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ListViewColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "listViewIsSoqlCompatible");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ListViewIsSoqlCompatible.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ListViewOrderBy");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ListViewOrderBy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ListViewRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ListViewRecordColumn[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ListViewRecordColumn");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "columns");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ListViewRecordColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ListViewRecordColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "location");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Location.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "LoginResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.LoginResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MassEmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MassEmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MatchRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MatchRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MatchResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MatchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "MergeResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.MergeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "NameCaseValue");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.NameCaseValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "NamedLayoutInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.NamedLayoutInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "NameObjectValuePair");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.NameObjectValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "NameValuePair");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.NameValuePair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "orderByDirection");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.OrderByDirection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "orderByNullsPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.OrderByNullsPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "OwnerChangeOption");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.OwnerChangeOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "OwnerChangeOptionType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.OwnerChangeOptionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PackageVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PackageVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PerformQuickActionRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PerformQuickActionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PerformQuickActionResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PerformQuickActionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PicklistEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PicklistEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "PicklistForRecordType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.PicklistForRecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "Possessive");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.Possessive.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessSubmitRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessSubmitRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ProcessWorkitemRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ProcessWorkitemRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryLocator");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QueryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QuickActionTemplateResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.QuickActionTemplateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RecordTypeCompactLayoutMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RecordTypeCompactLayoutMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RecordTypeInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RecordTypeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RecordTypeMapping");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RecordTypeMapping.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RecordTypesSupported");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RecordTypeInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RecordTypeInfo");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "recordTypeInfos");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RelatedContent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.DescribeRelatedContentItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "DescribeRelatedContentItem");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "relatedContentItems");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RelatedList");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RelatedListColumn");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedListColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RelatedListSort");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RelatedListSort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RelationshipReferenceTo");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "referenceTo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RenderEmailTemplateBodyResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RenderEmailTemplateBodyResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RenderEmailTemplateError");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RenderEmailTemplateError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RenderEmailTemplateRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RenderEmailTemplateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "RenderEmailTemplateResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.RenderEmailTemplateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ReportChartComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ReportChartComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ReportChartSize");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ReportChartSize.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ResetPasswordResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ResetPasswordResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SaveResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SaveResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ScopeInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ScopeInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchLayoutButton");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchLayoutButton.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchLayoutButtonsDisplayed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchLayoutButtonsDisplayed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchLayoutField");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchLayoutField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchLayoutFieldsDisplayed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchLayoutFieldsDisplayed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SearchSnippet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SearchSnippet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailError");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailOptOutPolicy");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailOptOutPolicy.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SendEmailResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SendEmailResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SetPasswordResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SetPasswordResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "ShareAccessLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.ShareAccessLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SingleEmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SingleEmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "soapType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoapType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SoqlCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoqlCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SoqlConditionGroup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoqlConditionGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "soqlConjunction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoqlConjunction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SoqlNotCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoqlNotCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "soqlOperator");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoqlOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SoqlSubQueryCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoqlSubQueryCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "SoqlWhereCondition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.SoqlWhereCondition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "StartsWith");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.StartsWith.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "StatusCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.StatusCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "TabOrderType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.TabOrderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UndeleteResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UndeleteResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "UpsertResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.UpsertResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "VisualforcePage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.VisualforcePage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "WebLinkPosition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.WebLinkPosition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "WebLinkType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.WebLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "WebLinkWindowType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.WebLinkWindowType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ApiFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ApiFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ApiQueryFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ApiQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "ExceptionCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.ExceptionCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "FaultCode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.FaultCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidFieldFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidFieldFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidIdFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidIdFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidNewPasswordFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidNewPasswordFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidQueryLocatorFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "InvalidSObjectFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.InvalidSObjectFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "LoginFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.LoginFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedQueryFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.MalformedQueryFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "MalformedSearchFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.MalformedSearchFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:fault.enterprise.soap.sforce.com", "UnexpectedErrorFault");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.fault.UnexpectedErrorFault.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AcceptedEventRelation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AcceptedEventRelation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accion__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Accion__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Accion__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Accion__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Account");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Account.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountPartner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountPartner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AccountShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AccountShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionLinkGroupTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ActionLinkGroupTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActionLinkTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ActionLinkTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ActivityHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ActivityHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AdditionalNumber");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AdditionalNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AggregateResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AggregateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Announcement");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Announcement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexClass");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexClass.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexEmailNotification");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexEmailNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexLog");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexPage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexPage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTestQueueItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexTestQueueItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTestResult");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexTestResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTestSuite");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexTestSuite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ApexTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ApexTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AppMenuItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AppMenuItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Approval");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Approval.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Archivo_Mainframe__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Archivo_Mainframe__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Archivo_Mainframe__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Archivo_Mainframe__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Asset");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Asset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssetFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AssetFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssetHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AssetHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assignment_Group_Name__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Assignment_Group_Name__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assignment_Group_Name__Share");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Assignment_Group_Name__Share.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assignment_Group_Queues__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Assignment_Group_Queues__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Assignment_Groups__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Assignment_Groups__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AssignmentRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AssignmentRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AsyncApexJob");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AsyncApexJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AttachedContentDocument");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AttachedContentDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Attachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Attachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuraDefinition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AuraDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuraDefinitionBundle");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AuraDefinitionBundle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AuthConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthConfigProviders");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AuthConfigProviders.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthProvider");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AuthProvider.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AuthSession");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.AuthSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BrandTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BrandTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessHours");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BusinessHours.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "BusinessProcess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.BusinessProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CallCenter");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CallCenter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campaign");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Campaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignMemberStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignMemberStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CampaignShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CampaignShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_Avon__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Campania_Avon__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Campania_Avon__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Campania_Avon__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Case");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject._case.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseComment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseMilestone");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseMilestone.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseSolution");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseSolution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplateMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplateMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseTeamTemplateRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CaseTeamTemplateRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CategoryData");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CategoryData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CategoryNode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CategoryNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChatterActivity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ChatterActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ClientBrowser");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ClientBrowser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroupFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroupFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroupMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroupMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroupMemberRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroupMemberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationGroupRecord");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationGroupRecord.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CollaborationInvitation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CollaborationInvitation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CombinedAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CombinedAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Community");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Community.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Condicion__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Condicion__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Condicion__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Condicion__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ConnectedApplication");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ConnectedApplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contact");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Contact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContactShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContactShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDistribution");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDistribution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDistributionView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDistributionView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocument");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocumentFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocumentHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDocumentLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentDocumentLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFolder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFolderItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentFolderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFolderLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentFolderLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFolderMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentFolderMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentHubItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentHubItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentHubRepository");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentHubRepository.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentVersionHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentVersionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspace");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentWorkspace.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentWorkspaceDoc");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContentWorkspaceDoc.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Contract.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractLineItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractLineItemHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractLineItemHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ContractStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CorsWhitelistEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CorsWhitelistEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CronJobDetail");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CronJobDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CronTrigger");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CronTrigger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomBrand");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CustomBrand.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomBrandAsset");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CustomBrandAsset.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomObjectUserLicenseMetrics");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CustomObjectUserLicenseMetrics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomPermission");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CustomPermission.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomPermissionDependency");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.CustomPermissionDependency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Dashboard");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Dashboard.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DashboardComponent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DashboardComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DashboardComponentFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DashboardComponentFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DashboardFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DashboardFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataStatistics");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DataStatistics.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DataType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DataType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DeclinedEventRelation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DeclinedEventRelation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Document");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DocumentAttachmentMap");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DocumentAttachmentMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Domain");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Domain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DomainSite");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DomainSite.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DuplicateRecordItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DuplicateRecordItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DuplicateRecordSet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DuplicateRecordSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DuplicateRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.DuplicateRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailDomainKey");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailDomainKey.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailMessage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailServicesAddress");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailServicesAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailServicesFunction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailServicesFunction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EmailTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Entitlement");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Entitlement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntitlementContact");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EntitlementContact.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntitlementFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EntitlementFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntitlementHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EntitlementHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntitlementTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EntitlementTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityDefinition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EntityDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntityParticle");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EntityParticle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EntitySubscription");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EntitySubscription.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estrategia__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Estrategia__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Estrategia__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Estrategia__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Event");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Event.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EventFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventLogFile");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EventLogFile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EventRelation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.EventRelation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalDataSource");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ExternalDataSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalDataUserAuth");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ExternalDataUserAuth.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ExternalSocialAccount");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ExternalSocialAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedComment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedLike");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedLike.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedPollChoice");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedPollChoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedPollVote");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedPollVote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedRevision");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedRevision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedTrackedChange");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FeedTrackedChange.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldDefinition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FieldDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FieldPermissions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FieldPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FiscalYearSettings");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FiscalYearSettings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FlexQueueItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FlexQueueItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FlowInterview");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FlowInterview.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FlowInterviewShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FlowInterviewShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Flujo_General__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Flujo_General__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Folder");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FolderedContentDocument");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.FolderedContentDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForecastShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ForecastShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GrantedByLicense");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.GrantedByLicense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings5() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Group");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Group.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "GroupMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.GroupMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Holiday");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Holiday.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Idea");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Idea.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IdeaComment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.IdeaComment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InstalledMobileApp");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.InstalledMobileApp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Item__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Item__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Item__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Item__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "KnowledgeableUser");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.KnowledgeableUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Lead");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Lead.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LeadStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LeadStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ListView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListViewChart");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ListViewChart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ListViewChartInstance");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ListViewChartInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveAgentSession");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveAgentSession.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveAgentSessionHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveAgentSessionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveAgentSessionShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveAgentSessionShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatBlockingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatBlockingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatButton");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatButton.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatButtonDeployment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatButtonDeployment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatButtonSkill");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatButtonSkill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatDeployment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatDeployment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatSensitiveDataRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatSensitiveDataRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatTranscript");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatTranscript.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatTranscriptEvent");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatTranscriptEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatTranscriptHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatTranscriptHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatTranscriptShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatTranscriptShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatTranscriptSkill");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatTranscriptSkill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatUserConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatUserConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatUserConfigProfile");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatUserConfigProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatUserConfigUser");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatUserConfigUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LiveChatVisitor");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LiveChatVisitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginGeo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LoginGeo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LoginHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LoginIp");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LoginIp.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LookedUpFromActivity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.LookedUpFromActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Macro");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Macro.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MacroHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MacroHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MacroInstruction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MacroInstruction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MacroShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MacroShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MailmergeTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MailmergeTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MatchingRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MatchingRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MatchingRuleItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MatchingRuleItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MDF30__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MDF30__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MDF65__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MDF65__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Mensajes_Avon__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Mensajes_Avon__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MilestoneType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.MilestoneType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Movimiento__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Movimiento__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Movimiento__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Movimiento__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Name.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NamedCredential");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NamedCredential.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NavigationLinkSet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NavigationLinkSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NavigationMenuItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NavigationMenuItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Network");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Network.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkActivityAudit");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NetworkActivityAudit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkMember");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NetworkMember.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkMemberGroup");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NetworkMemberGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkModeration");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NetworkModeration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkPageOverride");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NetworkPageOverride.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkSelfRegistration");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NetworkSelfRegistration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Note");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Note.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NoteAndAttachment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.NoteAndAttachment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OauthToken");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OauthToken.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ObjectPermissions");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ObjectPermissions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpenActivity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpenActivity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Opportunity");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Opportunity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityCompetitor");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityCompetitor.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityContactRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityContactRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityFieldHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityFieldHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityLineItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityLineItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityPartner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityPartner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OpportunityStage");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OpportunityStage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Order");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Order.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrderFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrderFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrderHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrderHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrderItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrderItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrderItemFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrderItemFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrderItemHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrderItemHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrderShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrderShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Organization");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Organization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OrgWideEmailAddress");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OrgWideEmailAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OwnedContentDocument");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.OwnedContentDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PackageLicense");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PackageLicense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Partner");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Partner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PartnerRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PartnerRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Period");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Period.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSet");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PermissionSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PermissionSetAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetLicense");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PermissionSetLicense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PermissionSetLicenseAssign");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PermissionSetLicenseAssign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PicklistValueInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PicklistValueInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PlatformAction");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PlatformAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PlatformCachePartition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PlatformCachePartition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PlatformCachePartitionType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PlatformCachePartitionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings6() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Pricebook2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Pricebook2History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Pricebook2History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PricebookEntry");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PricebookEntry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessDefinition");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessDefinition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstance");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstance.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceNode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceStep");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceStep.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessInstanceWorkitem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessInstanceWorkitem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProcessNode");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProcessNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product2");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Product2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product2Feed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Product2Feed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Product2History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Product2History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ProductEntitlementTemplate");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ProductEntitlementTemplate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Profile");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Profile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Programa__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Programa__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Publisher");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Publisher.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PushTopic");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.PushTopic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QueueSobject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QueueSobject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuickText");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QuickText.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuickTextHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QuickTextHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "QuickTextShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.QuickTextShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecentlyViewed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RecentlyViewed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RecordType");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RecordType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipDomain");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RelationshipDomain.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelationshipInfo");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.RelationshipInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Report");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Report.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReportFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ReportFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReputationLevel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ReputationLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReputationPointsRule");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ReputationPointsRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SamlSsoConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SamlSsoConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SchedChatter__ScheduledPost__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SchedChatter__ScheduledPost__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SchedChatter__ScheduledPost__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SchedChatter__ScheduledPost__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Scontrol");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Scontrol.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SearchLayout");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SearchLayout.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SecureAgentsCluster");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SecureAgentsCluster.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceContract");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ServiceContract.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceContractFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ServiceContractFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceContractHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ServiceContractHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ServiceContractShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ServiceContractShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupAuditTrail");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SetupAuditTrail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SetupEntityAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SetupEntityAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Site");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Site.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SiteFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SiteFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SiteHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SiteHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Skill");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Skill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SkillProfile");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SkillProfile.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SkillUser");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SkillUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SlaProcess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SlaProcess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "sObject");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SObject.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SocialPersona");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SocialPersona.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SocialPersonaHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SocialPersonaHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SocialPost");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SocialPost.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SocialPostFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SocialPostFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SocialPostHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SocialPostHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SocialPostShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SocialPostShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solicitudes__c");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Solicitudes__c.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solicitudes__History");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Solicitudes__History.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Solution");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Solution.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SolutionStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SolutionStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StaticResource");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.StaticResource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StreamingChannel");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.StreamingChannel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "StreamingChannelShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.StreamingChannelShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SupervisorAgentConfigSkill");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.SupervisorAgentConfigSkill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Task");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Task.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskPriority");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskPriority.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TaskStatus");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TaskStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TenantUsageEntitlement");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TenantUsageEntitlement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TestSuiteMembership");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TestSuiteMembership.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ThirdPartyAccountLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.ThirdPartyAccountLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Topic");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Topic.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TopicAssignment");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TopicAssignment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "TopicFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.TopicFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UndecidedEventRelation");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UndecidedEventRelation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserAppMenuCustomization");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserAppMenuCustomization.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserAppMenuCustomizationShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserAppMenuCustomizationShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserAppMenuItem");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserAppMenuItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserConfigTransferButton");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserConfigTransferButton.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserConfigTransferSkill");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserConfigTransferSkill.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserEntityAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserEntityAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserFeed");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserFeed.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserFieldAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserFieldAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLicense");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserLicense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserListView");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserListView.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserListViewCriterion");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserListViewCriterion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserLogin");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPackageLicense");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserPackageLicense.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserPreference");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserPreference.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvAccount");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserProvAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvAccountStaging");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserProvAccountStaging.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvisioningConfig");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserProvisioningConfig.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvisioningLog");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserProvisioningLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvisioningRequest");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserProvisioningRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvisioningRequestShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserProvisioningRequestShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserProvMockTarget");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserProvMockTarget.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRecordAccess");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserRecordAccess.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings7() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserRole");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UserShare");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.UserShare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "VerificationHistory");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.VerificationHistory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Vote");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.Vote.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WebLink");
            cachedSerQNames.add(qName);
            cls = com.sforce.soap.enterprise.sobject.WebLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.sforce.soap.enterprise.LoginResponse login(com.sforce.soap.enterprise.Login parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.LoginFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.LoginResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.LoginResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.LoginResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.LoginFault) {
              throw (com.sforce.soap.enterprise.fault.LoginFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSObjectResponse describeSObject(com.sforce.soap.enterprise.DescribeSObject parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeSObject"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSObjectResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSObjectResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSObjectResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSObjectResult[] describeSObjects(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeSObjects"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSObjectResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSObjectResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSObjectResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeGlobalResponse describeGlobal(com.sforce.soap.enterprise.DescribeGlobal parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeGlobal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeGlobalResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeGlobalResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeGlobalResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeDataCategoryGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.enterprise.DescribeDataCategoryGroupStructures parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeDataCategoryGroupStructures"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeKnowledgeSettingsResponse describeKnowledgeSettings(com.sforce.soap.enterprise.DescribeKnowledgeSettings parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeKnowledgeSettings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeKnowledgeSettingsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeKnowledgeSettingsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeKnowledgeSettingsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeFlexiPageResult[] describeFlexiPages(com.sforce.soap.enterprise.DescribeFlexiPages parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeFlexiPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeFlexiPageResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeFlexiPageResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeFlexiPageResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeAppMenuResponse describeAppMenu(com.sforce.soap.enterprise.DescribeAppMenu parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeAppMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeAppMenuResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeAppMenuResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeAppMenuResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeGlobalThemeResponse describeGlobalTheme(com.sforce.soap.enterprise.DescribeGlobalThemeType1 parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeGlobalTheme"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeGlobalThemeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeGlobalThemeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeGlobalThemeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeThemeResponse describeTheme(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeTheme"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeThemeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeThemeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeThemeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeLayoutResponse describeLayout(com.sforce.soap.enterprise.DescribeLayoutType0 parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeLayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeLayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeLayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse describeSoftphoneLayout(com.sforce.soap.enterprise.DescribeSoftphoneLayout parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeSoftphoneLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSearchLayoutResult[] describeSearchLayouts(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeSearchLayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSearchLayoutResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSearchLayoutResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSearchLayoutResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[] describeSearchScopeOrder(com.sforce.soap.enterprise.DescribeSearchScopeOrder parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeSearchScopeOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeCompactLayoutsResponse describeCompactLayouts(com.sforce.soap.enterprise.DescribeCompactLayouts parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeCompactLayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeCompactLayoutsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeCompactLayoutsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeCompactLayoutsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribePathAssistantsResponse describePathAssistants(com.sforce.soap.enterprise.DescribePathAssistants parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describePathAssistants"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribePathAssistantsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribePathAssistantsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribePathAssistantsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeApprovalLayoutResponse describeApprovalLayout(com.sforce.soap.enterprise.DescribeApprovalLayoutType2 parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeApprovalLayout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeApprovalLayoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeApprovalLayoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeApprovalLayoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSoqlListViewsResponse describeSoqlListViews(com.sforce.soap.enterprise.DescribeSoqlListViews parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeSoqlListViews"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSoqlListViewsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSoqlListViewsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSoqlListViewsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.ExecuteListViewResponse executeListView(com.sforce.soap.enterprise.ExecuteListView parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "executeListView"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.ExecuteListViewResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.ExecuteListViewResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.ExecuteListViewResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeSObjectListViewsResponse describeSObjectListViews(com.sforce.soap.enterprise.DescribeSObjectListViews parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeSObjectListViews"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeSObjectListViewsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeSObjectListViewsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeSObjectListViewsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeTabSetResult[] describeTabs(com.sforce.soap.enterprise.DescribeTabs parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeTabs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeTabSetResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeTabSetResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeTabSetResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeTab[] describeAllTabs(com.sforce.soap.enterprise.DescribeAllTabs parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeAllTabs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeTab[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeTab[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeTab[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeCompactLayout[] describePrimaryCompactLayouts(java.lang.String[] parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describePrimaryCompactLayouts"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeCompactLayout[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeCompactLayout[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeCompactLayout[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SaveResult[] create(com.sforce.soap.enterprise.sobject.SObject[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "create"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SaveResult[] update(com.sforce.soap.enterprise.sobject.SObject[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SaveResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SaveResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SaveResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.UpsertResult[] upsert(com.sforce.soap.enterprise.Upsert parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "upsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.UpsertResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.UpsertResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.UpsertResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.MergeResult[] merge(com.sforce.soap.enterprise.MergeRequest[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "merge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.MergeResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.MergeResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.MergeResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DeleteResult[] delete(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "delete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.UndeleteResult[] undelete(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "undelete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.UndeleteResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.UndeleteResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.UndeleteResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "emptyRecycleBin"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.EmptyRecycleBinResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.EmptyRecycleBinResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.EmptyRecycleBinResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.sobject.SObject[] retrieve(com.sforce.soap.enterprise.Retrieve parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieve"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.sobject.SObject[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.sobject.SObject[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.sobject.SObject[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.ProcessResult[] process(com.sforce.soap.enterprise.ProcessRequest[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "process"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.ProcessResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.ProcessResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.ProcessResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.LeadConvertResult[] convertLead(com.sforce.soap.enterprise.LeadConvert[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "convertLead"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.LeadConvertResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.LeadConvertResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.LeadConvertResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.LogoutResponse logout(com.sforce.soap.enterprise.Logout parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.LogoutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.LogoutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.LogoutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "invalidateSessions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.InvalidateSessionsResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.InvalidateSessionsResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.InvalidateSessionsResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetDeletedResponse getDeleted(com.sforce.soap.enterprise.GetDeleted parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getDeleted"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetDeletedResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetDeletedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetDeletedResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetUpdatedResponse getUpdated(com.sforce.soap.enterprise.GetUpdated parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getUpdated"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetUpdatedResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetUpdatedResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetUpdatedResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryResponse query(com.sforce.soap.enterprise.Query parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "query"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryAllResponse queryAll(com.sforce.soap.enterprise.QueryAll parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryAll"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryAllResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryAllResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryAllResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QueryMoreResponse queryMore(com.sforce.soap.enterprise.QueryMore parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.MalformedQueryFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "queryMore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QueryMoreResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QueryMoreResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QueryMoreResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedQueryFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedQueryFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SearchResponse search(com.sforce.soap.enterprise.Search parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.MalformedSearchFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "search"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidSObjectFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidSObjectFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidFieldFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidFieldFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.MalformedSearchFault) {
              throw (com.sforce.soap.enterprise.fault.MalformedSearchFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetServerTimestampResponse getServerTimestamp(com.sforce.soap.enterprise.GetServerTimestamp parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getServerTimestamp"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetServerTimestampResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetServerTimestampResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetServerTimestampResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SetPasswordResponse setPassword(com.sforce.soap.enterprise.SetPassword parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidNewPasswordFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "setPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SetPasswordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SetPasswordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SetPasswordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidNewPasswordFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidNewPasswordFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.ResetPasswordResponse resetPassword(com.sforce.soap.enterprise.ResetPassword parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "resetPassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.ResetPasswordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.ResetPasswordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.ResetPasswordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.InvalidIdFault) {
              throw (com.sforce.soap.enterprise.fault.InvalidIdFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.GetUserInfoResponse getUserInfo(com.sforce.soap.enterprise.GetUserInfo parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "getUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.GetUserInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.GetUserInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.GetUserInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SendEmailResult[] sendEmailMessage(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendEmailMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SendEmailResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SendEmailResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SendEmailResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.SendEmailResult[] sendEmail(com.sforce.soap.enterprise.Email[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "sendEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.SendEmailResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.SendEmailResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.SendEmailResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.RenderEmailTemplateResult[] renderEmailTemplate(com.sforce.soap.enterprise.RenderEmailTemplateRequest[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "renderEmailTemplate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.RenderEmailTemplateResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.RenderEmailTemplateResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.RenderEmailTemplateResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.sforce.soap.enterprise.fault.UnexpectedErrorFault) {
              throw (com.sforce.soap.enterprise.fault.UnexpectedErrorFault) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.PerformQuickActionResult[] performQuickActions(com.sforce.soap.enterprise.PerformQuickActionRequest[] parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "performQuickActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.PerformQuickActionResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.PerformQuickActionResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.PerformQuickActionResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeQuickActionResult[] describeQuickActions(java.lang.String[] parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeQuickActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeQuickActionResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeQuickActionResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeQuickActionResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeAvailableQuickActionResult[] describeAvailableQuickActions(com.sforce.soap.enterprise.DescribeAvailableQuickActions parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeAvailableQuickActions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeAvailableQuickActionResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeAvailableQuickActionResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeAvailableQuickActionResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.QuickActionTemplateResult[] retrieveQuickActionTemplates(com.sforce.soap.enterprise.RetrieveQuickActionTemplates parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "retrieveQuickActionTemplates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.QuickActionTemplateResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.QuickActionTemplateResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.QuickActionTemplateResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.sforce.soap.enterprise.DescribeNounResult[] describeNouns(com.sforce.soap.enterprise.DescribeNouns parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "describeNouns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.sforce.soap.enterprise.DescribeNounResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.sforce.soap.enterprise.DescribeNounResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.sforce.soap.enterprise.DescribeNounResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
