package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

import java.math.BigDecimal;

public class MyRegularExpression extends MyBasicObj {
    public MyRegularExpression(){
        example();
    }
    private void example(){
        String progLangs = "C++,C,Java,Go";
        String [] progLangsArr = progLangs.split(",");
        for (String s : progLangsArr){
            Print.printTextLn(s);
        }

        String s = "Q!W@E#R$T%Y";
        String sClear = s.replaceAll("[!@#$%]", "*");
        Print.printTextLn(sClear);

        String [] sArr = new String[4];
        sArr[0] = "QWEreg erg";
        sArr[1] = "efgewg QWEreg erg";
        sArr[2] = "QWE123";
        sArr[3] = "QW_E";

        for(String s1 : sArr){
            if (s1.matches(".*QWE.*")){
                Print.printTextLn(s1);
            }
        }
    }
}
