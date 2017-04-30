package parsers;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Employeeparse extends DefaultHandler {
	
	boolean employee_id = false;
	boolean first_name = false;
	boolean last_name = false;
	boolean email = false;
	boolean extension = false;
	boolean home_phone = false;
	boolean cell_phone = false;
	boolean jobtitle = false;
	boolean ssn = false;
	boolean driver_license_number = false;
	boolean address = false;
	boolean city = false;
	boolean state = false;
	boolean postal_code = false;
	boolean birth_date = false;
	boolean date_hired = false;
	boolean salary = false;
	boolean notes = false;
	
	public static void main(String[] args){

		try {	
			File xmlFile = new File("xmls/Employee.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			Employeeparse userhandler = new Employeeparse();
			saxParser.parse(xmlFile, userhandler);     
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void startElement(String uri, 
			String localName, String qName, Attributes attributes)
					throws SAXException {
		if (qName.equalsIgnoreCase("employee_id")) {
			employee_id = true;
		}else  if (qName.equalsIgnoreCase("first_name")) {
			first_name = true;
		}else  if (qName.equalsIgnoreCase("last_name")) {
			last_name = true;
		}else  if (qName.equalsIgnoreCase("email")) {
			email = true;
		}else  if (qName.equalsIgnoreCase("extension")) {
			extension = true;
		}else  if (qName.equalsIgnoreCase("home_phone")) {
			home_phone = true;
		}else  if (qName.equalsIgnoreCase("cell_phone")) {
			cell_phone = true;
		}else  if (qName.equalsIgnoreCase("jobtitle")) {
			jobtitle = true;
		}else  if (qName.equalsIgnoreCase("ssn")) {
			ssn = true;
		}else  if (qName.equalsIgnoreCase("driver_license_number")) {
			driver_license_number = true;
		}else  if (qName.equalsIgnoreCase("address")) {
			address = true;
		}else  if (qName.equalsIgnoreCase("city")) {
			city = true;
		}else  if (qName.equalsIgnoreCase("state")) {
			state = true;
		}else  if (qName.equalsIgnoreCase("postal_code")) {
			postal_code = true;
		}else  if (qName.equalsIgnoreCase("birth_date")) {
			birth_date = true;
		}else  if (qName.equalsIgnoreCase("date_hired")) {
			date_hired = true;
		}else  if (qName.equalsIgnoreCase("salary")) {
			salary = true;
		}else  if (qName.equalsIgnoreCase("notes")) {
			notes = true;
		}
	}
	
	@Override
	public void endElement(String uri, 
			String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("employee")) {
			System.out.println("End Element :" + qName);

		}
	}
	
	@Override
	   public void characters(char ch[], 
	      int start, int length) throws SAXException {
	      if (employee_id) {
	    	  System.out.println("Employee ID:" + new String(ch, start, length));
	    	  employee_id =false;
	      } else if (first_name) {
	    	  System.out.println("first Name:" + new String(ch, start, length));
	    	  first_name =false;
	      }else if (last_name) {
	    	  System.out.println("last Name:" + new String(ch, start, length));
	    	  last_name =false;
	      }else if (email) {
	    	  System.out.println("Email:" + new String(ch, start, length));
	    	  email =false;
	      }else if (extension) {
	    	  System.out.println("Extension:" + new String(ch, start, length));
	    	  extension =false;
	      }else if (home_phone) {
	    	  System.out.println("Home Phone:" + new String(ch, start, length));
	    	  home_phone =false;
	      }else if (cell_phone) {
	    	  System.out.println("Cell Phone:" + new String(ch, start, length));
	    	  cell_phone =false;
	      }else if (jobtitle) {
	    	  System.out.println("Job Title:" + new String(ch, start, length));
	    	  jobtitle =false;
	      }else if (ssn) {
	    	  System.out.println("SSN:" + new String(ch, start, length));
	    	  ssn =false;
	      }else if (driver_license_number) {
	    	  System.out.println("driver_license_number):" + new String(ch, start, length));
	    	  driver_license_number =false;
	      }else if (address) {
	    	  System.out.println("Address:" + new String(ch, start, length));
	    	  address =false;
	      }else if (city) {
	    	  System.out.println("City:" + new String(ch, start, length));
	    	  city =false;
	      }else if (state) {
	    	  System.out.println("state:" + new String(ch, start, length));
	    	  state =false;
	      }else if (postal_code) {
	    	  System.out.println("Postal Code:" + new String(ch, start, length));
	    	  postal_code =false;
	      }else if (birth_date) {
	    	  System.out.println("Birth Date:" + new String(ch, start, length));
	    	  birth_date =false;
	      }else if (date_hired) {
	    	  System.out.println("date Hired:" + new String(ch, start, length));
	    	  date_hired =false;
	      }else if (salary) {
	    	  System.out.println("Salary:" + new String(ch, start, length));
	    	  salary =false;
	      }else if (notes) {
	    	  System.out.println("Notes:" + new String(ch, start, length));
	    	  notes =false;
	      }
	}

}
