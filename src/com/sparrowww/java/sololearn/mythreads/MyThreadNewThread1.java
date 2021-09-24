package com.sparrowww.java.sololearn.mythreads;

public class MyThreadNewThread1 extends Thread{
    @Override
    public void run() {
        while(true)
        {
            System.out.println("Thread 1. Sleep one sec . . .");
            mySleep(1000);
        }
    }
    private void mySleep(int numMsec){
        try {
            sleep(numMsec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
