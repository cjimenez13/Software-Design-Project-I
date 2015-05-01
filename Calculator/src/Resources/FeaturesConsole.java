package Resources;

import java.util.Arrays;

public enum FeaturesConsole{
    Suma,Resta,Division,Multiplicacion,Elevar,RaizCuadrada,ConversionBinaria,ConversionOctal,ConversionHexadecimal;
    public static String[] getOperations(){
        String valueStr= Arrays.toString(FeaturesConsole.values());
        return valueStr.substring(1, valueStr.length()-1).replace(" ","").split(",");
    }
}
