package Controller;


import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.OperationDTO;
import Controller.AControllerStandAlone;
import DataAccessObject.QuantOperatorsDTO;
import Model.Context;
import Model.IContext;
import java.util.*;

public class ControllerStandAlone extends AControllerStandAlone {
    private static IController  _Instance = null;
    private IContext context = Context.getInstance();
    
    public ControllerStandAlone() {}

    private static void createInstance(){
        if(_Instance == null){
            _Instance = new ControllerStandAlone();
        }
    }
    public static synchronized IController getInstance(){
        createInstance();
        return _Instance;
    }
	
    @Override
    public void setOperation(OperationDTO pOperationDTO) {
        context.setContext(pOperationDTO);
    }

    @Override
    public ResultDTO doOperation(OperatorsDTO pOperatorsDTO) {
        return context.executeCalculate(pOperatorsDTO);
    }

    @Override
    public QuantOperatorsDTO getQuantOperators() {
        return context.getQuantOperators();
    }

}