package A06OOPs.Polymorphism;

class Parent {
    int multi(int a, int b) {
        return a * b;
    }
}

class Child extends Parent {
    int multi(int a, int b){
        return a * b + 10;
    }
}

public class PolyDemo1 {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // For method overloading
        PolyDemo1 p = new PolyDemo1();
        System.out.println(p.add(10, 10));
        System.out.println(p.add(10.10, 10.10));
        System.out.println(p.add(10, 10, 10));

        // For method overriding
        Parent pp = new Child();
        System.out.println(pp.multi(10,10)); // because here multi() method runs based on the runtime (using dynamic method dispatcher)
        // Note: always executes the methods of object created class not reference class.
    }
}

// Polymorphism: Many form of one thing like here we have implemented the add() method in 3 different ways
// basically there are two types of polymorphism,
// 1. Compile-time Polymorphism: also called as method overloading
// 2. Runtime Polymorphism: also called as method overriding


// 1. Compile-time Polymorphism
// in above example we have achieved the compile time(method overloading(same names methods in one with diff parameter list or different return type))
// Rules of method overloading:
// 1. Method name must be same
// 2. List of parameter must be different
// 3. Return type is not considered in method overloading

// 2. Runtime Polymorphism
// method overriding means change parent class implementation
// Rules for method overriding:
// 1. Methods name must be same
// 2. List of parameter must be same
// 3. Return type must be same
// 4. Private Static and Final methods cannot be overridden
// 5. There is must be IS-A relationship between the classes(Inheritance)


//| Type                          | Also Called As         | How It Works                                         | Example                                 |
//| ----------------------------- | ---------------------- | ---------------------------------------------------- | --------------------------------------- |
//| **Compile-time Polymorphism** | **Method Overloading** | Resolved at **compile time** based on argument types | Multiple `add()` methods in same class  |
//| **Run-time Polymorphism**     | **Method Overriding**  | Resolved at **run time** based on object type        | Same method in parent and child classes |
