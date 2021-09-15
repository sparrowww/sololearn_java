package com.sparrowww.sololearn.java.myoverloading;

public class MyOverloadingMain {
    public static void example(){
        MyOverloading ovl = new MyOverloading();
        int paramInt = 42;
        ovl.print(paramInt);
        float paramFloat = 42.42f;
        ovl.print(paramFloat);
    }
}
