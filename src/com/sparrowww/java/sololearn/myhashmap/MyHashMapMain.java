package com.sparrowww.java.sololearn.myhashmap;

import com.sparrowww.java.Print;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class MyHashMapMain {
    public static void exampleEntry(){
        HashMap<String, Integer> mMap = new HashMap<>();
        mMap.put("A", 0);
        mMap.put("B", 1);
        mMap.put("C", 2);

        for (String s:mMap.keySet())
        {
            Print.printTextPlusParam(s,mMap.get(s));
        }

        for (HashMap.Entry<String,Integer> mMapEntry:mMap.entrySet())
        {
            Print.printTextPlusParam(mMapEntry.getKey(), mMapEntry.getValue());
        }

        // Создаем кортежи и выводим их
        Map.Entry<String,Integer> mSE = new AbstractMap.SimpleEntry<>("s0", 0);
        Print.printTextPlusParam(mSE.getKey(), mSE.getValue());
        ArrayList<Map.Entry<String,Integer>> arrList = new ArrayList<>();
        arrList.add(new AbstractMap.SimpleEntry<>("s1", 123));
        arrList.add(new AbstractMap.SimpleEntry<>("s2", 456));
        arrList.add(new AbstractMap.SimpleEntry<>("s3", 789));

        for(Map.Entry<String,Integer> mSE1:arrList)
        {
            Print.printTextPlusParam(mSE1.getKey(), mSE1.getValue());
        }
    }
    private static final boolean flLambda = false;
    public static void exampleSearchMax() {
        HashMap<String,Integer> mapPlayer = new HashMap<>();
        String firstPlayer = "Alex 46"; parseString(mapPlayer,firstPlayer);
        String secondPlayer = "Tom 147"; parseString(mapPlayer,secondPlayer);
        String thirdPlayer = "Rob 11"; parseString(mapPlayer,thirdPlayer);

        if (flLambda) {
            AtomicInteger atomInt = new AtomicInteger(0);
            AtomicReference<String> winnerName = new AtomicReference<>("");
            mapPlayer.forEach((Str, Int) -> {
                if (atomInt.get() < Int) {
                    atomInt.set(Int);
                    winnerName.set(Str);
                }
            });
            Print.printTextPlusParam(winnerName.get(), atomInt.get());
        }
        else {
            String[] myStr = mapPlayer.keySet().toArray(new String[0]);
            int maxPoint = 0;
            String nameWinner = "";
            for (String s:myStr) {
                int tmp = mapPlayer.get(s);
                if (maxPoint < tmp) {
                    maxPoint = tmp;
                    nameWinner = s;
                }
            }
            Print.printTextPlusParam(nameWinner, maxPoint);
        }

    }
    private static void parseString( HashMap<String,Integer> mMap, String mStr){
        String[] values = mStr.split(" ");
        String name = values[0];
        int points = Integer.parseInt(values[1]);
        mMap.put(name, points);
    }

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
