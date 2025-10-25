package OOPs;

public class Car {

    // fields, attributes, properties
    String name;
    String brand;
    int speed;

    // behaviour(methods), actions
    public void run() {
        System.out.println("Car is running at speed " + speed);
    }

    public static void main(String[] args) {

        Car c = new Car();

        //first set the speed

        c.run();

    }
}
