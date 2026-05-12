package javaExamples;                                       // organizes this class into a package

public class MethodTypesExample {                           // defines the class

    public static void main(String[] args) {               // program starting point
                                                           // used to run and test methods

        sayHello();                                        // calls basic method

        greetUser("Alex");                                 // calls parameter method

        int result = addNumbers(5, 3);                     // calls return method and stores result
        System.out.println("Sum: " + result);              // outputs returned value

        MethodTypesExample obj = new MethodTypesExample(); // creates object for non-static method
        obj.nonStaticExample();                            // calls non-static method
    }

    public static void sayHello() {                        // basic method (no input, no return)
                                                           // used for simple actions

        System.out.println("Hello");                       // output
    }

    public static void greetUser(String name) {            // parameter method
                                                           // takes input (name)
                                                           // used when method needs outside data

        System.out.println("Hello " + name);               // uses parameter
    }

    public static int addNumbers(int a, int b) {           // return method
                                                           // takes input and returns a value
                                                           // int = return type

        return a + b;                                     // sends result back to caller
    }

    public void nonStaticExample() {                       // non-static method
                                                           // belongs to an object, not the class
                                                           // requires object to be called

        System.out.println("Non-static method called");    // output
    }
}