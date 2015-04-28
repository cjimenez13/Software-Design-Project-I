package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public class Multiplier extends ACalculator {
    private static ICalculator _Instance = null;
    private Multiplier() {
        setNumOperators(2);
    }
    private static void createInstance(){
        if (_Instance == null){
            _Instance = new Multiplier();
        } 
    }
    public static synchronized ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
    @Override
    public ResultDTO calculate(OperatorsDTO pOperator) {
        int result = pOperator.getNum1() * pOperator.getNum2();
        return new ResultDTO(String.valueOf(result));
    }
    @Override
    public int getQuantOperators() {
        return getNumOperators();
    }

}