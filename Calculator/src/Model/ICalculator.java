package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public interface ICalculator {
    public abstract ResultDTO calculate(OperatorsDTO pOperator);
    public int getNumOperators();
}