package Model.OperatorsFactory;
import Model.Adder;
import Model.ICalculator;

public class AdderCreator extends FactoryOperators {
    public AdderCreator() {}

    @Override
    protected ICalculator createOperator(String pOperatorType) {
        return Adder.getInstance();
    }
}