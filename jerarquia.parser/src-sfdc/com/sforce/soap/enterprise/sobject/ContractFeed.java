/**
 * ContractFeed.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.enterprise.sobject;

public class ContractFeed  extends com.sforce.soap.enterprise.sobject.SObject  implements java.io.Serializable {
    private java.lang.String body;

    private java.lang.Integer commentCount;

    private byte[] contentData;

    private java.lang.String contentDescription;

    private java.lang.String contentFileName;

    private java.lang.Integer contentSize;

    private java.lang.String contentType;

    private com.sforce.soap.enterprise.sobject.Name createdBy;

    private java.lang.String createdById;

    private java.util.Calendar createdDate;

    private com.sforce.soap.enterprise.QueryResult feedAttachments;

    private com.sforce.soap.enterprise.QueryResult feedComments;

    private com.sforce.soap.enterprise.QueryResult feedLikes;

    private com.sforce.soap.enterprise.QueryResult feedTrackedChanges;

    private com.sforce.soap.enterprise.sobject.Name insertedBy;

    private java.lang.String insertedById;

    private java.lang.Boolean isDeleted;

    private java.lang.Boolean isRichText;

    private java.util.Calendar lastModifiedDate;

    private java.lang.Integer likeCount;

    private java.lang.String linkUrl;

    private java.lang.String networkScope;

    private com.sforce.soap.enterprise.sobject.Contract parent;

    private java.lang.String parentId;

    private java.lang.String relatedRecordId;

    private java.util.Calendar systemModstamp;

    private java.lang.String title;

    private java.lang.String type;

    private java.lang.String visibility;

    public ContractFeed() {
    }

    public ContractFeed(
           java.lang.String[] fieldsToNull,
           java.lang.String id,
           java.lang.String body,
           java.lang.Integer commentCount,
           byte[] contentData,
           java.lang.String contentDescription,
           java.lang.String contentFileName,
           java.lang.Integer contentSize,
           java.lang.String contentType,
           com.sforce.soap.enterprise.sobject.Name createdBy,
           java.lang.String createdById,
           java.util.Calendar createdDate,
           com.sforce.soap.enterprise.QueryResult feedAttachments,
           com.sforce.soap.enterprise.QueryResult feedComments,
           com.sforce.soap.enterprise.QueryResult feedLikes,
           com.sforce.soap.enterprise.QueryResult feedTrackedChanges,
           com.sforce.soap.enterprise.sobject.Name insertedBy,
           java.lang.String insertedById,
           java.lang.Boolean isDeleted,
           java.lang.Boolean isRichText,
           java.util.Calendar lastModifiedDate,
           java.lang.Integer likeCount,
           java.lang.String linkUrl,
           java.lang.String networkScope,
           com.sforce.soap.enterprise.sobject.Contract parent,
           java.lang.String parentId,
           java.lang.String relatedRecordId,
           java.util.Calendar systemModstamp,
           java.lang.String title,
           java.lang.String type,
           java.lang.String visibility) {
        super(
            fieldsToNull,
            id);
        this.body = body;
        this.commentCount = commentCount;
        this.contentData = contentData;
        this.contentDescription = contentDescription;
        this.contentFileName = contentFileName;
        this.contentSize = contentSize;
        this.contentType = contentType;
        this.createdBy = createdBy;
        this.createdById = createdById;
        this.createdDate = createdDate;
        this.feedAttachments = feedAttachments;
        this.feedComments = feedComments;
        this.feedLikes = feedLikes;
        this.feedTrackedChanges = feedTrackedChanges;
        this.insertedBy = insertedBy;
        this.insertedById = insertedById;
        this.isDeleted = isDeleted;
        this.isRichText = isRichText;
        this.lastModifiedDate = lastModifiedDate;
        this.likeCount = likeCount;
        this.linkUrl = linkUrl;
        this.networkScope = networkScope;
        this.parent = parent;
        this.parentId = parentId;
        this.relatedRecordId = relatedRecordId;
        this.systemModstamp = systemModstamp;
        this.title = title;
        this.type = type;
        this.visibility = visibility;
    }


    /**
     * Gets the body value for this ContractFeed.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this ContractFeed.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the commentCount value for this ContractFeed.
     * 
     * @return commentCount
     */
    public java.lang.Integer getCommentCount() {
        return commentCount;
    }


    /**
     * Sets the commentCount value for this ContractFeed.
     * 
     * @param commentCount
     */
    public void setCommentCount(java.lang.Integer commentCount) {
        this.commentCount = commentCount;
    }


    /**
     * Gets the contentData value for this ContractFeed.
     * 
     * @return contentData
     */
    public byte[] getContentData() {
        return contentData;
    }


    /**
     * Sets the contentData value for this ContractFeed.
     * 
     * @param contentData
     */
    public void setContentData(byte[] contentData) {
        this.contentData = contentData;
    }


    /**
     * Gets the contentDescription value for this ContractFeed.
     * 
     * @return contentDescription
     */
    public java.lang.String getContentDescription() {
        return contentDescription;
    }


    /**
     * Sets the contentDescription value for this ContractFeed.
     * 
     * @param contentDescription
     */
    public void setContentDescription(java.lang.String contentDescription) {
        this.contentDescription = contentDescription;
    }


    /**
     * Gets the contentFileName value for this ContractFeed.
     * 
     * @return contentFileName
     */
    public java.lang.String getContentFileName() {
        return contentFileName;
    }


    /**
     * Sets the contentFileName value for this ContractFeed.
     * 
     * @param contentFileName
     */
    public void setContentFileName(java.lang.String contentFileName) {
        this.contentFileName = contentFileName;
    }


    /**
     * Gets the contentSize value for this ContractFeed.
     * 
     * @return contentSize
     */
    public java.lang.Integer getContentSize() {
        return contentSize;
    }


    /**
     * Sets the contentSize value for this ContractFeed.
     * 
     * @param contentSize
     */
    public void setContentSize(java.lang.Integer contentSize) {
        this.contentSize = contentSize;
    }


    /**
     * Gets the contentType value for this ContractFeed.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this ContractFeed.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the createdBy value for this ContractFeed.
     * 
     * @return createdBy
     */
    public com.sforce.soap.enterprise.sobject.Name getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this ContractFeed.
     * 
     * @param createdBy
     */
    public void setCreatedBy(com.sforce.soap.enterprise.sobject.Name createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdById value for this ContractFeed.
     * 
     * @return createdById
     */
    public java.lang.String getCreatedById() {
        return createdById;
    }


    /**
     * Sets the createdById value for this ContractFeed.
     * 
     * @param createdById
     */
    public void setCreatedById(java.lang.String createdById) {
        this.createdById = createdById;
    }


    /**
     * Gets the createdDate value for this ContractFeed.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ContractFeed.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the feedAttachments value for this ContractFeed.
     * 
     * @return feedAttachments
     */
    public com.sforce.soap.enterprise.QueryResult getFeedAttachments() {
        return feedAttachments;
    }


    /**
     * Sets the feedAttachments value for this ContractFeed.
     * 
     * @param feedAttachments
     */
    public void setFeedAttachments(com.sforce.soap.enterprise.QueryResult feedAttachments) {
        this.feedAttachments = feedAttachments;
    }


    /**
     * Gets the feedComments value for this ContractFeed.
     * 
     * @return feedComments
     */
    public com.sforce.soap.enterprise.QueryResult getFeedComments() {
        return feedComments;
    }


    /**
     * Sets the feedComments value for this ContractFeed.
     * 
     * @param feedComments
     */
    public void setFeedComments(com.sforce.soap.enterprise.QueryResult feedComments) {
        this.feedComments = feedComments;
    }


    /**
     * Gets the feedLikes value for this ContractFeed.
     * 
     * @return feedLikes
     */
    public com.sforce.soap.enterprise.QueryResult getFeedLikes() {
        return feedLikes;
    }


    /**
     * Sets the feedLikes value for this ContractFeed.
     * 
     * @param feedLikes
     */
    public void setFeedLikes(com.sforce.soap.enterprise.QueryResult feedLikes) {
        this.feedLikes = feedLikes;
    }


    /**
     * Gets the feedTrackedChanges value for this ContractFeed.
     * 
     * @return feedTrackedChanges
     */
    public com.sforce.soap.enterprise.QueryResult getFeedTrackedChanges() {
        return feedTrackedChanges;
    }


    /**
     * Sets the feedTrackedChanges value for this ContractFeed.
     * 
     * @param feedTrackedChanges
     */
    public void setFeedTrackedChanges(com.sforce.soap.enterprise.QueryResult feedTrackedChanges) {
        this.feedTrackedChanges = feedTrackedChanges;
    }


    /**
     * Gets the insertedBy value for this ContractFeed.
     * 
     * @return insertedBy
     */
    public com.sforce.soap.enterprise.sobject.Name getInsertedBy() {
        return insertedBy;
    }


    /**
     * Sets the insertedBy value for this ContractFeed.
     * 
     * @param insertedBy
     */
    public void setInsertedBy(com.sforce.soap.enterprise.sobject.Name insertedBy) {
        this.insertedBy = insertedBy;
    }


    /**
     * Gets the insertedById value for this ContractFeed.
     * 
     * @return insertedById
     */
    public java.lang.String getInsertedById() {
        return insertedById;
    }


    /**
     * Sets the insertedById value for this ContractFeed.
     * 
     * @param insertedById
     */
    public void setInsertedById(java.lang.String insertedById) {
        this.insertedById = insertedById;
    }


    /**
     * Gets the isDeleted value for this ContractFeed.
     * 
     * @return isDeleted
     */
    public java.lang.Boolean getIsDeleted() {
        return isDeleted;
    }


    /**
     * Sets the isDeleted value for this ContractFeed.
     * 
     * @param isDeleted
     */
    public void setIsDeleted(java.lang.Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }


    /**
     * Gets the isRichText value for this ContractFeed.
     * 
     * @return isRichText
     */
    public java.lang.Boolean getIsRichText() {
        return isRichText;
    }


    /**
     * Sets the isRichText value for this ContractFeed.
     * 
     * @param isRichText
     */
    public void setIsRichText(java.lang.Boolean isRichText) {
        this.isRichText = isRichText;
    }


    /**
     * Gets the lastModifiedDate value for this ContractFeed.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ContractFeed.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the likeCount value for this ContractFeed.
     * 
     * @return likeCount
     */
    public java.lang.Integer getLikeCount() {
        return likeCount;
    }


    /**
     * Sets the likeCount value for this ContractFeed.
     * 
     * @param likeCount
     */
    public void setLikeCount(java.lang.Integer likeCount) {
        this.likeCount = likeCount;
    }


    /**
     * Gets the linkUrl value for this ContractFeed.
     * 
     * @return linkUrl
     */
    public java.lang.String getLinkUrl() {
        return linkUrl;
    }


    /**
     * Sets the linkUrl value for this ContractFeed.
     * 
     * @param linkUrl
     */
    public void setLinkUrl(java.lang.String linkUrl) {
        this.linkUrl = linkUrl;
    }


    /**
     * Gets the networkScope value for this ContractFeed.
     * 
     * @return networkScope
     */
    public java.lang.String getNetworkScope() {
        return networkScope;
    }


    /**
     * Sets the networkScope value for this ContractFeed.
     * 
     * @param networkScope
     */
    public void setNetworkScope(java.lang.String networkScope) {
        this.networkScope = networkScope;
    }


    /**
     * Gets the parent value for this ContractFeed.
     * 
     * @return parent
     */
    public com.sforce.soap.enterprise.sobject.Contract getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ContractFeed.
     * 
     * @param parent
     */
    public void setParent(com.sforce.soap.enterprise.sobject.Contract parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentId value for this ContractFeed.
     * 
     * @return parentId
     */
    public java.lang.String getParentId() {
        return parentId;
    }


    /**
     * Sets the parentId value for this ContractFeed.
     * 
     * @param parentId
     */
    public void setParentId(java.lang.String parentId) {
        this.parentId = parentId;
    }


    /**
     * Gets the relatedRecordId value for this ContractFeed.
     * 
     * @return relatedRecordId
     */
    public java.lang.String getRelatedRecordId() {
        return relatedRecordId;
    }


    /**
     * Sets the relatedRecordId value for this ContractFeed.
     * 
     * @param relatedRecordId
     */
    public void setRelatedRecordId(java.lang.String relatedRecordId) {
        this.relatedRecordId = relatedRecordId;
    }


    /**
     * Gets the systemModstamp value for this ContractFeed.
     * 
     * @return systemModstamp
     */
    public java.util.Calendar getSystemModstamp() {
        return systemModstamp;
    }


    /**
     * Sets the systemModstamp value for this ContractFeed.
     * 
     * @param systemModstamp
     */
    public void setSystemModstamp(java.util.Calendar systemModstamp) {
        this.systemModstamp = systemModstamp;
    }


    /**
     * Gets the title value for this ContractFeed.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ContractFeed.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the type value for this ContractFeed.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ContractFeed.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the visibility value for this ContractFeed.
     * 
     * @return visibility
     */
    public java.lang.String getVisibility() {
        return visibility;
    }


    /**
     * Sets the visibility value for this ContractFeed.
     * 
     * @param visibility
     */
    public void setVisibility(java.lang.String visibility) {
        this.visibility = visibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContractFeed)) return false;
        ContractFeed other = (ContractFeed) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.commentCount==null && other.getCommentCount()==null) || 
             (this.commentCount!=null &&
              this.commentCount.equals(other.getCommentCount()))) &&
            ((this.contentData==null && other.getContentData()==null) || 
             (this.contentData!=null &&
              java.util.Arrays.equals(this.contentData, other.getContentData()))) &&
            ((this.contentDescription==null && other.getContentDescription()==null) || 
             (this.contentDescription!=null &&
              this.contentDescription.equals(other.getContentDescription()))) &&
            ((this.contentFileName==null && other.getContentFileName()==null) || 
             (this.contentFileName!=null &&
              this.contentFileName.equals(other.getContentFileName()))) &&
            ((this.contentSize==null && other.getContentSize()==null) || 
             (this.contentSize!=null &&
              this.contentSize.equals(other.getContentSize()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdById==null && other.getCreatedById()==null) || 
             (this.createdById!=null &&
              this.createdById.equals(other.getCreatedById()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.feedAttachments==null && other.getFeedAttachments()==null) || 
             (this.feedAttachments!=null &&
              this.feedAttachments.equals(other.getFeedAttachments()))) &&
            ((this.feedComments==null && other.getFeedComments()==null) || 
             (this.feedComments!=null &&
              this.feedComments.equals(other.getFeedComments()))) &&
            ((this.feedLikes==null && other.getFeedLikes()==null) || 
             (this.feedLikes!=null &&
              this.feedLikes.equals(other.getFeedLikes()))) &&
            ((this.feedTrackedChanges==null && other.getFeedTrackedChanges()==null) || 
             (this.feedTrackedChanges!=null &&
              this.feedTrackedChanges.equals(other.getFeedTrackedChanges()))) &&
            ((this.insertedBy==null && other.getInsertedBy()==null) || 
             (this.insertedBy!=null &&
              this.insertedBy.equals(other.getInsertedBy()))) &&
            ((this.insertedById==null && other.getInsertedById()==null) || 
             (this.insertedById!=null &&
              this.insertedById.equals(other.getInsertedById()))) &&
            ((this.isDeleted==null && other.getIsDeleted()==null) || 
             (this.isDeleted!=null &&
              this.isDeleted.equals(other.getIsDeleted()))) &&
            ((this.isRichText==null && other.getIsRichText()==null) || 
             (this.isRichText!=null &&
              this.isRichText.equals(other.getIsRichText()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.likeCount==null && other.getLikeCount()==null) || 
             (this.likeCount!=null &&
              this.likeCount.equals(other.getLikeCount()))) &&
            ((this.linkUrl==null && other.getLinkUrl()==null) || 
             (this.linkUrl!=null &&
              this.linkUrl.equals(other.getLinkUrl()))) &&
            ((this.networkScope==null && other.getNetworkScope()==null) || 
             (this.networkScope!=null &&
              this.networkScope.equals(other.getNetworkScope()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentId==null && other.getParentId()==null) || 
             (this.parentId!=null &&
              this.parentId.equals(other.getParentId()))) &&
            ((this.relatedRecordId==null && other.getRelatedRecordId()==null) || 
             (this.relatedRecordId!=null &&
              this.relatedRecordId.equals(other.getRelatedRecordId()))) &&
            ((this.systemModstamp==null && other.getSystemModstamp()==null) || 
             (this.systemModstamp!=null &&
              this.systemModstamp.equals(other.getSystemModstamp()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.visibility==null && other.getVisibility()==null) || 
             (this.visibility!=null &&
              this.visibility.equals(other.getVisibility())));
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
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getCommentCount() != null) {
            _hashCode += getCommentCount().hashCode();
        }
        if (getContentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContentDescription() != null) {
            _hashCode += getContentDescription().hashCode();
        }
        if (getContentFileName() != null) {
            _hashCode += getContentFileName().hashCode();
        }
        if (getContentSize() != null) {
            _hashCode += getContentSize().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
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
        if (getFeedAttachments() != null) {
            _hashCode += getFeedAttachments().hashCode();
        }
        if (getFeedComments() != null) {
            _hashCode += getFeedComments().hashCode();
        }
        if (getFeedLikes() != null) {
            _hashCode += getFeedLikes().hashCode();
        }
        if (getFeedTrackedChanges() != null) {
            _hashCode += getFeedTrackedChanges().hashCode();
        }
        if (getInsertedBy() != null) {
            _hashCode += getInsertedBy().hashCode();
        }
        if (getInsertedById() != null) {
            _hashCode += getInsertedById().hashCode();
        }
        if (getIsDeleted() != null) {
            _hashCode += getIsDeleted().hashCode();
        }
        if (getIsRichText() != null) {
            _hashCode += getIsRichText().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLikeCount() != null) {
            _hashCode += getLikeCount().hashCode();
        }
        if (getLinkUrl() != null) {
            _hashCode += getLinkUrl().hashCode();
        }
        if (getNetworkScope() != null) {
            _hashCode += getNetworkScope().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentId() != null) {
            _hashCode += getParentId().hashCode();
        }
        if (getRelatedRecordId() != null) {
            _hashCode += getRelatedRecordId().hashCode();
        }
        if (getSystemModstamp() != null) {
            _hashCode += getSystemModstamp().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getVisibility() != null) {
            _hashCode += getVisibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContractFeed.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContractFeed"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CommentCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
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
        elemField.setFieldName("feedAttachments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedAttachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedLikes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedLikes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedTrackedChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "FeedTrackedChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:enterprise.soap.sforce.com", "QueryResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InsertedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Name"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertedById");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "InsertedById"));
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
        elemField.setFieldName("isRichText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "IsRichText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("likeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LikeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "LinkUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "NetworkScope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Contract"));
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
        elemField.setFieldName("relatedRecordId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "RelatedRecordId"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Title"));
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
        elemField.setFieldName("visibility");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sobject.enterprise.soap.sforce.com", "Visibility"));
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
