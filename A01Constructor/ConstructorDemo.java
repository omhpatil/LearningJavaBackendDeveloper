package A01Constructor;

public class ConstructorDemo {

    String name;
    int duration;

    ConstructorDemo() {
        System.out.println("Constructor called");
    }

    ConstructorDemo(String name){
        this.name=name;
        System.out.println("Parameterized constructor called");
        System.out.println("I am lerning "+name);
    }

    public void learn(ConstructorDemo c1) {
        System.out.println("I am learning " + c1.name);
    }

    public static void main(String[] args) {
        System.out.println("Before Constructor called");
        ConstructorDemo c1 = new ConstructorDemo();
        c1.name = "Java Fullstack";
        c1.learn(c1);
        System.out.println("After constructor called");

        ConstructorDemo c2 = new ConstructorDemo();
//        c2.learn(c2);                                   // because here we have set value to field name in for the
                                                        // constructor c1 not for the c2 so that is why it is showing the null value
//         c2.name = "DevOps Learning";                 // If u want correct output set value for name field in the constructor c2 also
//         c2.learn(c2);

        ConstructorDemo c3 = new ConstructorDemo("Java Backend");
        // at the time printing below line remove this.name = name for printing the null value
        System.out.println(c3.name);  // here i am assigning value the which i gave at the time of object creation but it is showing null when i am printing it because i have to set the value to the instance of local in the constructor
        c3.name="DSA";
        System.out.println(c3.name);
    }
}



// Constructor is special method which has same name has class name
// used to initialize the instance variable
// if we are not making any constructor then Java JVM makes the default constructor which sets the default values

// 1. Default Constructor: by default created by the JVM
// 2. Parameterized Constructor: used for restrict the object creation
// 3. Overloaded (GL/Optional)

// When to use the parameterized constructor:
// 1. when we want to restrict the object creation based on the parameter
// 2. to set the instance variables value at the time of the object creation