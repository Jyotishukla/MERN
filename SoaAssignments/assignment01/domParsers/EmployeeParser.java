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

public class EmployeeParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("xmls/Employee.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :"  + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("employee");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println(" Employee ID : " + eElement.getElementsByTagName("employee_id").item(0).getTextContent());
					System.out.println(" First Name : " + eElement.getElementsByTagName("first_name").item(0).getTextContent());
					System.out.println(" Last Name : " + eElement.getElementsByTagName("last_name").item(0).getTextContent());
					System.out.println(" Email : " + eElement.getElementsByTagName("email").item(0).getTextContent());
					System.out.println(" Extension : " + eElement.getElementsByTagName("extension").item(0).getTextContent());
					System.out.println(" Home phone : " + eElement.getElementsByTagName("home_phone").item(0).getTextContent());
					System.out.println(" Cell Phone : " + eElement.getElementsByTagName("cell_phone").item(0).getTextContent());
					System.out.println(" Job Title : " + eElement.getElementsByTagName("jobtitle").item(0).getTextContent());
					System.out.println(" SSN : " + eElement.getElementsByTagName("ssn").item(0).getTextContent());
					System.out.println(" Driver License Number : " + eElement.getElementsByTagName("driver_license_number").item(0).getTextContent());
					System.out.println(" Address : " + eElement.getElementsByTagName("address").item(0).getTextContent());
					System.out.println(" City : " + eElement.getElementsByTagName("city").item(0).getTextContent());
					System.out.println(" State : " + eElement.getElementsByTagName("state").item(0).getTextContent());
					System.out.println(" Postal Code : " + eElement.getElementsByTagName("postal_code").item(0).getTextContent());
					System.out.println(" Birth Date : " + eElement.getElementsByTagName("birth_date").item(0).getTextContent());
					System.out.println(" Date Hired : " + eElement.getElementsByTagName("date_hired").item(0).getTextContent());
					System.out.println(" Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
					System.out.println(" Notes : " + eElement.getElementsByTagName("notes").item(0).getTextContent());
					
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

		
}
