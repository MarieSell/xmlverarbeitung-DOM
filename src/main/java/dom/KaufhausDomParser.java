package dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class KaufhausDomParser {
	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		System.out.println("PersNr. \t Name ");
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("kaufhaus2.xml");
			NodeList abtLeiterList = doc.getElementsByTagName("abteilungsleiter");

			// print PersNr und AbteilungsleiterName
			for (int i = 0; i < abtLeiterList.getLength(); i++) {
				Node abtLeiterNode = abtLeiterList.item(i);
				if (abtLeiterNode.getNodeType() == Node.ELEMENT_NODE) {
					Element abtLeiter = (Element) abtLeiterNode;
					String id = abtLeiter.getAttribute("persNr");
					String abtLeiterName = abtLeiter.getTextContent().trim();
					System.out.println(id + "\t\t " + abtLeiterName);
				}
			}

			// print AbteilungsName und Gesamtzahl Artikel einer Abteilung
			System.out.println("\n\nAnzahl \t\t Artikel");
			for (int i = 0; i < abtLeiterList.getLength(); i++) {
				Node artikelNode = abtLeiterList.item(i).getNextSibling();

				if (artikelNode.getNodeType() == Node.ELEMENT_NODE) {
					Element artikel = (Element) artikelNode;
					String anzahl = artikel.getAttribute("anzahl");
					String artikelName = artikel.getTextContent().trim();
					System.out.println(anzahl + ":\t\t " + artikelName);
				}
			}

		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}