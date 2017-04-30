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

public class LocationParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("xmls/Location.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :"  + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("location");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println(" Location ID : " + eElement.getElementsByTagName("location_id").item(0).getTextContent());
					System.out.println(" Location Name : " + eElement.getElementsByTagName("location_name").item(0).getTextContent());
					System.out.println(" Location Code : " + eElement.getElementsByTagName("location_code").item(0).getTextContent());
					System.out.println(" Is Auction : " + eElement.getElementsByTagName("is_auction").item(0).getTextContent());
					System.out.println(" Customer ID : " + eElement.getElementsByTagName("customer_id").item(0).getTextContent());
					System.out.println(" Address Street1 : " + eElement.getElementsByTagName("address_street1").item(0).getTextContent());
					System.out.println(" Address Street2 : " + eElement.getElementsByTagName("address_street2").item(0).getTextContent());
					System.out.println(" city : " + eElement.getElementsByTagName("city").item(0).getTextContent());
					System.out.println(" state : " + eElement.getElementsByTagName("state").item(0).getTextContent());
					System.out.println(" postal_code : " + eElement.getElementsByTagName("postal_code").item(0).getTextContent());
					System.out.println(" Region : " + eElement.getElementsByTagName("region").item(0).getTextContent());
					System.out.println(" Location Contact Name : " + eElement.getElementsByTagName("location_contact_name").item(0).getTextContent());
					System.out.println(" Location Phone : " + eElement.getElementsByTagName("location_phone").item(0).getTextContent());
					System.out.println(" Location Fax Number : " + eElement.getElementsByTagName("location_fax_number").item(0).getTextContent());
					System.out.println(" Location Email : " + eElement.getElementsByTagName("location_email").item(0).getTextContent());
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
