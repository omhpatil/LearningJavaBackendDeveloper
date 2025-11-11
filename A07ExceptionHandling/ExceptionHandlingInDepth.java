package A07ExceptionHandling;

public class ExceptionHandlingInDepth {

    public static void m1() {
        m2();
        System.out.println("Hello From M1");
    }

    public static void m2() {
        m3();
        System.out.println("Hello From M2");
    }

    public static void m3() {
        m4();
        System.out.println("Hello From M3");
    }

    public static void m4() {
        int a = 10 / 0;
        System.out.println("Hello From M4");
    }

    
    public static void main(String[] args) {
        m1();
//        main() → m1() → m2() → m3() → m4()

    }

}


//When an exception occurs:
//The current method (m4) stops immediately.
//The system looks for a try-catch block in m4() — ❌ None found.
//So it passes (or propagates) the exception back to the caller → m3().
//Now m3() receives it:
//Does m3() have a try-catch? ❌ No → it also stops.
//Exception moves to m2()
//m2() also has no try-catch → stops
//Then it moves to m1() → also no try-catch → stops
//Finally, it reaches main() → also no try-catch.
//Since no one handled the exception, the JVM (Java Virtual Machine) handles it by:
//Printing an error message
//Showing the exception type and cause
//Printing the call stack trace (the chain of method calls leading to the error)