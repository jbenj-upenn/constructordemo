package com.java.constructordemo;

public class MainPokemon {
    public static void main(String[] args){

        Pokemon p1 = new Pokemon();
        p1.name = "Pikarcher";

        Pokemon p2 = new Pokemon();
        p2.name = "Arvee";
        p2.level = p2.level;

        System.out.println("1: " + p1.name + ", " + p1.level);
        p2.attack();

        System.out.println("2: " + p2.name + ", " + p2.level);
        p2.levelUp(20);
        System.out.println("3: " + p1.name + ", " + p1.level);
        p1.attack();
        int newLevel = p1.levelUp(55);
        System.out.println("4: " + p2.name + ", " + p2.level);
        System.out.println("5: " + p1.name + ", " + p1.level);
        System.out.println("6: " + newLevel);

        Pokemon p3 = new Pokemon("Sarnor", 15, 23); //passing args to parameterized Constructor
        System.out.println("7: " + p3.name + ", " + p3.level);

        Pokemen p4 = new Pokemen();
        p4.setName("Jucee"); //using methods from Pokemon via 'extends' keyword to Pokemen
        System.out.println("8: " + p4.getName());
        p4.changeName("Juicy");
        System.out.println("9: " + p4.getName());

    }
}
