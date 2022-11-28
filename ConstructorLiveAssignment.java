package com.java.constructordemo;
import java.util.Scanner;
public class ConstructorLiveAssignment {
    //Note that both files are seen here but ARE separate files, as they are in separate classes
    //First class: ConstructorLiveAssignemtn
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int again = 0;
        String fName, mName, lName;
        int ssn;
        int userNumber = 0;

        // Get simple user input and display it
        System.out.println("Prompt user for input");
        //create Object(s) of the class below
        do {

            System.out.println("Enter first name: ");
            fName = sc.nextLine();
            System.out.println("Enter middle name (optional): ");
            mName = sc.nextLine();
            System.out.println("Enter last name: ");
            lName = sc.nextLine();
            System.out.println("Enter SSN: ");
            ssn = sc.nextInt();

                if (mName.equalsIgnoreCase("")) {
                    mandatoryOptional user = new mandatoryOptional(fName, lName, ssn);
                    System.out.println(user.fName + " " + user.mName + " " + user.lName + " " + user.ssn);
                } else {
                    mandatoryOptional user = new mandatoryOptional(fName, mName, lName, ssn); // complete your object; feel free to change its name!
                    System.out.println(user.fName + " " + user.mName + " " + user.lName + " " + user.ssn);
                }
            userNumber++;

            System.out.println("Enter 1 to enter another user: ");
            again = sc.nextInt();
            String decoy = sc.nextLine();
        }while(again == 1);


    }
}
class mandatoryOptional {
    // create two mandatory fields and one optional field minimum
    public String fName;
    public String mName;
    public String lName;
    public int ssn;
    // create Constructor(s) to handle input of mandatory and optional information
    mandatoryOptional(String fName, String lName, int ssn){
        this(fName, "N/A", lName, ssn);
    }
    mandatoryOptional(String fName, String mName, String lName, int ssn){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.ssn = ssn;
    }
    // you may create getter and setter methods to take in and output user info

}
