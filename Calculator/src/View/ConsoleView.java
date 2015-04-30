
package View;

import Resources.FeaturesConsole;
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


public class ConsoleView implements IConsoleView {
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
        int salir;
        do{
            //seleccion = createMenu();
            salir = createMenu();
            seleccion = getNumber();
            if(!(0<seleccion && seleccion<salir))continue;
            setOperation(new OperationDTO(getOperator(seleccion)));
            int cantOperators = controller.getQuantOperators().getNumOperators();
            showResult(executeOperation(cantOperators));
            getConsoleString();
        }while(seleccion!=salir);
    }
    private String getOperator(int pSelection){
        return controller.getFeatures().getFeatures()[pSelection-1];
    }
    private void showResult(ResultDTO pResultDTO){
        System.out.println("Resultado: "+pResultDTO.getResult());
    }
    
    
    private int getNumber(){
        int seleccion;
        while(true){
            try{
                seleccion = Integer.valueOf(getConsoleString());
                break;
            }catch(NumberFormatException  e){
                System.out.println("Numero invalido");
                continue;
            }
        }
        return seleccion;
    }
    
    
    public ResultDTO executeOperation(int pCantOperators){
        int num1;
        if(pCantOperators==1){
            System.out.print("Insertar numero: ");
            num1 = getNumber();
            return doOperation(new OperatorsDTO(num1));
        }else{
            int num2;
            System.out.print("Insertar numero 1: ");
            num1 = getNumber();
            System.out.print("Insertar numero 2: ");
            num2 = getNumber();
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

    @Override
    public int createMenu() {
        String menu = "\t\t\t\tCalculadora Basica\n";
        String[] operations = controller.getFeatures().getFeatures();
        int i = 0;
        for(i=0;i<operations.length;i++){
            menu += "\t"+(i+1)+"."+operations[i]+"\n";
        }
        menu+="\t"+(i+1)+".Salir\n \tIngrese seleccion: ";
        System.out.print(menu);
        return i+1;
    }
}
