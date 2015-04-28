package Model;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.ResultDTO;

public class Context implements IContext {
    private static IContext _Instance = null;
    private ICalculator _Strategy = null;
    private Context() {}
    
    private static void createInstance(){
        if(_Instance == null){
            _Instance = new Context();
        }
    }
    public static synchronized IContext getInstance(){
        createInstance();
        return _Instance;
    }

    @Override
    public void setContext(ICalculator pICalculator) {
        _Strategy = pICalculator;
    }

    @Override
    public ResultDTO executeCalculate(OperatorsDTO pOperatorsDTO) {
        return _Strategy.calculate(pOperatorsDTO);
    }

}