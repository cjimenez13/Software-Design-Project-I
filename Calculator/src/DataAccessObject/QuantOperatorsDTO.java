package DataAccessObject;

public class QuantOperatorsDTO {
    int numOperators;
    
    private QuantOperatorsDTO(){
        
    }
    
    public QuantOperatorsDTO(int pQuantOperators){
        numOperators=pQuantOperators;
    }

    public int getNumOperators() {
        return numOperators;
    }

    public void setNumOperators(int numOperators) {
        this.numOperators = numOperators;
    }
    
    
    
}
