package calculator;

import DataAccessObject.OperatorsDTO;
import Model.ACalculator;
import Model.Adder;
import Model.ICalculator;


public class Calculator {

    public static void main(String[] args) {
        ICalculator calc = Adder.getInstance();
        System.out.println(calc.calculate(new OperatorsDTO(1,2)).getResult());
        
    }
    
}
