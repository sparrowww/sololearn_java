package com.sparrowww.sololearn.java.myhashset;

import com.sparrowww.sololearn.java.Print;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyHashSetMain {
    public static void example(){
        HashSet<String>mHS = new HashSet<>();
        mHS.add("A");
        mHS.add("Z");
        mHS.add("C");
        mHS.add("Y");
        Print.printTextPlusParam("HashSet", mHS);
        Print.printTextPlusParam("mHS.size()", mHS.size());
        Print.printStrings(mHS.toArray());

        LinkedHashSet<String>mLHS = new LinkedHashSet<>();
        mLHS.add("A");
        mLHS.add("Z");
        mLHS.add("C");
        mLHS.add("Y");
        Print.printTextPlusParam("LinkedHashSet", mLHS);
        Print.printTextPlusParam("mLHS.size()", mLHS.size());
        Print.printStrings(mLHS.toArray());
        mLHS.remove("C");
        Print.printTextPlusParam("LinkedHashSet", mLHS);
    }
}
