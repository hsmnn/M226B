package ch.epai.ict.m226.contact_manager;

public interface DataMapperFactory {

    public static DataMapperFactory newInstance(){
        return new DataMapperFactoryImpl();
    }
    public PersonDataMapper createDataMapper(String fileName) throws Exception;

}