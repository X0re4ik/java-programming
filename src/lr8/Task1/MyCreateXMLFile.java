package lr8.Task1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class MyCreateXMLFile {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("cars");
            doc.appendChild(rootElement);
            String[] names = {"bsbsijd", "sdfsdf", "dsfsdfsd", "sfsdfsdf"};
            int[] prices = {1000, 2000, 3000, 4000};
            for (int i = 0; i < names.length; i++) {

                Element task1 = doc.createElement("car");
                rootElement.appendChild(task1);

                Element name1 = doc.createElement("name");
                name1.appendChild(doc.createTextNode(names[i]));
                task1.appendChild(name1);

                Element deadline1 = doc.createElement("price");
                deadline1.appendChild(
                    doc.createTextNode(
                        Integer.toString(prices[i])
                    )
                );
                task1.appendChild(deadline1);
            }

            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/lr8/Task1/example.xml"));
            transformer.transform(source, result);
            System.out.println("XML-файл успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}