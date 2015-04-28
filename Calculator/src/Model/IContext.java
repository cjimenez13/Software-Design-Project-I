package Model;
import DataAccessObject.OperationDTO;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.QuantOperatorsDTO;

public interface IContext {
	public void setContext(OperationDTO pOperationDTO);
	public ResultDTO executeCalculate(OperatorsDTO pOperatorsDTO);
        public QuantOperatorsDTO getQuantOperators();
}