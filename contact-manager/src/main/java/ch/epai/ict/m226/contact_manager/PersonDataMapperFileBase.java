package ch.epai.ict.m226.contact_manager;

import java.util.ArrayList;
import java.util.List;

public abstract class PersonDataMapperFileBase implements PersonDataMapper {

    private List<Person> persons;

    protected PersonDataMapperFileBase (String fileName) throws Exception{
        this.persons = new ArrayList<Person>();
        this.readFile(fileName, persons);
    }
 
    protected abstract void readFile (String fileName, List<Person> persons) throws Exception;

    @Override
    public Person findById(int id) {
        for  (Person p : persons){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public Iterable<Person> findAll() {
        return this.persons;
    }

}