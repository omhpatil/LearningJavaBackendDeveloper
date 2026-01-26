package A09NewThings.IOHandeling;

import java.io.*;

public class ByteStreamExample {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\input.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\output.jpg");

        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close();
        fos.close();

        System.out.println("Binary file copied successfully");
    }
}

