package parsers;

import java.io.File;						
import javax.xml.parsers.SAXParser;						
import javax.xml.parsers.SAXParserFactory;						
import org.xml.sax.Attributes;						
import org.xml.sax.SAXException;						
import org.xml.sax.helpers.DefaultHandler;	

public class Transactionparser extends DefaultHandler {
	boolean transaction_id = false;					
	boolean order_id = false;					
	boolean price_id = false;					
	boolean transaction_date = false;					
	boolean transaction_description = false;					
	boolean transaction_amount = false;					
	boolean make = false;					
	boolean model = false;					
	boolean year = false;					
	boolean employee_id = false;					
	boolean truck_no = false;					
	boolean discount = false;					
	boolean quality = false;					
	boolean unit_price = false;					
	boolean driver_pric = false;					
	boolean vin = false;					
	boolean run_number = false;					
	boolean special = false;
	boolean rate=false;
	boolean surcharge=false;
	
	public static void main(String[] args){					
		try {				
			File xmlFile = new File("xmls/Transactions.xml");			
			SAXParserFactory factory = SAXParserFactory.newInstance();			
			SAXParser saxParser = factory.newSAXParser();			
			Transactionparser userhandler = new Transactionparser();			
			saxParser.parse(xmlFile, userhandler);     			
		} catch (Exception e) {				
			e.printStackTrace();			
		}				
	}					
		@Override				
		public void startElement(String uri, 				
				String localName, String qName, Attributes attributes)		
						throws SAXException {
			if (qName.equalsIgnoreCase("transaction_id")) {			
				transaction_id = true;		
			}else  if (qName.equalsIgnoreCase("order_id")) {			
				order_id = true;		
			}else  if (qName.equalsIgnoreCase("price_id")) {			
				price_id = true;		
			}else  if (qName.equalsIgnoreCase("transaction_date")) {			
				transaction_date = true;		
			}else  if (qName.equalsIgnoreCase("transaction_description")) {			
				transaction_description = true;		
			}else  if (qName.equalsIgnoreCase("transaction_amount")) {			
				transaction_amount = true;		
			}else  if (qName.equalsIgnoreCase("year")) {			
				year = true;		
			}else  if (qName.equalsIgnoreCase("employee_id")) {			
				employee_id = true;		
			}else  if (qName.equalsIgnoreCase("truck_no")) {			
				truck_no = true;		
			}else  if (qName.equalsIgnoreCase("discount")) {			
				discount = true;		
			}else  if (qName.equalsIgnoreCase("quality")) {			
				quality = true;		
			}else  if (qName.equalsIgnoreCase("unit_price")) {			
				unit_price = true;		
			}else  if (qName.equalsIgnoreCase("vin")) {			
				vin = true;		
			}else  if (qName.equalsIgnoreCase("altername_contactname")) {			
				run_number = true;		
			}else  if (qName.equalsIgnoreCase("special")) {			
				special = true;		
			}		
			else  if (qName.equalsIgnoreCase("rate")) {			
				rate = true;		
			}else  if (qName.equalsIgnoreCase("surcharge")) {			
				surcharge = true;		
			}		
		}				
		@Override				
		public void endElement(String uri, 				
				String localName, String qName) throws SAXException {		
			if (qName.equalsIgnoreCase("customer")) {			
				System.out.println("End Element :" + qName);		
			}			
		}				
						
		@Override				
		   public void characters(char ch[], 				
		      int start, int length) throws SAXException {				
		      if (transaction_id) {				
		    	  System.out.println("Transaction ID:" + new String(ch, start, length));			
		    	  transaction_id =false;			
		      } else if (order_id) {				
		    	  System.out.println("Order ID:" + new String(ch, start, length));			
		    	  order_id =false;			
		      }else if (price_id) {				
		    	  System.out.println("Price ID:" + new String(ch, start, length));			
		    	  price_id =false;			
		      }else if (transaction_date) {				
		    	  System.out.println("Transaction Date:" + new String(ch, start, length));			
		    	  transaction_date =false;			
		      }else if (transaction_description) {				
		    	  System.out.println("transaction_description:" + new String(ch, start, length));			
		    	  transaction_description =false;			
		      }else if (transaction_amount) {				
		    	  System.out.println("transaction_amount:" + new String(ch, start, length));			
		    	  transaction_amount =false;			
		      }else if (make) {				
		    	  System.out.println("Make:" + new String(ch, start, length));			
		    	  make =false;			
		      }else if (model) {				
		    	  System.out.println("model:" + new String(ch, start, length));			
		    	  model =false;			
		      }else if (year) {				
		    	  System.out.println("Year:" + new String(ch, start, length));			
		    	  year =false;			
		      }else if (employee_id) {				
		    	  System.out.println("Employee ID:" + new String(ch, start, length));			
		    	  employee_id =false;			
		      }else if (truck_no) {				
		    	  System.out.println("Truck no:" + new String(ch, start, length));			
		    	  truck_no =false;			
		      }else if (discount) {				
		    	  System.out.println("Discount:" + new String(ch, start, length));			
		    	  discount =false;			
		      }else if (quality) {				
		    	  System.out.println("Quality:" + new String(ch, start, length));			
		    	  quality =false;			
		      }else if (unit_price) {				
		    	  System.out.println("Unit Price:" + new String(ch, start, length));			
		    	  unit_price =false;			
		      }else if (driver_pric) {				
		    	  System.out.println("Driver Price:" + new String(ch, start, length));			
		    	  driver_pric =false;			
		      }else if (vin) {				
		    	  System.out.println("Vin:" + new String(ch, start, length));			
		    	  vin =false;			
		      }else if (run_number) {				
		    	  System.out.println("Run Number:" + new String(ch, start, length));			
		    	  run_number =false;			
		      }else if (special) {				
		    	  System.out.println("Special:" + new String(ch, start, length));			
		    	  special =false;	
		      }
		    	  else if (rate) {				
			    	  System.out.println("Rate:" + new String(ch, start, length));			
			    	  rate =false;			
			      }else if (surcharge) {				
			    	  System.out.println("Surcharge:" + new String(ch, start, length));			
			    	  surcharge =false;	
		      }				
		}	
	

}
