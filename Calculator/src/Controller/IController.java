package Controller;


import DataAccessObject.ResultDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.OperationDTO;
import DataAccessObject.QuantOperatorsDTO;

public interface IController {
    public static IController getInstance(){return null;};

    public void setOperation(OperationDTO pOperationDTO);

    public ResultDTO doOperation(OperatorsDTO pOperatorsDTO);
    
    public QuantOperatorsDTO getQuantOperators();

}