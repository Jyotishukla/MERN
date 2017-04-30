package parsers;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class OrderParser extends DefaultHandler {
	boolean order_id = false;
	boolean order_date = false;
	boolean customer_id = false;
	boolean employee_id = false;
	boolean truck_id = false;
	boolean is_special = false;
	boolean purchase_order_number = false;
	boolean order_total_amount = false;


	public static void main(String[] args){

		try {	
			File xmlFile = new File("src/xmls/Orders.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			OrderParser orderhandler = new OrderParser();
			saxParser.parse(xmlFile, orderhandler);     
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void startElement(String uri, 
			String localName, String qName, Attributes attributes)
					throws SAXException {
		if (qName.equalsIgnoreCase("order_id")) {
			order_id = true;
		}else  if (qName.equalsIgnoreCase("order_date")) {
			order_date = true;
		}else  if (qName.equalsIgnoreCase("customer_id")) {
			customer_id = true;
		}else  if (qName.equalsIgnoreCase("employee_id")) {
			employee_id = true;
		}else  if (qName.equalsIgnoreCase("truck_id")) {
			truck_id = true;
		}else  if (qName.equalsIgnoreCase("is_special")) {
			is_special = true;
		}else  if (qName.equalsIgnoreCase("purchase_order_number")) {
			purchase_order_number = true;
		}else  if (qName.equalsIgnoreCase("order_total_amount")) {
			order_total_amount = true;
		}
	}


	@Override
	public void endElement(String uri, 
			String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("order")) {
			System.out.println("End Element :" + qName);

		}
	}

	@Override
	public void characters(char ch[], 
			int start, int length) throws SAXException {
		if (order_id) {
			System.out.println("Order ID:" + new String(ch, start, length));
			order_id =false;
		} else if (order_date) {
			System.out.println("Order Date:" + new String(ch, start, length));
			order_date =false;
		}else if (customer_id) {
			System.out.println("Customer ID" + new String(ch, start, length));
			customer_id =false;
		}else if (employee_id) {
			System.out.println("Employee ID" + new String(ch, start, length));
			employee_id =false;
		}else if (truck_id) {
			System.out.println("Truck Id:" + new String(ch, start, length));
			truck_id =false;
		}else if (is_special) {
			System.out.println("Is Special:" + new String(ch, start, length));
			is_special =false;
		}else if (purchase_order_number) {
			System.out.println("Purchase Order Number:" + new String(ch, start, length));
			purchase_order_number =false;
		}else if (order_total_amount) {
			System.out.println("Order Total Amount:" + new String(ch, start, length));
			order_total_amount =false;
		}

	}
}
