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

public class CustomerParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("xmls/Customer.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :"  + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("customer");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println(" Customer ID : " + eElement.getElementsByTagName("customer_id").item(0).getTextContent());
					System.out.println("Customer Title : " + eElement.getElementsByTagName("customer_title").item(0).getTextContent());
					System.out.println("Buisness Name : " + eElement.getElementsByTagName("buisness_name").item(0).getTextContent());
					System.out.println("Billing Address : "+ eElement.getElementsByTagName("billing_address").item(0).getTextContent());
					System.out.println("City : " + eElement.getElementsByTagName("city").item(0).getTextContent());
					System.out.println("State : " + eElement.getElementsByTagName("state").item(0).getTextContent());
					System.out.println("Postal Code : " + eElement.getElementsByTagName("postal_code").item(0).getTextContent());
					System.out.println("Country : " + eElement.getElementsByTagName("country").item(0).getTextContent());
					System.out.println("Phone No : " + eElement.getElementsByTagName("phone_no").item(0).getTextContent());
					System.out.println("Cell Number : " + eElement.getElementsByTagName("cell_number").item(0).getTextContent());
					System.out.println("Other Number : " + eElement.getElementsByTagName("other_number").item(0).getTextContent());
					System.out.println("Fax Number : " + eElement.getElementsByTagName("fax_number").item(0).getTextContent());
					System.out.println("Email Address : " + eElement.getElementsByTagName("email_address").item(0).getTextContent());
					System.out.println("Customer Type : " + eElement.getElementsByTagName("customer_type").item(0).getTextContent());
					System.out.println("Company Type : " + eElement.getElementsByTagName("company_type").item(0).getTextContent());
					System.out.println("Contact Name : " + eElement.getElementsByTagName("contact_name").item(0).getTextContent());
					System.out.println("Alternate Contactname : " + eElement.getElementsByTagName("alternate_contactname").item(0).getTextContent());
					System.out.println("Date Entered : " + eElement.getElementsByTagName("date_entered").item(0).getTextContent());


				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
