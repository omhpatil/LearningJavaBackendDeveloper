package Java8Features;

interface MyInterface2 {
    void greet();
}

class Demo {

    public void sayHello() {
        System.out.println("Hello from Instance Method");
    }
}

public class InstanceMethodReferenceExample {

    public static void main(String[] args) {

        Demo demo = new Demo();

        MyInterface2 m = demo::sayHello;

        m.greet();
    }
}