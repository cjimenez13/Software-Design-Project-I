/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Arrays;

/**
 *
 * @author JuanCarlos
 */
public enum Operations {
    Suma,Resta,Division,Multiplicacion,Elevar,RaizCuadrada,ConversionBinaria,ConversionOctal,ConversionHexadecimal;
    public static String[] getOperations(){
        String valueStr= Arrays.toString(Operations.values());
        return valueStr.substring(1, valueStr.length()-1).replace(" ","").split(",");
    }
}
