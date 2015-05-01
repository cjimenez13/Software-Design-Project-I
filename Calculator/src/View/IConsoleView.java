package View;

public interface IConsoleView extends IView{
    public String getConsoleString();
    public int createMenu();
    public void selectOption(String pOption);
    public abstract void run();
}
