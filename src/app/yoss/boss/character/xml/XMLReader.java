package app.yoss.boss.character.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class XMLReader {

	protected Document xmlDoc;
	public XMLReader() {}
	
	public XMLReader(String path) {

		File input = new File(path);

		DocumentBuilder dBuilder;

		try {
			dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

			xmlDoc = dBuilder.parse(input);
			xmlDoc.getDocumentElement().normalize();

			System.out.println(xmlDoc.getDocumentElement().getNodeName());
			xmlDoc.getDocumentElement().getNodeName();

		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
