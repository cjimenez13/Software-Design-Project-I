package Model.OperatorsFactory;

import Model.ICalculator;

public abstract class FactoryOperators implements IFactoryOperators {
    private static IFactoryOperators _Instance;
    public FactoryOperators() {}
    @Override
    public ICalculator getOperator(String pOperatorType){
        ICalculator calc = createOperator(pOperatorType);
        return calc;
        
    }
    protected abstract ICalculator createOperator(String pOperatorType);
	

}