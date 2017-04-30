import javax.jws.WebService;

@WebService
public class Services_2 {
	
		//for any web service , code must contain three element
		//1 designate web service as web service
		// 2. Public constructor class that take no imports
		// a web service must run on server and accesed by client
		
		public void Constructor(){
			
		}
		
		public String Service(String s) {
			return "Hello" + s;
		}

	}
