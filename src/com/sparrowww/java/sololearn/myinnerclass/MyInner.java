package com.sparrowww.java.sololearn.myinnerclass;

public class MyInner {
    MyInner(){
        System.out.println("Hello! I'm MyInner!");
        InMyInner c = new InMyInner();
    }
    public class InMyInner { // if private, in MyInnerMain no access
        InMyInner() {
            System.out.println("Hello! I'm InMyInner!");
        }
        public void touch(){
            System.out.println("touch InMyInner!");
        }
    }
}
