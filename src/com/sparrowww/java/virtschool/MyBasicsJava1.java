package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

import java.util.Scanner;

public class MyBasicsJava1 {
    public MyBasicsJava1(){
        Print.printText("Основы Java-программирования I");
        example();
    }
    private void example(){
        /** HO-HO-HO
         * */

        getCurrentTime();
//        formatNumbers();
//        calcCircleArea(2.15);
//        Scanner scanner = new Scanner(System.in);
//        calcCircleArea(scanner.nextDouble());
    }
    private void getCurrentTime(){
        System.currentTimeMillis();
    }
    private void formatNumbers(){
        final int BINARYNUMBER = 0b0101_0101;
        final int OCTALNUMBER = 0113;
        final int HEXNUMBER = 0xFFFF;
        final long BIGNUMBER = 123_456_789L;
    }
    private void calcCircleArea( double radius ){
        double area = Math.PI*radius*radius;
        Print.printTextPlusParam("Радиус круга(см)", radius);
        Print.printTextPlusParam("Площадь круга(см2)", area);
    }
}
