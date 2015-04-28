
package View;

import Controller.ControllerConsole;
import Controller.IController;
import DataAccessObject.OperationDTO;
import DataAccessObject.OperatorsDTO;
import DataAccessObject.ResultDTO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConsoleView extends AConsoleView {
    private IController controller = null;
    private static IView _Instance = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    private ConsoleView(){
        controller = ControllerConsole.getInstance();
    }
    
    private static void createInstance(){
        if (_Instance == null){
            _Instance = new ConsoleView();
        }
    }
    public static synchronized IView getInstance(){
        createInstance();
        return _Instance;
    }
    

    @Override
    public void run() {
        int seleccion = 0;
        do{
            createMenu();
            seleccion = Integer.valueOf(getConsoleString());
            String op = Operators.values()[seleccion-1].toString();
            System.out.println(op);
            setOperation(new OperationDTO(op));
            int cantOperators = controller.getQuantOperators().getNumOperators();
            System.out.println("Resultado: "+executeOperation(cantOperators).getResult());
            getConsoleString();
        }while(seleccion!=10);
    }
    
    
    public ResultDTO executeOperation(int pCantOperators){
        int num1;
        if(pCantOperators==1){
            System.out.print("Insertar numero: ");
            num1 = Integer.valueOf(getConsoleString());
            return doOperation(new OperatorsDTO(num1));
        }else{
            int num2;
            System.out.print("Insertar numero 1: ");
            num1 = Integer.valueOf(getConsoleString());
            System.out.print("Insertar numero 2: ");
            num2 = Integer.valueOf(getConsoleString());
            return doOperation(new OperatorsDTO(num1, num2));
        }
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
        String menu = "\t\t\t\tCalculadora Basica\n"
                + "\t1.Suma\n"
                + "\t2.Resta\n"
                + "\t3.Division\n"
                + "\t4.Multiplicacion\n"
                + "\t5.Elevar\n"
                + "\t6.Raiz Cuadrada\n"
                + "\t7.Conversion a Binario\n"
                + "\t8.Conversion a Octal\n"
                + "\t9.Conversion a Hexadecimal\n"
                + "\t10.Salir\n"
                + "\tIngrese seleccion: ";
        System.out.print(menu);
    }
    
    @Override
    public ResultDTO doOperation(OperatorsDTO pOperatorsDTO) {
         return controller.doOperation(pOperatorsDTO);
    }

    @Override
    public void setOperation(OperationDTO pOperation) {
        controller.setOperation(pOperation);
    }

    @Override
    public void selectOption(String pOption) {
        
    }
}
