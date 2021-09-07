package com.sparrowww.sololearn.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World!!!");

        animalTest();
        catTest();
        //staticTest();
        //ScannerTest();

    }

    public static void animalTest(){
        Animal animal = new Animal();
        animal.eat();
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
    public static void ScannerTest(){
        Scanner read = new Scanner(System.in);
        String name  = read.nextLine();
        int a = read.nextInt();
    }
}
