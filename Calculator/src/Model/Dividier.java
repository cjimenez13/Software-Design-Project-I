package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public class Dividier extends ACalculator {
    private static ICalculator _Instance = null;
    private Dividier() {
        setNumOperators(2);
    }

    private static void createInstance(){
        if (_Instance == null){
            _Instance = new Dividier();
        } 
    }
    public static synchronized ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
    @Override
    public ResultDTO calculate(OperatorsDTO pOperator) {
        float result = pOperator.getNum1() / pOperator.getNum2();
        return new ResultDTO(String.valueOf(result));
    }


}