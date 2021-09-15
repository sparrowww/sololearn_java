package com.sparrowww.sololearn.java.mytypecasting;

import com.sparrowww.sololearn.java.mypolymorphism.*;

public class MyTypeCasting {
    public void testCast () {
        int iVar = (int) 3.14; // loss of precision. Need casting!!!
        System.out.println("testCast iVar = " + iVar);
        double dVar = 3; // no loss of precision. Not need casting
        System.out.println("testCast dVar = " + dVar);

    }
    public void arrTest(){
        int [] iArr = {19,14,55};
        int iArrSize = iArr.length;
        for (int i : iArr) {
            System.out.printf("[%d]", i);
        }
        System.out.print("\n");
        System.out.println("iArrSize = " + iArrSize);
        byte [] bArr = new byte [5];
        int bArrSize = bArr.length;
        bArr[bArr.length-1] = 10;
        System.out.println("bArrSize = " + bArrSize);
        for(int i:bArr){
            System.out.printf("[%d]",i);
        }
        System.out.print("\n");
    }
    public void upcastingTest(){
        // UPCASTING ALWAYS IS OK!
        Animal a1 = new Cat();
        Animal a2 = new Dog();
    }
    private final Animal a1 = new Cat();
    private final Animal a2 = new Dog();
    public void downcastingTest(){
        // DOWNCASTING MAY BE FAILED!!!
        Cat c = (Cat)a1;
        c.eat();
        Dog d = (Dog)a2;
        d.eat();
    }
}
