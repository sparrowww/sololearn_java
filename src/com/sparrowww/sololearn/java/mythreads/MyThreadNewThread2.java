package com.sparrowww.sololearn.java.mythreads;

public class MyThreadNewThread2 implements Runnable{
    @Override
    public void run() {
        while(true)
        {
            System.out.println("Thread 2. Sleep one sec . . .");
            mySleep(1000);
        }
    }
    private void mySleep(int numMsec){
        try {
            Thread.sleep(numMsec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
