package com.sparrowww.sololearn.java.mysortinglist;

import com.sparrowww.sololearn.java.Print;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySortingListMain {
    public static void example(){
        ArrayList<String> mArrList = new ArrayList<>();
        mArrList.add("red");
        mArrList.add("green");
        mArrList.add("blue");
        mArrList.add("yellow");
        mArrList.add("magenta");
        mArrList.add("cyan");

        Print.printText("До сортировки:");
        Print.printStrings(mArrList);

        Collections.sort(mArrList);
        Print.printText("После сортировки:");
        Print.printStrings(mArrList);

        Collections.reverse(mArrList);
        Print.printText("После сортировки reverse:");
        Print.printStrings(mArrList);

        Collections.shuffle(mArrList);
        Print.printText("После сортировки shuffle() \"random\":");
        Print.printStrings(mArrList);

    }
}
