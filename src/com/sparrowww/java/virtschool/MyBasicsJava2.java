package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyBasicsJava2 extends MyBasicObj{
//    private final int [] arrGenerated;
    public MyBasicsJava2() {
//        arrGenerated = arrGen(100000, 100000);
        mySort(new int[]{10, 5, 7 ,8 ,99,16,38,988,74,1,2,4});
        mySort(arrGen(50,50));
//        example();
    }
    private void mySort(int [] arrToSort){
        int mimIdx = 0;
        for ( int arrBegin = 0; arrBegin < arrToSort.length; ++arrBegin)
        {
            int min = arrToSort[arrBegin];
            for (int i = arrBegin; i < arrToSort.length; ++i){
                if (arrToSort[i] <= min)
                {
                    min = arrToSort[i];
                    mimIdx = i;
                }
            }
            int tmp = arrToSort[arrBegin];
            arrToSort[arrBegin] = arrToSort[mimIdx];
            arrToSort[mimIdx] = tmp;
        }

        for(int i:arrToSort) {
            Print.printText(i);
        }
        Print.printTextLn();
    }
    public void linSearchEx(){
//        int resSearch = LinearSearch(arrGenerated,80000);
//        Print.printTextPlusParam("resSearch(LIN)", resSearch);
    }
    public void binSearchEx(){
//        Arrays.sort(arrGenerated);
//        int resSearch = BinarySearch(arrGenerated ,80000);
//        Print.printTextPlusParam("resSearch(BIN)", resSearch);
    }
    private int LinearSearch(int [] arrToSearch, int key){
        for(int idx = 0; idx < arrToSearch.length; ++idx){
            if (arrToSearch[idx] == key)
            {
                return idx;
            }
        }
        return -1;
    }
    private int BinarySearch(int [] arrToSearch, int key){
        int low = 0;
        int high = arrToSearch.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < arrToSearch[mid])
                high = mid - 1;
            else if (key == arrToSearch[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Теперь high < low
    }
    private void example(){
        int [] intArr = new int[10];
        intArr[0] = 42;
        intArr[intArr.length-1] = 11;
        int res = sumArr(intArr);
        Print.printTextPlusParam("res", res);

        int [] intArr2 = {42, 0, 11};
        int res2 = sumArr(intArr2);
        Print.printTextPlusParam("res2", res2);

        int mySizeArr = 30;
        int [] resIntArr = arrGen(mySizeArr, 100);
        for (int i:resIntArr)
        {
            Print.printText(i);
        }
        Print.printTextLn();

        int res3 = sumArrVar(0,5,7);
        Print.printTextPlusParam("res3", res3);

        int [] intArr3 = new int[]{18,5,10};
        int res4 = sumArrVar(intArr3);
        Print.printTextPlusParam("res4", res4);

    }
    private int sumArr( int [] refIntArr){
        int tmp = 0;
        for (int i : refIntArr) {
            tmp += i;
        }
        return tmp;
    }
    private int [] arrGen ( int sizeArr, int maxRandNumber ){
        int [] intArr = new int[sizeArr];
        for (int i = 0; i < intArr.length; ++i)
        {
            intArr[i] = (int)(Math.random()*maxRandNumber);
        }
        return intArr;
    }
    private int sumArrVar( int ... refIntArr){
        int tmp = 0;
        for (int i : refIntArr) {
            tmp += i;
        }
        return tmp;
    }
}
