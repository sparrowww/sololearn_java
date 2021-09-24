package com.sparrowww.java.sololearn.myarraylist;

import java.util.ArrayList;

public class MyArrayList {
    private int num;
    public MyArrayList(int num){
        this.num = num;
    }
    public void copy(MyArrayList o){
        this.num = o.num;
    }
    public void swap(MyArrayList o){
        int old = this.num;
        this.num = o.num;
        o.num = old;
    }
    private void printMsg(){
        System.out.println("MyArrayList:" + num);
    }
    public static void MyArrayListTest()
    {
        final int SIZEARR = 5;
        ArrayList <MyArrayList> mArL = new ArrayList<>(1);
        System.out.println("mArL.size() = " + mArL.size());
        while (mArL.size() < SIZEARR)
        {
            mArL.add(new MyArrayList((int)(Math.random()*100)));
        }
        System.out.println("mArL.size() = " + mArL.size());

        mArL.add(0,new MyArrayList(0));
        mArL.add(mArL.size(),new MyArrayList((int)(Math.random()*100)));
        mArL.add(mArL.size(),new MyArrayList(65000));
        System.out.println("mArL.size() = " + mArL.size());

        mArL.remove(mArL.remove(mArL.size()/2));
        mArL.remove(mArL.remove(mArL.size()/2));
        System.out.println("mArL.size() = " + mArL.size());
        mArL.get(1).copy(mArL.get(0));
        mArL.get(0).swap( mArL.get(mArL.size()-1));

        for(MyArrayList m: mArL)
        {
            m.printMsg();
        }
    }

}
