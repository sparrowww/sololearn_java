package com.sparrowww.sololearn.java.myinterface;

public class Car extends AbstractMachine{
    public Car (){
        System.out.println("Car created!");
    }
    @Override
    public void myWayIs() {
        System.out.println("myWayIs Asphalt");
    }
    @Override
    public void myFuelIs() {
        System.out.println("myFuelIs petrol");
    }
}
