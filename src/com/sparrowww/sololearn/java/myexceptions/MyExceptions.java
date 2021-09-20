package com.sparrowww.sololearn.java.myexceptions;

import java.util.InputMismatchException;

public class MyExceptions {
    public void goEx (){
        try {
            int[] intArr = new int[2];
            intArr[0] = 123;
            intArr[1] = 124;
            intArr[2] = 125;
        }catch (Exception e)
        {
            System.out.println("An error occurred! Exception String: " + e.toString());
        }
    }

    public int divInt ( int divisible, int divider) throws ArithmeticException, InputMismatchException {
        if (divider == 0 ) {
            throw new ArithmeticException("Division by Zero!!!");
        }
        else {
            return divisible / divider;
        }
    }
}
