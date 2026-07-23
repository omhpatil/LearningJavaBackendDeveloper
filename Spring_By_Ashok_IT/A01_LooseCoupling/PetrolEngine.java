package Spring_By_Ashok_IT.A01_LooseCoupling;

public class PetrolEngine implements Engine {
    @Override
    public int start() {
        System.out.println("Petrol Engine Started..");
        return 1;
    }
}
