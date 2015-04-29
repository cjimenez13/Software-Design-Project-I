package View;

import DataAccessObject.OperatorsDTO;
import DataAccessObject.ResultDTO;

public interface IStandAloneView extends IView{
    public void showResult(ResultDTO pResultDTO);
    public OperatorsDTO getNumbers(int pQuantNumbers);

}
