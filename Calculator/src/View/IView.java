package View;

import DataAccessObject.*;

public interface IView {
    public ResultDTO doOperation(OperatorsDTO pOperatorsDTO);
    public void setOperation(OperationDTO pOperation);
}