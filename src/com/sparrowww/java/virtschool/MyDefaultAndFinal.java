package com.sparrowww.java.virtschool;

import com.sparrowww.java.Print;

public class MyDefaultAndFinal extends MyBasicObj{
    public MyDefaultAndFinal(){
        MyAnimal animal = new MyCat();
        Print.printTextPlusParam("ID",animal.getId());
        animal.voice();
    }
    private interface MyAnimal{
        long id = System.currentTimeMillis();
        default long getId(){
            return id;
        }
        void voice();
    }
    private static final class MyCat implements MyAnimal{
        @Override
        public void voice() {
            Print.printTextLn("MEOWWWWW");
        }
    }
}
