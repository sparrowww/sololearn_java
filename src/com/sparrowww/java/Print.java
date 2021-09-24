package com.sparrowww.java;

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
    public static void printTextPlusParam( Object text, Object param ){
        String str="";
        if (text == null) text = "null";
        if (param == null) param = "null";
        str = str.concat(text.toString()).concat("=").concat(param.toString());
        System.out.println(str);
    }
    public static void printTextPlusParam( Object param ){
        printTextPlusParam("param", param);
    }
    public static void printText( Object text ){
        String str="";
        if (text == null) text = "null";
        System.out.println(text);
    }
}
