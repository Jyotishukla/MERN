/**
 * CustomerWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface CustomerWS extends java.rmi.Remote {
    public ws.Customer getCustomer(java.lang.Integer arg0) throws java.rmi.RemoteException;
    public ws.Customer[] getCustomers() throws java.rmi.RemoteException;
}
