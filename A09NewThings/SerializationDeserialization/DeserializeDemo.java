package A09NewThings.SerializationDeserialization;

import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("student.txt"));

        Student s = (Student) ois.readObject();
        ois.close();

        System.out.println(s.id);
        System.out.println(s.name);
    }
}
