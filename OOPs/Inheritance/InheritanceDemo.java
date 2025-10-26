package OOPs.Inheritance;

class Animal {
    void sound() {
        System.out.println("Animal sounds...");
    }
}

class Dog extends Animal {
    void sound() {
//        super.sound();                            // to call Animals sound methodw
        System.out.println("Dog barks...");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
    }
}
