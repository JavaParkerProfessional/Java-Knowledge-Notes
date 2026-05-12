package javaExamples;                              // organizes this class into a package

import java.util.Scanner;                          // imports Scanner for user input

public class InputOutputExample {                  // defines the class
    public static void main(String[] args) {      // program starting point
                                                  // public = accessible from outside class
                                                  // static = belongs to class itself
                                                  // void = returns nothing
                                                  // main = method Java starts with
                                                  // String[] args = command-line input as strings

        Scanner input = new Scanner(System.in);   // creates Scanner object to read input

        System.out.print("Enter your name: ");    // prompts user (no new line)
        String name = input.nextLine();           // reads full line of text input

        System.out.print("Enter your age: ");     // prompts user for integer
        int age = input.nextInt();                // reads integer input

        System.out.println("Hello " + name);      // outputs concatenated string
        System.out.println("You are " + age + " years old"); // outputs combined data

        input.close();                            // closes Scanner (good practice)
    }
}