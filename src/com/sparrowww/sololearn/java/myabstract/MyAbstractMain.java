package com.sparrowww.sololearn.java.myabstract;

public class MyAbstractMain {
    public static void example(){
        AbstractBook absBook = new HorrorBook();
        int randNumPages = (int) (Math.random() * 1000);
        absBook.setPage(randNumPages);
        absBook.reading();
    }
}
