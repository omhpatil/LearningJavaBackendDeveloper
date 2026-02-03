// Ensures that only one object of a class is created in the whole program, and it provides a global access point to it.


package DesignPatterns.CreationalPattern;

class Singleton {
    // Step 1: create a private static instance
    private static Singleton instance;

    // Step 2: private constructor (no one can create object directly)
    private Singleton() {

    }

    // Step 3: provide a public method to get the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // create only once
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am Singleton!");
    }
}

public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println(obj1 == obj2); // true (both same object)
        obj1.showMessage();
        obj2.showMessage();

    }
}
