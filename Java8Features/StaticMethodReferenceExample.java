package Java8Features;

interface MyInterface {
    public void m1();
}

public class StaticMethodReferenceExample {

    public static void m2() {
        System.out.println("Hii, kaise hoo!!");
    }

    public static void main(String[] args) {
        MyInterface m = StaticMethodReferenceExample::m2;

        m.m1();
    }

}

// Method reference means reference to one mtehod from another method
// Types:
//1. Static Method Reference
//2. Instance Method Reference
//3. Constructor Reference
