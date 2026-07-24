package Spring_By_Ashok_IT.A03_Dependency_Injection.Constructor_Injection;

public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
    }

    public static void main(String[] args) {
        Car c = new Car(new Engine());
        c.drive();
    }
}
