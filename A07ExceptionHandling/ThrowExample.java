package A07ExceptionHandling;

public class ThrowExample {

    public static void checkAge(int age) {
        if (age < 18) {
            // Manually throwing an exception
            throw new ArithmeticException("Not eligible to vote (age below 18)");
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16);  // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues normally after exception handling...");
    }
}

