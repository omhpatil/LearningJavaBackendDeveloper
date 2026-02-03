// Instead of creating objects directly with new, the Factory Method provides a method to create objects.
// This lets you decide the object type at runtime without changing the main code.

package DesignPatterns.CreationalPattern;

// Step 1: Create an interface
interface Shape {
    void draw();
}

// Step 2: Concrete classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// Step 3: Factory class
class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}

// Step 4: Client code
public class FactoryMethodMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape s1 = factory.getShape("circle");
        s1.draw();  // Output: Drawing Circle

        Shape s2 = factory.getShape("square");
        s2.draw();  // Output: Drawing Square
    }
}
