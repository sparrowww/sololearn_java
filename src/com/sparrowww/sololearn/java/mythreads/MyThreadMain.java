package com.sparrowww.sololearn.java.mythreads;

public class MyThreadMain {
    public static void runThread(){
        MyThreadNewThread1 myThread = new MyThreadNewThread1();
        myThread.setPriority(1);
        myThread.start();
    }
    public static void runRunnableThread(){
        Thread myThread = new Thread(new MyThreadNewThread2());
        myThread.setPriority(10);
        myThread.start();
    }
}
