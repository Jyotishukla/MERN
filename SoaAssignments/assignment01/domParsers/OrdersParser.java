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

public class OrdersParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("xmls/Orders.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :"  + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("order");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println(" Order Id : " + eElement.getElementsByTagName("order_id").item(0).getTextContent());
					System.out.println(" Order Date : " + eElement.getElementsByTagName("order_date").item(0).getTextContent());
					System.out.println(" Customer ID : " + eElement.getElementsByTagName("customer_id").item(0).getTextContent());
					System.out.println(" Employee ID : " + eElement.getElementsByTagName("employee_id").item(0).getTextContent());
					System.out.println(" Truck ID : " + eElement.getElementsByTagName("truck_id").item(0).getTextContent());
					System.out.println(" Is Special : " + eElement.getElementsByTagName("is_special").item(0).getTextContent());
					System.out.println(" Purchase Order Number : " + eElement.getElementsByTagName("purchase_order_number").item(0).getTextContent());
					System.out.println(" Order Total Amount : " + eElement.getElementsByTagName("order_total_amount").item(0).getTextContent());
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
