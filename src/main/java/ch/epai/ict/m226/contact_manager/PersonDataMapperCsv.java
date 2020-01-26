package ch.epai.ict.m226.contact_manager;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PersonDataMapperCsv extends PersonDataMapperFileBase {

    public PersonDataMapperCsv(String fileName) throws Exception{
        super(fileName);
    }

    @Override
    protected void readFile(String fileName, List<Person>persons) throws Exception {
        // Lit toutes les lignes d’un fichier de texte et les stocke dans une
        // liste de chaîne.
        List<String> lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);

        // Itère la liste liste de chaîne (pour chaque chaîne de la liste)
        for (String line : lines) {
            // Scinde la ligne en un tableau. Le paramètre de split est le caractère
            // utilisé pour séparer les champs (ici le caractère de tabulation).
            String[] fields = line.split(";");

            int id = Integer.parseInt(fields[0]);
            String firstName = fields[1];
            String lastName = fields[2];
            String street = fields[3];
            String postalCode = fields[4];
            String city = fields[5];
            String emailAddress = fields[6];

            Person p = new PersonImpl(id, firstName, lastName, street, postalCode, city, emailAddress);
            persons.add(p);
        }
    }

}