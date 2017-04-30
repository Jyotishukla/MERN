package parsers;						
	import java.io.File;						
	import javax.xml.parsers.SAXParser;						
	import javax.xml.parsers.SAXParserFactory;						
	import org.xml.sax.Attributes;						
	import org.xml.sax.SAXException;						
	import org.xml.sax.helpers.DefaultHandler;						
							
	public class TruckParser  extends DefaultHandler {						
		boolean truck_id = false;					
		boolean license_plate_no = false;					
		boolean color = false;								
		boolean make = false;					
		boolean model = false;					
		boolean year = false;					
		boolean employee_id = false;					
		
		
		public static void main(String[] args){					
			try {				
				File xmlFile = new File("xmls/Truck.xml");			
				SAXParserFactory factory = SAXParserFactory.newInstance();			
				SAXParser saxParser = factory.newSAXParser();			
				TruckParser userhandler = new TruckParser();			
				saxParser.parse(xmlFile, userhandler);     			
			} catch (Exception e) {				
				e.printStackTrace();			
			}				
		}					
			@Override				
			public void startElement(String uri, 				
					String localName, String qName, Attributes attributes)		
							throws SAXException {
				if (qName.equalsIgnoreCase("truck_id")) {			
					truck_id = true;		
				}else  if (qName.equalsIgnoreCase("license_plate_no")) {			
					license_plate_no = true;		
				}else  if (qName.equalsIgnoreCase("color")) {			
					color = true;		
					
				}else  if (qName.equalsIgnoreCase("year")) {			
					year = true;		
				}else  if (qName.equalsIgnoreCase("employee_id")) {			
					employee_id = true;		
				}		
			}				
			@Override				
			public void endElement(String uri, 				
					String localName, String qName) throws SAXException {		
				if (qName.equalsIgnoreCase("truck")) {			
					System.out.println("End Element :" + qName);		
				}			
			}				
							
			@Override				
			   public void characters(char ch[], 				
			      int start, int length) throws SAXException {				
			      if (truck_id) {				
			    	  System.out.println("Truck ID:" + new String(ch, start, length));			
			    	  truck_id =false;			
			      } else if (license_plate_no) {				
			    	  System.out.println("License Plate Number:" + new String(ch, start, length));			
			    	  license_plate_no =false;			
			      }else if (color) {				
			    	  System.out.println("Color:" + new String(ch, start, length));			
			    	  color =false;			
			      		
			      }else if (make) {				
			    	  System.out.println("Make:" + new String(ch, start, length));			
			    	  make =false;			
			      }else if (model) {				
			    	  System.out.println("Model:" + new String(ch, start, length));			
			    	  model =false;			
			      }else if (year) {				
			    	  System.out.println("Year:" + new String(ch, start, length));			
			    	  year =false;			
			      }else if (employee_id) {				
			    	  System.out.println("Employee_ID" + new String(ch, start, length));			
			    	  employee_id =false;			
			      }
			      }
			    	  				
		}					