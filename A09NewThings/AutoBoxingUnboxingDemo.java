package A09NewThings;

public class AutoBoxingUnboxingDemo {

    public static void main(String[] args) {

        int a = 10;

        Integer obj = a;      // Autoboxing (int → Integer)
        System.out.println("Autoboxed Integer: " + obj);

        int b = obj;          // Unboxing (Integer → int)
        System.out.println("Unboxed int: " + b);

        double x = 20.5;

        Double dobj = x;      // Autoboxing (double → Double)
        System.out.println("Autoboxed Double: " + dobj);

        double y = dobj;      // Unboxing (Double → double)
        System.out.println("Unboxed double: " + y);
    }
}