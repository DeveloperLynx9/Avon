/**
 * NetworkMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class NetworkMember  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private com.sforce.soap.enterprise.sobject.User createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private java.lang.String defaultGroupNotificationFrequency;

    private java.lang.String digestFrequency;

    private java.util.Date lastChatterActivityDate;

    private com.sforce.soap.enterprise.sobject.User member;

    private java.lang.String memberId;

    private com.sforce.soap.enterprise.sobject.Network network;

    private java.lang.String networkId;

    private java.lang.Boolean preferencesDisCommentAfterLikeEmail;

    private java.lang.Boolean preferencesDisMentionsCommentEmail;

    private java.lang.Boolean preferencesDisProfPostCommentEmail;

    private java.lang.Boolean preferencesDisableAllFeedsEmail;

    private java.lang.Boolean preferencesDisableBookmarkEmail;

    private java.lang.Boolean preferencesDisableChangeCommentEmail;

    private java.lang.Boolean preferencesDisableEndorsementEmail;

    private java.lang.Boolean preferencesDisableFollowersEmail;

    private java.lang.Boolean preferencesDisableItemFlaggedEmail;

    private java.lang.Boolean preferencesDisableLaterCommentEmail;

    private java.lang.Boolean preferencesDisableLikeEmail;

    private java.lang.Boolean preferencesDisableMentionsPostEmail;

    private java.lang.Boolean preferencesDisableMessageEmail;

    private java.lang.Boolean preferencesDisableProfilePostEmail;

    private java.lang.Boolean preferencesDisableSharePostEmail;

    private java.lang.Double reputationPoints;

    private java.util.Calendar systemModstamp;

    public NetworkMember() {
    }

    public NetworkMember(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           com.sforce.soap.enterprise.sobject.User createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           java.lang.String defaultGroupNotificationFrequency,
           java.lang.String digestFrequency,
           java.util.Date lastChatterActivityDate,
           com.sforce.soap.enterprise.sobject.User member,
           java.lang.String memberId,
           com.sforce.soap.enterprise.sobject.Network network,
           java.lang.String networkId,
           java.lang.Boolean preferencesDisCommentAfterLikeEmail,
           java.lang.Boolean preferencesDisMentionsCommentEmail,
           java.lang.Boolean preferencesDisProfPostCommentEmail,
           java.lang.Boolean preferencesDisableAllFeedsEmail,
           java.lang.Boolean preferencesDisableBookmarkEmail,
           java.lang.Boolean preferencesDisableChangeCommentEmail,
           java.lang.Boolean preferencesDisableEndorsementEmail,
           java.lang.Boolean preferencesDisableFollowersEmail,
           java.lang.Boolean preferencesDisableItemFlaggedEmail,
           java.lang.Boolean preferencesDisableLaterCommentEmail,
           java.lang.Boolean preferencesDisableLikeEmail,
           java.lang.Boolean preferencesDisableMentionsPostEmail,
           java.lang.Boolean preferencesDisableMessageEmail,
           java.lang.Boolean preferencesDisableProfilePostEmail,
           java.lang.Boolean preferencesDisableSharePostEmail,
           java.lang.Double reputationPoints,
           java.util.Calendar systemModstamp) {
        super(
            fieldsToNull,
            id);
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.defaultGroupNotificationFrequency = defaultGroupNotificationFrequency;
        this.digestFrequency = digestFrequency;
        this.lastChatterActivityDate = lastChatterActivityDate;
        this.member = member;
        this.memberId = memberId;
        this.network = network;
        this.networkId = networkId;
        this.preferencesDisCommentAfterLikeEmail = preferencesDisCommentAfterLikeEmail;
        this.preferencesDisMentionsCommentEmail = preferencesDisMentionsCommentEmail;
        this.preferencesDisProfPostCommentEmail = preferencesDisProfPostCommentEmail;
        this.preferencesDisableAllFeedsEmail = preferencesDisableAllFeedsEmail;
        this.preferencesDisableBookmarkEmail = preferencesDisableBookmarkEmail;
        this.preferencesDisableChangeCommentEmail = preferencesDisableChangeCommentEmail;
        this.preferencesDisableEndorsementEmail = preferencesDisableEndorsementEmail;
        this.preferencesDisableFollowersEmail = preferencesDisableFollowersEmail;
        this.preferencesDisableItemFlaggedEmail = preferencesDisableItemFlaggedEmail;
        this.preferencesDisableLaterCommentEmail = preferencesDisableLaterCommentEmail;
        this.preferencesDisableLikeEmail = preferencesDisableLikeEmail;
        this.preferencesDisableMentionsPostEmail = preferencesDisableMentionsPostEmail;
        this.preferencesDisableMessageEmail = preferencesDisableMessageEmail;
        this.preferencesDisableProfilePostEmail = preferencesDisableProfilePostEmail;
        this.preferencesDisableSharePostEmail = preferencesDisableSharePostEmail;
        this.reputationPoints = reputationPoints;
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the createdBy value for this NetworkMember.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.User getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this NetworkMember.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this NetworkMember.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this NetworkMember.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this NetworkMember.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this NetworkMember.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the defaultGroupNotificationFrequency value for this NetworkMember.
     * 
     * @return defaultGroupNotificationFrequency
     */
    public java.lang.String getDefaultGroupNotificationFrequency() {
        return defaultGroupNotificationFrequency;
    }


    /**
     * Sets the defaultGroupNotificationFrequency value for this NetworkMember.
     * 
     * @param defaultGroupNotificationFrequency
     */
    public void setDefaultGroupNotificationFrequency(java.lang.String defaultGroupNotificationFrequency) {
        this.defaultGroupNotificationFrequency = defaultGroupNotificationFrequency;
    }


    /**
     * Gets the digestFrequency value for this NetworkMember.
     * 
     * @return digestFrequency
     */
    public java.lang.String getDigestFrequency() {
        return digestFrequency;
    }


    /**
     * Sets the digestFrequency value for this NetworkMember.
     * 
     * @param digestFrequency
     */
    public void setDigestFrequency(java.lang.String digestFrequency) {
        this.digestFrequency = digestFrequency;
    }


    /**
     * Gets the lastChatterActivityDate value for this NetworkMember.
     * 
     * @return lastChatterActivityDate
     */
    public java.util.Date getLastChatterActivityDate() {
        return lastChatterActivityDate;
    }


    /**
     * Sets the lastChatterActivityDate value for this NetworkMember.
     * 
     * @param lastChatterActivityDate
     */
    public void setLastChatterActivityDate(java.util.Date lastChatterActivityDate) {
        this.lastChatterActivityDate = lastChatterActivityDate;
    }


    /**
     * Gets the member value for this NetworkMember.
     * 
     * @return member
     */
    public com.sforce.soap.enterprise.sobject.User getMember() {
        return member;
    }


    /**
     * Sets the member value for this NetworkMember.
     * 
     * @param member
     */
    public void setMember(com.sforce.soap.enterprise.sobject.User member) {
        this.member = member;
    }


    /**
     * Gets the memberId value for this NetworkMember.
     * 
     * @return memberId
     */
    public java.lang.String getMemberId() {
        return memberId;
    }


    /**
     * Sets the memberId value for this NetworkMember.
     * 
     * @param memberId
     */
    public void setMemberId(java.lang.String memberId) {
        this.memberId = memberId;
    }


    /**
     * Gets the network value for this NetworkMember.
     * 
     * @return network
     */
    public com.sforce.soap.enterprise.sobject.Network getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this NetworkMember.
     * 
     * @param network
     */
    public void setNetwork(com.sforce.soap.enterprise.sobject.Network network) {
        this.network = network;
    }


    /**
     * Gets the networkId value for this NetworkMember.
     * 
     * @return networkId
     */
    public java.lang.String getNetworkId() {
        return networkId;
    }


    /**
     * Sets the networkId value for this NetworkMember.
     * 
     * @param networkId
     */
    public void setNetworkId(java.lang.String networkId) {
        this.networkId = networkId;
    }


    /**
     * Gets the preferencesDisCommentAfterLikeEmail value for this NetworkMember.
     * 
     * @return preferencesDisCommentAfterLikeEmail
     */
    public java.lang.Boolean getPreferencesDisCommentAfterLikeEmail() {
        return preferencesDisCommentAfterLikeEmail;
    }


    /**
     * Sets the preferencesDisCommentAfterLikeEmail value for this NetworkMember.
     * 
     * @param preferencesDisCommentAfterLikeEmail
     */
    public void setPreferencesDisCommentAfterLikeEmail(java.lang.Boolean preferencesDisCommentAfterLikeEmail) {
        this.preferencesDisCommentAfterLikeEmail = preferencesDisCommentAfterLikeEmail;
    }


    /**
     * Gets the preferencesDisMentionsCommentEmail value for this NetworkMember.
     * 
     * @return preferencesDisMentionsCommentEmail
     */
    public java.lang.Boolean getPreferencesDisMentionsCommentEmail() {
        return preferencesDisMentionsCommentEmail;
    }


    /**
     * Sets the preferencesDisMentionsCommentEmail value for this NetworkMember.
     * 
     * @param preferencesDisMentionsCommentEmail
     */
    public void setPreferencesDisMentionsCommentEmail(java.lang.Boolean preferencesDisMentionsCommentEmail) {
        this.preferencesDisMentionsCommentEmail = preferencesDisMentionsCommentEmail;
    }


    /**
     * Gets the preferencesDisProfPostCommentEmail value for this NetworkMember.
     * 
     * @return preferencesDisProfPostCommentEmail
     */
    public java.lang.Boolean getPreferencesDisProfPostCommentEmail() {
        return preferencesDisProfPostCommentEmail;
    }


    /**
     * Sets the preferencesDisProfPostCommentEmail value for this NetworkMember.
     * 
     * @param preferencesDisProfPostCommentEmail
     */
    public void setPreferencesDisProfPostCommentEmail(java.lang.Boolean preferencesDisProfPostCommentEmail) {
        this.preferencesDisProfPostCommentEmail = preferencesDisProfPostCommentEmail;
    }


    /**
     * Gets the preferencesDisableAllFeedsEmail value for this NetworkMember.
     * 
     * @return preferencesDisableAllFeedsEmail
     */
    public java.lang.Boolean getPreferencesDisableAllFeedsEmail() {
        return preferencesDisableAllFeedsEmail;
    }


    /**
     * Sets the preferencesDisableAllFeedsEmail value for this NetworkMember.
     * 
     * @param preferencesDisableAllFeedsEmail
     */
    public void setPreferencesDisableAllFeedsEmail(java.lang.Boolean preferencesDisableAllFeedsEmail) {
        this.preferencesDisableAllFeedsEmail = preferencesDisableAllFeedsEmail;
    }


    /**
     * Gets the preferencesDisableBookmarkEmail value for this NetworkMember.
     * 
     * @return preferencesDisableBookmarkEmail
     */
    public java.lang.Boolean getPreferencesDisableBookmarkEmail() {
        return preferencesDisableBookmarkEmail;
    }


    /**
     * Sets the preferencesDisableBookmarkEmail value for this NetworkMember.
     * 
     * @param preferencesDisableBookmarkEmail
     */
    public void setPreferencesDisableBookmarkEmail(java.lang.Boolean preferencesDisableBookmarkEmail) {
        this.preferencesDisableBookmarkEmail = preferencesDisableBookmarkEmail;
    }


    /**
     * Gets the preferencesDisableChangeCommentEmail value for this NetworkMember.
     * 
     * @return preferencesDisableChangeCommentEmail
     */
    public java.lang.Boolean getPreferencesDisableChangeCommentEmail() {
        return preferencesDisableChangeCommentEmail;
    }


    /**
     * Sets the preferencesDisableChangeCommentEmail value for this NetworkMember.
     * 
     * @param preferencesDisableChangeCommentEmail
     */
    public void setPreferencesDisableChangeCommentEmail(java.lang.Boolean preferencesDisableChangeCommentEmail) {
        this.preferencesDisableChangeCommentEmail = preferencesDisableChangeCommentEmail;
    }


    /**
     * Gets the preferencesDisableEndorsementEmail value for this NetworkMember.
     * 
     * @return preferencesDisableEndorsementEmail
     */
    public java.lang.Boolean getPreferencesDisableEndorsementEmail() {
        return preferencesDisableEndorsementEmail;
    }


    /**
     * Sets the preferencesDisableEndorsementEmail value for this NetworkMember.
     * 
     * @param preferencesDisableEndorsementEmail
     */
    public void setPreferencesDisableEndorsementEmail(java.lang.Boolean preferencesDisableEndorsementEmail) {
        this.preferencesDisableEndorsementEmail = preferencesDisableEndorsementEmail;
    }


    /**
     * Gets the preferencesDisableFollowersEmail value for this NetworkMember.
     * 
     * @return preferencesDisableFollowersEmail
     */
    public java.lang.Boolean getPreferencesDisableFollowersEmail() {
        return preferencesDisableFollowersEmail;
    }


    /**
     * Sets the preferencesDisableFollowersEmail value for this NetworkMember.
     * 
     * @param preferencesDisableFollowersEmail
     */
    public void setPreferencesDisableFollowersEmail(java.lang.Boolean preferencesDisableFollowersEmail) {
        this.preferencesDisableFollowersEmail = preferencesDisableFollowersEmail;
    }


    /**
     * Gets the preferencesDisableItemFlaggedEmail value for this NetworkMember.
     * 
     * @return preferencesDisableItemFlaggedEmail
     */
    public java.lang.Boolean getPreferencesDisableItemFlaggedEmail() {
        return preferencesDisableItemFlaggedEmail;
    }


    /**
     * Sets the preferencesDisableItemFlaggedEmail value for this NetworkMember.
     * 
     * @param preferencesDisableItemFlaggedEmail
     */
    public void setPreferencesDisableItemFlaggedEmail(java.lang.Boolean preferencesDisableItemFlaggedEmail) {
        this.preferencesDisableItemFlaggedEmail = preferencesDisableItemFlaggedEmail;
    }


    /**
     * Gets the preferencesDisableLaterCommentEmail value for this NetworkMember.
     * 
     * @return preferencesDisableLaterCommentEmail
     */
    public java.lang.Boolean getPreferencesDisableLaterCommentEmail() {
        return preferencesDisableLaterCommentEmail;
    }


    /**
     * Sets the preferencesDisableLaterCommentEmail value for this NetworkMember.
     * 
     * @param preferencesDisableLaterCommentEmail
     */
    public void setPreferencesDisableLaterCommentEmail(java.lang.Boolean preferencesDisableLaterCommentEmail) {
        this.preferencesDisableLaterCommentEmail = preferencesDisableLaterCommentEmail;
    }


    /**
     * Gets the preferencesDisableLikeEmail value for this NetworkMember.
     * 
     * @return preferencesDisableLikeEmail
     */
    public java.lang.Boolean getPreferencesDisableLikeEmail() {
        return preferencesDisableLikeEmail;
    }


    /**
     * Sets the preferencesDisableLikeEmail value for this NetworkMember.
     * 
     * @param preferencesDisableLikeEmail
     */
    public void setPreferencesDisableLikeEmail(java.lang.Boolean preferencesDisableLikeEmail) {
        this.preferencesDisableLikeEmail = preferencesDisableLikeEmail;
    }


    /**
     * Gets the preferencesDisableMentionsPostEmail value for this NetworkMember.
     * 
     * @return preferencesDisableMentionsPostEmail
     */
    public java.lang.Boolean getPreferencesDisableMentionsPostEmail() {
        return preferencesDisableMentionsPostEmail;
    }


    /**
     * Sets the preferencesDisableMentionsPostEmail value for this NetworkMember.
     * 
     * @param preferencesDisableMentionsPostEmail
     */
    public void setPreferencesDisableMentionsPostEmail(java.lang.Boolean preferencesDisableMentionsPostEmail) {
        this.preferencesDisableMentionsPostEmail = preferencesDisableMentionsPostEmail;
    }


    /**
     * Gets the preferencesDisableMessageEmail value for this NetworkMember.
     * 
     * @return preferencesDisableMessageEmail
     */
    public java.lang.Boolean getPreferencesDisableMessageEmail() {
        return preferencesDisableMessageEmail;
    }


    /**
     * Sets the preferencesDisableMessageEmail value for this NetworkMember.
     * 
     * @param preferencesDisableMessageEmail
     */
    public void setPreferencesDisableMessageEmail(java.lang.Boolean preferencesDisableMessageEmail) {
        this.preferencesDisableMessageEmail = preferencesDisableMessageEmail;
    }


    /**
     * Gets the preferencesDisableProfilePostEmail value for this NetworkMember.
     * 
     * @return preferencesDisableProfilePostEmail
     */
    public java.lang.Boolean getPreferencesDisableProfilePostEmail() {
        return preferencesDisableProfilePostEmail;
    }


    /**
     * Sets the preferencesDisableProfilePostEmail value for this NetworkMember.
     * 
     * @param preferencesDisableProfilePostEmail
     */
    public void setPreferencesDisableProfilePostEmail(java.lang.Boolean preferencesDisableProfilePostEmail) {
        this.preferencesDisableProfilePostEmail = preferencesDisableProfilePostEmail;
    }


    /**
     * Gets the preferencesDisableSharePostEmail value for this NetworkMember.
     * 
     * @return preferencesDisableSharePostEmail
     */
    public java.lang.Boolean getPreferencesDisableSharePostEmail() {
        return preferencesDisableSharePostEmail;
    }


    /**
     * Sets the preferencesDisableSharePostEmail value for this NetworkMember.
     * 
     * @param preferencesDisableSharePostEmail
     */
    public void setPreferencesDisableSharePostEmail(java.lang.Boolean preferencesDisableSharePostEmail) {
        this.preferencesDisableSharePostEmail = preferencesDisableSharePostEmail;
    }


    /**
     * Gets the reputationPoints value for this NetworkMember.
     * 
     * @return reputationPoints
     */
    public java.lang.Double getReputationPoints() {
        return reputationPoints;
    }


    /**
     * Sets the reputationPoints value for this NetworkMember.
     * 
     * @param reputationPoints
     */
    public void setReputationPoints(java.lang.Double reputationPoints) {
        this.reputationPoints = reputationPoints;
    }


    /**
     * Gets the systemModstamp value for this NetworkMember.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this NetworkMember.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NetworkMember)) return false;
        NetworkMember other = (NetworkMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.defaultGroupNotificationFrequency==null && other.getDefaultGroupNotificationFrequency()==null) || 
             (this.defaultGroupNotificationFrequency!=null &&
              this.defaultGroupNotificationFrequency.equals(other.getDefaultGroupNotificationFrequency()))) &&
            ((this.digestFrequency==null && other.getDigestFrequency()==null) || 
             (this.digestFrequency!=null &&
              this.digestFrequency.equals(other.getDigestFrequency()))) &&
            ((this.lastChatterActivityDate==null && other.getLastChatterActivityDate()==null) || 
             (this.lastChatterActivityDate!=null &&
              this.lastChatterActivityDate.equals(other.getLastChatterActivityDate()))) &&
            ((this.member==null && other.getMember()==null) || 
             (this.member!=null &&
              this.member.equals(other.getMember()))) &&
            ((this.memberId==null && other.getMemberId()==null) || 
             (this.memberId!=null &&
              this.memberId.equals(other.getMemberId()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.networkId==null && other.getNetworkId()==null) || 
             (this.networkId!=null &&
              this.networkId.equals(other.getNetworkId()))) &&
            ((this.preferencesDisCommentAfterLikeEmail==null && other.getPreferencesDisCommentAfterLikeEmail()==null) || 
             (this.preferencesDisCommentAfterLikeEmail!=null &&
              this.preferencesDisCommentAfterLikeEmail.equals(other.getPreferencesDisCommentAfterLikeEmail()))) &&
            ((this.preferencesDisMentionsCommentEmail==null && other.getPreferencesDisMentionsCommentEmail()==null) || 
             (this.preferencesDisMentionsCommentEmail!=null &&
              this.preferencesDisMentionsCommentEmail.equals(other.getPreferencesDisMentionsCommentEmail()))) &&
            ((this.preferencesDisProfPostCommentEmail==null && other.getPreferencesDisProfPostCommentEmail()==null) || 
             (this.preferencesDisProfPostCommentEmail!=null &&
              this.preferencesDisProfPostCommentEmail.equals(other.getPreferencesDisProfPostCommentEmail()))) &&
            ((this.preferencesDisableAllFeedsEmail==null && other.getPreferencesDisableAllFeedsEmail()==null) || 
             (this.preferencesDisableAllFeedsEmail!=null &&
              this.preferencesDisableAllFeedsEmail.equals(other.getPreferencesDisableAllFeedsEmail()))) &&
            ((this.preferencesDisableBookmarkEmail==null && other.getPreferencesDisableBookmarkEmail()==null) || 
             (this.preferencesDisableBookmarkEmail!=null &&
              this.preferencesDisableBookmarkEmail.equals(other.getPreferencesDisableBookmarkEmail()))) &&
            ((this.preferencesDisableChangeCommentEmail==null && other.getPreferencesDisableChangeCommentEmail()==null) || 
             (this.preferencesDisableChangeCommentEmail!=null &&
              this.preferencesDisableChangeCommentEmail.equals(other.getPreferencesDisableChangeCommentEmail()))) &&
            ((this.preferencesDisableEndorsementEmail==null && other.getPreferencesDisableEndorsementEmail()==null) || 
             (this.preferencesDisableEndorsementEmail!=null &&
              this.preferencesDisableEndorsementEmail.equals(other.getPreferencesDisableEndorsementEmail()))) &&
            ((this.preferencesDisableFollowersEmail==null && other.getPreferencesDisableFollowersEmail()==null) || 
             (this.preferencesDisableFollowersEmail!=null &&
              this.preferencesDisableFollowersEmail.equals(other.getPreferencesDisableFollowersEmail()))) &&
            ((this.preferencesDisableItemFlaggedEmail==null && other.getPreferencesDisableItemFlaggedEmail()==null) || 
             (this.preferencesDisableItemFlaggedEmail!=null &&
              this.preferencesDisableItemFlaggedEmail.equals(other.getPreferencesDisableItemFlaggedEmail()))) &&
            ((this.preferencesDisableLaterCommentEmail==null && other.getPreferencesDisableLaterCommentEmail()==null) || 
             (this.preferencesDisableLaterCommentEmail!=null &&
              this.preferencesDisableLaterCommentEmail.equals(other.getPreferencesDisableLaterCommentEmail()))) &&
            ((this.preferencesDisableLikeEmail==null && other.getPreferencesDisableLikeEmail()==null) || 
             (this.preferencesDisableLikeEmail!=null &&
              this.preferencesDisableLikeEmail.equals(other.getPreferencesDisableLikeEmail()))) &&
            ((this.preferencesDisableMentionsPostEmail==null && other.getPreferencesDisableMentionsPostEmail()==null) || 
             (this.preferencesDisableMentionsPostEmail!=null &&
              this.preferencesDisableMentionsPostEmail.equals(other.getPreferencesDisableMentionsPostEmail()))) &&
            ((this.preferencesDisableMessageEmail==null && other.getPreferencesDisableMessageEmail()==null) || 
             (this.preferencesDisableMessageEmail!=null &&
              this.preferencesDisableMessageEmail.equals(other.getPreferencesDisableMessageEmail()))) &&
            ((this.preferencesDisableProfilePostEmail==null && other.getPreferencesDisableProfilePostEmail()==null) || 
             (this.preferencesDisableProfilePostEmail!=null &&
              this.preferencesDisableProfilePostEmail.equals(other.getPreferencesDisableProfilePostEmail()))) &&
            ((this.preferencesDisableSharePostEmail==null && other.getPreferencesDisableSharePostEmail()==null) || 
             (this.preferencesDisableSharePostEmail!=null &&
              this.preferencesDisableSharePostEmail.equals(other.getPreferencesDisableSharePostEmail()))) &&
            ((this.reputationPoints==null && other.getReputationPoints()==null) || 
             (this.reputationPoints!=null &&
              this.reputationPoints.equals(other.getReputationPoints()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp())));
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
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedById() != null) {
            _hashCode += getCreatedById().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDefaultGroupNotificationFrequency() != null) {
            _hashCode += getDefaultGroupNotificationFrequency().hashCode();
        }
        if (getDigestFrequency() != null) {
            _hashCode += getDigestFrequency().hashCode();
        }
        if (getLastChatterActivityDate() != null) {
            _hashCode += getLastChatterActivityDate().hashCode();
        }
        if (getMember() != null) {
            _hashCode += getMember().hashCode();
        }
        if (getMemberId() != null) {
            _hashCode += getMemberId().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getNetworkId() != null) {
            _hashCode += getNetworkId().hashCode();
        }
        if (getPreferencesDisCommentAfterLikeEmail() != null) {
            _hashCode += getPreferencesDisCommentAfterLikeEmail().hashCode();
        }
        if (getPreferencesDisMentionsCommentEmail() != null) {
            _hashCode += getPreferencesDisMentionsCommentEmail().hashCode();
        }
        if (getPreferencesDisProfPostCommentEmail() != null) {
            _hashCode += getPreferencesDisProfPostCommentEmail().hashCode();
        }
        if (getPreferencesDisableAllFeedsEmail() != null) {
            _hashCode += getPreferencesDisableAllFeedsEmail().hashCode();
        }
        if (getPreferencesDisableBookmarkEmail() != null) {
            _hashCode += getPreferencesDisableBookmarkEmail().hashCode();
        }
        if (getPreferencesDisableChangeCommentEmail() != null) {
            _hashCode += getPreferencesDisableChangeCommentEmail().hashCode();
        }
        if (getPreferencesDisableEndorsementEmail() != null) {
            _hashCode += getPreferencesDisableEndorsementEmail().hashCode();
        }
        if (getPreferencesDisableFollowersEmail() != null) {
            _hashCode += getPreferencesDisableFollowersEmail().hashCode();
        }
        if (getPreferencesDisableItemFlaggedEmail() != null) {
            _hashCode += getPreferencesDisableItemFlaggedEmail().hashCode();
        }
        if (getPreferencesDisableLaterCommentEmail() != null) {
            _hashCode += getPreferencesDisableLaterCommentEmail().hashCode();
        }
        if (getPreferencesDisableLikeEmail() != null) {
            _hashCode += getPreferencesDisableLikeEmail().hashCode();
        }
        if (getPreferencesDisableMentionsPostEmail() != null) {
            _hashCode += getPreferencesDisableMentionsPostEmail().hashCode();
        }
        if (getPreferencesDisableMessageEmail() != null) {
            _hashCode += getPreferencesDisableMessageEmail().hashCode();
        }
        if (getPreferencesDisableProfilePostEmail() != null) {
            _hashCode += getPreferencesDisableProfilePostEmail().hashCode();
        }
        if (getPreferencesDisableSharePostEmail() != null) {
            _hashCode += getPreferencesDisableSharePostEmail().hashCode();
        }
        if (getReputationPoints() != null) {
            _hashCode += getReputationPoints().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NetworkMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("defaultGroupNotificationFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DefaultGroupNotificationFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("digestFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "DigestFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChatterActivityDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LastChatterActivityDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Member"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "User"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "MemberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Network"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Network"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisCommentAfterLikeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisCommentAfterLikeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisMentionsCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisMentionsCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisProfPostCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisProfPostCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableAllFeedsEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableAllFeedsEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableBookmarkEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableBookmarkEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableChangeCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableChangeCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableEndorsementEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableEndorsementEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableFollowersEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableFollowersEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableItemFlaggedEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableItemFlaggedEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableLaterCommentEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableLaterCommentEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableLikeEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableLikeEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableMentionsPostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableMentionsPostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableMessageEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableMessageEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableProfilePostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableProfilePostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferencesDisableSharePostEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "PreferencesDisableSharePostEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reputationPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ReputationPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
