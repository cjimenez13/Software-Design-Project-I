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
        ICalculator calc = Adder.getInstance();
        //System.out.println(calc.calculate(new OperatorsDTO(1,2)).getResult());
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("src\\calculator\\operationsFile.properties");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        prop.load(input);
        String clase = prop.getProperty("Elevar");
        
        FactoryOperators fo;
        fo = (FactoryOperators) Class.forName("Model.OperatorsFactory."+clase).newInstance();
        ICalculator c = fo.getOperator();
        System.out.println(c.calculate(new OperatorsDTO(2,2)).getResult());
        ConsoleView a = (ConsoleView) ConsoleView.getInstance();
        a.run();
        
        
    }
    
}
