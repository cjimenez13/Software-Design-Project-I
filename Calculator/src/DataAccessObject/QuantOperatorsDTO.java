/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessObject;

/**
 *
 * @author JuanCarlos
 */
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
