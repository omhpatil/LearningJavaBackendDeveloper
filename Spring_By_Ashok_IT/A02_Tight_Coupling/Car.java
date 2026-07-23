package Spring_By_Ashok_IT.A02_Tight_Coupling;

public class Car {

    Engine eng = new Engine();          // direct dependency

    public void drive() {
        eng.start();
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
