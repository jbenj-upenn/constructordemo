package com.java.constructordemo;

public class MainEnemies {
    public static void main(String[] args){
    Werewolf wolfie = new Werewolf("Wolfie", 34, 55);
        System.out.println(wolfie.getName());
        System.out.println(wolfie.getHealth());
        System.out.println(wolfie.getStrength());
        System.out.println(wolfie.name);
        System.out.println(wolfie.health);
//        System.out.println(wolfie.strength);
        wolfie.eat();
        wolfie.talk();

    Werewolf wolfer = new Werewolf("Tom", 20, 30);
        System.out.println(wolfer.name);
        System.out.println(wolfer.health);
    wolfer.setName("Wolfer");
    wolfer.setHealth(35);
    wolfer.setStrength(55);
        System.out.println(wolfer.getName());
        System.out.println(wolfer.getHealth());
        System.out.println(wolfer.getStrength());
        System.out.println(wolfer.name);
        System.out.println(wolfer.health);
//    Enemy enemy = new Enemy();
//    //Abstraction
//    enemy.talk(); //Abstraction: we only care about the output, not how it's implemented in Enemies.java
//    //Inheritance
//    Vampire vamp = new Vampire();
//    vamp.talk(); //Inheritance: with Vampire class empty, we can call Enemy's talk() method bc of 'extends'
//    //Polymorphism
//    Werewolf werewolf = new Werewolf();
//    werewolf.talk();
//
////    Enemy enemy2 = vamp;
////    enemy2.talk();
//
//    Enemy[] enemies = { vamp, werewolf };
//    enemies[0].talk();
//    enemies[1].talk();
//    //Encapsulation: built on the idea of hiding data
//        vamp.setHealth(25); //not good practice to have what's calling your object to be able to change variables in it
//        vamp.getHealth(); // encapsulating variables to private so we have control over them
//
//        Witch witch = new Witch();
//        witch.setHealth(50);
//        witch.getHealth();
    }
}