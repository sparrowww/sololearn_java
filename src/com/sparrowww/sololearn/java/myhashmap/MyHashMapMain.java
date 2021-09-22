package com.sparrowww.sololearn.java.myhashmap;

import java.util.HashMap;

public class MyHashMapMain {
    public static void example(){
        HashMap<String,Integer> myHM = new HashMap<>();
        myHM.put("Hello", 0);
        myHM.put("ALEX", 42);
        myHM.put("KRYA-KRYA", 187);
        myHM.put("BLUE", 64);

        Integer intValue = myHM.get("ALEX");
        if (intValue == null) intValue = -1;
        String s = "intValue = ".concat(intValue.toString()).concat(", myHM.size() = ").concat(Integer.toString(myHM.size()));
        System.out.println(s);
        myHM.remove("ALEX");
        intValue = myHM.get("ALEX");
        if (intValue == null) intValue = -1;
        s = "intValue = ".concat(intValue.toString()).concat(", myHM.size() = ").concat(Integer.toString(myHM.size()));
        System.out.println(s);
    }
}
