package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public interface IContext {
	public void setContext(ICalculator pICalculator);
	public ResultDTO executeCalculate(OperatorsDTO pOperatorsDTO);

}