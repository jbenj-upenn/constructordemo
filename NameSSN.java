package com.java.constructordemo;

public class NameSSN {
    private String name;
    private int ssn;

    public NameSSN(String name, int ssn){
        this.name = name;
        this.ssn = ssn;
    }

    public NameSSN(int ssn){
        this("John Doe", ssn);
    }
    public String getName(){
        return name;
    }
    public int getSsn(){
        return ssn;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSsn(int ssn){
        this.ssn = ssn;
    }
    public String toString(){
        return ("Name: " + this.name + "; SSN: " + ssn);
    }
}
