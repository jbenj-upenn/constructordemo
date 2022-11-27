package com.java.constructordemo;

public class Enemy {
    private int health;
    public String name;

    public void talk(){
        System.out.println("I'm your enemy; you're doomed!");
    }
    public void getHealth(){ //these enable all classes that extend from here to set and get a private variable
        System.out.println(health);
    }
    public void getName(){
        System.out.println(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }
}
