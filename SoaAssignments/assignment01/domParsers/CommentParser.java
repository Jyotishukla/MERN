package DOMParsers;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class CommentParser {
	   public static void main(String[] args){

		      try {	
		         File inputFile = new File("src/xmls/Comment.xml");
		    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		         Document doc = dBuilder.parse(inputFile);
		         doc.getDocumentElement().normalize();
		         System.out.println("Root element :" 
		            + doc.getDocumentElement().getNodeName());
		         NodeList nList = doc.getElementsByTagName("comment_body");
		         System.out.println("----------------------------");
		         for (int temp = 0; temp < nList.getLength(); temp++) {
		             Node nNode = nList.item(temp);
		             System.out.println("\nCurrent Element :" 
		                + nNode.getNodeName());
		             if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		                Element eElement = (Element) nNode;
		                System.out.println("Comment ID : " 
		                   + eElement
		                   .getElementsByTagName("comment_id")
		                   .item(0)
		                   .getTextContent());
		     
		                System.out.println("Comment Time : " 
		                + eElement
		                   .getElementsByTagName("comment_time")
		                   .item(0)
		                   .getTextContent());
		                System.out.println("Comment : " 
		                + eElement
		                   .getElementsByTagName("comment")
		                   .item(0)
		                   .getTextContent());
		                System.out.println("Comment Type : " 
		                + eElement
		                   .getElementsByTagName("comment_type")
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