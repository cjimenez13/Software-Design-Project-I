package Model.OperatorsFactory;

import Model.ICalculator;

public abstract class FactoryOperators implements IFactoryOperators {
    public FactoryOperators() {}
    @Override
    public ICalculator getOperator(){
        ICalculator calc = createOperator();
        return calc;
        
    }
    protected abstract ICalculator createOperator();
	

}