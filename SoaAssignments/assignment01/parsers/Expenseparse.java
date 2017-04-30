package parsers;
import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Expenseparse extends DefaultHandler {
	boolean expense_id = false;
	boolean employee_id= false;
	boolean expense_type= false;
	boolean purpose_of_expense= false;
	boolean amount_spent= false;
	boolean description= false;
	boolean date_purchased= false;
	boolean date_submitted= false;
	boolean advance_amount= false;
	boolean payment_method= false;
	
	public static void main(String[] args){

		try {	
			File xmlFile = new File("xmls/Expense.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			Expenseparse userhandler = new Expenseparse();
			saxParser.parse(xmlFile, userhandler);     
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void startElement(String uri, 
			String localName, String qName, Attributes attributes)
					throws SAXException {
		if (qName.equalsIgnoreCase("expense_id")) {
			expense_id = true;
		}else  if (qName.equalsIgnoreCase("employee_id")) {
			employee_id = true;
		}else  if (qName.equalsIgnoreCase("expense_type")) {
			expense_type = true;
		}else  if (qName.equalsIgnoreCase("purpose_of_expense")) {
			purpose_of_expense = true;
		}else  if (qName.equalsIgnoreCase("amount_spent")) {
			amount_spent = true;
		}else  if (qName.equalsIgnoreCase("description")) {
			description = true;
		}else  if (qName.equalsIgnoreCase("date_purchased")) {
			date_purchased = true;
		}else  if (qName.equalsIgnoreCase("date_submitted")) {
			date_submitted = true;
		}else  if (qName.equalsIgnoreCase("advance_amount")) {
			advance_amount = true;
		}else  if (qName.equalsIgnoreCase("payment_method")) {
			payment_method = true;
		}
	}
	
	@Override
	public void endElement(String uri, 
			String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("expense")) {
			System.out.println("End Element :" + qName);

		}
	}
	
	@Override
	   public void characters(char ch[], 
	      int start, int length) throws SAXException {
	      if (expense_id) {
	    	  System.out.println("Expense ID:" + new String(ch, start, length));
	    	  expense_id =false;
	      } else if (employee_id) {
	    	  System.out.println("Employee ID:" + new String(ch, start, length));
	    	  employee_id =false;
	      } else if (expense_type) {
	    	  System.out.println("Expense Type:" + new String(ch, start, length));
	    	  expense_type =false;
	      } else if (purpose_of_expense) {
	    	  System.out.println("Purpose of expense:" + new String(ch, start, length));
	    	  purpose_of_expense =false;
	      } else if (amount_spent) {
	    	  System.out.println("Amount spent:" + new String(ch, start, length));
	    	  amount_spent =false;
	      } else if (description) {
	    	  System.out.println("Description:" + new String(ch, start, length));
	    	  description =false;
	      } else if (date_purchased) {
	    	  System.out.println("Date purchased:" + new String(ch, start, length));
	    	  date_purchased =false;
	      } else if (date_submitted) {
	    	  System.out.println("Date Submitted:" + new String(ch, start, length));
	    	  date_submitted =false;
	      } else if (advance_amount) {
	    	  System.out.println("Advance Amount:" + new String(ch, start, length));
	    	  advance_amount =false;
	      } else if (payment_method) {
	    	  System.out.println("payment method:" + new String(ch, start, length));
	    	  payment_method =false;
	      }
	}
}
