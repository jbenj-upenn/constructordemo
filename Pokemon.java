package com.java.constructordemo;

 class Pokemon {
     //instance variable
     String name;
     int level = 0;

     //No-Args Constructor
     Pokemon(){
         this.level = 1; //here we want all Pokemon to be set to level 1
     }
    //Parameterized Constructor
     Pokemon(String n, int l, int levUp){
         name = n;
         level = l;
         this.attack();
         this.levelUp(levUp);
     }
     //methods
     void setName(String sName){
         this.name = sName;
     }
     String getName(){
         return name;
     }
     void attack(/*parameters?*/) {
         System.out.println("Attack method: " + name + ", attack!");
     }
     int levelUp(int level) {
         this.level = this.level + level;
         return level;
     }
}
class Pokemen extends Pokemon {
     String name;
     int level;
     void changeName(String nName){
         System.out.println(nName + ", formerly known as " + super.name);
         super.name = nName;
     }

}
