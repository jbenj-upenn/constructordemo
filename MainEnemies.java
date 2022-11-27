package com.java.constructordemo;

public class MainEnemies {
    public static void main(String[] args){
    Enemy enemy = new Enemy();

    //Abstraction
    enemy.talk(); //Abstraction: we only care about the output, not how it's implemented in Enemies.java
    //Inheritance
    Vampire vamp = new Vampire();
    vamp.talk(); //Inheritance: with Vampire class empty, we can call Enemy's talk() method bc of 'extends'
    //Polymorphism
    Werewolf werewolf = new Werewolf();
    werewolf.talk();

//    Enemy enemy2 = vamp;
//    enemy2.talk();

    Enemy[] enemies = { vamp, werewolf };
    enemies[0].talk();
    enemies[1].talk();
    //Encapsulation: built on the idea of hiding data
        vamp.setHealth(25); //not good practice to have what's calling your object to be able to change variables in it
        vamp.getHealth(); // encapsulating variables to private so we have control over them

        Witch witch = new Witch();
        witch.setHealth(50);
        witch.getHealth();
    }
}