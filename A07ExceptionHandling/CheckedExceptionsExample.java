package A07ExceptionHandling;

import java.io.*;     // For IOException and FileNotFoundException
import java.sql.*;    // For SQLException

public class CheckedExceptionsExample {
    public static void main(String[] args) {
        // Example 1: FileNotFoundException (Checked)
        try {
            FileReader file = new FileReader("nonexistent.txt");
            BufferedReader reader = new BufferedReader(file);
            System.out.println(reader.readLine());
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found! → " + e);
        } catch (IOException e) {
            System.out.println("Error while reading file → " + e);
        }

        // Example 2: SQLException (Checked)
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println("Database error occurred → " + e);
        }

        // Example 3: ClassNotFoundException (Checked)
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found → " + e);
        }
    }
}

