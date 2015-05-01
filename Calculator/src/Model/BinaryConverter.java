package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public class BinaryConverter extends ACalculator {
    private static ICalculator _Instance = null;
    private BinaryConverter() { 
        setNumOperators(1);
    }
    private static void createInstance(){
        if (_Instance == null){
            _Instance = new BinaryConverter();
        } 
    }
    public static synchronized ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
    @Override
    public ResultDTO calculate(OperatorsDTO pOperator) {
        String result = Integer.toBinaryString(pOperator.getNum1());
        return new ResultDTO(result);
    }
}