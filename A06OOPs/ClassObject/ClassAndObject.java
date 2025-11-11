package A06OOPs.ClassObject;

public class ClassAndObject {

    // fields, attributes, properties
    String name;
    String brand;
    int speed;

    // behaviour(methods), actions
    public void run() {
        System.out.println("Car is running at speed " + speed);
    }

    public static void main(String[] args) {

        ClassAndObject c = new ClassAndObject();

        //first set the speed

        c.run();

    }
}
