package parsers;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class PaymentParser extends DefaultHandler {
	boolean payment_id = false;
	boolean order_id = false;
	boolean payment_method_id = false;
	boolean payment_amount = false;
	boolean payment_date = false;
	boolean check_number = false;
	boolean credit_card = false;
	boolean credit_card_number = false;
	boolean cardholder_name = false;
	boolean creditcard_exp_date = false;
	boolean creaditcard_auth_num = false;

	public static void main(String[] args){

		try {	
			File xmlFile = new File("src/xmls/Payment.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			PaymentParser paymenthandler = new PaymentParser();
			saxParser.parse(xmlFile, paymenthandler);     
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void startElement(String uri, 
			String localName, String qName, Attributes attributes)
					throws SAXException {
		if (qName.equalsIgnoreCase("payment_id")) {
			payment_id = true;
		}else  if (qName.equalsIgnoreCase("order_id")) {
			order_id = true;
		}else  if (qName.equalsIgnoreCase("payment_method_id")) {
			payment_method_id = true;
		}else  if (qName.equalsIgnoreCase("payment_amount")) {
			payment_amount = true;
		}else  if (qName.equalsIgnoreCase("payment_date")) {
			payment_date = true;	
		}else  if (qName.equalsIgnoreCase("check_number")) {
			check_number = true;
		}else  if (qName.equalsIgnoreCase("credit_card")) {
			credit_card = true;
		}else  if (qName.equalsIgnoreCase("credit_card_number")) {
			credit_card_number = true;
		}else  if (qName.equalsIgnoreCase("cardholder_name")) {
			cardholder_name = true;
		}else  if (qName.equalsIgnoreCase("creditcard_exp_date")) {
			creditcard_exp_date = true;
		}else  if (qName.equalsIgnoreCase("creaditcard_auth_num")) {
			creaditcard_auth_num = true;
		}
	}
	@Override
	public void endElement(String uri, 
			String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("payment")) {
			System.out.println("End Element :" + qName);

		}
	}
	@Override
	public void characters(char ch[], 
			int start, int length) throws SAXException {
		if (payment_id) {
			System.out.println("Payment ID:" + new String(ch, start, length));
			payment_id =false;
		} else if (order_id) {
			System.out.println("Order ID:" + new String(ch, start, length));
			order_id =false;
		}else if (payment_method_id) {
			System.out.println("Payment Method ID" + new String(ch, start, length));
			payment_method_id =false;
		}else if (payment_amount) {
			System.out.println("Payment Amount" + new String(ch, start, length));
			payment_amount =false;
		}else if (payment_date) {
			System.out.println("Payment Date:" + new String(ch, start, length));
			payment_date =false;
		}else if (check_number) {
			System.out.println("Check Number:" + new String(ch, start, length));
			check_number =false;
		}else if (credit_card) {
			System.out.println("Credit Card:" + new String(ch, start, length));
			credit_card =false;
		}else if (credit_card_number) {
			System.out.println("Credit Card Number:" + new String(ch, start, length));
			credit_card_number =false;
		}else if (cardholder_name) {
			System.out.println("Credit Card Name:" + new String(ch, start, length));
			cardholder_name =false;
		}else if (creditcard_exp_date) {
			System.out.println("Credit Exp Date:" + new String(ch, start, length));
			creditcard_exp_date =false;
		}else if (creaditcard_auth_num) {
			System.out.println("Credit Auth Number:" + new String(ch, start, length));
			creaditcard_auth_num =false;
		}
	}
}