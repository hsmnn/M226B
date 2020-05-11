package ch.epai.ict.m226.contact_manager;

public class DataMapperFactoryImpl implements DataMapperFactory {

    @Override
    public PersonDataMapper createDataMapper(String fileName) throws Exception{
        PersonDataMapper dataMapper;
        if (fileName.endsWith(".csv")){
            dataMapper = new PersonDataMapperCsv(fileName);
        }else{
            dataMapper = new PersonDataMapperXml(fileName);
        }
        
        return dataMapper;
    } 
}