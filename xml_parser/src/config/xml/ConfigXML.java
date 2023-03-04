package config.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ConfigXML {
	final String CONFIG_PATH = "";
	
	public void openConfigurationSettings() {
		
	}
	
	public void setConfigurationSettings() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document doc = (Document) builder.parse(new File(CONFIG_PATH));
			
			doc.getDocumentElement().normalize();
			
			NodeList config = doc.getElementsByTagName("super");
			
			for (int i = 0; i < config.getLength(); i++) {
				Node conf = config.item(i);
				
				if (conf.getNodeType() == Element.ELEMENT_NODE) {
					Element confElement = (Element) conf;
					
					System.out.println(confElement.getNodeValue());
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
