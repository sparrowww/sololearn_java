package com.sparrowww.sololearn.java.myhashmap;

import com.sparrowww.sololearn.java.Print;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class MyHashMapMain {
    public static void example(){
        HashMap<String,Integer> myHM = new HashMap<>();
        myHM.put("Hello", 0);
        myHM.put("ALEX", 42);
        myHM.put("ALEX", 43); // перетирает старое значение по тому же ключу
        myHM.put("KRYA-KRYA", 187);
        myHM.put("BLUE", 2845);
        myHM.put("RED", 7755);
        myHM.put("GREEN", 6845);

        Integer intValue = myHM.get("ALEX");
        Print.printStrings(intValue,myHM.size());

        myHM.remove("ALEX");
        intValue = myHM.get("ALEX");
        Print.printStrings(intValue,myHM.size());

        boolean flag = myHM.containsKey("BLUE");
        Print.printTextPlusParam("myHM.containsKey(\"BLUE\")", flag);
        flag = myHM.containsKey("BLUe");
        Print.printTextPlusParam("myHM.containsKey(\"BLUe\")", flag);
        flag = myHM.containsValue(187);
        Print.printTextPlusParam("myHM.containsValue(187)", flag);
        flag = myHM.containsValue(188);
        Print.printTextPlusParam("myHM.containsValue(188)", flag);

        String[] strArr = new String[myHM.size()];
        strArr = myHM.keySet().toArray(strArr);
        Arrays.sort(strArr); //в мапе неотсортированные ключи!
        Print.printStrings(Arrays.stream(strArr).toArray());

        for(String s:strArr)
        {
            if (myHM.get(s) <1000)
            {
                myHM.remove(s);
            }
        }

        Print.printTextPlusParam(myHM);



    }
}
