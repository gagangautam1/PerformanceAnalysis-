package Services;

public class ServiceProxy implements Services.Service {
  private String _endpoint = null;
  private Services.Service service = null;
  
  public ServiceProxy() {
    _initServiceProxy();
  }
  
  public ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceProxy();
  }
  
  private void _initServiceProxy() {
    try {
      service = (new Services.ServiceServiceLocator()).getService();
      if (service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (service != null)
      ((javax.xml.rpc.Stub)service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Services.Service getService() {
    if (service == null)
      _initServiceProxy();
    return service;
  }
  
  public void find_prime() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    service.find_prime();
  }
  
  public void check_prime() throws java.rmi.RemoteException{
    if (service == null)
      _initServiceProxy();
    service.check_prime();
  }
  
  
}