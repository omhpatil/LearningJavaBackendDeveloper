package Java8Features.Revision;

interface MyInterface {
    void display();
}

public class WithoutUsingLambda implements MyInterface {

    public void display() {
        System.out.println("Hey, How are you!!");
    }

    public static void main(String[] args) {
        WithoutUsingLambda w = new WithoutUsingLambda();
        w.display();
    }
}
