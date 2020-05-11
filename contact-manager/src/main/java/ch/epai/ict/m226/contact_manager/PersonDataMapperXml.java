package ch.epai.ict.m226.contact_manager;

import java.util.List;
import java.io.File;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class PersonDataMapperXml extends PersonDataMapperFileBase {

    public PersonDataMapperXml(String fileName) throws Exception {
        super(fileName);
    }

    @Override
    protected void readFile(String fileName, List<Person>persons) throws Exception {
        File xmlFile = new File(fileName);

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);
        doc.getDocumentElement().normalize();

        NodeList personNodeList = doc.getElementsByTagName("person");

        for (int i = 0; i < personNodeList.getLength(); i++) {
            Node node = personNodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE) {

                Element personElement = (Element)node;
                int id =  Integer.parseInt(personElement.getElementsByTagName("id").item(0).getTextContent());
                String lastName = personElement.getElementsByTagName("lastname").item(0).getTextContent();
                String firstName = personElement.getElementsByTagName("firstname").item(0).getTextContent();
                String street = personElement.getElementsByTagName("address").item(0).getTextContent();
                String postalCode = personElement.getElementsByTagName("postal-code").item(0).getTextContent();
                String city = personElement.getElementsByTagName("city").item(0).getTextContent();
                String emailAddress = personElement.getElementsByTagName("email").item(0).getTextContent();

                // TODO : utiliser les champs pour créer un objet de type PersonImpl et l'ajouter à la liste
                
                PersonImpl p = new PersonImpl(id, lastName, firstName, street, postalCode, city, emailAddress);
                persons.add(p);
            }
        }
    }

}