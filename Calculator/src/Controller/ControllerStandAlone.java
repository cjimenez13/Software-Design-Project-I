package Controller;


import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.OperationDTO;
import Controller.AControllerStandAlone;
import java.util.*;

public class ControllerStandAlone extends AControllerStandAlone {
    private static IController  _Instance = null;
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultDTO doOperation(OperatorsDTO pOperatorsDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}