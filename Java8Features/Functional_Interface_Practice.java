package Java8Features;

@FunctionalInterface
interface vehicalFunctionalInterface {
    // abstract method
    void car();

    // static method inside the interface
    // for calling the static method we can call it using object we need to call it by using the interface name
    static void bike(){
        System.out.println("Bike");
    }

    // default method inside the interface
    default void bycycle(){
        System.out.println("Bycycle");
    }
}

public class Functional_Interface_Practice implements vehicalFunctionalInterface {

    public void car() {
        System.out.println("Car");
    }

    public static void main(String[] args) {
        Functional_Interface_Practice f = new Functional_Interface_Practice();
        f.car();
        vehicalFunctionalInterface.bike();
        f.bycycle();
    }
}
