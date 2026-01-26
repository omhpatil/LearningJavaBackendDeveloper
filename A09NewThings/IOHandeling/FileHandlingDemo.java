package A09NewThings.IOHandeling;

import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\Admin\\Desktop\\practice.txt";
        File file = new File(filePath);

        try {

            // 1️⃣ Check if file exists
            if (file.exists()) {
                System.out.println("File already exists");
            } else {
                file.createNewFile();
                System.out.println("File created");
            }

            // 2️⃣ Write data to file (overwrite)
            FileWriter fw = new FileWriter(file);
            fw.write("Hello, this is file handling practice.\n");
            fw.write("Java File Handling Demo\n");
            fw.close();
            System.out.println("Data written to file");

            // 3️⃣ Append data to file
            FileWriter fwAppend = new FileWriter(file, true);
            fwAppend.write("Appending new line to file.\n");
            fwAppend.close();
            System.out.println("Data appended to file");

            // 4️⃣ Read data from file
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("\nReading file content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // 5️⃣ File details
            System.out.println("\nFile name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());

            // 6️⃣ Rename file
            File renamedFile = new File("C:\\Users\\Admin\\Desktop\\practice_new.txt");
            if (file.renameTo(renamedFile)) {
                System.out.println("File renamed successfully");
            } else {
                System.out.println("File rename failed");
            }

            // 7️⃣ Delete file
            if (renamedFile.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("File deletion failed");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
