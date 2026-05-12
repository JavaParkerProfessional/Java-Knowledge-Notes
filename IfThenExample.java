package javaExamples;                                      // organizes this class into a package

public class IfThenExample {                               // defines the class

    public static void main(String[] args) {               // starting point of program

        int health = 40;                                  // example variable

        if (health < 50) {                                // checks condition
            System.out.println("Low Health");             // runs if condition is true
        }

        if (health >= 50) {                               // second condition
            System.out.println("Health is OK");           // runs if condition is true
        }
    }
}