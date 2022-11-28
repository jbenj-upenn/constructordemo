package com.java.constructordemo;

import java.util.Scanner;
class DC {
    static String name = "John Doe";
}
public class MainConstructorDemos {
    public static void main(String[] args) {
        int bankR = 0;

        //Default Constructor
//        DefaultConstructor dc = new DefaultConstructor(); //object
//        dc.setName("Sam");
//        dc.setAge(20);
//        System.out.println("1st-" + dc.getName());
//        System.out.println("2nd-" + dc.getAge());
        //==============================================================
//        // No Args Constructor
//        NoArgsConstructor na = new NoArgsConstructor();
//        na.setName("John");
//        na.setAge(20);
//        System.out.println("3rd-" + na.getName());
//        System.out.println("4th-" + na.getAge());
        //=================================================================
//        //Parameterized Constructor with Hard-coded Input
//        ParameterizedConstructor pc = new ParameterizedConstructor("Sarah", 55);
//        System.out.println("5th-" + pc.getName());
//        System.out.println("6th-" + pc.getAge());
//        pc.workOnAssignment(/* pc.name, pc.age, 2 */);
//        //Parameterized Constructor with User Input
        Scanner sc = new Scanner(System.in);
        String name;
        int age, quality;
        System.out.println("Enter your name, age, and quality of work:\n(1-poor; 2-average; 3-exceptional); \npress 'Enter' after both: ");
        name = sc.nextLine();
        age = sc.nextInt();
        quality = sc.nextInt();

 //       ============================================================
        ParameterizedConstructorUserInputScanner pCUIS1 = new ParameterizedConstructorUserInputScanner(name, age, quality);
        System.out.println(pCUIS1.name); //calls name directly from Constructor
        System.out.println(pCUIS1.age); //calls age directly from Constructor
        System.out.println(pCUIS1.getName()); //calls name from method
        System.out.println(pCUIS1.getAge()); //calls age from method
        System.out.println("The quality of " + pCUIS1.name + "'s work is: " + pCUIS1.workOnAssignment(quality) + ".");
// ====================================================================
//        DefaultConstructor dc1 = new DefaultConstructor();
//        DefaultConstructor dc2 = new DefaultConstructor();
//        DefaultConstructor dc3 = new DefaultConstructor();
//        int bet = 0;
//        dc1.setName("John");dc2.setName("Samantha");dc3.setName("Olivia");
//        System.out.println(dc1.name + ", enter your bet: ");
//        bet = sc.nextInt(); dc1.betChips(bet);
//        System.out.println(dc1.name + " bet " + dc1.bet + "; " + dc1.name + "'s current stack is " + dc1.currentChipStack + " chips.");
//        System.out.println(dc2.name + ", enter your bet: ");
//        bet = sc.nextInt(); dc2.betChips(bet);
//        System.out.println(dc2.name + " bet " + dc2.bet + "; " + dc2.name + "'s current stack is " + dc2.currentChipStack + " chips.");
//        System.out.println(dc3.name + ", enter your bet: ");
//        bet = sc.nextInt(); dc3.betChips(bet);
//        System.out.println(dc3.name + " bet " + dc3.bet + "; " + dc1.name + "'s current stack is " + dc3.currentChipStack + " chips.");
//======================================================================
//        System.out.println("What's your bank roll?");
//        bankR = sc.nextInt();
//        DefaultConstructor dcInput = new DefaultConstructor(bankR, sc);

    }
}

