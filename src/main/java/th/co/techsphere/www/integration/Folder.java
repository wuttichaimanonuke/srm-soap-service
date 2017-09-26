/**
 * Folder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.techsphere.www.integration;

public class Folder  implements java.io.Serializable {
    private java.lang.String folderID;

    private java.lang.String folderName;

    private java.lang.String KKPath;

    private th.co.techsphere.www.integration.Folder[] folderMember;

    private java.lang.String documentType;

    private java.lang.String modificationDate;

    private java.lang.String modifier;

    private th.co.techsphere.www.integration.Attribute[] attributes;

    private th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries;

    public Folder() {
    }

    public Folder(
           java.lang.String folderID,
           java.lang.String folderName,
           java.lang.String KKPath,
           th.co.techsphere.www.integration.Folder[] folderMember,
           java.lang.String documentType,
           java.lang.String modificationDate,
           java.lang.String modifier,
           th.co.techsphere.www.integration.Attribute[] attributes,
           th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries) {
           this.folderID = folderID;
           this.folderName = folderName;
           this.KKPath = KKPath;
           this.folderMember = folderMember;
           this.documentType = documentType;
           this.modificationDate = modificationDate;
           this.modifier = modifier;
           this.attributes = attributes;
           this.accessControlEntries = accessControlEntries;
    }


    /**
     * Gets the folderID value for this Folder.
     * 
     * @return folderID
     */
    public java.lang.String getFolderID() {
        return folderID;
    }


    /**
     * Sets the folderID value for this Folder.
     * 
     * @param folderID
     */
    public void setFolderID(java.lang.String folderID) {
        this.folderID = folderID;
    }


    /**
     * Gets the folderName value for this Folder.
     * 
     * @return folderName
     */
    public java.lang.String getFolderName() {
        return folderName;
    }


    /**
     * Sets the folderName value for this Folder.
     * 
     * @param folderName
     */
    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }


    /**
     * Gets the KKPath value for this Folder.
     * 
     * @return KKPath
     */
    public java.lang.String getKKPath() {
        return KKPath;
    }


    /**
     * Sets the KKPath value for this Folder.
     * 
     * @param KKPath
     */
    public void setKKPath(java.lang.String KKPath) {
        this.KKPath = KKPath;
    }


    /**
     * Gets the folderMember value for this Folder.
     * 
     * @return folderMember
     */
    public th.co.techsphere.www.integration.Folder[] getFolderMember() {
        return folderMember;
    }


    /**
     * Sets the folderMember value for this Folder.
     * 
     * @param folderMember
     */
    public void setFolderMember(th.co.techsphere.www.integration.Folder[] folderMember) {
        this.folderMember = folderMember;
    }


    /**
     * Gets the documentType value for this Folder.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this Folder.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the modificationDate value for this Folder.
     * 
     * @return modificationDate
     */
    public java.lang.String getModificationDate() {
        return modificationDate;
    }


    /**
     * Sets the modificationDate value for this Folder.
     * 
     * @param modificationDate
     */
    public void setModificationDate(java.lang.String modificationDate) {
        this.modificationDate = modificationDate;
    }


    /**
     * Gets the modifier value for this Folder.
     * 
     * @return modifier
     */
    public java.lang.String getModifier() {
        return modifier;
    }


    /**
     * Sets the modifier value for this Folder.
     * 
     * @param modifier
     */
    public void setModifier(java.lang.String modifier) {
        this.modifier = modifier;
    }


    /**
     * Gets the attributes value for this Folder.
     * 
     * @return attributes
     */
    public th.co.techsphere.www.integration.Attribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this Folder.
     * 
     * @param attributes
     */
    public void setAttributes(th.co.techsphere.www.integration.Attribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the accessControlEntries value for this Folder.
     * 
     * @return accessControlEntries
     */
    public th.co.techsphere.www.integration.AccessControlEntry[] getAccessControlEntries() {
        return accessControlEntries;
    }


    /**
     * Sets the accessControlEntries value for this Folder.
     * 
     * @param accessControlEntries
     */
    public void setAccessControlEntries(th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries) {
        this.accessControlEntries = accessControlEntries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Folder)) return false;
        Folder other = (Folder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.folderID==null && other.getFolderID()==null) || 
             (this.folderID!=null &&
              this.folderID.equals(other.getFolderID()))) &&
            ((this.folderName==null && other.getFolderName()==null) || 
             (this.folderName!=null &&
              this.folderName.equals(other.getFolderName()))) &&
            ((this.KKPath==null && other.getKKPath()==null) || 
             (this.KKPath!=null &&
              this.KKPath.equals(other.getKKPath()))) &&
            ((this.folderMember==null && other.getFolderMember()==null) || 
             (this.folderMember!=null &&
              java.util.Arrays.equals(this.folderMember, other.getFolderMember()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.modificationDate==null && other.getModificationDate()==null) || 
             (this.modificationDate!=null &&
              this.modificationDate.equals(other.getModificationDate()))) &&
            ((this.modifier==null && other.getModifier()==null) || 
             (this.modifier!=null &&
              this.modifier.equals(other.getModifier()))) &&
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
        if (getFolderID() != null) {
            _hashCode += getFolderID().hashCode();
        }
        if (getFolderName() != null) {
            _hashCode += getFolderName().hashCode();
        }
        if (getKKPath() != null) {
            _hashCode += getKKPath().hashCode();
        }
        if (getFolderMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFolderMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFolderMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getModificationDate() != null) {
            _hashCode += getModificationDate().hashCode();
        }
        if (getModifier() != null) {
            _hashCode += getModifier().hashCode();
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
        new org.apache.axis.description.TypeDesc(Folder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Folder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "FolderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "FolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("folderMember");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "FolderMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Folder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Folder"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "DocumentType"));
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
