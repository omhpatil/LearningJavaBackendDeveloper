package A07ExceptionHandling;

import java.io.*;

public class ThrowsExample {

    // This method declares that it might throw an IOException
    public static void readFile() throws IOException {
        FileReader file = new FileReader("test.txt");
        BufferedReader reader = new BufferedReader(file);
        System.out.println(reader.readLine());
        reader.close();
    }

    public static void main(String[] args) {
        try {
            readFile(); // This method may throw IOException
        } catch (IOException e) {
            System.out.println("Exception handled in main(): " + e.getMessage());
        }

        System.out.println("Program executed successfully after handling IOException.");
    }
}

