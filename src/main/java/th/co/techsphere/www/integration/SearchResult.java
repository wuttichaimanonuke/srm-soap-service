/**
 * SearchResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.techsphere.www.integration;

public class SearchResult  implements java.io.Serializable {
    private java.lang.String docID;

    private java.lang.String name;

    private java.lang.String version;

    private java.lang.String size;

    private java.lang.String modificationDate;

    private java.lang.String modifier;

    private th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries;

    private th.co.techsphere.www.integration.Attribute[] attributes;

    public SearchResult() {
    }

    public SearchResult(
           java.lang.String docID,
           java.lang.String name,
           java.lang.String version,
           java.lang.String size,
           java.lang.String modificationDate,
           java.lang.String modifier,
           th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries,
           th.co.techsphere.www.integration.Attribute[] attributes) {
           this.docID = docID;
           this.name = name;
           this.version = version;
           this.size = size;
           this.modificationDate = modificationDate;
           this.modifier = modifier;
           this.accessControlEntries = accessControlEntries;
           this.attributes = attributes;
    }


    /**
     * Gets the docID value for this SearchResult.
     * 
     * @return docID
     */
    public java.lang.String getDocID() {
        return docID;
    }


    /**
     * Sets the docID value for this SearchResult.
     * 
     * @param docID
     */
    public void setDocID(java.lang.String docID) {
        this.docID = docID;
    }


    /**
     * Gets the name value for this SearchResult.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SearchResult.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the version value for this SearchResult.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SearchResult.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the size value for this SearchResult.
     * 
     * @return size
     */
    public java.lang.String getSize() {
        return size;
    }


    /**
     * Sets the size value for this SearchResult.
     * 
     * @param size
     */
    public void setSize(java.lang.String size) {
        this.size = size;
    }


    /**
     * Gets the modificationDate value for this SearchResult.
     * 
     * @return modificationDate
     */
    public java.lang.String getModificationDate() {
        return modificationDate;
    }


    /**
     * Sets the modificationDate value for this SearchResult.
     * 
     * @param modificationDate
     */
    public void setModificationDate(java.lang.String modificationDate) {
        this.modificationDate = modificationDate;
    }


    /**
     * Gets the modifier value for this SearchResult.
     * 
     * @return modifier
     */
    public java.lang.String getModifier() {
        return modifier;
    }


    /**
     * Sets the modifier value for this SearchResult.
     * 
     * @param modifier
     */
    public void setModifier(java.lang.String modifier) {
        this.modifier = modifier;
    }


    /**
     * Gets the accessControlEntries value for this SearchResult.
     * 
     * @return accessControlEntries
     */
    public th.co.techsphere.www.integration.AccessControlEntry[] getAccessControlEntries() {
        return accessControlEntries;
    }


    /**
     * Sets the accessControlEntries value for this SearchResult.
     * 
     * @param accessControlEntries
     */
    public void setAccessControlEntries(th.co.techsphere.www.integration.AccessControlEntry[] accessControlEntries) {
        this.accessControlEntries = accessControlEntries;
    }


    /**
     * Gets the attributes value for this SearchResult.
     * 
     * @return attributes
     */
    public th.co.techsphere.www.integration.Attribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this SearchResult.
     * 
     * @param attributes
     */
    public void setAttributes(th.co.techsphere.www.integration.Attribute[] attributes) {
        this.attributes = attributes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SearchResult)) return false;
        SearchResult other = (SearchResult) obj;
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
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.modificationDate==null && other.getModificationDate()==null) || 
             (this.modificationDate!=null &&
              this.modificationDate.equals(other.getModificationDate()))) &&
            ((this.modifier==null && other.getModifier()==null) || 
             (this.modifier!=null &&
              this.modifier.equals(other.getModifier()))) &&
            ((this.accessControlEntries==null && other.getAccessControlEntries()==null) || 
             (this.accessControlEntries!=null &&
              java.util.Arrays.equals(this.accessControlEntries, other.getAccessControlEntries()))) &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SearchResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "SearchResult"));
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
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Version"));
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
        elemField.setFieldName("accessControlEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "AccessControlEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "AccessControlEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "AccessControlEntry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Attribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Attribute"));
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
