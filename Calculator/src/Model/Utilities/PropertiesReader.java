/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanCarlos
 */
public class PropertiesReader implements IPropertiesReader{
    private static PropertiesReader _Instance = null;
    Properties prop = new Properties();
    InputStream input = null;
    
    private static void createInstance() throws FileNotFoundException{
        if (_Instance == null){
            _Instance = new PropertiesReader();
        } 
    }
    public static synchronized IPropertiesReader getInstance() throws FileNotFoundException{
        createInstance();
        return _Instance;
    }
    
    private PropertiesReader(){}
    @Override
    public void loadProperties(String pFilePath){
        setInput(pFilePath);
        loadProperties();
    }
    private boolean setInput(String pFilePath){
        try { 
            input=new FileInputStream(pFilePath);
            
            return true;
        } catch (FileNotFoundException ex) {
            return false;
        }
    }
    private void loadProperties(){
        try {
            prop.load(input);
        } catch (IOException ex) {
            Logger.getLogger(PropertiesReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    
    @Override
    public String getProperty(String pOperation){
        return prop.getProperty(pOperation);
    }
    
}
