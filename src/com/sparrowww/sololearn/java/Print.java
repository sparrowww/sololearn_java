package com.sparrowww.sololearn.java;

public class Print {
    public static void printStrings( Object ...pValue ){
        String str="";
        for (int i = 0; i < pValue.length; ++i)
        {
            if (pValue[i] == null) pValue[i] = "null";
            str = str.concat("prm").concat(Integer.toString(i)).concat("=").concat(pValue[i].toString()).concat("; ");
        }
        System.out.println(str);
    }
}
