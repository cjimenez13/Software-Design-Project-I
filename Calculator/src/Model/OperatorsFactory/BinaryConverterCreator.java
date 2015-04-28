package Model.OperatorsFactory;

import Model.BinaryConverter;
import Model.ICalculator;

public class BinaryConverterCreator extends FactoryOperators {
    private BinaryConverterCreator() {}
    
    @Override
    protected ICalculator createOperator(String pOperatorType) {
        return BinaryConverter.getInstance();
    }


}