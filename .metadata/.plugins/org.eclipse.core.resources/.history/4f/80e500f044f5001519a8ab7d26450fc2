/**
 * Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise;

public interface Soap extends java.rmi.Remote {

    /**
     * Login to the Salesforce.com SOAP Api
     */
    public com.sforce.soap.enterprise.LoginResponse login(com.sforce.soap.enterprise.Login parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.LoginFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Describe an sObject
     */
    public com.sforce.soap.enterprise.DescribeSObjectResponse describeSObject(com.sforce.soap.enterprise.DescribeSObject parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe multiple sObjects (upto 100)
     */
    public com.sforce.soap.enterprise.DescribeSObjectResult[] describeSObjects(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the Global state
     */
    public com.sforce.soap.enterprise.DescribeGlobalResponse describeGlobal(com.sforce.soap.enterprise.DescribeGlobal parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe all the data category groups available for a given
     * set of types
     */
    public com.sforce.soap.enterprise.DescribeDataCategoryGroupResult[] describeDataCategoryGroups(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the data category group structures for a given set
     * of pair of types and data category group name
     */
    public com.sforce.soap.enterprise.DescribeDataCategoryGroupStructureResult[] describeDataCategoryGroupStructures(com.sforce.soap.enterprise.DescribeDataCategoryGroupStructures parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describes your Knowledge settings, such as if knowledgeEnabled
     * is on or off, its default language and supported languages
     */
    public com.sforce.soap.enterprise.DescribeKnowledgeSettingsResponse describeKnowledgeSettings(com.sforce.soap.enterprise.DescribeKnowledgeSettings parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe a list of FlexiPage and their contents
     */
    public com.sforce.soap.enterprise.DescribeFlexiPageResult[] describeFlexiPages(com.sforce.soap.enterprise.DescribeFlexiPages parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Describe the items in an AppMenu
     */
    public com.sforce.soap.enterprise.DescribeAppMenuResponse describeAppMenu(com.sforce.soap.enterprise.DescribeAppMenu parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe Gloal and Themes
     */
    public com.sforce.soap.enterprise.DescribeGlobalThemeResponse describeGlobalTheme(com.sforce.soap.enterprise.DescribeGlobalThemeType1 parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe Themes
     */
    public com.sforce.soap.enterprise.DescribeThemeResponse describeTheme(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the layout of the given sObject or the given actionable
     * global page.
     */
    public com.sforce.soap.enterprise.DescribeLayoutResponse describeLayout(com.sforce.soap.enterprise.DescribeLayoutType0 parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Describe the layout of the SoftPhone
     */
    public com.sforce.soap.enterprise.DescribeSoftphoneLayoutResponse describeSoftphoneLayout(com.sforce.soap.enterprise.DescribeSoftphoneLayout parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the search view of an sObject
     */
    public com.sforce.soap.enterprise.DescribeSearchLayoutResult[] describeSearchLayouts(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe a list of objects representing the order and scope
     * of objects on a users search result page
     */
    public com.sforce.soap.enterprise.DescribeSearchScopeOrderResult[] describeSearchScopeOrder(com.sforce.soap.enterprise.DescribeSearchScopeOrder parameters) throws java.rmi.RemoteException;

    /**
     * Describe the compact layouts of the given sObject
     */
    public com.sforce.soap.enterprise.DescribeCompactLayoutsResponse describeCompactLayouts(com.sforce.soap.enterprise.DescribeCompactLayouts parameters) throws java.rmi.RemoteException;

    /**
     * Describe the Path Assistants for the given sObject and optionally
     * RecordTypes
     */
    public com.sforce.soap.enterprise.DescribePathAssistantsResponse describePathAssistants(com.sforce.soap.enterprise.DescribePathAssistants parameters) throws java.rmi.RemoteException;

    /**
     * Describe the approval layouts of the given sObject
     */
    public com.sforce.soap.enterprise.DescribeApprovalLayoutResponse describeApprovalLayout(com.sforce.soap.enterprise.DescribeApprovalLayoutType2 parameters) throws java.rmi.RemoteException;

    /**
     * Describe the ListViews as SOQL metadata for the generation
     * of SOQL.
     */
    public com.sforce.soap.enterprise.DescribeSoqlListViewsResponse describeSoqlListViews(com.sforce.soap.enterprise.DescribeSoqlListViews parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Execute the specified list view and return the presentation-ready
     * results.
     */
    public com.sforce.soap.enterprise.ExecuteListViewResponse executeListView(com.sforce.soap.enterprise.ExecuteListView parameters) throws java.rmi.RemoteException;

    /**
     * Describe the ListViews of a SObject as SOQL metadata for the
     * generation of SOQL.
     */
    public com.sforce.soap.enterprise.DescribeSObjectListViewsResponse describeSObjectListViews(com.sforce.soap.enterprise.DescribeSObjectListViews parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the tabs that appear on a users page
     */
    public com.sforce.soap.enterprise.DescribeTabSetResult[] describeTabs(com.sforce.soap.enterprise.DescribeTabs parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe all tabs available to a user
     */
    public com.sforce.soap.enterprise.DescribeTab[] describeAllTabs(com.sforce.soap.enterprise.DescribeAllTabs parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Describe the primary compact layouts for the sObjects requested
     */
    public com.sforce.soap.enterprise.DescribeCompactLayout[] describePrimaryCompactLayouts(java.lang.String[] parameters) throws java.rmi.RemoteException;

    /**
     * Create a set of new sObjects
     */
    public com.sforce.soap.enterprise.SaveResult[] create(com.sforce.soap.enterprise.sobject.SObject[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Update a set of sObjects
     */
    public com.sforce.soap.enterprise.SaveResult[] update(com.sforce.soap.enterprise.sobject.SObject[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Update or insert a set of sObjects based on object id
     */
    public com.sforce.soap.enterprise.UpsertResult[] upsert(com.sforce.soap.enterprise.Upsert parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Merge and update a set of sObjects based on object id
     */
    public com.sforce.soap.enterprise.MergeResult[] merge(com.sforce.soap.enterprise.MergeRequest[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Delete a set of sObjects
     */
    public com.sforce.soap.enterprise.DeleteResult[] delete(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Undelete a set of sObjects
     */
    public com.sforce.soap.enterprise.UndeleteResult[] undelete(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Empty a set of sObjects from the recycle bin
     */
    public com.sforce.soap.enterprise.EmptyRecycleBinResult[] emptyRecycleBin(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get a set of sObjects
     */
    public com.sforce.soap.enterprise.sobject.SObject[] retrieve(com.sforce.soap.enterprise.Retrieve parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Submit an entity to a workflow process or process a workitem
     */
    public com.sforce.soap.enterprise.ProcessResult[] process(com.sforce.soap.enterprise.ProcessRequest[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * convert a set of leads
     */
    public com.sforce.soap.enterprise.LeadConvertResult[] convertLead(com.sforce.soap.enterprise.LeadConvert[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Logout the current user, invalidating the current session.
     */
    public com.sforce.soap.enterprise.LogoutResponse logout(com.sforce.soap.enterprise.Logout parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Logs out and invalidates session ids
     */
    public com.sforce.soap.enterprise.InvalidateSessionsResult[] invalidateSessions(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for deleted sObjects
     */
    public com.sforce.soap.enterprise.GetDeletedResponse getDeleted(com.sforce.soap.enterprise.GetDeleted parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Get the IDs for updated sObjects
     */
    public com.sforce.soap.enterprise.GetUpdatedResponse getUpdated(com.sforce.soap.enterprise.GetUpdated parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Create a Query Cursor
     */
    public com.sforce.soap.enterprise.QueryResponse query(com.sforce.soap.enterprise.Query parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Create a Query Cursor, including deleted sObjects
     */
    public com.sforce.soap.enterprise.QueryAllResponse queryAll(com.sforce.soap.enterprise.QueryAll parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.MalformedQueryFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Gets the next batch of sObjects from a query
     */
    public com.sforce.soap.enterprise.QueryMoreResponse queryMore(com.sforce.soap.enterprise.QueryMore parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.InvalidQueryLocatorFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.MalformedQueryFault;

    /**
     * Search for sObjects
     */
    public com.sforce.soap.enterprise.SearchResponse search(com.sforce.soap.enterprise.Search parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidSObjectFault, com.sforce.soap.enterprise.fault.InvalidFieldFault, com.sforce.soap.enterprise.fault.MalformedSearchFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Gets server timestamp
     */
    public com.sforce.soap.enterprise.GetServerTimestampResponse getServerTimestamp(com.sforce.soap.enterprise.GetServerTimestamp parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Set a user's password
     */
    public com.sforce.soap.enterprise.SetPasswordResponse setPassword(com.sforce.soap.enterprise.SetPassword parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.InvalidNewPasswordFault, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Reset a user's password
     */
    public com.sforce.soap.enterprise.ResetPasswordResponse resetPassword(com.sforce.soap.enterprise.ResetPassword parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault, com.sforce.soap.enterprise.fault.InvalidIdFault;

    /**
     * Returns standard information relevant to the current user
     */
    public com.sforce.soap.enterprise.GetUserInfoResponse getUserInfo(com.sforce.soap.enterprise.GetUserInfo parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Send existing draft EmailMessage
     */
    public com.sforce.soap.enterprise.SendEmailResult[] sendEmailMessage(java.lang.String[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Send outbound email
     */
    public com.sforce.soap.enterprise.SendEmailResult[] sendEmail(com.sforce.soap.enterprise.Email[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Perform a template merge on one or more blocks of text.  Optionally,
     * just validate the template text.
     */
    public com.sforce.soap.enterprise.RenderEmailTemplateResult[] renderEmailTemplate(com.sforce.soap.enterprise.RenderEmailTemplateRequest[] parameters) throws java.rmi.RemoteException, com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

    /**
     * Perform a series of predefined actions such as quick create
     * or log a task
     */
    public com.sforce.soap.enterprise.PerformQuickActionResult[] performQuickActions(com.sforce.soap.enterprise.PerformQuickActionRequest[] parameters) throws java.rmi.RemoteException;

    /**
     * Describe the details of a series of quick actions
     */
    public com.sforce.soap.enterprise.DescribeQuickActionResult[] describeQuickActions(java.lang.String[] parameters) throws java.rmi.RemoteException;

    /**
     * Describe the details of a series of quick actions available
     * for the given contextType
     */
    public com.sforce.soap.enterprise.DescribeAvailableQuickActionResult[] describeAvailableQuickActions(com.sforce.soap.enterprise.DescribeAvailableQuickActions parameters) throws java.rmi.RemoteException;

    /**
     * Retreive the template sobjects, if appropriate, for the given
     * quick action names in a given context
     */
    public com.sforce.soap.enterprise.QuickActionTemplateResult[] retrieveQuickActionTemplates(com.sforce.soap.enterprise.RetrieveQuickActionTemplates parameters) throws java.rmi.RemoteException;

    /**
     * Return the renameable nouns from the server for use in presentation
     * using the salesforce grammar engine
     */
    public com.sforce.soap.enterprise.DescribeNounResult[] describeNouns(com.sforce.soap.enterprise.DescribeNouns parameters) throws java.rmi.RemoteException;
}
