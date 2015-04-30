package Controller;


import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.OperationDTO;
import DataAccessObject.FeaturesDTO;
import DataAccessObject.QuantOperatorsDTO;
import Model.Context;
import Model.IContext;
import Resources.FeaturesConsole;

public class ControllerConsole implements IControllerConsole {
    private static IController  _Instance = null;
    private IContext context;
    
    private ControllerConsole() {
        context = Context.getInstance();
    }
    
    private static void createInstance(){
        if(_Instance == null){
            _Instance = new ControllerConsole();
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

    @Override
    public FeaturesDTO getFeatures() {
        return new FeaturesDTO(FeaturesConsole.getOperations());
    }

}