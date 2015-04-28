package Model.OperatorsFactory;

import Model.BinaryConverter;
import Model.ICalculator;

public class BinaryConverterCreator extends FactoryOperators {
    public BinaryConverterCreator() {}
    
    @Override
    protected ICalculator createOperator() {
        return BinaryConverter.getInstance();
    }


}