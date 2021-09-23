package com.sparrowww.sololearn.java.myhashset;

import com.sparrowww.sololearn.java.Print;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MyHashSetMain {
    public static void example(){
        HashSet<String> mHS = new HashSet<>();
        mHS.add("1Aaa");
        mHS.add("Z");
        mHS.add("C");
        mHS.add("Y");
        Print.printTextPlusParam("HashSet", mHS);
        Print.printTextPlusParam("mHS.size()", mHS.size());
        Print.printStrings(mHS.toArray());

        Object [] arr = mHS.toArray();
        for ( int i = 0; i < arr.length; ++i) {
            Print.printTextPlusParam(i, arr[i].hashCode());
        }

        LinkedHashSet<String>mLHS = new LinkedHashSet<>();
        mLHS.add("1Aaa");
        mLHS.add("Z");
        mLHS.add("C");
        mLHS.add("Y");
        Print.printTextPlusParam("LinkedHashSet", mLHS);
        Print.printTextPlusParam("mLHS.size()", mLHS.size());
        Print.printStrings(mLHS.toArray());
        mLHS.remove("C");
        Print.printTextPlusParam("LinkedHashSet", mLHS);

        TreeSet<String> mTS = new TreeSet<>();
        mTS.add("1Aaa");
        mTS.add("Z");
        mTS.add("C");
        mTS.add("Y");
        Print.printTextPlusParam("TreeSet", mTS);
        Print.printTextPlusParam("mTS.size()", mTS.size());
        Print.printStrings(mTS.toArray());

    }
}
