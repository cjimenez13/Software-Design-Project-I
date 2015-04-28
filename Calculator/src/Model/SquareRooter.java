package Model;
import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;

public class SquareRooter extends ACalculator {
    private static ICalculator _Instance = null;
    private SquareRooter() {}
    private static void createInstance(){
        if (_Instance == null){
            _Instance = new SquareRooter();
        } 
    }
    public static synchronized ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
    @Override
    public ResultDTO calculate(OperatorsDTO pOperator) {
        double result = Math.pow(pOperator.getNum1(),(1/pOperator.getNum2()));
        return new ResultDTO(String.valueOf(result));
    }

}