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
    public static void printTextPlusParam( String text, Object param ){
        String str="";
        if (text == null) text = "null";
        if (param == null) param = "null";
        str = str.concat(text).concat("=").concat(param.toString());
        System.out.println(str);
    }
    public static void printTextPlusParam( Object param ){
        printTextPlusParam("param", param);
    }
}
