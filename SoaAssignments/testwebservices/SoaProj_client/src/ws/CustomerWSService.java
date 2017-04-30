/**
 * CustomerWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface CustomerWSService extends javax.xml.rpc.Service {
    public java.lang.String getCustomerWSPortAddress();

    public ws.CustomerWS getCustomerWSPort() throws javax.xml.rpc.ServiceException;

    public ws.CustomerWS getCustomerWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
