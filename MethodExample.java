package javaExamples;                                   // organizes this class into a package

public class MethodExample {                            // defines the class

    public static void main(String[] args) {           // program starting point
                                                       // Java looks here first in a standalone program
                                                       // used when you want to run and test code directly

        sayHello();                                    // calls the method
    }

    public static void sayHello() {                    // basic method
                                                       // public = can be accessed from other classes
                                                       // static = belongs to the class itself
                                                       // void = returns nothing
                                                       // sayHello = method name
                                                       // () = no input is required

        System.out.println("Hello from the method");   // output inside the method
    }
}