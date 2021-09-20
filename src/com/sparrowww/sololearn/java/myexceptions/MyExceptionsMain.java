package com.sparrowww.sololearn.java.myexceptions;

import java.util.InputMismatchException;

public class MyExceptionsMain {
    public static void example(){
        MyExceptions mEx = new MyExceptions();
        mEx.goEx();
        try {
            int divRes = mEx.divInt(20, 4);
            System.out.println("divRes = " + divRes);
        }
        catch (Exception e) // все исключения
        {
            System.out.println("divInt Error  = " + e.toString());
        }

        try {
            int divRes = mEx.divInt(20, 0);
            System.out.println("divRes = " + divRes);
        }
        catch (ArithmeticException e) // конкретное исключение с конкретной обработкой
        {
            System.out.println("ArithmeticException Error  = " + e.toString());
        }
        catch (InputMismatchException e) // конкретное исключение с конкретной обработкой
        {
            System.out.println("InputMismatchException Error  = " + e.toString());
        }
    }
}
