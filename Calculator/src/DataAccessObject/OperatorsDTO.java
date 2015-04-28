package DataAccessObject;

public class OperatorsDTO {
    private int _Num1;
    private int _Num2;

    private OperatorsDTO(){}
    public  OperatorsDTO(int pNum1, int pNum2) {
        _Num1 = pNum1;
        _Num2 = pNum2;
    }

    public  OperatorsDTO(int pNum1) {
        _Num1 = pNum1;
    }

    public int getNum1() {
        return _Num1;
    }

    public int getNum2() {
        return _Num2;
    }

    public void setNum1(int pNum1) {
        _Num1 = pNum1;
    }

    public void setNum2(int pNum2) {
        _Num2 = pNum2;
    }

}