package A07ExceptionHandling;

public class DemoTryCatchFinally {
    public static void main(String[] args) {
        System.out.println("Before Exception");
        try {
            int a = 10 / 0;
        } catch (Exception e) {         //catch code execute when the error occurs otherwise it will not print anything written inside it
            System.out.println(e);                  // below another ways to print the exceptions
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//            System.out.println(e.toString());
        } finally {
            System.out.println("Hello from finally block");
        }
    }
}
