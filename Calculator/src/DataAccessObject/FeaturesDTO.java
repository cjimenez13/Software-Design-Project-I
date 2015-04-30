
package DataAccessObject;
public class FeaturesDTO {
    private String[] _Features;
    
    private FeaturesDTO(){};
    public FeaturesDTO (String[] pFeatures){
        _Features = pFeatures;
    }

    public String[] getFeatures() {
        return _Features;
    }

    public void setFeatures(String[] _Features) {
        this._Features = _Features;
    }
    
    
}
