package A07ExceptionHandling;

public class DemoException {
    public static void main(String[] args) {
        System.out.println("Lets start learning Exception in Java");
    }
}


// Exception Handling

// An Exception is a runtime object representing a problem that interrupt the flow the program
// An unwanted event that interrupt the flow of the program
// Exceptions are recoverable and Errors are not recoverable

//                                  Object
//                                    |
//                                Throwable (PCE) -- Partially Checked Exception
//                                    |
//                --------------------------------------------------------------------
//                  |                                                                |
//              Exception  (PCE)                                                    Error
//                  |                                                                |
//-------------------------------------------------------------------       ------------------------------------------------
// | (FCE)             | (FCE)          | (FCE)                | (PCE)         |                    |                    |
//I/O Exception  SQL Exception  ClassNotFoundException  RuntimeException  StackOverflowError  VirtualMachineError  OutOfMemoryError
//                                                              |
//                   ---------------------------------------------------
//                   |                |                |               |
//   ArithmeticException  NullPointerException  NumberFormatException  IndexOutOfBoundsException
//                                                        |
//                                       --------------------------------------
//                                       |                                    |
//                            ArrayIndexOutOfBoundsException     StringIndexOutOfBoundsException


// Types of Exceptions:
// 1. Checked Exceptions: These are exception checked at the compile time also they force compiler to handle explicitly
//    - These exceptions must be handle in the try-catch bloch or throws

// 2. Unchecked Exceptions: These are exception not checked at time of compile time means at the runtime
//    - these exceptions occurs during the execution time means runtime

// Note: Whether exception is checked or unchecked exception it should be occurs at runtime only and there is no chance of
// occurring any exception at compile time

// Then Checked exception is further divided into two types:
// 1. Full Checked VS 2. Partially Exception:
// A exceptions is said to be full exception if and only if they child class also checked exception
// A exceptions is said to be partially exception if and only if they child class not checked exception
