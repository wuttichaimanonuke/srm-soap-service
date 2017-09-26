/**
 * KoolService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.techsphere.www.integration;

public interface KoolService extends javax.xml.rpc.Service {
    public java.lang.String getKoolServiceSoapAddress();

    public th.co.techsphere.www.integration.KoolServiceSoap getKoolServiceSoap() throws javax.xml.rpc.ServiceException;

    public th.co.techsphere.www.integration.KoolServiceSoap getKoolServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
