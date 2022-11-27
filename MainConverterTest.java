package com.java.constructordemo;
import java.util.Scanner;
public class MainConverterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int again = 0, uOption;
//        convert conv = new convert();
        do {
            System.out.println("Enter measurement to convert: 1. pounds; 2. ounces; 3. kilograms; 4. grams");
            uOption = sc.nextInt();

            switch (uOption) {
                case 1:
                    poundsTo poundsTo = new poundsTo(sc);
                    System.out.println(poundsTo.result);
                    break;
                case 2:
                    ouncesTo ouncesTo = new ouncesTo(sc);
                    System.out.println(ouncesTo.result);
                    break;
                case 3:
                    kilosTo kilosTo = new kilosTo(sc);
                    System.out.println(kilosTo.result);
                    break;
                case 4:
                    gramsTo gramsTo = new gramsTo(sc);
                    System.out.println(gramsTo.result);
                    break;
            }
            System.out.println("Enter 1 to run program again: ");
            again = sc.nextInt();
            String decoy = sc.nextLine();
        }while(again == 1);
    }
}
//==================================
class convert{
    convert(){
        System.out.println("Welcome to the Mass Converter by JavaLinks!");
        System.out.println("#########################");
    }
    double pounds = 0.0, ounces = 0.0, kilograms = 0.0, grams = 0.0;
    int uOption;
    String poundsStr = " pounds ", ouncesStr = " ounces ", kilosStr = " kilograms ", gramsStr = " grams ";
    String poundStr = " pound ", ounceStr = " ounce ", kiloStr = " kilogram ", gramStr = " gram ";
    String equals = "is equal to ";
    String result;
}
//-------POUNDS TO------------------------------------------------
// ----------------------------------------------------------------

class poundsTo extends convert{
    //================================
    poundsTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. ounces; 2. kilograms; 3. grams");
        uOption = sc.nextInt();
        System.out.println("Enter amount of pounds:");
        pounds = sc.nextDouble();
    //
        switch(uOption){
            case 1: poundsToOz(pounds);break;
            case 2: poundsToKG(pounds);break;
            case 3: poundsToGr(pounds);break;
        }
    }
    //POUNDS TO conversion and return methods======================
    // to Ozs
    public String poundsToOz(double pounds){
        ounces = pounds * 16.0;
        if(pounds == 1) {
            result = pounds + poundStr + equals + ounces + ouncesStr + ".";
        }else{
            result = pounds + poundsStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
    // to KGs========================
    public String poundsToKG(double pounds){
        kilograms = pounds * 0.453592;
        if(pounds == 1) {
            result = pounds + poundStr + equals + kilograms + kilosStr + ".";
        }else{
            result = pounds + poundsStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // to Grams=======================
    public String poundsToGr(double pounds){
        grams = pounds * 453.592;
        if(pounds == 1) {
            result = pounds + poundStr + equals + grams + gramsStr + ".";
        }else{
            result = pounds + poundsStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
}
//-------OUNCES TO------------------------------------------------
//----------------------------------------------------------------
class ouncesTo extends convert {
    //================================
    ouncesTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. pounds; 2. kilograms; 3. grams");
        uOption = sc.nextInt();
        System.out.println("Enter amount of ounces:");
        ounces = sc.nextDouble();
        //
        switch(uOption){
            case 1: ouncesToLB(ounces);break;
            case 2: ouncesToKg(ounces);break;
            case 3: ouncesToGr(ounces);break;
        }
    }
    //OUNCES TO conversion and return methods======================
    // to LBs
    public String ouncesToLB(double ounces){
        pounds = ounces * 0.0625;
        if(pounds == 1) {
            result = ounces + ounceStr + equals + pounds + poundsStr + ".";
        }else{
            result = ounces + ouncesStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    // to KGs========================
    public String ouncesToKg(double ounces){
        kilograms = ounces * 0.0283495;
        if(pounds == 1) {
            result = ounces + ounceStr + equals + kilograms + kilosStr + ".";
        }else{
            result = ounces + ouncesStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // to Grams=======================
    public String ouncesToGr(double ounces){
        grams = ounces * 28.34952;
        if(pounds == 1) {
            result = ounces + ounceStr + equals + grams + gramsStr + ".";
        }else{
            result = ounces + ouncesStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
}
//-------KILOGRAMS TO------------------------------------------------
//----------------------------------------------------------------
class kilosTo extends convert{
    kilosTo(Scanner sc){
        System.out.println("Enter measurement to convert it into: 1. pounds; 2. grams; 3. ounces");
        uOption = sc.nextInt();
        System.out.println("Enter amount of kilograms:");
        kilograms = sc.nextDouble();
        //user options direct to appropriate methods
        switch(uOption){
            case 1: kilosToPounds(kilograms);break;
            case 2: kilosToGrams(kilograms);break;
            case 3: kilosToOunces(kilograms);break;
        }
    }
    //KiloGrams TO conversion and return methods======================
    // to pounds
    public String kilosToPounds(double kilograms){
        pounds = kilograms * 2.20462;
        if(grams == 1) {
            result = kilograms + kiloStr + equals + pounds + poundsStr + ".";
        }else{
            result = kilograms + kilosStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    //============to Grams
    public String kilosToGrams(double kilograms){
        grams = kilograms * 1000;
        if(pounds == 1) {
            result = kilograms + kiloStr + equals + grams + gramsStr + ".";
        }else{
            result = kilograms + kilosStr + equals + grams + gramsStr + ".";
        }
        return result;
    }
    // to Ounces=======================
    public String kilosToOunces(double kilograms){
        ounces = kilograms * 35.27;
        if(pounds == 1) {
            result = kilograms + kiloStr + equals + ounces + ouncesStr + ".";
        }else{
            result = kilograms + kilosStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
}
//-------GRAMS TO------------------------------------------------
//----------------------------------------------------------------
class gramsTo extends convert{
gramsTo(Scanner sc){
    System.out.println("Enter measurement to convert it into: 1. pounds; 2. kilograms; 3. ounces");
    uOption = sc.nextInt();
    String decoy = sc.nextLine();
    System.out.println("Enter amount of grams:");
    grams = sc.nextDouble();
    //user options direct to appropriate methods below =============
    switch(uOption){
        case 1: gramsToPounds(grams);break;
        case 2: gramsToKG(grams);break;
        case 3: gramsToOz(grams);break;
    }
}
    //Grams TO conversion and return methods======================
    // TO POUNDS
    public String gramsToPounds(double grams){
        pounds = grams * 0.00220462;
        if(grams == 1) {
            result = grams + gramStr + equals + pounds + poundsStr + ".";
        }else{
            result = grams + gramsStr + equals + pounds + poundsStr + ".";
        }
        return result;
    }
    // TO KILOGRAMS
    public String gramsToKG(double grams){
        kilograms = grams * 1000;
        if(grams == 1) {
            result = grams + gramStr + equals + kilograms + kilosStr + ".";
        }else{
            result = grams + gramsStr + equals + kilograms + kilosStr + ".";
        }
        return result;
    }
    // TO OUNCES
    public String gramsToOz(double grams){
        ounces = grams * 0.035274;
        if(grams == 1) {
            result = grams + gramStr + equals + ounces + ouncesStr + ".";
        }else{
            result = grams + gramsStr + equals + ounces + ouncesStr + ".";
        }
        return result;
    }
}