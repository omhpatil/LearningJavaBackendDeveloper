package Spring_By_Ashok_IT.A01_LooseCoupling;

public class DisealEngine implements Engine {

    @Override
    public int start() {
        System.out.println("Diesel Engine Started..");
        return 1;
    }
}
