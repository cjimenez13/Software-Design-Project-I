package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public class Substracter extends ACalculator {
    private static ICalculator _Instance = null;
    private Substracter() {}
    private static void createInstance(){
        if (_Instance == null){
            _Instance = new Substracter();
        } 
    }
    public static synchronized ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
    @Override
    public ResultDTO calculate(OperatorsDTO pOperator) {
        int result = pOperator.getNum1() - pOperator.getNum2();
        return new ResultDTO(String.valueOf(result));
    }

}