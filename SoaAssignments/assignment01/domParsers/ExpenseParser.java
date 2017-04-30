package domparser;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ExpenseParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("xmls/Expense.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :"  + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("expense");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println(" Expense ID : " + eElement.getElementsByTagName("expense_id").item(0).getTextContent());
					System.out.println(" Employee ID : " + eElement.getElementsByTagName("employee_id").item(0).getTextContent());
					System.out.println(" Expense Type : " + eElement.getElementsByTagName("expense_type").item(0).getTextContent());
					System.out.println(" Purpose of Expense : " + eElement.getElementsByTagName("purpose_of_expense").item(0).getTextContent());
					System.out.println(" Amount Spent : " + eElement.getElementsByTagName("amount_spent").item(0).getTextContent());
					System.out.println(" Description : " + eElement.getElementsByTagName("description").item(0).getTextContent());
					System.out.println(" Date Purchased : " + eElement.getElementsByTagName("date_purchased").item(0).getTextContent());
					System.out.println(" Date Submitted : " + eElement.getElementsByTagName("date_submitted").item(0).getTextContent());
					System.out.println(" Advance Amount : " + eElement.getElementsByTagName("advance_amount").item(0).getTextContent());
					System.out.println(" Payment Method : " + eElement.getElementsByTagName("payment_method").item(0).getTextContent());
										
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
