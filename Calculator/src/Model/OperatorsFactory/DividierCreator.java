package Model.OperatorsFactory;

import Model.Dividier;
import Model.ICalculator;

public class DividierCreator extends FactoryOperators {
    private DividierCreator() {}

    @Override
    protected ICalculator createOperator(String pOperatorType) {
        return Dividier.getInstance();
    }


}