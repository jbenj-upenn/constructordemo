package com.java.constructordemo;

public class ParameterizedConstructorUserInputScanner {
    String name;
    int age;
    int quality;
    String result;


    public ParameterizedConstructorUserInputScanner(String n, int a, int b) //names of parameters do not have to match names of parameters in main method
    {
        System.out.println("####Parameterized constructor with user input####");
        this.name=n;
        this.age=a;
        this.quality=b;
    }
    public String workOnAssignment(int quality)
    {
        System.out.println(this.name + " is working, even at the age of " + this.age + ".");
        switch(quality){
            case 1: result = "Bad";break;
            case 2: result = "Average";break;
            case 3: result = "Good";break;
        }return result;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { //names of parameters only have to be internally consistent; i.e., "name" taken in matches inside
        this.name = name;              //method still "gets" and returns "set" values
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
