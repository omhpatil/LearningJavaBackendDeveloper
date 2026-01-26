package Java8Features;

interface Practice{
    void start();

    default void print(){
        System.out.println("Default method of interface");
    }

    static void prints(){
        System.out.println("Static method of interface");
    }
}

public class InterfaceChanges implements Practice{

    // Interface methods are public by default, so the implementing class must implement them as public.
    public void start(){
        System.out.println("Start method of interface");
    }

    public static void main(String[] args) {
        InterfaceChanges obj = new InterfaceChanges();

        obj.start();
        obj.print();
        Practice.prints();
    }
}
