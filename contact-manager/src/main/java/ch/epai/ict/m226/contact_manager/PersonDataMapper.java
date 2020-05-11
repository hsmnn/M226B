package ch.epai.ict.m226.contact_manager;

public interface PersonDataMapper{

    public Iterable<Person> findAll();
    public Person findById(int id);

}