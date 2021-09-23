package com.sparrowww.sololearn.java.myiterators;

import com.sparrowww.sololearn.java.Print;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyIteratorsMain {
    public static void example(){
        final int SIZE_ARR = 5;
        ArrayList<Integer> mArrList = new ArrayList<>();
        for (int i =0; i < SIZE_ARR; i ++) {
            mArrList.add(i);
        }

        Iterator<Integer> itrInt = mArrList.iterator();
        Print.printTextPlusParam("size()", mArrList.size());

        while (itrInt.hasNext())
        {
            Print.printText(itrInt.next());
        }

        removeBeginElement(mArrList.iterator());
        Print.printTextPlusParam("size()", mArrList.size());

        Consumer<Integer> lamdaInt = ((Int) -> Print.printTextPlusParam("lamdaInt", Int));

        mArrList.iterator().forEachRemaining(lamdaInt);

        removeBeginElement(mArrList.iterator());
        Print.printTextPlusParam("size()", mArrList.size());

        mArrList.iterator().forEachRemaining(Int->Print.printTextPlusParam("lamdaInt2", Int));

    }
    private static void removeBeginElement(Iterator<Integer> itrInt){
        if (itrInt.hasNext())
        {
            itrInt.next();
            itrInt.remove();
        }
    }

}
