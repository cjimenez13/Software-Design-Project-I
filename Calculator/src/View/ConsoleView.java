
package View;

import DataAccessObject.OperationDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.ResultDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConsoleView extends AConsoleView {
    private static IView _Instance = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    private ConsoleView(){}
    
    private static void createInstance(){
        if (_Instance == null){
            _Instance = new StandAloneView();
        }
    }
    public static synchronized IView getInstance(){
        createInstance();
        return _Instance;
    }

    @Override
    public String getConsoleString() {
        try {
            return br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ConsoleView.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    @Override
    public void createMenu() {
        String menu = "/t/t/t/tCalculadora Basica/n"
                + "/t1.Suma/n"
                + "/t2.Resta/n"
                + "/t3.Division/n"
                + "/t4.Multiplicacion/n"
                + "/t5.Suma/n"
                + "/t6.Elevar/n"
                + "/t7.Raiz Cuadrada/n"
                + "/t8.Conversion a Binario/n"
                + "/t9.Conversion a Octal/n"
                + "/t10.Conversion a Hexadecimal/n"
                + "/t11.Salir"
                + "/tIngrese seleccion: ";
        System.out.println(menu);
    }
    
    @Override
    public ResultDTO doOperation(OperatorsDTO pOperatorsDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOperation(OperationDTO pOperation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void selectOption(String pOption) {
        
    }
}
