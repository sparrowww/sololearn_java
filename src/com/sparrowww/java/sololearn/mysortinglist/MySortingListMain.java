package com.sparrowww.java.sololearn.mysortinglist;

import com.sparrowww.java.Print;

import java.util.ArrayList;
import java.util.Collections;

public class MySortingListMain {
    public static void example(){
        ArrayList<String> mArrList = new ArrayList<>();
        mArrList.add("red");
        mArrList.add("green");
        mArrList.add("blue");
        mArrList.add("yellow");
        mArrList.add("magenta");
        mArrList.add("cyan");

        Print.printTextLn("До сортировки:");
        Print.printStrings(mArrList);

        Collections.sort(mArrList);
        Print.printTextLn("После сортировки:");
        Print.printStrings(mArrList);

        Collections.reverse(mArrList);
        Print.printTextLn("После сортировки reverse:");
        Print.printStrings(mArrList);

        Collections.shuffle(mArrList);
        Print.printTextLn("После сортировки shuffle() \"random\":");
        Print.printStrings(mArrList);

    }
}
