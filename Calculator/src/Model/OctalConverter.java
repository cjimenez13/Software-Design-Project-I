package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public class OctalConverter extends ACalculator {
    private static ICalculator _Instance = null;
    private OctalConverter() {}
    private static void createInstance(){
        if (_Instance == null){
           _Instance = new OctalConverter();
        } 
    }
    public static synchronized ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
    @Override
    public ResultDTO calculate(OperatorsDTO pOperator) {
        String result = Integer.toOctalString(pOperator.getNum1());
        return new ResultDTO(result);
    }

}