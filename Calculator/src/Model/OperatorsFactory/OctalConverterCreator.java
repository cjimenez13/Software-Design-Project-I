package Model.OperatorsFactory;

import Model.ICalculator;
import Model.OctalConverter;

public class OctalConverterCreator extends FactoryOperators {

	public OctalConverterCreator() {
	}

    @Override
    protected ICalculator createOperator() {
        return OctalConverter.getInstance();
    }


}