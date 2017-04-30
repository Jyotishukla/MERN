package DOMParsers;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TansactionParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("src/xmls/Transactions.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" 
					+ doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("transaction");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					System.out.println("Transaction ID : " 
							+ eElement
							.getElementsByTagName("transaction_id")
							.item(0)
							.getTextContent());
					System.out.println("Order ID : " 
							+ eElement
							.getElementsByTagName("order_id")
							.item(0)
							.getTextContent());
					System.out.println("Price ID : " 
							+ eElement
							.getElementsByTagName("price_id")
							.item(0)
							.getTextContent());
					System.out.println("Transaction Date : " 
							+ eElement
							.getElementsByTagName("transaction_date")
							.item(0)
							.getTextContent());

					System.out.println("Transaction Description : " 
							+ eElement
							.getElementsByTagName("transaction_description")
							.item(0)
							.getTextContent());

					System.out.println("Transaction Amount : " 
							+ eElement
							.getElementsByTagName("transaction_amount")
							.item(0)
							.getTextContent());

					System.out.println("Make : " 
							+ eElement
							.getElementsByTagName("make")
							.item(0)
							.getTextContent());

					System.out.println("Model : " 
							+ eElement
							.getElementsByTagName("model")
							.item(0)
							.getTextContent());
					System.out.println("Year : " 
							+ eElement
							.getElementsByTagName("year")
							.item(0)
							.getTextContent());
					System.out.println("Employee ID : " 
							+ eElement
							.getElementsByTagName("employee_id")
							.item(0)
							.getTextContent());

					System.out.println("Truck No : " 
							+ eElement
							.getElementsByTagName("truck_no")
							.item(0)
							.getTextContent());

					System.out.println("Discount : " 
							+ eElement
							.getElementsByTagName("discount")
							.item(0)
							.getTextContent());

					System.out.println("Quality : " 
							+ eElement
							.getElementsByTagName("quality")
							.item(0)
							.getTextContent());

					System.out.println("unit_price : " 
							+ eElement
							.getElementsByTagName("unit_price")
							.item(0)
							.getTextContent());

					System.out.println("Driver Price : " 
							+ eElement
							.getElementsByTagName("driver_pric")
							.item(0)
							.getTextContent());

					System.out.println("Vin : " 
							+ eElement
							.getElementsByTagName("vin")
							.item(0)
							.getTextContent());
					System.out.println("Run Number : " 
							+ eElement
							.getElementsByTagName("run_number")
							.item(0)
							.getTextContent());
					System.out.println("Special : " 
							+ eElement
							.getElementsByTagName("special")
							.item(0)
							.getTextContent());
					System.out.println("Special : " 
							+ eElement
							.getElementsByTagName("special")
							.item(0)
							.getTextContent());

					System.out.println("Rate : " 
							+ eElement
							.getElementsByTagName("rate")
							.item(0)
							.getTextContent());

					System.out.println("Surcharge : " 
							+ eElement
							.getElementsByTagName("surcharge")
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