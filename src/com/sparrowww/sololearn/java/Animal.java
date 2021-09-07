package com.sparrowww.sololearn.java;

public class Animal {

    private int animalId;
    protected String animalType;

    public Animal(){
        animalId = (int)(Math.random() * 1000);
        System.out.println("The Animal was born. ID = " + animalId );
        animalType = "UNKNOWN";
    }
    protected int getAnimalId(){
        return animalId;
    }
    protected void printAnimalType(){
        System.out.println( "animalType = " + animalType );
    }
    protected void eat(){
        System.out.println( "AM-AM-AM" );
    }
}
