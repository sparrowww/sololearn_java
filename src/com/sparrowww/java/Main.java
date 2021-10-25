package com.sparrowww.java;

import com.sparrowww.java.sololearn.myabstract.MyAbstractMain;
import com.sparrowww.java.sololearn.myanonymous.MyAnonymousMain;
import com.sparrowww.java.sololearn.myarraylist.MyArrayMain;
import com.sparrowww.java.sololearn.myenums.MyEnumsMain;
import com.sparrowww.java.sololearn.myequalsobj.MyEqualsMain;
import com.sparrowww.java.sololearn.myexceptions.MyExceptionsMain;
import com.sparrowww.java.sololearn.myfilestest.MyFileReadingMain;
import com.sparrowww.java.sololearn.myfilestest.MyFileWritingMain;
import com.sparrowww.java.sololearn.myhashmap.MyHashMapMain;
import com.sparrowww.java.sololearn.myhashset.MyHashSetMain;
import com.sparrowww.java.sololearn.myinnerclass.MyInnerMain;
import com.sparrowww.java.sololearn.myinterface.MyInterfaceMain;
import com.sparrowww.java.sololearn.myiterators.MyIteratorsMain;
import com.sparrowww.java.sololearn.myjavaapi.MyJavaAPIMain;
import com.sparrowww.java.sololearn.mylinkedlist.MyLinkedListMain;
import com.sparrowww.java.sololearn.myoverloading.MyOverloadingMain;
import com.sparrowww.java.sololearn.mypolymorphism.MyPolymorphismMain;
import com.sparrowww.java.sololearn.mysortinglist.MySortingListMain;
import com.sparrowww.java.sololearn.mystatic.MyStaticMain;
import com.sparrowww.java.sololearn.mytemplate.MyTemplateFuncMain;
import com.sparrowww.java.sololearn.mythreads.MyThreadMain;
import com.sparrowww.java.sololearn.mythreads.MyThreadMainLoop;
import com.sparrowww.java.sololearn.mytypecasting.MyTypeCastingMain;
import com.sparrowww.java.virtschool.*;

import java.util.Scanner;

public class Main {
    private static final boolean FLAG_NO_EXECUTE = false;
    public static void main(String[] args){
	    // write your code here
        System.out.println("Hello, World!!!");
        int sleepTime = 1;
        SLEEP(sleepTime);

        startTimeMeasure();
        new MyDefaultAndFinal();
        finishTimeMeasure();

        if (FLAG_NO_EXECUTE) {
            new MyInstanceOf();
            new MyRegularExpression();
            new MyRecursion();
            new MyMultidimensionalArray();
            new MyBasicsJava2();
            new MyLeapYearCalc();
            new MyBodyMassIndex();
            new MyMoneyConverter();
            new MyCreditCalc();
            new MyBasicsJava1();
            MyTemplateFuncMain.example();
            MyHashMapMain.exampleEntry();
            MyHashMapMain.exampleSearchMax();
            MyFileWritingMain.example();
            MyFileReadingMain.example();
            MyIteratorsMain.example();
            MySortingListMain.example();
            MyHashSetMain.example();
            MyHashMapMain.example();
            testPerfConcatStr();
            MyLinkedListMain.example();
            MyArrayMain.example();
            ScannerTest();
            MyPolymorphismMain.examle();
            MyStaticMain.example();
            MyOverloadingMain.example();
            MyAbstractMain.example();
            MyInterfaceMain.example();
            MyTypeCastingMain.examle();
            MyAnonymousMain.example();
            MyInnerMain.example();
            MyEqualsMain.example();
            MyEnumsMain.example();
            MyJavaAPIMain.example();
            MyExceptionsMain.example();
            MyThreadMain.runThread();
            MyThreadMain.runRunnableThread();
            MyThreadMainLoop.runMainLoop();
        }
    }

    private static void testPerfConcatStr(){
        startTimeMeasure();
        int i = 45;
        String s = "s = 123".concat(Integer.toString(i)).concat("678");
        System.out.println(s);
        finishTimeMeasure();

        startTimeMeasure();
        int i1 = 45;
        String s1 = "s1 = 123" + i1 + "678";
        System.out.println(s1);
        finishTimeMeasure();
    }
    private static void ScannerTest(){
        Scanner read = new Scanner(System.in);
        String name  = read.nextLine();
        int a = read.nextInt();
        Print.printTextPlusParam(name,a);
    }

    private static void SLEEP(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static long startTime;
    private static void startTimeMeasure(){
        startTime = System.currentTimeMillis();
    }
    private static void finishTimeMeasure(){
        long finishTime = System.currentTimeMillis();
        long elapsed = finishTime - startTime;
        Print.printTextPlusParam("Прошло времени, мс", elapsed);
    }
}
