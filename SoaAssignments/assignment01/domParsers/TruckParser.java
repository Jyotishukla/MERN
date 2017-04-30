package DOMParsers;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TruckParser {
	public static void main(String[] args){

		try {	
			File inputFile = new File("src/xmls/Truck.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" 
					+ doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("truck");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" 
						+ nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Truck ID : " 
							+ eElement
							.getElementsByTagName("truck_id")
							.item(0)
							.getTextContent());
					System.out.println("Make : " 
							+ eElement
							.getElementsByTagName("make")
							.item(0)
							.getTextContent());
					System.out.println("Year : " 
							+ eElement
							.getElementsByTagName("year")
							.item(0)
							.getTextContent());
					System.out.println("Model : " 
							+ eElement
							.getElementsByTagName("model")
							.item(0)
							.getTextContent());
					System.out.println("License Plate No : " 
							+ eElement
							.getElementsByTagName("license_plate_no")
							.item(0)
							.getTextContent());
					System.out.println("Employee Id : " 
							+ eElement
							.getElementsByTagName("employee_id")
							.item(0)
							.getTextContent());
					System.out.println("Color : " 
							+ eElement
							.getElementsByTagName("color")
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