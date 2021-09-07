package com.sparrowww.sololearn.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World!!!");
        //staticTest();
        catTest();
    }

    public static void catTest(){
        Cat cat = new Cat();
        cat.printAnimalType();
        cat.eat();
    }

    public static void staticTest(){
        MyPrint.print("");
        MyPrint.print("Static func is interesting!");
        CalcPoint.touchPoint();
        CalcPoint.touchPoint();
        MyPrint.print("");
    }
}
