package parsers;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Customerparse extends DefaultHandler {
	boolean customer_id = false;
	boolean customer_title = false;
	boolean buisness_name = false;
	boolean billing_address = false;
	boolean city = false;
	boolean state = false;
	boolean postal_code = false;
	boolean country = false;
	boolean phone_no = false;
	boolean cell_number = false;
	boolean other_number = false;
	boolean fax_number = false;
	boolean email_address = false;
	boolean customer_type = false;
	boolean company_type = false;
	boolean contact_name = false;
	boolean alternate_contactname = false;
	boolean date_entered = false;

	public static void main(String[] args){

		try {	
			File xmlFile = new File("xmls/Customer.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			Customerparse userhandler = new Customerparse();
			saxParser.parse(xmlFile, userhandler);     
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

		@Override
		public void startElement(String uri, 
				String localName, String qName, Attributes attributes)
						throws SAXException {
			if (qName.equalsIgnoreCase("customer_id")) {
				customer_id = true;
			}else  if (qName.equalsIgnoreCase("customer_title")) {
				customer_title = true;
			}else  if (qName.equalsIgnoreCase("buisness_name")) {
				buisness_name = true;
			}else  if (qName.equalsIgnoreCase("billing_address")) {
				billing_address = true;
			}else  if (qName.equalsIgnoreCase("city")) {
				city = true;
			}else  if (qName.equalsIgnoreCase("state")) {
				state = true;
			}else  if (qName.equalsIgnoreCase("Phone_no")) {
				phone_no = true;
			}else  if (qName.equalsIgnoreCase("cell_number")) {
				cell_number = true;
			}else  if (qName.equalsIgnoreCase("other_number")) {
				other_number = true;
			}else  if (qName.equalsIgnoreCase("fax_number")) {
				fax_number = true;
			}else  if (qName.equalsIgnoreCase("email_address")) {
				email_address = true;
			}else  if (qName.equalsIgnoreCase("customer_type")) {
				customer_type = true;
			}else  if (qName.equalsIgnoreCase("contact_name")) {
				contact_name = true;
			}else  if (qName.equalsIgnoreCase("altername_contactname")) {
				alternate_contactname = true;
			}else  if (qName.equalsIgnoreCase("date_entered")) {
				date_entered = true;
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
		      if (customer_id) {
		    	  System.out.println("Customer ID:" + new String(ch, start, length));
		    	  customer_id =false;
		      } else if (customer_title) {
		    	  System.out.println("Customer Title:" + new String(ch, start, length));
		    	  customer_title =false;
		      }else if (buisness_name) {
		    	  System.out.println("Buisness name:" + new String(ch, start, length));
		    	  buisness_name =false;
		      }else if (billing_address) {
		    	  System.out.println("Billing Address" + new String(ch, start, length));
		    	  billing_address =false;
		      }else if (city) {
		    	  System.out.println("City:" + new String(ch, start, length));
		    	  city =false;
		      }else if (state) {
		    	  System.out.println("State:" + new String(ch, start, length));
		    	  state =false;
		      }else if (postal_code) {
		    	  System.out.println("Postal Code:" + new String(ch, start, length));
		    	  postal_code =false;
		      }else if (country) {
		    	  System.out.println("Country:" + new String(ch, start, length));
		    	  country =false;
		      }else if (phone_no) {
		    	  System.out.println("Phone no:" + new String(ch, start, length));
		    	  phone_no =false;
		      }else if (cell_number) {
		    	  System.out.println("Cell no:" + new String(ch, start, length));
		    	  cell_number =false;
		      }else if (other_number) {
		    	  System.out.println("Other no:" + new String(ch, start, length));
		    	  other_number =false;
		      }else if (fax_number) {
		    	  System.out.println("Fax Number:" + new String(ch, start, length));
		    	  fax_number =false;
		      }else if (email_address) {
		    	  System.out.println("Email Address:" + new String(ch, start, length));
		    	  email_address =false;
		      }else if (customer_type) {
		    	  System.out.println("Customer Type:" + new String(ch, start, length));
		    	  customer_type =false;
		      }else if (company_type) {
		    	  System.out.println("Company Type:" + new String(ch, start, length));
		    	  company_type =false;
		      }else if (contact_name) {
		    	  System.out.println("Contact name:" + new String(ch, start, length));
		    	  contact_name =false;
		      }else if (alternate_contactname) {
		    	  System.out.println("Alternate Contact name:" + new String(ch, start, length));
		    	  alternate_contactname =false;
		      }else if (date_entered) {
		    	  System.out.println("date Entered:" + new String(ch, start, length));
		    	  date_entered =false;
		      }
		}
	}





