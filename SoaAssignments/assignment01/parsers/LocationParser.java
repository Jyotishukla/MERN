package parsers;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class LocationParser extends DefaultHandler {
	boolean location_id = false;
	boolean location_name = false;
	boolean location_code = false;
	boolean is_auction = false;
	boolean customer_id = false;
	boolean address_street1 = false;
	boolean address_street2 = false;
	boolean city = false;
	boolean state = false;
	boolean postal_code = false;
	boolean region = false;
	boolean location_contact_name = false;
	boolean location_phone = false;
	boolean location_fax_number = false;
	boolean location_email = false;

	public static void main(String[] args){

		try {	
			File xmlFile = new File("src/xmls/Location.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			LocationParser locationhandler = new LocationParser();
			saxParser.parse(xmlFile, locationhandler);     
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void startElement(String uri, 
			String localName, String qName, Attributes attributes)
					throws SAXException {
		if (qName.equalsIgnoreCase("location_id")) {
			location_id = true;
		}else  if (qName.equalsIgnoreCase("location_name")) {
			location_name = true;
		}else  if (qName.equalsIgnoreCase("location_code")) {
			location_code = true;
		}else  if (qName.equalsIgnoreCase("is_auction")) {
			is_auction = true;
		}else  if (qName.equalsIgnoreCase("customer_id")) {
			customer_id = true;
		}else  if (qName.equalsIgnoreCase("address_street1")) {
			address_street1 = true;
		}else  if (qName.equalsIgnoreCase("address_street2")) {
			address_street2 = true;
		}else  if (qName.equalsIgnoreCase("city")) {
			city = true;
		}else  if (qName.equalsIgnoreCase("postal_code")) {
			postal_code = true;
		}else  if (qName.equalsIgnoreCase("region")) {
			region = true;
		}else  if (qName.equalsIgnoreCase("location_contact_name")) {
			location_contact_name = true;
		}else  if (qName.equalsIgnoreCase("location_phone")) {
			location_phone = true;
		}else  if (qName.equalsIgnoreCase("location_fax_number")) {
			location_fax_number = true;
		}else  if (qName.equalsIgnoreCase("location_email")) {
			location_email = true;
		}
	}
	@Override
	public void endElement(String uri, 
			String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("location")) {
			System.out.println("End Element :" + qName);

		}
	}

	@Override
	public void characters(char ch[], 
			int start, int length) throws SAXException {
		if (location_id) {
			System.out.println("Location ID:" + new String(ch, start, length));
			location_id =false;
		} else if (location_name) {
			System.out.println("Location Name:" + new String(ch, start, length));
			location_name =false;
		}else if (location_code) {
			System.out.println("Location Code:" + new String(ch, start, length));
			location_code =false;
		}else if (is_auction) {
			System.out.println("Is Auction" + new String(ch, start, length));
			is_auction =false;
		}else if (customer_id) {
			System.out.println("Customer Id:" + new String(ch, start, length));
			customer_id =false;
		}else if (address_street1) {
			System.out.println("address_street1:" + new String(ch, start, length));
			address_street1 =false;
		}else if (address_street2) {
			System.out.println("address_street2:" + new String(ch, start, length));
			address_street2 =false;
		}else if (city) {
			System.out.println("city:" + new String(ch, start, length));
			city =false;
		}else if (state) {
			System.out.println("state:" + new String(ch, start, length));
			state =false;
		}else if (postal_code) {
			System.out.println("postal_code:" + new String(ch, start, length));
			postal_code =false;
		}else if (region) {
			System.out.println("region:" + new String(ch, start, length));
			region =false;
		}else if (location_contact_name) {
			System.out.println("location_contact_name:" + new String(ch, start, length));
			location_contact_name =false;
		}else if (address_street1) {
			System.out.println("address_street1:" + new String(ch, start, length));
			address_street1 =false;
		}else if (location_phone) {
			System.out.println("location_phone:" + new String(ch, start, length));
			location_phone =false;
		}else if (location_fax_number) {
			System.out.println("location_fax_number:" + new String(ch, start, length));
			location_fax_number =false;
		}else if (location_email) {
			System.out.println("location_email:" + new String(ch, start, length));
			location_email =false;

		}
	}
}