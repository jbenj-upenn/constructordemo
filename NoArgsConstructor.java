package com.java.constructordemo;

public class NoArgsConstructor {
    String name = "Sarah";
    int age = 25;

    public NoArgsConstructor()
    {
        System.out.println("=====Welcome to the No-Arguments Constructor======");
//        name = "Aurora";
//        age = 33;
    }
    public void workOnAssignment(String name, int age, int quality) //method
    {
        System.out.println(name + " is working, even at the age of " + age + ".");
        if(quality == 1){
            System.out.println(name + " does great work!");
        }else{
            System.out.println(name + " needs to step their game up.");
        }
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
