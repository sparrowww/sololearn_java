package com.sparrowww.java.sololearn.myarraylist;

public class MyArrayClasses {
    private int num;
    public MyArrayClasses(int num){
        this.num = num;
    }
    private void printMsg(){
        System.out.println("MyArrayClasses:" + num);
    }

    public static void MyArrayClassesTest()
    {
        final int SIZEARR = 5;
        MyArrayClasses [] mArCl = new MyArrayClasses[SIZEARR]; // создаем масив из ссылок на классы, выделяем под них место.
        for (int i = 0; i < mArCl.length; i ++)
        {
            mArCl[i] = new MyArrayClasses(i);
        }
        for(MyArrayClasses m: mArCl)
        {
            m.printMsg();
        }
    }
}
