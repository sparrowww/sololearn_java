package com.sparrowww.sololearn.java.myarraylist;

import java.util.ArrayList;

public class MyArrayList {
    private int num;
    public MyArrayList(){
        this.num = -1;
    }
    public MyArrayList(int num){
        this.num = num;
    }
    public void copy(MyArrayList o){
        this.num = o.num;
    }
    private void printMsg(){
        System.out.println("MyArrayList:" + num);
    }
    public static void MyArrayListTest()
    {
        final int SIZEARR = 5;
        ArrayList <MyArrayList> mArL = new ArrayList<>();
        System.out.println("mArL.size() = " + mArL.size());
        for (int i = 0; i < SIZEARR; i ++)
        {
            mArL.add(new MyArrayList(i));
        }
        System.out.println("mArL.size() = " + mArL.size());

        mArL.add(mArL.size(),new MyArrayList(SIZEARR+0));
        mArL.add(mArL.size(),new MyArrayList(SIZEARR+1));
        mArL.add(mArL.size(),new MyArrayList(SIZEARR+2));
        System.out.println("mArL.size() = " + mArL.size());

        mArL.remove(0);
        System.out.println("mArL.size() = " + mArL.size());

        MyArrayList tmp = new MyArrayList();
        tmp.copy(mArL.get(0));
        mArL.get(0).copy(mArL.get(mArL.size()-1));
        mArL.get(mArL.size()-1).copy(tmp);

        for(MyArrayList m: mArL)
        {
            m.printMsg();
        }
    }

}
