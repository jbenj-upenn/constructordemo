package com.java.constructordemo;


public class Enemy {
    public String name;
    public int health;
    private int strength;
public Enemy(){
    System.out.println("Name, health, and strength are not set.");
}
public Enemy (String name, int health, int strength){
    this.name = name;
    this.health = health;
    this.strength = strength;
}

    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getHealth(){ //these enable all classes that extend from here to set and get a private variable
    return health;
    }
    public String getName(){
    return name;
    }
    public int getStrength(){
    return strength;
    }
    public void talk(){
        System.out.println("I'm your enemy; you're doomed!");
    }
    public void eat() {
        System.out.println("I'm starving! Get over here!");
    }
}
