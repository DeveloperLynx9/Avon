/**
 * Network.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class Network  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String allowedExtensions;

    private com.sforce.soap.enterprise.QueryResult attachedContentDocuments;

    private java.lang.String caseCommentEmailTemplateId;

    private java.lang.String changePasswordEmailTemplateId;

    private com.sforce.soap.enterprise.QueryResult combinedAttachments;

    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult customBrands;

    private java.lang.String description;

    private java.lang.String emailFooterLogoId;

    private java.lang.String emailFooterText;

    private java.lang.String emailSenderAddress;

    private java.lang.String emailSenderName;

    private java.util.Date firstActivationDate;

    private java.lang.String forgotPasswordEmailTemplateId;

    private com.sforce.soap.enterprise.sobject.User lastModifiedBy;

    private java.lang.String lastModifiedById;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Integer maxFileSizeKb;

    private java.lang.String name;

    private com.sforce.soap.enterprise.QueryResult networkActivityAudits;

    private com.sforce.soap.enterprise.QueryResult networkCollaborationGroups;

    private com.sforce.soap.enterprise.QueryResult networkEntitySubscriptions;

    private com.sforce.soap.enterprise.QueryResult networkMembers;

    private com.sforce.soap.enterprise.QueryResult networkModerations;

    private java.lang.String newSenderAddress;

    private java.lang.Boolean optionsAllowMembersToFlag;

    private java.lang.Boolean optionsGuestChatterEnabled;

    private java.lang.Boolean optionsInvitationsEnabled;

    private java.lang.Boolean optionsKnowledgeableEnabled;

    private java.lang.Boolean optionsNicknameDisplayEnabled;

    private java.lang.Boolean optionsPrivateMessagesEnabled;

    private java.lang.Boolean optionsReputationEnabled;

    private java.lang.Boolean optionsSelfRegistrationEnabled;

    private java.lang.Boolean optionsSendWelcomeEmail;

    private java.lang.Boolean optionsShowAllNetworkSettings;

    private java.lang.Boolean optionsSiteAsContainerEnabled;

    private java.lang.String selfRegProfileId;

    private java.lang.String status;

    private java.util.Calendar systemModstamp;

    private java.lang.String urlPathPrefix;

    private java.lang.String welcomeEmailTemplateId;

    public Network() {
    }

    public Network(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String allowedExtensions,
           com.sforce.soap.enterprise.QueryResult attachedContentDocuments,
           java.lang.String caseCommentEmailTemplateId,
           java.lang.String changePasswordEmailTemplateId,
           com.sforce.soap.enterprise.QueryResult combinedAttachments,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult customBrands,
           java.lang.String description,
           java.lang.String emailFooterLogoId,
           java.lang.String emailFooterText,
           java.lang.String emailSenderAddress,
           java.lang.String emailSenderName,
           java.util.Date firstActivationDate,
           java.lang.String forgotPasswordEmailTemplateId,
           com.sforce.soap.enterprise.sobject.User lastModifiedBy,
           java.lang.String lastModifiedById,
           java.util.Calendar lastModifiedDate,
           java.lang.Integer maxFileSizeKb,
           java.lang.String name,
           com.sforce.soap.enterprise.QueryResult networkActivityAudits,
           com.sforce.soap.enterprise.QueryResult networkCollaborationGroups,
           com.sforce.soap.enterprise.QueryResult networkEntitySubscriptions,
           com.sforce.soap.enterprise.QueryResult networkMembers,
           com.sforce.soap.enterprise.QueryResult networkModerations,
           java.lang.String newSenderAddress,
           java.lang.Boolean optionsAllowMembersToFlag,
           java.lang.Boolean optionsGuestChatterEnabled,
           java.lang.Boolean optionsInvitationsEnabled,
           java.lang.Boolean optionsKnowledgeableEnabled,
           java.lang.Boolean optionsNicknameDisplayEnabled,
           java.lang.Boolean optionsPrivateMessagesEnabled,
           java.lang.Boolean optionsReputationEnabled,
           java.lang.Boolean optionsSelfRegistrationEnabled,
           java.lang.Boolean optionsSendWelcomeEmail,
           java.lang.Boolean optionsShowAllNetworkSettings,
           java.lang.Boolean optionsSiteAsContainerEnabled,
           java.lang.String selfRegProfileId,
           java.lang.String status,
           java.util.Calendar systemModstamp,
           java.lang.String urlPathPrefix,
           java.lang.String welcomeEmailTemplateId) {
        super(
            fieldsToNull,
            id);
        this.allowedExtensions = allowedExtensions;
        this.attachedContentDocuments = attachedContentDocuments;
        this.caseCommentEmailTemplateId = caseCommentEmailTemplateId;
        this.changePasswordEmailTemplateId = changePasswordEmailTemplateId;
        this.combinedAttachments = combinedAttachments;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.customBrands = customBrands;
        this.description = description;
        this.emailFooterLogoId = emailFooterLogoId;
        this.emailFooterText = emailFooterText;
        this.emailSenderAddress = emailSenderAddress;
        this.emailSenderName = emailSenderName;
        this.firstActivationDate = firstActivationDate;
        this.forgotPasswordEmailTemplateId = forgotPasswordEmailTemplateId;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedById = lastModifiedById;
        this.lastModifiedDate = lastModifiedDate;
        this.maxFileSizeKb = maxFileSizeKb;
        this.name = name;
        this.networkActivityAudits = networkActivityAudits;
        this.networkCollaborationGroups = networkCollaborationGroups;
        this.networkEntitySubscriptions = networkEntitySubscriptions;
        this.networkMembers = networkMembers;
        this.networkModerations = networkModerations;
        this.newSenderAddress = newSenderAddress;
        this.optionsAllowMembersToFlag = optionsAllowMembersToFlag;
        this.optionsGuestChatterEnabled = optionsGuestChatterEnabled;
        this.optionsInvitationsEnabled = optionsInvitationsEnabled;
        this.optionsKnowledgeableEnabled = optionsKnowledgeableEnabled;
        this.optionsNicknameDisplayEnabled = optionsNicknameDisplayEnabled;
        this.optionsPrivateMessagesEnabled = optionsPrivateMessagesEnabled;
        this.optionsReputationEnabled = optionsReputationEnabled;
        this.optionsSelfRegistrationEnabled = optionsSelfRegistrationEnabled;
        this.optionsSendWelcomeEmail = optionsSendWelcomeEmail;
        this.optionsShowAllNetworkSettings = optionsShowAllNetworkSettings;
        this.optionsSiteAsContainerEnabled = optionsSiteAsContainerEnabled;
        this.selfRegProfileId = selfRegProfileId;
        this.status = status;
        this.systemModstamp = systemModstamp;
        this.urlPathPrefix = urlPathPrefix;
        this.welcomeEmailTemplateId = welcomeEmailTemplateId;
    }


    /**
     * Gets the allowedExtensions value for this Network.
     * 
     * @return allowedExtensions
     */
    public java.lang.String getAllowedExtensions() {
        return allowedExtensions;
    }


    /**
     * Sets the allowedExtensions value for this Network.
     * 
     * @param allowedExtensions
     */
    public void setAllowedExtensions(java.lang.String allowedExtensions) {
        this.allowedExtensions = allowedExtensions;
    }


    /**
     * Gets the attachedContentDocuments value for this Network.
     * 
     * @return attachedContentDocuments
     */
    public com.sforce.soap.enterprise.QueryResult getAttachedContentDocuments() {
        return attachedContentDocuments;
    }


    /**
     * Sets the attachedContentDocuments value for this Network.
     * 
     * @param attachedContentDocuments
     */
    public void setAttachedContentDocuments(com.sforce.soap.enterprise.QueryResult attachedContentDocuments) {
        this.attachedContentDocuments = attachedContentDocuments;
    }


    /**
     * Gets the caseCommentEmailTemplateId value for this Network.
     * 
     * @return caseCommentEmailTemplateId
     */
    public java.lang.String getCaseCommentEmailTemplateId() {
        return caseCommentEmailTemplateId;
    }


    /**
     * Sets the caseCommentEmailTemplateId value for this Network.
     * 
     * @param caseCommentEmailTemplateId
     */
    public void setCaseCommentEmailTemplateId(java.lang.String caseCommentEmailTemplateId) {
        this.caseCommentEmailTemplateId = caseCommentEmailTemplateId;
    }


    /**
     * Gets the changePasswordEmailTemplateId value for this Network.
     * 
     * @return changePasswordEmailTemplateId
     */
    public java.lang.String getChangePasswordEmailTemplateId() {
        return changePasswordEmailTemplateId;
    }


    /**
     * Sets the changePasswordEmailTemplateId value for this Network.
     * 
     * @param changePasswordEmailTemplateId
     */
    public void setChangePasswordEmailTemplateId(java.lang.String changePasswordEmailTemplateId) {
        this.changePasswordEmailTemplateId = changePasswordEmailTemplateId;
    }


    /**
     * Gets the combinedAttachments value for this Network.
     * 
     * @return combinedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getCombinedAttachments() {
        return combinedAttachments;
    }


    /**
     * Sets the combinedAttachments value for this Network.
     * 
     * @param combinedAttachments
     */
    public void setCombinedAttachments(com.sforce.soap.enterprise.QueryResult combinedAttachments) {
        this.combinedAttachments = combinedAttachments;
    }


    /**
     * Gets the createdBy value for this Network.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this Network.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this Network.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this Network.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this Network.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this Network.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the customBrands value for this Network.
     * 
     * @return customBrands
     */
    public com.sforce.soap.enterprise.QueryResult getCustomBrands() {
        return customBrands;
    }


    /**
     * Sets the customBrands value for this Network.
     * 
     * @param customBrands
     */
    public void setCustomBrands(com.sforce.soap.enterprise.QueryResult customBrands) {
        this.customBrands = customBrands;
    }


    /**
     * Gets the description value for this Network.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Network.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the emailFooterLogoId value for this Network.
     * 
     * @return emailFooterLogoId
     */
    public java.lang.String getEmailFooterLogoId() {
        return emailFooterLogoId;
    }


    /**
     * Sets the emailFooterLogoId value for this Network.
     * 
     * @param emailFooterLogoId
     */
    public void setEmailFooterLogoId(java.lang.String emailFooterLogoId) {
        this.emailFooterLogoId = emailFooterLogoId;
    }


    /**
     * Gets the emailFooterText value for this Network.
     * 
     * @return emailFooterText
     */
    public java.lang.String getEmailFooterText() {
        return emailFooterText;
    }


    /**
     * Sets the emailFooterText value for this Network.
     * 
     * @param emailFooterText
     */
    public void setEmailFooterText(java.lang.String emailFooterText) {
        this.emailFooterText = emailFooterText;
    }


    /**
     * Gets the emailSenderAddress value for this Network.
     * 
     * @return emailSenderAddress
     */
    public java.lang.String getEmailSenderAddress() {
        return emailSenderAddress;
    }


    /**
     * Sets the emailSenderAddress value for this Network.
     * 
     * @param emailSenderAddress
     */
    public void setEmailSenderAddress(java.lang.String emailSenderAddress) {
        this.emailSenderAddress = emailSenderAddress;
    }


    /**
     * Gets the emailSenderName value for this Network.
     * 
     * @return emailSenderName
     */
    public java.lang.String getEmailSenderName() {
        return emailSenderName;
    }


    /**
     * Sets the emailSenderName value for this Network.
     * 
     * @param emailSenderName
     */
    public void setEmailSenderName(java.lang.String emailSenderName) {
        this.emailSenderName = emailSenderName;
    }


    /**
     * Gets the firstActivationDate value for this Network.
     * 
     * @return firstActivationDate
     */
    public java.util.Date getFirstActivationDate() {
        return firstActivationDate;
    }


    /**
     * Sets the firstActivationDate value for this Network.
     * 
     * @param firstActivationDate
     */
    public void setFirstActivationDate(java.util.Date firstActivationDate) {
        this.firstActivationDate = firstActivationDate;
    }


    /**
     * Gets the forgotPasswordEmailTemplateId value for this Network.
     * 
     * @return forgotPasswordEmailTemplateId
     */
    public java.lang.String getForgotPasswordEmailTemplateId() {
        return forgotPasswordEmailTemplateId;
    }


    /**
     * Sets the forgotPasswordEmailTemplateId value for this Network.
     * 
     * @param forgotPasswordEmailTemplateId
     */
    public void setForgotPasswordEmailTemplateId(java.lang.String forgotPasswordEmailTemplateId) {
        this.forgotPasswordEmailTemplateId = forgotPasswordEmailTemplateId;
    }


    /**
     * Gets the lastModifiedBy value for this Network.
     * 
     * @return lastModifiedBy
     */
    public com.sforce.soap.enterprise.sobject.User getLastModifiedBy() {
        return lastModifiedBy;
    }


    /**
     * Sets the lastModifiedBy value for this Network.
     * 
     * @param lastModifiedBy
     */
    public void setLastModifiedBy(com.sforce.soap.enterprise.sobject.User lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }


    /**
     * Gets the lastModifiedById value for this Network.
     * 
     * @return lastModifiedById
     */
    public java.lang.String getLastModifiedById() {
        return lastModifiedById;
    }


    /**
     * Sets the lastModifiedById value for this Network.
     * 
     * @param lastModifiedById
     */
    public void setLastModifiedById(java.lang.String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }


    /**
     * Gets the lastModifiedDate value for this Network.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this Network.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the maxFileSizeKb value for this Network.
     * 
     * @return maxFileSizeKb
     */
    public java.lang.Integer getMaxFileSizeKb() {
        return maxFileSizeKb;
    }


    /**
     * Sets the maxFileSizeKb value for this Network.
     * 
     * @param maxFileSizeKb
     */
    public void setMaxFileSizeKb(java.lang.Integer maxFileSizeKb) {
        this.maxFileSizeKb = maxFileSizeKb;
    }


    /**
     * Gets the name value for this Network.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Network.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the networkActivityAudits value for this Network.
     * 
     * @return networkActivityAudits
     */
    public com.sforce.soap.enterprise.QueryResult getNetworkActivityAudits() {
        return networkActivityAudits;
    }


    /**
     * Sets the networkActivityAudits value for this Network.
     * 
     * @param networkActivityAudits
     */
    public void setNetworkActivityAudits(com.sforce.soap.enterprise.QueryResult networkActivityAudits) {
        this.networkActivityAudits = networkActivityAudits;
    }


    /**
     * Gets the networkCollaborationGroups value for this Network.
     * 
     * @return networkCollaborationGroups
     */
    public com.sforce.soap.enterprise.QueryResult getNetworkCollaborationGroups() {
        return networkCollaborationGroups;
    }


    /**
     * Sets the networkCollaborationGroups value for this Network.
     * 
     * @param networkCollaborationGroups
     */
    public void setNetworkCollaborationGroups(com.sforce.soap.enterprise.QueryResult networkCollaborationGroups) {
        this.networkCollaborationGroups = networkCollaborationGroups;
    }


    /**
     * Gets the networkEntitySubscriptions value for this Network.
     * 
     * @return networkEntitySubscriptions
     */
    public com.sforce.soap.enterprise.QueryResult getNetworkEntitySubscriptions() {
        return networkEntitySubscriptions;
    }


    /**
     * Sets the networkEntitySubscriptions value for this Network.
     * 
     * @param networkEntitySubscriptions
     */
    public void setNetworkEntitySubscriptions(com.sforce.soap.enterprise.QueryResult networkEntitySubscriptions) {
        this.networkEntitySubscriptions = networkEntitySubscriptions;
    }


    /**
     * Gets the networkMembers value for this Network.
     * 
     * @return networkMembers
     */
    public com.sforce.soap.enterprise.QueryResult getNetworkMembers() {
        return networkMembers;
    }


    /**
     * Sets the networkMembers value for this Network.
     * 
     * @param networkMembers
     */
    public void setNetworkMembers(com.sforce.soap.enterprise.QueryResult networkMembers) {
        this.networkMembers = networkMembers;
    }


    /**
     * Gets the networkModerations value for this Network.
     * 
     * @return networkModerations
     */
    public com.sforce.soap.enterprise.QueryResult getNetworkModerations() {
        return networkModerations;
    }


    /**
     * Sets the networkModerations value for this Network.
     * 
     * @param networkModerations
     */
    public void setNetworkModerations(com.sforce.soap.enterprise.QueryResult networkModerations) {
        this.networkModerations = networkModerations;
    }


    /**
     * Gets the newSenderAddress value for this Network.
     * 
     * @return newSenderAddress
     */
    public java.lang.String getNewSenderAddress() {
        return newSenderAddress;
    }


    /**
     * Sets the newSenderAddress value for this Network.
     * 
     * @param newSenderAddress
     */
    public void setNewSenderAddress(java.lang.String newSenderAddress) {
        this.newSenderAddress = newSenderAddress;
    }


    /**
     * Gets the optionsAllowMembersToFlag value for this Network.
     * 
     * @return optionsAllowMembersToFlag
     */
    public java.lang.Boolean getOptionsAllowMembersToFlag() {
        return optionsAllowMembersToFlag;
    }


    /**
     * Sets the optionsAllowMembersToFlag value for this Network.
     * 
     * @param optionsAllowMembersToFlag
     */
    public void setOptionsAllowMembersToFlag(java.lang.Boolean optionsAllowMembersToFlag) {
        this.optionsAllowMembersToFlag = optionsAllowMembersToFlag;
    }


    /**
     * Gets the optionsGuestChatterEnabled value for this Network.
     * 
     * @return optionsGuestChatterEnabled
     */
    public java.lang.Boolean getOptionsGuestChatterEnabled() {
        return optionsGuestChatterEnabled;
    }


    /**
     * Sets the optionsGuestChatterEnabled value for this Network.
     * 
     * @param optionsGuestChatterEnabled
     */
    public void setOptionsGuestChatterEnabled(java.lang.Boolean optionsGuestChatterEnabled) {
        this.optionsGuestChatterEnabled = optionsGuestChatterEnabled;
    }


    /**
     * Gets the optionsInvitationsEnabled value for this Network.
     * 
     * @return optionsInvitationsEnabled
     */
    public java.lang.Boolean getOptionsInvitationsEnabled() {
        return optionsInvitationsEnabled;
    }


    /**
     * Sets the optionsInvitationsEnabled value for this Network.
     * 
     * @param optionsInvitationsEnabled
     */
    public void setOptionsInvitationsEnabled(java.lang.Boolean optionsInvitationsEnabled) {
        this.optionsInvitationsEnabled = optionsInvitationsEnabled;
    }


    /**
     * Gets the optionsKnowledgeableEnabled value for this Network.
     * 
     * @return optionsKnowledgeableEnabled
     */
    public java.lang.Boolean getOptionsKnowledgeableEnabled() {
        return optionsKnowledgeableEnabled;
    }


    /**
     * Sets the optionsKnowledgeableEnabled value for this Network.
     * 
     * @param optionsKnowledgeableEnabled
     */
    public void setOptionsKnowledgeableEnabled(java.lang.Boolean optionsKnowledgeableEnabled) {
        this.optionsKnowledgeableEnabled = optionsKnowledgeableEnabled;
    }


    /**
     * Gets the optionsNicknameDisplayEnabled value for this Network.
     * 
     * @return optionsNicknameDisplayEnabled
     */
    public java.lang.Boolean getOptionsNicknameDisplayEnabled() {
        return optionsNicknameDisplayEnabled;
    }


    /**
     * Sets the optionsNicknameDisplayEnabled value for this Network.
     * 
     * @param optionsNicknameDisplayEnabled
     */
    public void setOptionsNicknameDisplayEnabled(java.lang.Boolean optionsNicknameDisplayEnabled) {
        this.optionsNicknameDisplayEnabled = optionsNicknameDisplayEnabled;
    }


    /**
     * Gets the optionsPrivateMessagesEnabled value for this Network.
     * 
     * @return optionsPrivateMessagesEnabled
     */
    public java.lang.Boolean getOptionsPrivateMessagesEnabled() {
        return optionsPrivateMessagesEnabled;
    }


    /**
     * Sets the optionsPrivateMessagesEnabled value for this Network.
     * 
     * @param optionsPrivateMessagesEnabled
     */
    public void setOptionsPrivateMessagesEnabled(java.lang.Boolean optionsPrivateMessagesEnabled) {
        this.optionsPrivateMessagesEnabled = optionsPrivateMessagesEnabled;
    }


    /**
     * Gets the optionsReputationEnabled value for this Network.
     * 
     * @return optionsReputationEnabled
     */
    public java.lang.Boolean getOptionsReputationEnabled() {
        return optionsReputationEnabled;
    }


    /**
     * Sets the optionsReputationEnabled value for this Network.
     * 
     * @param optionsReputationEnabled
     */
    public void setOptionsReputationEnabled(java.lang.Boolean optionsReputationEnabled) {
        this.optionsReputationEnabled = optionsReputationEnabled;
    }


    /**
     * Gets the optionsSelfRegistrationEnabled value for this Network.
     * 
     * @return optionsSelfRegistrationEnabled
     */
    public java.lang.Boolean getOptionsSelfRegistrationEnabled() {
        return optionsSelfRegistrationEnabled;
    }


    /**
     * Sets the optionsSelfRegistrationEnabled value for this Network.
     * 
     * @param optionsSelfRegistrationEnabled
     */
    public void setOptionsSelfRegistrationEnabled(java.lang.Boolean optionsSelfRegistrationEnabled) {
        this.optionsSelfRegistrationEnabled = optionsSelfRegistrationEnabled;
    }


    /**
     * Gets the optionsSendWelcomeEmail value for this Network.
     * 
     * @return optionsSendWelcomeEmail
     */
    public java.lang.Boolean getOptionsSendWelcomeEmail() {
        return optionsSendWelcomeEmail;
    }


    /**
     * Sets the optionsSendWelcomeEmail value for this Network.
     * 
     * @param optionsSendWelcomeEmail
     */
    public void setOptionsSendWelcomeEmail(java.lang.Boolean optionsSendWelcomeEmail) {
        this.optionsSendWelcomeEmail = optionsSendWelcomeEmail;
    }


    /**
     * Gets the optionsShowAllNetworkSettings value for this Network.
     * 
     * @return optionsShowAllNetworkSettings
     */
    public java.lang.Boolean getOptionsShowAllNetworkSettings() {
        return optionsShowAllNetworkSettings;
    }


    /**
     * Sets the optionsShowAllNetworkSettings value for this Network.
     * 
     * @param optionsShowAllNetworkSettings
     */
    public void setOptionsShowAllNetworkSettings(java.lang.Boolean optionsShowAllNetworkSettings) {
        this.optionsShowAllNetworkSettings = optionsShowAllNetworkSettings;
    }


    /**
     * Gets the optionsSiteAsContainerEnabled value for this Network.
     * 
     * @return optionsSiteAsContainerEnabled
     */
    public java.lang.Boolean getOptionsSiteAsContainerEnabled() {
        return optionsSiteAsContainerEnabled;
    }


    /**
     * Sets the optionsSiteAsContainerEnabled value for this Network.
     * 
     * @param optionsSiteAsContainerEnabled
     */
    public void setOptionsSiteAsContainerEnabled(java.lang.Boolean optionsSiteAsContainerEnabled) {
        this.optionsSiteAsContainerEnabled = optionsSiteAsContainerEnabled;
    }


    /**
     * Gets the selfRegProfileId value for this Network.
     * 
     * @return selfRegProfileId
     */
    public java.lang.String getSelfRegProfileId() {
        return selfRegProfileId;
    }


    /**
     * Sets the selfRegProfileId value for this Network.
     * 
     * @param selfRegProfileId
     */
    public void setSelfRegProfileId(java.lang.String selfRegProfileId) {
        this.selfRegProfileId = selfRegProfileId;
    }


    /**
     * Gets the status value for this Network.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Network.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the systemModstamp value for this Network.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this Network.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the urlPathPrefix value for this Network.
     * 
     * @return urlPathPrefix
     */
    public java.lang.String getUrlPathPrefix() {
        return urlPathPrefix;
    }


    /**
     * Sets the urlPathPrefix value for this Network.
     * 
     * @param urlPathPrefix
     */
    public void setUrlPathPrefix(java.lang.String urlPathPrefix) {
        this.urlPathPrefix = urlPathPrefix;
    }


    /**
     * Gets the welcomeEmailTemplateId value for this Network.
     * 
     * @return welcomeEmailTemplateId
     */
    public java.lang.String getWelcomeEmailTemplateId() {
        return welcomeEmailTemplateId;
    }


    /**
     * Sets the welcomeEmailTemplateId value for this Network.
     * 
     * @param welcomeEmailTemplateId
     */
    public void setWelcomeEmailTemplateId(java.lang.String welcomeEmailTemplateId) {
        this.welcomeEmailTemplateId = welcomeEmailTemplateId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Network)) return false;
        Network other = (Network) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.allowedExtensions==null && other.getAllowedExtensions()==null) || 
             (this.allowedExtensions!=null &&
              this.allowedExtensions.equals(other.getAllowedExtensions()))) &&
            ((this.attachedContentDocuments==null && other.getAttachedContentDocuments()==null) || 
             (this.attachedContentDocuments!=null &&
              this.attachedContentDocuments.equals(other.getAttachedContentDocuments()))) &&
            ((this.caseCommentEmailTemplateId==null && other.getCaseCommentEmailTemplateId()==null) || 
             (this.caseCommentEmailTemplateId!=null &&
              this.caseCommentEmailTemplateId.equals(other.getCaseCommentEmailTemplateId()))) &&
            ((this.changePasswordEmailTemplateId==null && other.getChangePasswordEmailTemplateId()==null) || 
             (this.changePasswordEmailTemplateId!=null &&
              this.changePasswordEmailTemplateId.equals(other.getChangePasswordEmailTemplateId()))) &&
            ((this.combinedAttachments==null && other.getCombinedAttachments()==null) || 
             (this.combinedAttachments!=null &&
              this.combinedAttachments.equals(other.getCombinedAttachments()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.customBrands==null && other.getCustomBrands()==null) || 
             (this.customBrands!=null &&
              this.customBrands.equals(other.getCustomBrands()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.emailFooterLogoId==null && other.getEmailFooterLogoId()==null) || 
             (this.emailFooterLogoId!=null &&
              this.emailFooterLogoId.equals(other.getEmailFooterLogoId()))) &&
            ((this.emailFooterText==null && other.getEmailFooterText()==null) || 
             (this.emailFooterText!=null &&
              this.emailFooterText.equals(other.getEmailFooterText()))) &&
            ((this.emailSenderAddress==null && other.getEmailSenderAddress()==null) || 
             (this.emailSenderAddress!=null &&
              this.emailSenderAddress.equals(other.getEmailSenderAddress()))) &&
            ((this.emailSenderName==null && other.getEmailSenderName()==null) || 
             (this.emailSenderName!=null &&
              this.emailSenderName.equals(other.getEmailSenderName()))) &&
            ((this.firstActivationDate==null && other.getFirstActivationDate()==null) || 
             (this.firstActivationDate!=null &&
              this.firstActivationDate.equals(other.getFirstActivationDate()))) &&
            ((this.forgotPasswordEmailTemplateId==null && other.getForgotPasswordEmailTemplateId()==null) || 
             (this.forgotPasswordEmailTemplateId!=null &&
              this.forgotPasswordEmailTemplateId.equals(other.getForgotPasswordEmailTemplateId()))) &&
            ((this.lastModifiedBy==null && other.getLastModifiedBy()==null) || 
             (this.lastModifiedBy!=null &&
              this.lastModifiedBy.equals(other.getLastModifiedBy()))) &&
            ((this.lastModifiedById==null && other.getLastModifiedById()==null) || 
             (this.lastModifiedById!=null &&
              this.lastModifiedById.equals(other.getLastModifiedById()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.maxFileSizeKb==null && other.getMaxFileSizeKb()==null) || 
             (this.maxFileSizeKb!=null &&
              this.maxFileSizeKb.equals(other.getMaxFileSizeKb()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.networkActivityAudits==null && other.getNetworkActivityAudits()==null) || 
             (this.networkActivityAudits!=null &&
              this.networkActivityAudits.equals(other.getNetworkActivityAudits()))) &&
            ((this.networkCollaborationGroups==null && other.getNetworkCollaborationGroups()==null) || 
             (this.networkCollaborationGroups!=null &&
              this.networkCollaborationGroups.equals(other.getNetworkCollaborationGroups()))) &&
            ((this.networkEntitySubscriptions==null && other.getNetworkEntitySubscriptions()==null) || 
             (this.networkEntitySubscriptions!=null &&
              this.networkEntitySubscriptions.equals(other.getNetworkEntitySubscriptions()))) &&
            ((this.networkMembers==null && other.getNetworkMembers()==null) || 
             (this.networkMembers!=null &&
              this.networkMembers.equals(other.getNetworkMembers()))) &&
            ((this.networkModerations==null && other.getNetworkModerations()==null) || 
             (this.networkModerations!=null &&
              this.networkModerations.equals(other.getNetworkModerations()))) &&
            ((this.newSenderAddress==null && other.getNewSenderAddress()==null) || 
             (this.newSenderAddress!=null &&
              this.newSenderAddress.equals(other.getNewSenderAddress()))) &&
            ((this.optionsAllowMembersToFlag==null && other.getOptionsAllowMembersToFlag()==null) || 
             (this.optionsAllowMembersToFlag!=null &&
              this.optionsAllowMembersToFlag.equals(other.getOptionsAllowMembersToFlag()))) &&
            ((this.optionsGuestChatterEnabled==null && other.getOptionsGuestChatterEnabled()==null) || 
             (this.optionsGuestChatterEnabled!=null &&
              this.optionsGuestChatterEnabled.equals(other.getOptionsGuestChatterEnabled()))) &&
            ((this.optionsInvitationsEnabled==null && other.getOptionsInvitationsEnabled()==null) || 
             (this.optionsInvitationsEnabled!=null &&
              this.optionsInvitationsEnabled.equals(other.getOptionsInvitationsEnabled()))) &&
            ((this.optionsKnowledgeableEnabled==null && other.getOptionsKnowledgeableEnabled()==null) || 
             (this.optionsKnowledgeableEnabled!=null &&
              this.optionsKnowledgeableEnabled.equals(other.getOptionsKnowledgeableEnabled()))) &&
            ((this.optionsNicknameDisplayEnabled==null && other.getOptionsNicknameDisplayEnabled()==null) || 
             (this.optionsNicknameDisplayEnabled!=null &&
              this.optionsNicknameDisplayEnabled.equals(other.getOptionsNicknameDisplayEnabled()))) &&
            ((this.optionsPrivateMessagesEnabled==null && other.getOptionsPrivateMessagesEnabled()==null) || 
             (this.optionsPrivateMessagesEnabled!=null &&
              this.optionsPrivateMessagesEnabled.equals(other.getOptionsPrivateMessagesEnabled()))) &&
            ((this.optionsReputationEnabled==null && other.getOptionsReputationEnabled()==null) || 
             (this.optionsReputationEnabled!=null &&
              this.optionsReputationEnabled.equals(other.getOptionsReputationEnabled()))) &&
            ((this.optionsSelfRegistrationEnabled==null && other.getOptionsSelfRegistrationEnabled()==null) || 
             (this.optionsSelfRegistrationEnabled!=null &&
              this.optionsSelfRegistrationEnabled.equals(other.getOptionsSelfRegistrationEnabled()))) &&
            ((this.optionsSendWelcomeEmail==null && other.getOptionsSendWelcomeEmail()==null) || 
             (this.optionsSendWelcomeEmail!=null &&
              this.optionsSendWelcomeEmail.equals(other.getOptionsSendWelcomeEmail()))) &&
            ((this.optionsShowAllNetworkSettings==null && other.getOptionsShowAllNetworkSettings()==null) || 
             (this.optionsShowAllNetworkSettings!=null &&
              this.optionsShowAllNetworkSettings.equals(other.getOptionsShowAllNetworkSettings()))) &&
            ((this.optionsSiteAsContainerEnabled==null && other.getOptionsSiteAsContainerEnabled()==null) || 
             (this.optionsSiteAsContainerEnabled!=null &&
              this.optionsSiteAsContainerEnabled.equals(other.getOptionsSiteAsContainerEnabled()))) &&
            ((this.selfRegProfileId==null && other.getSelfRegProfileId()==null) || 
             (this.selfRegProfileId!=null &&
              this.selfRegProfileId.equals(other.getSelfRegProfileId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.urlPathPrefix==null && other.getUrlPathPrefix()==null) || 
             (this.urlPathPrefix!=null &&
              this.urlPathPrefix.equals(other.getUrlPathPrefix()))) &&
            ((this.welcomeEmailTemplateId==null && other.getWelcomeEmailTemplateId()==null) || 
             (this.welcomeEmailTemplateId!=null &&
              this.welcomeEmailTemplateId.equals(other.getWelcomeEmailTemplateId())));
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
        if (getAllowedExtensions() != null) {
            _hashCode += getAllowedExtensions().hashCode();
        }
        if (getAttachedContentDocuments() != null) {
            _hashCode += getAttachedContentDocuments().hashCode();
        }
        if (getCaseCommentEmailTemplateId() != null) {
            _hashCode += getCaseCommentEmailTemplateId().hashCode();
        }
        if (getChangePasswordEmailTemplateId() != null) {
            _hashCode += getChangePasswordEmailTemplateId().hashCode();
        }
        if (getCombinedAttachments() != null) {
            _hashCode += getCombinedAttachments().hashCode();
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
        if (getCustomBrands() != null) {
            _hashCode += getCustomBrands().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEmailFooterLogoId() != null) {
            _hashCode += getEmailFooterLogoId().hashCode();
        }
        if (getEmailFooterText() != null) {
            _hashCode += getEmailFooterText().hashCode();
        }
        if (getEmailSenderAddress() != null) {
            _hashCode += getEmailSenderAddress().hashCode();
        }
        if (getEmailSenderName() != null) {
            _hashCode += getEmailSenderName().hashCode();
        }
        if (getFirstActivationDate() != null) {
            _hashCode += getFirstActivationDate().hashCode();
        }
        if (getForgotPasswordEmailTemplateId() != null) {
            _hashCode += getForgotPasswordEmailTemplateId().hashCode();
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
        if (getMaxFileSizeKb() != null) {
            _hashCode += getMaxFileSizeKb().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNetworkActivityAudits() != null) {
            _hashCode += getNetworkActivityAudits().hashCode();
        }
        if (getNetworkCollaborationGroups() != null) {
            _hashCode += getNetworkCollaborationGroups().hashCode();
        }
        if (getNetworkEntitySubscriptions() != null) {
            _hashCode += getNetworkEntitySubscriptions().hashCode();
        }
        if (getNetworkMembers() != null) {
            _hashCode += getNetworkMembers().hashCode();
        }
        if (getNetworkModerations() != null) {
            _hashCode += getNetworkModerations().hashCode();
        }
        if (getNewSenderAddress() != null) {
            _hashCode += getNewSenderAddress().hashCode();
        }
        if (getOptionsAllowMembersToFlag() != null) {
            _hashCode += getOptionsAllowMembersToFlag().hashCode();
        }
        if (getOptionsGuestChatterEnabled() != null) {
            _hashCode += getOptionsGuestChatterEnabled().hashCode();
        }
        if (getOptionsInvitationsEnabled() != null) {
            _hashCode += getOptionsInvitationsEnabled().hashCode();
        }
        if (getOptionsKnowledgeableEnabled() != null) {
            _hashCode += getOptionsKnowledgeableEnabled().hashCode();
        }
        if (getOptionsNicknameDisplayEnabled() != null) {
            _hashCode += getOptionsNicknameDisplayEnabled().hashCode();
        }
        if (getOptionsPrivateMessagesEnabled() != null) {
            _hashCode += getOptionsPrivateMessagesEnabled().hashCode();
        }
        if (getOptionsReputationEnabled() != null) {
            _hashCode += getOptionsReputationEnabled().hashCode();
        }
        if (getOptionsSelfRegistrationEnabled() != null) {
            _hashCode += getOptionsSelfRegistrationEnabled().hashCode();
        }
        if (getOptionsSendWelcomeEmail() != null) {
            _hashCode += getOptionsSendWelcomeEmail().hashCode();
        }
        if (getOptionsShowAllNetworkSettings() != null) {
            _hashCode += getOptionsShowAllNetworkSettings().hashCode();
        }
        if (getOptionsSiteAsContainerEnabled() != null) {
            _hashCode += getOptionsSiteAsContainerEnabled().hashCode();
        }
        if (getSelfRegProfileId() != null) {
            _hashCode += getSelfRegProfileId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getUrlPathPrefix() != null) {
            _hashCode += getUrlPathPrefix().hashCode();
        }
        if (getWelcomeEmailTemplateId() != null) {
            _hashCode += getWelcomeEmailTemplateId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Network.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Network"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedExtensions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "AllowedExtensions"));
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
        elemField.setFieldName("caseCommentEmailTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CaseCommentEmailTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changePasswordEmailTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ChangePasswordEmailTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("customBrands");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CustomBrands"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
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
        elemField.setFieldName("emailFooterLogoId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailFooterLogoId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailFooterText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailFooterText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSenderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailSenderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailSenderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "EmailSenderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstActivationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FirstActivationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forgotPasswordEmailTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ForgotPasswordEmailTemplateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("maxFileSizeKb");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MaxFileSizeKb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("networkActivityAudits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkActivityAudits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkCollaborationGroups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkCollaborationGroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkEntitySubscriptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkEntitySubscriptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkMembers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkMembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkModerations");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkModerations"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newSenderAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NewSenderAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsAllowMembersToFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsAllowMembersToFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsGuestChatterEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsGuestChatterEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsInvitationsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsInvitationsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsKnowledgeableEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsKnowledgeableEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsNicknameDisplayEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsNicknameDisplayEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsPrivateMessagesEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsPrivateMessagesEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsReputationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsReputationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsSelfRegistrationEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsSelfRegistrationEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsSendWelcomeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsSendWelcomeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsShowAllNetworkSettings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsShowAllNetworkSettings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionsSiteAsContainerEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "OptionsSiteAsContainerEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selfRegProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SelfRegProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("systemModstamp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "SystemModstamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlPathPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "UrlPathPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("welcomeEmailTemplateId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "WelcomeEmailTemplateId"));
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
