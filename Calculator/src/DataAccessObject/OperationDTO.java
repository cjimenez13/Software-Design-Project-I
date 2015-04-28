package DataAccessObject;

public class OperationDTO {
    private String _Operation;

    private OperationDTO() {}
    public OperationDTO(String pOperation) {
        _Operation = pOperation;
    }
    
    public String getOperation() {
        return _Operation;
    }
    public void setOpertation(String pOperation) {
        _Operation = pOperation;
    }

}