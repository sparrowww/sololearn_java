package com.sparrowww.sololearn.java;

public class Cat extends Animal{
    public Cat(){
        int idParent = super.getAnimalId();
        System.out.println("The Cat was born. ID = " + idParent);
        animalType = "CAT";
    }

    @Override
    protected void eat(){
        System.out.println( "NYAM-NYAM" );
    }
}
