package com.sparrowww.java.sololearn.myabstract;

public abstract class AbstractBook {
    private int page;
    public void setPage (int page){
        this.page = page;
    }
    public int getPage(){
        return  page;
    }
    public abstract void reading();
}