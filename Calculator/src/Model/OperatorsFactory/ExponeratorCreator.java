package Model.OperatorsFactory;


import Model.Exponerator;
import Model.ICalculator;
import Model.OperatorsFactory.FactoryOperators;
import java.util.*;

public class ExponeratorCreator extends FactoryOperators {
    public ExponeratorCreator() {
    }

    @Override
    protected ICalculator createOperator(String pOperatorType) {
        return Exponerator.getInstance();
    }


}