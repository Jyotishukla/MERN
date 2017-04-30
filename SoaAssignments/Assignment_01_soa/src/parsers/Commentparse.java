package parsers;

import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Commentparse extends DefaultHandler {
	boolean comment_id = false;
	boolean comment_time = false;
	boolean comment = false;
	boolean comment_type = false;

	public static void main(String[] args){

		try {	
			File xmlFile = new File("xmls/Comment.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			Commentparse userhandler = new Commentparse();
			saxParser.parse(xmlFile, userhandler);     
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void startElement(String uri, 
			String localName, String qName, Attributes attributes)
					throws SAXException {
		if (qName.equalsIgnoreCase("comment_id")) {
			comment_id = true;
		}else  if (qName.equalsIgnoreCase("comment_time")) {
			comment_time = true;
		}else  if (qName.equalsIgnoreCase("comment")) {
			comment = true;
		}else  if (qName.equalsIgnoreCase("comment_type")) {
			comment_type = true;
		}
	}

	@Override
	public void endElement(String uri, 
			String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("comment_body")) {
			System.out.println("End Element :" + qName);

		}
	}
	
	@Override
	   public void characters(char ch[], 
	      int start, int length) throws SAXException {
	      if (comment_id) {
	    	  System.out.println("Comment ID:" + new String(ch, start, length));
	    	  comment_id =false;
	      } else if (comment_time) {
	    	  System.out.println("Comment Time:" + new String(ch, start, length));
	    	  comment_time =false;
	      }else if (comment) {
	    	  System.out.println("Comment:" + new String(ch, start, length));
	    	  comment =false;
	      }else if (comment_type) {
	    	  System.out.println("Comment Type:" + new String(ch, start, length));
	    	  comment_type =false;
	      }
	}
}


