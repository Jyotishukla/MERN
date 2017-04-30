package test1;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path (value = "restful path")

public class Rest_test {
	
	ArrayList<Integer> data = new ArrayList<Integer>();

	public void Rest_test(){
		
	}
	
	@GET
	@Consumes("text/xml")
	@Produces("text/xml")
	public Object get(int index){
		return data.get(index);
	}
	
	@PUT
	@Consumes("text/xml")
	public void put(int index, int value){
		while(data.size()<=index){
			data.add(0);
		}
		data.set(index, value);
	}
		
	@DELETE
	@Consumes("text/xml")
	public void post(int index){
		data.remove(index);
	}
	
	}
	

