package A07ExceptionHandling;

public class UncheckedExceptionsExample {
    public static void main(String[] args) {

        // Example 1: ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero! → " + e);
        }

        // Example 2: NullPointerException
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Null object reference → " + e);
        }

        // Example 3: ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index → " + e);
        }

        // Example 4: NumberFormatException
        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format → " + e);
        }
    }
}

