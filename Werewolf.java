package com.java.constructordemo;

public class Werewolf extends Enemy {

    Werewolf(){
        super();
    }
    Werewolf(String n, int h, int s){
        super(n, h, s);
    }

    public void talk(){
        System.out.println("I would love a bite...of YOU!");
    }
}
