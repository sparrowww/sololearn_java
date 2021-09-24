package com.sparrowww.sololearn.java;

import com.sparrowww.sololearn.java.myhashmap.MyHashMapMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
	// write your code here
        System.out.println("Hello, World!!!");
        //SLEEP(10);

        startTimeMesure();
        MyHashMapMain.exampleEntry();
        finishTimeMesure();

        //MyHashMapMain.exampleSearchMax();
        //MyFileWritingMain.example();
        //MyFileReadingMain.example();
        //MyIteratorsMain.example();
        //MySortingListMain.example();
        //MyHashSetMain.example();
        //MyHashMapMain.example();
        //testPerfConcatStr();
        //MyLinkedListMain.example();
        //MyArrayMain.example();
        //ScannerTest();
        //MyPolymorphismMain.examle();
        //MyStaticMain.example();
        //MyOverloadingMain.example();
        //MyAbstractMain.example();
        //MyInterfaceMain.example();
        //MyTypeCastingMain.examle();
        //MyAnonymousMain.example();
        //MyInnerMain.example();
        //MyEqualsMain.example();
        //MyEnumsMain.example();
        //MyJavaAPIMain.example();
        //MyExceptionsMain.example();
        //MyThreadMain.runThread();
        //MyThreadMain.runRunnableThread();
        //MyThreadMainLoop.runMainLoop();
    }

    private static void testPerfConcatStr(){
        startTimeMesure();
        int i = 45;
        String s = "s = 123".concat(Integer.toString(i)).concat("678");
        System.out.println(s);
        finishTimeMesure();

        startTimeMesure();
        int i1 = 45;
        String s1 = "s1 = 123" + i1 + "678";
        System.out.println(s1);
        finishTimeMesure();
    }
    private static void ScannerTest(){
        Scanner read = new Scanner(System.in);
        String name  = read.nextLine();
        int a = read.nextInt();
    }

    private static void SLEEP(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static long startTime;
    private static long finishTime;
    private static void startTimeMesure(){
        startTime = System.currentTimeMillis();
    }
    private static void finishTimeMesure(){
        finishTime = System.currentTimeMillis();
        long elapsed = finishTime - startTime;
        System.out.println("Прошло времени, мс: " + elapsed);
    }
}
