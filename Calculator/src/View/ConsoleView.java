
package View;


public class ConsoleView {
    private static IView _Instance = null;
    
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
}
