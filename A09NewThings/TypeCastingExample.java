package A09NewThings;

public class TypeCastingExample {

    public static void main(String[] args) {

        int a = 10;

        double b = a;          // WIDENING (int → double)
        System.out.println(b);

        double c = 10.75;

        int d = (int) c;       // NARROWING (double → int)
        System.out.println(d);

        byte x = 20;

        int y = x;             // WIDENING (byte → int)
        System.out.println(y);

        int m = 130;

        byte n = (byte) m;     // NARROWING (int → byte)
        System.out.println(n);
    }
}

