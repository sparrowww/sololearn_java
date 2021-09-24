package com.sparrowww.java.sololearn.myequalsobj;

import java.util.Objects;

public class MyEquals {
    private String name;

    public MyEquals(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEquals myEquals = (MyEquals) o;
        return name.equals(myEquals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

