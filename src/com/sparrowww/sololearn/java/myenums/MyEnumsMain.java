package com.sparrowww.sololearn.java.myenums;

public class MyEnumsMain {
    static public void example(){
        MyEnums mEnums = new MyEnums();
        var currentColor = mEnums.getColorByNum(1);
        System.out.println("currentColor = " + currentColor);
        int numColor = mEnums.getNumByColor(MyEnums.MyColor.MY_BLUE);
        System.out.println("numColor = " + numColor);
    }
}
