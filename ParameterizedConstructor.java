package com.java.constructordemo;

public class ParameterizedConstructor /*extends NoArgsConstructor*/ {
    String name;
    int age;

    public ParameterizedConstructor(){

    }
    public ParameterizedConstructor(String n,int age)
    {
        System.out.println("*******Say hello to the Parameterized constructor********");
        this.name=n;
        this.age=age;
    }
    public ParameterizedConstructor(int age, String name)
    {
        System.out.println("*******Say hello to the Parameterized constructor********");
        this.name=name;
        this.age=age;
    }
    public void workOnAssignment()
    {
        System.out.println(name + " is working, even at the age of " + age + ".");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
