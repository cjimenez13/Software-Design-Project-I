package DataAccessObject;

public class ResultDTO {
    private String _Result;

    private ResultDTO() {}
    public  ResultDTO(String pResult) {
        _Result = pResult;
    }

    public String getResult() {
        return _Result;
    }

    public void setResult(String pResult) {
        _Result = pResult;
    }
}