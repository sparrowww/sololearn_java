package com.sparrowww.java.sololearn.mypolymorphism;

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
    public void printAnimalType(){
        System.out.println( "animalType = " + animalType );
    }
    public void eat(){
        System.out.println( "AM-AM-AM" );
    }
}

