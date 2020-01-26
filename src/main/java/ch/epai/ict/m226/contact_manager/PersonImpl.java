package ch.epai.ict.m226.contact_manager;

public class PersonImpl implements Person {

    private int id;
    private String firstName;
    private String lastName;
    private String street;
    private String postalCode;
    private String city;
    private String emailAddress;

    public PersonImpl (int id, String firstName, String lastName, String street, String postalCode, String city, String emailAddress){
        this.firstName = StringUtils.emptyStringIfNull(firstName);
        this.lastName = StringUtils.emptyStringIfNull(lastName);
        this.street = StringUtils.emptyStringIfNull(street);
        this.postalCode = StringUtils.emptyStringIfNull(postalCode);
        this.city = StringUtils.emptyStringIfNull(city);
        this.emailAddress = StringUtils.emptyStringIfNull(emailAddress);

        this.id = id;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String getStreet() {    
        return this.street;
    }

    @Override
    public String getPostalCode() {
        return this.postalCode;
    }

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }

}