package com.sparrowww.sololearn.java.myhashmap;

import com.sparrowww.sololearn.java.Print;

import java.util.HashMap;

public class MyHashMapMain {
    public static void example(){
        HashMap<String,Integer> myHM = new HashMap<>();
        myHM.put("Hello", 0);
        myHM.put("ALEX", 42);
        myHM.put("KRYA-KRYA", 187);
        myHM.put("BLUE", 64);

        Integer intValue = myHM.get("ALEX");
        Print.printStrings(intValue,myHM.size());

        myHM.remove("ALEX");
        intValue = myHM.get("ALEX");
        Print.printStrings(intValue,myHM.size());
    }
}
