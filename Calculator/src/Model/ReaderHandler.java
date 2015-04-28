/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
public class ReaderHandler {
    private static ReaderHandler _Instance = null;
    Properties prop = new Properties();
    InputStream input = null;
    
    private static void createInstance() throws FileNotFoundException{
        if (_Instance == null){
            _Instance = new ReaderHandler();
        } 
    }
    public static synchronized ReaderHandler getInstance() throws FileNotFoundException{
        createInstance();
        return _Instance;
    }
    
    public ReaderHandler() throws FileNotFoundException{
        input=new FileInputStream("src\\calculator\\operationsFile.properties");
        try {
            prop.load(input);
        } catch (IOException ex) {
            Logger.getLogger(ReaderHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }
    
    public String getProperty(String pOperation){
        return prop.getProperty(pOperation);
    }
    
}
