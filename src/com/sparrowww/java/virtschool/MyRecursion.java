package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

public class MyRecursion extends MyBasicObj {
    public MyRecursion(){
//        example1();
//        example2();
        hanoiTower(3,"SRC","HLP","DST");
    }
    public void hanoiTower(int n, String fromTower, String auxTower, String toTower) {
        if (n == 1) {// простой случай
            System.out.println("base  Переместите диск ".concat(Integer.toString(n)).concat(" с ").concat(fromTower).concat(" на ").concat(toTower));
        }
        else {
            hanoiTower(n - 1, fromTower, toTower, auxTower);
            System.out.println("after Переместите диск ".concat(Integer.toString(n)).concat(" с ").concat(fromTower).concat(" на ").concat(toTower));
            hanoiTower(n - 1, auxTower, fromTower, toTower);
        }
    }
    private void example2(){
        int numFibonacci = 10;
        for (int i = 0; i <= numFibonacci; i ++) {
            int res = fibonacciRec(i);
            Print.printText(i,"");
            Print.printTextPlusParam("F", res);
        }
    }
    private int fibonacciRec(int in){
        int out;
        if ( in == 0 ){
            out = 0;
        }
        else if ( in == 1 ){
            out = 1;
        }
        else{
            out = fibonacciRec(in - 1) + fibonacciRec( in - 2);
        }
        return out;
    }
    private void example1(){
        int numFactorial = 100;
        for (int i = 0; i <= numFactorial; i ++) {
            double res = factorialRec(i);
            Print.printText(i,"");
            Print.printTextPlusParam("!", res);
        }
    }
    private double factorialRec(long inNumber){
        double outNumber;
        if (inNumber == 0) {
            outNumber = 1;
        }
        else {
            outNumber = inNumber*factorialRec(inNumber - 1);
        }
        return outNumber;
    }
}
