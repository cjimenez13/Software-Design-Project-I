package Model.OperatorsFactory;

import Model.ICalculator;

public interface IFactoryOperators {

	public static IFactoryOperators getInstance(){return null;};

	public ICalculator getOperator() throws Exception;

}