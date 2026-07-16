package Java8Features.Revision;

interface Human {
    void run();

    default void eat() {
        System.out.println("Eating food");
    }

    // static method belong to interface so it can be called by using only interface name not by the object of implemented class
    static void walk() {
        System.out.println("Walking");
    }
}

public class InterfaceChanges2 implements Human {

    public void run() {
        System.out.println("Running");
    }

    // So here we can change the implementation of default method of interface which we are implemting
//    @Override
//    public void eat() {
//        System.out.println("Eating food by hand");
//    }

    public static void main(String[] args) {
        InterfaceChanges2 obj = new InterfaceChanges2();
        obj.run();
        obj.eat();
        Human.walk();
    }


}
