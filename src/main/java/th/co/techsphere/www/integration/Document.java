/**
 * Document.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.techsphere.www.integration;

public class Document  implements java.io.Serializable {
    private java.lang.String docID;

    private java.lang.String name;

    private boolean hasContent;

    private java.lang.String extention;

    private byte[] data;

    private boolean hasChild;

    private java.lang.String KKPath;

    private java.lang.String folderID;

    private java.lang.String version;

    private java.lang.String documentType;

    private java.lang.String size;

    private java.lang.String modificationDate;

    private java.lang.String modifier;

    private th.co.techsphere.www.integration.CheckOutInfo checkOutInfo;

    private java.util.Calendar retentionDate;

    private th.co.techsphere.www.integration.Attribute[] attributes;

    private th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries;

    public Document() {
    }

    public Document(
           java.lang.String docID,
           java.lang.String name,
           boolean hasContent,
           java.lang.String extention,
           byte[] data,
           boolean hasChild,
           java.lang.String KKPath,
           java.lang.String folderID,
           java.lang.String version,
           java.lang.String documentType,
           java.lang.String size,
           java.lang.String modificationDate,
           java.lang.String modifier,
           th.co.techsphere.www.integration.CheckOutInfo checkOutInfo,
           java.util.Calendar retentionDate,
           th.co.techsphere.www.integration.Attribute[] attributes,
           th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries) {
           this.docID = docID;
           this.name = name;
           this.hasContent = hasContent;
           this.extention = extention;
           this.data = data;
           this.hasChild = hasChild;
           this.KKPath = KKPath;
           this.folderID = folderID;
           this.version = version;
           this.documentType = documentType;
           this.size = size;
           this.modificationDate = modificationDate;
           this.modifier = modifier;
           this.checkOutInfo = checkOutInfo;
           this.retentionDate = retentionDate;
           this.attributes = attributes;
           this.accessControlEntries = accessControlEntries;
    }


    /**
     * Gets the docID value for this Document.
     * 
     * @return docID
     */
    public java.lang.String getDocID() {
        return docID;
    }


    /**
     * Sets the docID value for this Document.
     * 
     * @param docID
     */
    public void setDocID(java.lang.String docID) {
        this.docID = docID;
    }


    /**
     * Gets the name value for this Document.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Document.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the hasContent value for this Document.
     * 
     * @return hasContent
     */
    public boolean isHasContent() {
        return hasContent;
    }


    /**
     * Sets the hasContent value for this Document.
     * 
     * @param hasContent
     */
    public void setHasContent(boolean hasContent) {
        this.hasContent = hasContent;
    }


    /**
     * Gets the extention value for this Document.
     * 
     * @return extention
     */
    public java.lang.String getExtention() {
        return extention;
    }


    /**
     * Sets the extention value for this Document.
     * 
     * @param extention
     */
    public void setExtention(java.lang.String extention) {
        this.extention = extention;
    }


    /**
     * Gets the data value for this Document.
     * 
     * @return data
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this Document.
     * 
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the hasChild value for this Document.
     * 
     * @return hasChild
     */
    public boolean isHasChild() {
        return hasChild;
    }


    /**
     * Sets the hasChild value for this Document.
     * 
     * @param hasChild
     */
    public void setHasChild(boolean hasChild) {
        this.hasChild = hasChild;
    }


    /**
     * Gets the KKPath value for this Document.
     * 
     * @return KKPath
     */
    public java.lang.String getKKPath() {
        return KKPath;
    }


    /**
     * Sets the KKPath value for this Document.
     * 
     * @param KKPath
     */
    public void setKKPath(java.lang.String KKPath) {
        this.KKPath = KKPath;
    }


    /**
     * Gets the folderID value for this Document.
     * 
     * @return folderID
     */
    public java.lang.String getFolderID() {
        return folderID;
    }


    /**
     * Sets the folderID value for this Document.
     * 
     * @param folderID
     */
    public void setFolderID(java.lang.String folderID) {
        this.folderID = folderID;
    }


    /**
     * Gets the version value for this Document.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Document.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the documentType value for this Document.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this Document.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the size value for this Document.
     * 
     * @return size
     */
    public java.lang.String getSize() {
        return size;
    }


    /**
     * Sets the size value for this Document.
     * 
     * @param size
     */
    public void setSize(java.lang.String size) {
        this.size = size;
    }


    /**
     * Gets the modificationDate value for this Document.
     * 
     * @return modificationDate
     */
    public java.lang.String getModificationDate() {
        return modificationDate;
    }


    /**
     * Sets the modificationDate value for this Document.
     * 
     * @param modificationDate
     */
    public void setModificationDate(java.lang.String modificationDate) {
        this.modificationDate = modificationDate;
    }


    /**
     * Gets the modifier value for this Document.
     * 
     * @return modifier
     */
    public java.lang.String getModifier() {
        return modifier;
    }


    /**
     * Sets the modifier value for this Document.
     * 
     * @param modifier
     */
    public void setModifier(java.lang.String modifier) {
        this.modifier = modifier;
    }


    /**
     * Gets the checkOutInfo value for this Document.
     * 
     * @return checkOutInfo
     */
    public th.co.techsphere.www.integration.CheckOutInfo getCheckOutInfo() {
        return checkOutInfo;
    }


    /**
     * Sets the checkOutInfo value for this Document.
     * 
     * @param checkOutInfo
     */
    public void setCheckOutInfo(th.co.techsphere.www.integration.CheckOutInfo checkOutInfo) {
        this.checkOutInfo = checkOutInfo;
    }


    /**
     * Gets the retentionDate value for this Document.
     * 
     * @return retentionDate
     */
    public java.util.Calendar getRetentionDate() {
        return retentionDate;
    }


    /**
     * Sets the retentionDate value for this Document.
     * 
     * @param retentionDate
     */
    public void setRetentionDate(java.util.Calendar retentionDate) {
        this.retentionDate = retentionDate;
    }


    /**
     * Gets the attributes value for this Document.
     * 
     * @return attributes
     */
    public th.co.techsphere.www.integration.Attribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this Document.
     * 
     * @param attributes
     */
    public void setAttributes(th.co.techsphere.www.integration.Attribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the accessControlEntries value for this Document.
     * 
     * @return accessControlEntries
     */
    public th.co.techsphere.www.integration.AccessControlEntry[] getAccessControlEntries() {
        return accessControlEntries;
    }


    /**
     * Sets the accessControlEntries value for this Document.
     * 
     * @param accessControlEntries
     */
    public void setAccessControlEntries(th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries) {
        this.accessControlEntries = accessControlEntries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Document)) return false;
        Document other = (Document) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.docID==null && other.getDocID()==null) || 
             (this.docID!=null &&
              this.docID.equals(other.getDocID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.hasContent == other.isHasContent() &&
            ((this.extention==null && other.getExtention()==null) || 
             (this.extention!=null &&
              this.extention.equals(other.getExtention()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            this.hasChild == other.isHasChild() &&
            ((this.KKPath==null && other.getKKPath()==null) || 
             (this.KKPath!=null &&
              this.KKPath.equals(other.getKKPath()))) &&
            ((this.folderID==null && other.getFolderID()==null) || 
             (this.folderID!=null &&
              this.folderID.equals(other.getFolderID()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.modificationDate==null && other.getModificationDate()==null) || 
             (this.modificationDate!=null &&
              this.modificationDate.equals(other.getModificationDate()))) &&
            ((this.modifier==null && other.getModifier()==null) || 
             (this.modifier!=null &&
              this.modifier.equals(other.getModifier()))) &&
            ((this.checkOutInfo==null && other.getCheckOutInfo()==null) || 
             (this.checkOutInfo!=null &&
              this.checkOutInfo.equals(other.getCheckOutInfo()))) &&
            ((this.retentionDate==null && other.getRetentionDate()==null) || 
             (this.retentionDate!=null &&
              this.retentionDate.equals(other.getRetentionDate()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.accessControlEntries==null && other.getAccessControlEntries()==null) || 
             (this.accessControlEntries!=null &&
              java.util.Arrays.equals(this.accessControlEntries, other.getAccessControlEntries())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDocID() != null) {
            _hashCode += getDocID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isHasContent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExtention() != null) {
            _hashCode += getExtention().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isHasChild() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKKPath() != null) {
            _hashCode += getKKPath().hashCode();
        }
        if (getFolderID() != null) {
            _hashCode += getFolderID().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getModificationDate() != null) {
            _hashCode += getModificationDate().hashCode();
        }
        if (getModifier() != null) {
            _hashCode += getModifier().hashCode();
        }
        if (getCheckOutInfo() != null) {
            _hashCode += getCheckOutInfo().hashCode();
        }
        if (getRetentionDate() != null) {
            _hashCode += getRetentionDate().hashCode();
        }
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessControlEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessControlEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessControlEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Document.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Document"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "DocID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "HasContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extention");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Extention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasChild");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "HasChild"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("KKPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "KKPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "FolderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "ModificationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Modifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkOutInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "CheckOutInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "CheckOutInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retentionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "RetentionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Attribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Attribute"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessControlEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "AccessControlEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "AccessControlEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "AccessControlEntry"));
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
