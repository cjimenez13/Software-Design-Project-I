package View;


import DataAccessObject.*;
import java.util.*;

public interface IView {
    public static IView getInstance(){return null;}
    public ResultDTO doOperation(OperatorsDTO pOperatorsDTO);
    public void setOperation(OperationDTO pOperation);
    public void run();
}