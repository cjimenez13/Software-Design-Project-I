package Model.OperatorsFactory;

import Model.Dividier;
import Model.ICalculator;

public class DividerCreator extends FactoryOperators {
    public DividerCreator() {}

    @Override
    protected ICalculator createOperator() {
        return Dividier.getInstance();
    }


}