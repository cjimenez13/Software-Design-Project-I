package Model;

import DataAccessObject.OperatorsDTO;
import DataAccessObject.ResultDTO;

public abstract class ACalculator implements ICalculator {
    private static ICalculator _Instance = null;

    public ACalculator() {}
    
    private static void createInstance(){}
    public static ICalculator getInstance(){
        createInstance();
        return _Instance;
    }
}