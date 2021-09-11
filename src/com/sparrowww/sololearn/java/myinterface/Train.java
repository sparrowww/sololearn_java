package com.sparrowww.sololearn.java.myinterface;

public class Train extends AbstractMachine {
    public Train (){
        System.out.println("Train is created!");
    }
    @Override
    public void myWayIs() {
        System.out.println("myWayIs Railway");
    }
    @Override
    public void myFuelIs() {
        System.out.println("myFuelIs diesel ");
    }
}
