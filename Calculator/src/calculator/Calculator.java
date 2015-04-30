package calculator;

import DataAccessObject.OperatorsDTO;
import Model.ACalculator;
import Model.Adder;
import Model.ICalculator;
import Model.OperatorsFactory.FactoryOperators;
import Model.OperatorsFactory.OperatorsMaker;
import View.ConsoleView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Calculator {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, Exception{
        ConsoleView a = (ConsoleView) ConsoleView.getInstance();
        a.run();
        
        
    }
    
}
