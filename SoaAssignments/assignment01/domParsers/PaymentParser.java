package DOMParsers;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PaymentParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("src/xmls/Payment.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" 
					+ doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("payment");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					System.out.println("Payment ID : " 
							+ eElement
							.getElementsByTagName("payment_id")
							.item(0)
							.getTextContent());
					System.out.println("Order ID : " 
							+ eElement
							.getElementsByTagName("order_id")
							.item(0)
							.getTextContent());
					System.out.println("Payment Method ID : " 
							+ eElement
							.getElementsByTagName("payment_method_id")
							.item(0)
							.getTextContent());
					System.out.println("Payment Amount : " 
							+ eElement
							.getElementsByTagName("payment_amount")
							.item(0)
							.getTextContent());
					System.out.println("Payment Date: " 
							+ eElement
							.getElementsByTagName("payment_date")
							.item(0)
							.getTextContent());
					System.out.println("Check Number : " 
							+ eElement
							.getElementsByTagName("check_number")
							.item(0)
							.getTextContent());
					System.out.println("Credit Card : " 
							+ eElement
							.getElementsByTagName("credit_card")
							.item(0)
							.getTextContent());
					System.out.println("Credit_card_number : " 
							+ eElement
							.getElementsByTagName("credit_card_number")
							.item(0)
							.getTextContent());
					System.out.println("Cardholder Name : " 
							+ eElement
							.getElementsByTagName("cardholder_name")
							.item(0)
							.getTextContent());
					System.out.println("Creditcard_exp_date : " 
							+ eElement
							.getElementsByTagName("creditcard_exp_date")
							.item(0)
							.getTextContent());
					System.out.println("Creaditcard_Auth_Num : " 
							+ eElement
							.getElementsByTagName("creaditcard_auth_num")
							.item(0)
							.getTextContent());
				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
