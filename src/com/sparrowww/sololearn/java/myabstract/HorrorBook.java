package com.sparrowww.sololearn.java.myabstract;

public class HorrorBook extends AbstractBook{
    @Override
    public void reading(){
        System.out.println("The horror book has " + super.getPage() + " pages");
        System.out.println("Reading a horror book. . .");
    }
}
