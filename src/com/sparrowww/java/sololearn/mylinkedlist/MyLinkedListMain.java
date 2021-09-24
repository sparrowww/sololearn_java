package com.sparrowww.java.sololearn.mylinkedlist;

import java.util.LinkedList;

public class MyLinkedListMain {
    public static void example()
    {
        LinkedList<MyStructPhone> listStrPhone = new LinkedList<>();
        var str1 = new MyStructPhone(1234, "Alex", 2.8 );
        var str2 = new MyStructPhone(5678, "Harry", 5.1 );
        var str3 = new MyStructPhone(9012, "Jerry", 1.9 );

        listStrPhone.add(str1);
        listStrPhone.add(str2);
        listStrPhone.add(str3);

        for(var v:listStrPhone)
        {
            System.out.println(v.toString());
        }

        System.out.println("<--->");

        listStrPhone.remove(str2);
        listStrPhone.remove(0);
        listStrPhone.push(new MyStructPhone(3456,"Tom", 14.9));

        for(var v:listStrPhone)
        {
            System.out.println(v.toString());
        }
    }
}
