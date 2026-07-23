package Spring_By_Ashok_IT.A01_LooseCoupling;

public class Car {

    private Engine eng;

    Car(Engine eng) {
        this.eng = eng;
    }

    public void start() {
        int start = eng.start();

        if (start >= 1) {
            System.out.println("Engine Started!!!");
        } else {
            System.out.println("Engine Failed!!!");
        }
    }
}
