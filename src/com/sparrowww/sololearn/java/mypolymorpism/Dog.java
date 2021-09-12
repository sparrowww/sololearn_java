package com.sparrowww.sololearn.java.mypolymorpism;

public class Dog extends Animal {
    public Dog(){
        int idParent = super.getAnimalId();
        System.out.println("The Dog was born. ID = " + idParent);
        animalType = "DOG";
    }

    @Override
    public void eat(){
        System.out.println( "AFF-AFF" );
    }
}
