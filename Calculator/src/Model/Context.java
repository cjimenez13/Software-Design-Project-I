package Model;
import Model.Utilities.PropertiesReader;
import DataAccessObject.OperationDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.QuantOperatorsDTO;
import DataAccessObject.ResultDTO;
import Model.OperatorsFactory.FactoryOperators;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Context implements IContext {
    private static IContext _Instance = null;
    private ICalculator _Strategy = null;
    
    private Context() {}
    
    private static void createInstance(){
        if(_Instance == null){
            _Instance = new Context();
        }
    }
    public static synchronized IContext getInstance(){
        createInstance();
        return _Instance;
    }
    
    @Override
    public void setContext(OperationDTO pOperationDTO) {
        String operation = pOperationDTO.getOperation();
        String clase ="";
        try {
            PropertiesReader.getInstance().loadProperties("src\\Resources\\operationsFile.properties");
            clase = PropertiesReader.getInstance().getProperty(operation);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Context.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {            
            FactoryOperators f =(FactoryOperators) Class.forName("Model.OperatorsFactory."+clase).newInstance();
            _Strategy = f.getOperator();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Context.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Context.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Context.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @Override
    public ResultDTO executeCalculate(OperatorsDTO pOperatorsDTO) {
        return _Strategy.calculate(pOperatorsDTO);
    }

    @Override
    public QuantOperatorsDTO getQuantOperators() {
        return new QuantOperatorsDTO(_Strategy.getQuantOperators());
    }

    

}