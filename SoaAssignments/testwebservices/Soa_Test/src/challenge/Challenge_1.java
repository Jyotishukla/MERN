package challenge;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService(name="new name")
public class Challenge_1 {
	
	public void constructor(){
		
	}
	
	@WebMethod
	public int fibonacci(int n){
	int a= 1;
	int b = 1;
	
	for(int i=1; i<n;i++){
		int result = a + b;
		a=b;
		b= result;
	}
return b;
	}

}
