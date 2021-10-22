package com.sparrowww.java.virtschool;

public class MyInstanceOf extends MyBasicObj {
    public MyInstanceOf(){
        BaseClass b = new BaseClass();
        AClass a = new AClass();

        printClassName(b);
        printClassName(a);
        BaseClass b1 = new AClass();
        printClassName(b1);
        AClass a1 = castingToAClass(b);
        printClassName(a1);
        AClass a2 = castingToAClass(b1);
        printClassName(a2);
    }
    private AClass castingToAClass(BaseClass b){
        if ( b instanceof AClass)
            return (AClass)b;
        else
            return null;
    }
    private void printClassName(BaseClass b){
        if (b != null) {
            System.out.println(b.getNameClass());
        }
        else {
            System.out.println("b==null");
        }
    }

    private static class BaseClass{
        BaseClass(){

        }
        String getNameClass(){
            return this.getClass().getName();
        }
    }
    private static class AClass extends BaseClass{
        AClass(){
            super();
        }
        @Override
        String getNameClass(){
            return this.getClass().getName() + " is a " + super.getNameClass();
        }
    }
}
