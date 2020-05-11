package ch.epai.ict.m226.contact_manager;


public final class App {

    public static void main(String[] args) {

        String fileName = "person.xml"; // ou "person.csv" les deux doivent fonctionner

        DataMapperFactory factory = DataMapperFactory.newInstance();
  
        try {
            PersonDataMapper dataMapper = factory.createDataMapper(fileName);

            Iterable<Person> persons = dataMapper.findAll();
            for (Person p : persons) {
                System.out.printf("%s %s\n", p.getFirstName(), p.getEmailAddress());
            }
        
        } catch (Exception ex) {
            System.out.println("Un erreur est survenue.");
        }
    }
}
