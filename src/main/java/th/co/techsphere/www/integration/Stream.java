/**
 * Stream.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.techsphere.www.integration;

public abstract class Stream  extends th.co.techsphere.www.integration.MarshalByRefObject  implements java.io.Serializable {
    private long position;

    private int readTimeout;

    private int writeTimeout;

    public Stream() {
    }

    public Stream(
           long position,
           int readTimeout,
           int writeTimeout) {
        this.position = position;
        this.readTimeout = readTimeout;
        this.writeTimeout = writeTimeout;
    }


    /**
     * Gets the position value for this Stream.
     * 
     * @return position
     */
    public long getPosition() {
        return position;
    }


    /**
     * Sets the position value for this Stream.
     * 
     * @param position
     */
    public void setPosition(long position) {
        this.position = position;
    }


    /**
     * Gets the readTimeout value for this Stream.
     * 
     * @return readTimeout
     */
    public int getReadTimeout() {
        return readTimeout;
    }


    /**
     * Sets the readTimeout value for this Stream.
     * 
     * @param readTimeout
     */
    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }


    /**
     * Gets the writeTimeout value for this Stream.
     * 
     * @return writeTimeout
     */
    public int getWriteTimeout() {
        return writeTimeout;
    }


    /**
     * Sets the writeTimeout value for this Stream.
     * 
     * @param writeTimeout
     */
    public void setWriteTimeout(int writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Stream)) return false;
        Stream other = (Stream) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.position == other.getPosition() &&
            this.readTimeout == other.getReadTimeout() &&
            this.writeTimeout == other.getWriteTimeout();
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
        _hashCode += new Long(getPosition()).hashCode();
        _hashCode += getReadTimeout();
        _hashCode += getWriteTimeout();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Stream.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Stream"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "Position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "ReadTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "WriteTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
