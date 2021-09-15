package com.sparrowww.sololearn.java.myanonymous;

public class MyAnonymousMain {
    public static void example(){
        MyAnonymous myAn = new MyAnonymous();
        myAn.printClassHello();
        // налету переопределяем метод printClassHello для myAn1
        MyAnonymous myAn1 = new MyAnonymous(){
            @Override
            public void printClassHello(){
                System.out.println("Hello! I'm MyAnonymous class @Override!");
            }
        };
        myAn1.printClassHello(); // влияет только на объект myAn1
        myAn.printClassHello(); // на объект myAn не влияет!
    }
}
