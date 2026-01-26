package Java8Features;

import java.util.concurrent.Callable;

@FunctionalInterface
interface Vehicle {

    // Abstract method (Functional Interface rule)
    void car();

    // Default method
    default void bicycle() {
        System.out.println("Default Method: Bicycle");
    }

    // Static method
    static void bike() {
        System.out.println("Static Method: Bike");
    }
}

public class Functional_Interface_Practice2 {

    public static void main(String[] args) throws Exception {

        /* ==============================
           1. Functional Interface + Lambda
           ============================== */

        Vehicle v = () -> System.out.println("Lambda implements car()");
        v.car();
        v.bicycle();
        Vehicle.bike();

        System.out.println("-----------------------");

        /* ==============================
           2. Runnable → run()
           ============================== */

        Runnable r = () -> System.out.println("Runnable Lambda: run() executed");
        Thread t = new Thread(r);
        t.start();

        System.out.println("-----------------------");

        /* ==============================
           3. Callable → call()
           ============================== */

        Callable<Integer> c = () -> {
            return 100;
        };
        System.out.println("Callable Lambda: call() returns " + c.call());

        System.out.println("-----------------------");

        /* ==============================
           4. Comparable → compareTo()
           ============================== */

        Comparable<Integer> comp = (num) -> num - 50;

        int result = comp.compareTo(60);

        if (result > 0)
            System.out.println("Comparable: Number is greater");
        else if (result < 0)
            System.out.println("Comparable: Number is smaller");
        else
            System.out.println("Comparable: Numbers are equal");
    }
}
