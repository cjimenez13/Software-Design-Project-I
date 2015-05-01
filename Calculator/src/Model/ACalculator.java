package Model;

import DataAccessObject.OperatorsDTO;
import DataAccessObject.ResultDTO;

public abstract class ACalculator implements ICalculator {
    private int numOperators;

    public ACalculator() {}
    
    public int getNumOperators() {
        return numOperators;
    }
    
    public void setNumOperators(int numOperators) {
        this.numOperators = numOperators;
    }
    
    
}