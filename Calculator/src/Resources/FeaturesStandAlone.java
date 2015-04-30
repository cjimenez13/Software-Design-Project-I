package Resources;

import java.util.Arrays;

public enum FeaturesStandAlone{
    Suma,Resta,Division,Multiplicacion,Elevar,RaizCuadrada,ConversionBinaria,ConversionOctal,ConversionHexadecimal;

    public static String[] getOperations(){
        String valueStr= Arrays.toString(FeaturesStandAlone.values());
        return valueStr.substring(1, valueStr.length()-1).replace(" ","").split(",");
    }
}
