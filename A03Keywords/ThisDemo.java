package A03Keywords;

public class ThisDemo {

    String name;

    ThisDemo() {
        this("Unknown");
    }

    ThisDemo(String name) {
        this.name = name;
    }

    public void display() {
        Hello(this);                                // this will refer / calls to default constructor
        System.out.println("My name is " + name);
    }

    public void Hello(ThisDemo d) {
        System.out.println("My name is " + d.name);
    }


    public static void main(String[] args) {
        ThisDemo d1 = new ThisDemo("Java");
        d1.display();

        ThisDemo d2 = new ThisDemo();
        d2.display();

    }
}


// This:
// - this is keyword which refer to the current object

// why we use it?
// - reference to the current object / and make the difference between the local and instance variables
// - call current class constructor
// - this as method argument


//ThisDemo() {                // this() to call another constructor in the same class
//    this("Unknown");
//}

// This calls the parameterized constructor with "Unknown".
// This is called constructor chaining, and it must be the first line in the constructor.

