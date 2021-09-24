package com.sparrowww.java.sololearn.myarraylist;

import java.util.ArrayList;

public class MyArrayString {
    private static void myPrint(Object obj){
        System.out.println(obj);
    }
    static public void MyArrayStringTest(){
        final int ARRCAPACITY = 3;
        ArrayList<String> arrString = new ArrayList<>(ARRCAPACITY);
        myPrint("ARR SIZE = " + arrString.size());
        arrString.add("cat");
        arrString.add("dog");
        arrString.add("cow");
        myPrint("ARR SIZE = " + arrString.size());
        arrString.add("goat"); // уже за пределами емкости массива! это накладно!
        myPrint("ARR SIZE = " + arrString.size());
    }
}
