package Java8Features.Revision;

@FunctionalInterface
interface MyInterface2 {
    void display();
}

public class WithUsingLambda {

    public static void main(String[] args) {
        MyInterface2 m2 = () -> System.out.println("To kaise ho app log....");
        m2.display();
    }
}


// Here two concepts got clear one is lambda expression and other one is functional interface is used to call lambda