package com.sparrowww.sololearn.java;

import com.sparrowww.sololearn.java.myabstract.MyAbstractMain;
import com.sparrowww.sololearn.java.myanonymous.MyAnonymousMain;
import com.sparrowww.sololearn.java.myinterface.MyInterfaceMain;
import com.sparrowww.sololearn.java.myoverloading.MyOverloadingMain;
import com.sparrowww.sololearn.java.mypolymorphism.MyPolymorphismMain;
import com.sparrowww.sololearn.java.mystatic.MyStaticMain;
import com.sparrowww.sololearn.java.mytypecasting.MyTypeCastingMain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World!!!");

        //ScannerTest();
        //MyPolymorphismMain.examle();
        //MyStaticMain.example();
        //MyOverloadingMain.example();
        //MyAbstractMain.example();
        //MyInterfaceMain.example();
        //MyTypeCastingMain.examle();
        //MyAnonymousMain.example();
    }

    public static void ScannerTest(){
        Scanner read = new Scanner(System.in);
        String name  = read.nextLine();
        int a = read.nextInt();
    }
}
