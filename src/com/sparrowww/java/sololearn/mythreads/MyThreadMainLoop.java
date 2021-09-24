package com.sparrowww.java.sololearn.mythreads;

public class MyThreadMainLoop {
    public static void runMainLoop(){
        while(true)
        {
            System.out.println("MainLoop. Sleep one sec . . .");
            mySleep(1000);
        }
    }
    private static void mySleep(int numMsec){
        try {
            Thread.sleep(numMsec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
