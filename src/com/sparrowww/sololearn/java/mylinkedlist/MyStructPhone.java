package com.sparrowww.sololearn.java.mylinkedlist;

public class MyStructPhone {
    private int numberPhone;
    private String namePhone;
    private double latencyPhone;

    public MyStructPhone(int numberPhone, String namePhone, double latencyPhone) {
        this.numberPhone = numberPhone;
        this.namePhone = namePhone;
        this.latencyPhone = latencyPhone;
    }

    @Override
    public String toString() {
        return "MyStructPhone{" +
                "numberPhone=" + numberPhone +
                ", namePhone='" + namePhone + '\'' +
                ", latencyPhone=" + latencyPhone +
                '}';
    }
}
