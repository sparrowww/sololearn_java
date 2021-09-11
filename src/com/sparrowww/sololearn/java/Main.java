package com.sparrowww.sololearn.java;

import com.sparrowww.sololearn.java.myabstract.*;
import com.sparrowww.sololearn.java.mypolymorpism.*;
import com.sparrowww.sololearn.java.mystatic.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World!!!");

        //animalTest();
        //catTest();
        //staticTest();
        //ScannerTest();
        //OverloadTest();
        AbstractTest();
    }

    public static void animalTest(){
        Animal animal = new Animal();
        animal.eat();
    }
    public static void catTest(){
        Animal cat = new Cat();
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
    public static void ScannerTest(){
        Scanner read = new Scanner(System.in);
        String name  = read.nextLine();
        int a = read.nextInt();
    }
    public static void OverloadTest(){
        OverloadingTest ovl = new OverloadingTest();
        int paramInt = 42;
        ovl.print(paramInt);
        float paramFloat = 42.42f;
        ovl.print(paramFloat);
    }
    public static void AbstractTest(){
        AbstractBook absBook = new HorrorBook();
        absBook.reading();
    }
}
