package com.java.constructordemo;

public class MainNameSSN {
    public static void main(String[] args) {
        String name;
        int ssn;

        NameSSN cust1 = new NameSSN("Josh Benjamin", 123456789);
        NameSSN cust2 = new NameSSN(123456789);

        System.out.println(cust1.toString());
        System.out.println(cust2.toString());
    }
}
