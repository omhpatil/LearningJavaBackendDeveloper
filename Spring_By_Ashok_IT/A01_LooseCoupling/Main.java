package Spring_By_Ashok_IT.A01_LooseCoupling;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(new DisealEngine());
        c1.start();

        Car c2 = new Car(new PetrolEngine());
        c2.start();

        // here car class remains uncheged if we made any changes in the other disel and petrol classes means loose coupling
    }
}
