package com.sparrowww.java.sololearn.mypolymorphism;

public class Cat extends Animal {
    public Cat(){
        int idParent = super.getAnimalId();
        System.out.println("The Cat was born. ID = " + idParent);
        animalType = "CAT";
    }

    @Override
    public void eat(){
        System.out.println( "NYAM-NYAM" );
    }
}
