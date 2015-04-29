/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author JuanCarlos
 */
public interface IConsoleView extends IView{
    public String getConsoleString();
    public int createMenu();
    public void selectOption(String pOption);
    public abstract void run();
}
