package parsers;
						
	import java.io.File;						
	import javax.xml.parsers.SAXParser;						
	import javax.xml.parsers.SAXParserFactory;						
	import org.xml.sax.Attributes;						
	import org.xml.sax.SAXException;						
	import org.xml.sax.helpers.DefaultHandler;						
							
	public class Pricingparse  extends DefaultHandler {						
		boolean price_id = false;					
		boolean location_id_from = false;					
		boolean location_id_to = false;								
		boolean price = false;					
		boolean location_code_from = false;					
		boolean location_code_to = false;					
		boolean location_name_from = false;					
		boolean location_name_to = false;
		boolean customer_id= false;
		
		public static void main(String[] args){					
			try {				
				File xmlFile = new File("xmls/pricing.xml");			
				SAXParserFactory factory = SAXParserFactory.newInstance();			
				SAXParser saxParser = factory.newSAXParser();			
				Pricingparse userhandler = new Pricingparse();			
				saxParser.parse(xmlFile, userhandler);     			
			} catch (Exception e) {				
				e.printStackTrace();			
			}				
		}					
			@Override				
			public void startElement(String uri, 				
					String localName, String qName, Attributes attributes)		
							throws SAXException {
				if (qName.equalsIgnoreCase("price_id")) {			
					price_id = true;		
				}else  if (qName.equalsIgnoreCase("location_id_from")) {			
					location_id_from = true;		
				}else  if (qName.equalsIgnoreCase("location_id_to")) {			
					location_id_to = true;		
				}
					else  if (qName.equalsIgnoreCase("price")) {			
						price = true;			
				
					
				}else  if (qName.equalsIgnoreCase("location_code_from")) {			
					location_code_from = true;		
				}else  if (qName.equalsIgnoreCase("location_code_to")) {			
					location_code_to = true;		
				}		
				else  if (qName.equalsIgnoreCase("location_name_to")) {			
					location_code_to = true;		
				}else  if (qName.equalsIgnoreCase("customer id")) {			
					customer_id = true;		
				}			
				
				
			}	
			
			
			
			@Override				
			public void endElement(String uri, 				
					String localName, String qName) throws SAXException {		
				if (qName.equalsIgnoreCase("pricing")) {			
					System.out.println("End Element :" + qName);		
				}			
			}				
							
			@Override				
			   public void characters(char ch[], 				
			      int start, int length) throws SAXException {				
			      if (price_id) {				
			    	  System.out.println("Price ID:" + new String(ch, start, length));			
			    	  price_id =false;			
			      } else if (location_id_from) {				
			    	  System.out.println("Location Id from:" + new String(ch, start, length));			
			    	  location_id_from =false;			
			      }else if (location_id_to) {				
			    	  System.out.println("location_id_to:" + new String(ch, start, length));			
			    	  location_id_to =false;			
			      		
			      }else if (price) {				
			    	  System.out.println("price:" + new String(ch, start, length));			
			    	  price =false;
			    	  
			    	  
			    	  
			      }else if (location_code_from) {				
			    	  System.out.println("location_code_from:" + new String(ch, start, length));			
			    	  location_code_from =false;			
			      }else if (location_code_to) {				
			    	  System.out.println("location_code_to:" + new String(ch, start, length));			
			    	  location_code_to =false;			
			      }else if (location_name_from) {				
			    	  System.out.println("location_name_from" + new String(ch, start, length));			
			    	  location_name_from =false;			
			      }
			      else if (location_name_to) {				
			    	  System.out.println("location_name_to" + new String(ch, start, length));			
			    	  location_name_to =false;
			      }
			      else if (customer_id) {				
			    	  System.out.println("customer_id" + new String(ch, start, length));			
			    	  customer_id =false;
			      }  		
			      
		}
	}