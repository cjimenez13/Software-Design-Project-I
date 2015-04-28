package Model.OperatorsFactory;

import Model.ICalculator;
import Model.Multiplier;

public class MultiplierCreator extends FactoryOperators {

    public MultiplierCreator() {
    }

    @Override
    protected ICalculator createOperator() {
        return Multiplier.getInstance();
    }


}