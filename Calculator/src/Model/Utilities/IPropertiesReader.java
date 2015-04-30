package Model.Utilities;

public interface IPropertiesReader {
    public void loadProperties(String pFilePath);
    public String getProperty(String pOperation);
}
