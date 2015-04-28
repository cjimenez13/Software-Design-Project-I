package Model.OperatorsFactory;

import Model.HexadecimalConverter;
import Model.ICalculator;

public class HexadecimalConverterCreator extends FactoryOperators {

    public HexadecimalConverterCreator() {}

    @Override
    protected ICalculator createOperator(String pOperatorType) {
        return HexadecimalConverter.getInstance();
    }


}