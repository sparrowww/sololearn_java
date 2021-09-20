package com.sparrowww.sololearn.java.myequalsobj;

public class MyEqualsMain {
    public static void example(){
        MyEquals obj1 = new MyEquals("First");
        MyEquals obj2 = new MyEquals("Second");
        MyEquals obj3 = new MyEquals("Second");
        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        System.out.println("obj3 = " + obj3);
        System.out.println("(obj1 == obj2) = " + (obj1 == obj2));
        System.out.println("(obj2 == obj3) = " + (obj2 == obj3));

        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println("obj3.hashCode() = " + obj3.hashCode());

        System.out.println("(obj1.equals(obj2)) = " + (obj1.equals(obj2)));
        System.out.println("(obj2.equals(obj3)) = " + (obj2.equals(obj3)));
    }
}
