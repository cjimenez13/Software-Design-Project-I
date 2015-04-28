package Model.OperatorsFactory;

import Model.ICalculator;
import Model.Substracter;

public class SubstracterCreator extends FactoryOperators {

    public SubstracterCreator() {
    }

    @Override
    protected ICalculator createOperator() {
        return Substracter.getInstance();
    }

}