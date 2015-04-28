package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public interface ICalculator {
    public abstract ResultDTO calculate(OperatorsDTO pOperator);
    //public static ICalculator getInstance(){return null;};
    public static void createInstance(){};
    public int getQuantOperators();

}