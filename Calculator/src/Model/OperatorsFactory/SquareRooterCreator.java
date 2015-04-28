package Model.OperatorsFactory;

import Model.ICalculator;
import Model.SquareRooter;

public class SquareRooterCreator extends FactoryOperators {

    public SquareRooterCreator() {
    }

    @Override
    protected ICalculator createOperator() {
        return SquareRooter.getInstance();
    }
    
}