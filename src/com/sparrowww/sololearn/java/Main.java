package com.sparrowww.sololearn.java;

import com.sparrowww.sololearn.java.myabstract.*;
import com.sparrowww.sololearn.java.myoverloading.*;
import com.sparrowww.sololearn.java.mypolymorpism.*;
import com.sparrowww.sololearn.java.mystatic.*;
import com.sparrowww.sololearn.java.myinterface.*;
import com.sparrowww.sololearn.java.mytypecasting.*;

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
        //AbstractTest();
        //InterfaceTest();
        //TCastTest();
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
        CalcPoint.printPoint();
        CalcPoint.touchPoint();
        CalcPoint.printPoint();
        CalcPoint.touchPoint();
        CalcPoint.printPoint();
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
        int randNumPages = (int) (Math.random() * 1000);
        absBook.setPage(randNumPages);
        absBook.reading();
    }
    public static void InterfaceTest(){
        Car car = new Car();
        car.myWayIs();
        car.myFuelIs();

        Train train = new Train();
        train.myWayIs();
        train.myFuelIs();
    }
    public static void TCastTest(){
        TypeCastingTest castT = new TypeCastingTest();
        //castT.testCast();
        //castT.arrTest();
        //castT.upcastingTest();
        castT.downcastingTest();
    }
}
