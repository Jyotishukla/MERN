package test1;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Services_1 {
	public void constructor(){
		
	}
	@WebMethod
	public String Hello(String s){
		return "Hello " + s;
	}

}
