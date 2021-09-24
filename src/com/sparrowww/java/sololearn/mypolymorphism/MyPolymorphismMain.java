package com.sparrowww.java.sololearn.mypolymorphism;

public class MyPolymorphismMain {
    public static void examle(){
        Animal animal = new Animal();
        animal.eat();

        Animal cat = new Cat();
        cat.printAnimalType();
        cat.eat();
    }
}
