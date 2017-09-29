/**
 * KoolServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package th.co.techsphere.www.integration;

public class KoolServiceLocator extends org.apache.axis.client.Service
		implements th.co.techsphere.www.integration.KoolService {
	
	public KoolServiceLocator() {
	}

	public KoolServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public KoolServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for KoolServiceSoap
	private java.lang.String KoolServiceSoap_address = "http://172.20.36.106:8907/KoolService.asmx";
	
//	private java.lang.String KoolServiceSoap_address;

	public java.lang.String getKoolServiceSoapAddress() {
		return KoolServiceSoap_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String KoolServiceSoapWSDDServiceName = "KoolServiceSoap";

	public java.lang.String getKoolServiceSoapWSDDServiceName() {
		return KoolServiceSoapWSDDServiceName;
	}

	public void setKoolServiceSoapWSDDServiceName(java.lang.String name) {
		KoolServiceSoapWSDDServiceName = name;
	}

	public th.co.techsphere.www.integration.KoolServiceSoap getKoolServiceSoap() throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(KoolServiceSoap_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getKoolServiceSoap(endpoint);
	}

	public th.co.techsphere.www.integration.KoolServiceSoap getKoolServiceSoap(java.net.URL portAddress)
			throws javax.xml.rpc.ServiceException {
		try {
			th.co.techsphere.www.integration.KoolServiceSoapStub _stub = new th.co.techsphere.www.integration.KoolServiceSoapStub(
					portAddress, this);
			_stub.setPortName(getKoolServiceSoapWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setKoolServiceSoapEndpointAddress(java.lang.String address) {
		KoolServiceSoap_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (th.co.techsphere.www.integration.KoolServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
				th.co.techsphere.www.integration.KoolServiceSoapStub _stub = new th.co.techsphere.www.integration.KoolServiceSoapStub(
						new java.net.URL(KoolServiceSoap_address), this);
				_stub.setPortName(getKoolServiceSoapWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("KoolServiceSoap".equals(inputPortName)) {
			return getKoolServiceSoap();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "KoolService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName("http://www.techsphere.co.th/integration", "KoolServiceSoap"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {

		if ("KoolServiceSoap".equals(portName)) {
			setKoolServiceSoapEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
