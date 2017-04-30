package ws;

public class CustomerWSProxy implements ws.CustomerWS {
  private String _endpoint = null;
  private ws.CustomerWS customerWS = null;
  
  public CustomerWSProxy() {
    _initCustomerWSProxy();
  }
  
  public CustomerWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initCustomerWSProxy();
  }
  
  private void _initCustomerWSProxy() {
    try {
      customerWS = (new ws.CustomerWSServiceLocator()).getCustomerWSPort();
      if (customerWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)customerWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)customerWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (customerWS != null)
      ((javax.xml.rpc.Stub)customerWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.CustomerWS getCustomerWS() {
    if (customerWS == null)
      _initCustomerWSProxy();
    return customerWS;
  }
  
  public ws.Customer getCustomer(java.lang.Integer arg0) throws java.rmi.RemoteException{
    if (customerWS == null)
      _initCustomerWSProxy();
    return customerWS.getCustomer(arg0);
  }
  
  public ws.Customer[] getCustomers() throws java.rmi.RemoteException{
    if (customerWS == null)
      _initCustomerWSProxy();
    return customerWS.getCustomers();
  }
  
  
}