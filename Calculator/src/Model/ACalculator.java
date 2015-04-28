package Model;

import DataAccessObject.OperatorsDTO;
import DataAccessObject.ResultDTO;

public abstract class ACalculator implements ICalculator {
    private static ICalculator _Instance = null;
    private int numOperators;

    public ACalculator() {}
    
    private static void createInstance(){}
    public static ICalculator getInstance(){
        createInstance();
        return _Instance;
    }

    public int getNumOperators() {
        return numOperators;
    }

    public void setNumOperators(int numOperators) {
        this.numOperators = numOperators;
    }
    
    
}