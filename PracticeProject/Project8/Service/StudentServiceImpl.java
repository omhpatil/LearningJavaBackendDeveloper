package PracticeProject.Project8.Service;

import PracticeProject.Project8.Database.DBConnection;
import PracticeProject.Project8.Exception.StudentNotFoundException;
import PracticeProject.Project8.Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public boolean addStudent(Student student) {

        String sql = "INSERT INTO students VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setDouble(4, student.getMarks());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public Student searchStudentById(int id) {

        String sql = "SELECT * FROM students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getDouble("marks")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean deleteStudentById(int id) {

        String sql = "DELETE FROM students WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows == 0) {
                throw new StudentNotFoundException("Student not found with ID: " + id);
            }

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean updateStudent(int id, String name, int age, double marks) {

        String sql = "UPDATE students SET name=?, age=?, marks=? WHERE id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setDouble(3, marks);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows == 0) {
                throw new StudentNotFoundException("Student not found with ID: " + id);
            }

            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public void displayAllStudents() {

        String sql = "SELECT * FROM students";

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("name") + " "
                                + rs.getInt("age") + " "
                                + rs.getDouble("marks")
                );
            }

            if (!found) {
                System.out.println("No students found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sortStudentsByMarks() {

        String sql = "SELECT * FROM students ORDER BY marks";

        executeSortedQuery(sql);
    }

    @Override
    public void sortStudentsByName() {

        String sql = "SELECT * FROM students ORDER BY name";

        executeSortedQuery(sql);
    }

    private void executeSortedQuery(String sql) {

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " "
                                + rs.getString("name") + " "
                                + rs.getInt("age") + " "
                                + rs.getDouble("marks")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}