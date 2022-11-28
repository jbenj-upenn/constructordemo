package com.java.constructordemo;

public class DefaultConstructor {
    String name = "John Connor"; //static keyword allows variable to be access through className.variableName
    int age = 25; //changes to static variables reflect in all objects of the class; changes to instance variables only reflect in the class that changes it
    int quality = 1;
    //======================================================
//    static final int STARTING_CHIP_STACK = 200;
//    int bet = 0;
//    int currentChipStack = STARTING_CHIP_STACK;
//    int bankRoll = 5000;

//    public DefaultConstructor(int bankR, Scanner sc){
//        int reset = 0;
//        System.out.println("Default bankroll: " + bankRoll);
//        System.out.println("Enter 1 to reset your bankRoll: ");
//        reset = sc.nextInt();
//        if(reset == 1) {
//            this.bankRoll = bankR;
//            System.out.println("You've reset your bank roll to " + bankRoll);
//        }else{
//            System.out.println("Your bank roll is " + bankRoll);
//        }
//    }
//    public String getName() {
//        return name;
//    }
//    public int betChips(int bet){
//        this.bet = bet;
//        currentChipStack = STARTING_CHIP_STACK - bet;
//        return currentChipStack;
//    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() {
        return age;
    }
    public void workOnAssignment()
    {
        System.out.println(this.name + " is working, even at the age of " + this.age + ".");
    }
}

