package Controller;


import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.OperationDTO;
import DataAccessObject.FeaturesDTO;
import DataAccessObject.QuantOperatorsDTO;
import Model.Context;
import Model.IContext;
import Resources.FeaturesStandAlone;

public class ControllerStandAlone implements IControllerStandAlone {
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
    
    @Override
    public FeaturesDTO getFeatures() {
        return new FeaturesDTO(FeaturesStandAlone.getOperations());
    }

}