package DOMParsers;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class PriceParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("src/xmls/Pricing.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" 
					+ doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("pricing");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;

					System.out.println("Price ID : " 
							+ eElement
							.getElementsByTagName("price_id")
							.item(0)
							.getTextContent());
					System.out.println("Location_ID_From : " 
							+ eElement
							.getElementsByTagName("location_id_from")
							.item(0)
							.getTextContent());
					System.out.println("Location_ID_To : " 
							+ eElement
							.getElementsByTagName("location_id_to")
							.item(0)
							.getTextContent());
					System.out.println("Price : " 
							+ eElement
							.getElementsByTagName("price")
							.item(0)
							.getTextContent());
					System.out.println("Location_Code_From : " 
							+ eElement
							.getElementsByTagName("location_code_from")
							.item(0)
							.getTextContent());
					System.out.println("Location_Code_To : " 
							+ eElement
							.getElementsByTagName("location_code_to")
							.item(0)
							.getTextContent());
					System.out.println("Location_Name_From : " 
							+ eElement
							.getElementsByTagName("location_name_from")
							.item(0)
							.getTextContent());
					System.out.println("Location_Name_To : " 
							+ eElement
							.getElementsByTagName("location_name_to")
							.item(0)
							.getTextContent());
					System.out.println("Customer Id : " 
							+ eElement
							.getElementsByTagName("customer_id")
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








