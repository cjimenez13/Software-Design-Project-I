package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public class HexadecimalConverter extends ACalculator {
    private static ICalculator _Instance = null;
    private HexadecimalConverter(){}
    private static void createInstance(){
        if (_Instance == null){
            _Instance = new HexadecimalConverter(){};
        } 
    }
    public static synchronized ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
    @Override
    public ResultDTO calculate(OperatorsDTO pOperator) {
        String result = Integer.toHexString(pOperator.getNum1());
        return new ResultDTO(result);
    }

}