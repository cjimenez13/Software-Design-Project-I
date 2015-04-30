/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resources;

import java.util.Arrays;

/**
 *
 * @author JuanCarlos
 */
public enum FeaturesConsole{
    Suma,Resta,Division,Multiplicacion,Elevar,RaizCuadrada,ConversionBinaria,ConversionOctal,ConversionHexadecimal;
    public static String[] getOperations(){
        String valueStr= Arrays.toString(FeaturesConsole.values());
        return valueStr.substring(1, valueStr.length()-1).replace(" ","").split(",");
    }
}
