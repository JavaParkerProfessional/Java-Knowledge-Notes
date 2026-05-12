package javaExamples;                                   // organizes this class into a package

public class ConstructorExample {                                // defines the Character class
    String name;                                        // stores character name
    int health;                                         // stores health value
    int mana;                                           // stores mana value

    public ConstructorExample() {                                // default constructor
        name = "Unknown";                               // sets default name
        health = 100;                                   // sets default health
        mana = 50;                                      // sets default mana
    }

    public ConstructorExample(String n, int h, int m) {         // parameterized constructor
        name = n;                                       // sets name from argument
        health = h;                                     // sets health from argument
        mana = m;                                       // sets mana from argument
    }

    public void printStats() {                          // method to display character data
        System.out.println("Name: " + name);            // prints name
        System.out.println("Health: " + health);        // prints health
        System.out.println("Mana: " + mana);            // prints mana
    }
    

    public static void main(String[] args) {            // starting point of standalone program
        ConstructorExample playerOne = new ConstructorExample();          // uses default constructor
        ConstructorExample playerTwo = new ConstructorExample("Mage", 80, 120); // uses parameterized constructor

        playerOne.printStats();                         // prints default character stats
        System.out.println();                           // blank line
        playerTwo.printStats();                         // prints custom character stats
    }
}