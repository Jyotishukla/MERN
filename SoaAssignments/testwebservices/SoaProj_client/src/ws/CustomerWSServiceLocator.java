/**
 * CustomerWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class CustomerWSServiceLocator extends org.apache.axis.client.Service implements ws.CustomerWSService {

    public CustomerWSServiceLocator() {
    }


    public CustomerWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CustomerWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CustomerWSPort
    private java.lang.String CustomerWSPort_address = "http://localhost:9090/SoaProj/CustomerWSService";

    public java.lang.String getCustomerWSPortAddress() {
        return CustomerWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CustomerWSPortWSDDServiceName = "CustomerWSPort";

    public java.lang.String getCustomerWSPortWSDDServiceName() {
        return CustomerWSPortWSDDServiceName;
    }

    public void setCustomerWSPortWSDDServiceName(java.lang.String name) {
        CustomerWSPortWSDDServiceName = name;
    }

    public ws.CustomerWS getCustomerWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CustomerWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCustomerWSPort(endpoint);
    }

    public ws.CustomerWS getCustomerWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.CustomerWSPortBindingStub _stub = new ws.CustomerWSPortBindingStub(portAddress, this);
            _stub.setPortName(getCustomerWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCustomerWSPortEndpointAddress(java.lang.String address) {
        CustomerWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.CustomerWS.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.CustomerWSPortBindingStub _stub = new ws.CustomerWSPortBindingStub(new java.net.URL(CustomerWSPort_address), this);
                _stub.setPortName(getCustomerWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CustomerWSPort".equals(inputPortName)) {
            return getCustomerWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "CustomerWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "CustomerWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CustomerWSPort".equals(portName)) {
            setCustomerWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
