package finterface;

//we can create static and default methods in a functional interface.--------------------------- 

@FunctionalInterface
interface MyFunctionalInterface {
    // Single abstract method
    void abstractMethod();

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method in a functional interface.");
    }

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method in a functional interface.");
    }
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        MyFunctionalInterface example = () -> System.out.println("Abstract method implementation using lambda.");

        // Calling abstract method
        example.abstractMethod();

        // Calling static method
        MyFunctionalInterface.staticMethod();

        // Calling default method
        example.defaultMethod();
    }
}
