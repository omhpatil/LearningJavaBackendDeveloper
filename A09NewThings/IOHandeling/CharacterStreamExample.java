package A09NewThings.IOHandeling;

import java.io.*;

public class CharacterStreamExample {

    public static void main(String[] args) throws Exception {

        FileWriter fw = new FileWriter("C:\\Users\\Admin\\Desktop\\practice.txt");
        fw.write("Hello Java\n");
        fw.write("Character Stream Example\n");
        fw.close();

        BufferedReader br = new BufferedReader(
                new FileReader("C:\\Users\\Admin\\Desktop\\practice.txt")
        );

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}

