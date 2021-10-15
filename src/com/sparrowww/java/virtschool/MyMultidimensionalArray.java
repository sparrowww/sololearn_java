package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

import java.util.Arrays;

public class MyMultidimensionalArray extends MyBasicObj {
    public MyMultidimensionalArray(){
        example();
        int matrixSize = 10;
        example2(matrixSize);
    }
    private void example2(int matrixSize){
        int [][] matrix = new int[matrixSize][matrixSize];
        MyInterface2 mInt2 = (matrixRef)->{
            for(int [] mLine:matrixRef)
                for (int i = 0; i < mLine.length; ++i)
                    mLine[i] = (int)(Math.random()*1000);
        };
        mInt2.setMultiArr(matrix);

        MyInterface3 mInt3 = (matrixRef)->{
            for(int [] mLine:matrixRef) {
                for (int i : mLine) {
                    String numberFormatted;
                    if (i < 10)
                        numberFormatted = "00".concat(String.valueOf(i));
                    else if (i < 100)
                        numberFormatted = "0".concat(String.valueOf(i));
                    else
                        numberFormatted = "".concat(String.valueOf(i));
                    Print.printText(numberFormatted);
                }
                Print.printTextLn();
            }
        };
        mInt3.printMultiArr(matrix);
    }
    private void example(){
        int [][] multiArrInt = new int[3][3];
        multiArrInt[0][0] = 1;
        multiArrInt[0][1] = 2;
        multiArrInt[0][2] = 3;
        multiArrInt[1][0] = 4;
        multiArrInt[1][1] = 5;
        multiArrInt[1][2] = 6;
        multiArrInt[2][0] = 7;
        multiArrInt[2][1] = 8;
        multiArrInt[2][2] = 9;
        Print.printTextLn(Arrays.deepToString(multiArrInt));

        int [][] multiArrInt2 = {{16,17,18,19},
                                 {34},
                                 {42,11,17,18,14,55464,5545}};
        Print.printTextLn(Arrays.deepToString(multiArrInt2));
        Print.printTextLn(multiArrInt2[2][0]);

        MyInterface myInt = (mArr)->{int tmp=0; for(int[] i:mArr)tmp+=i.length; return tmp;};

        Print.printTextPlusParam("MultiArrLength", myInt.getMultiArrLength(multiArrInt));
        Print.printTextPlusParam("MultiArrLength2", myInt.getMultiArrLength(multiArrInt2));
    }

    @FunctionalInterface
    public interface MyInterface{
        // один абстрактный метод
        int getMultiArrLength(int [][] mArr);
    }
    @FunctionalInterface
    public interface MyInterface2{
        // один абстрактный метод
        void setMultiArr(int [][] mArr);
    }
    @FunctionalInterface
    public interface MyInterface3{
        // один абстрактный метод
        void printMultiArr(int [][] mArr);
    }
}
