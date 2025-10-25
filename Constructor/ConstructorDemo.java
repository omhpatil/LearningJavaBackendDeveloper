package Constructor;

// Constructor is special method which has same name has class name
// used to initialize the instance variable


public class ConstructorDemo {

    String name;
    int duration;

    ConstructorDemo(){
        System.out.println("Constructor called");
    }

    public void learn(ConstructorDemo c1){
        System.out.println("I am learning "+c1.name);
    }

    public static void main(String[] args) {
        System.out.println("Before Constructor called");
        ConstructorDemo c1 = new ConstructorDemo();
        c1.name = "Java Fullstack";
        c1.learn(c1);
        System.out.println("After constructor called");

        ConstructorDemo c2 = new ConstructorDemo();
        c2.learn(c2);                                   // because here we have set value to field name in for the
                                                        // constructor c1 not for the c2 so that is why it is showing the null value
//         c2.name = "DevOps Learning";                 // If u want correct output set value for name field in the constructor c2 also
//         c2.learn(c2);
    }
}
