package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public class Exponerator extends ACalculator {
    private static ICalculator _Instance = null;
    private Exponerator() {
        setNumOperators(2);
    }

    private static void createInstance(){
        if (_Instance == null){
            _Instance = new Exponerator();
        } 
    }
    public static synchronized ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
    @Override
    public ResultDTO calculate(OperatorsDTO pOperator) {
        int result = (int)Math.pow(pOperator.getNum1(),pOperator.getNum2());
        return new ResultDTO(String.valueOf(result));
    }
    @Override
    public int getQuantOperators() {
        return getNumOperators();
    }

}