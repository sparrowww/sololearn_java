package com.sparrowww.sololearn.java.mypolymorpism;

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
