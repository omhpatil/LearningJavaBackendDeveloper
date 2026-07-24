package Spring_By_Ashok_IT.A03_Dependency_Injection.Setter_Injection;

public class Car {

    private Engine engine = new Engine();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private void drive() {
        engine.start();
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }


}
