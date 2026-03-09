package PracticeProject.Project6.Service;

import PracticeProject.Project6.Model.Student;

public interface StudentService {
    boolean addStudent(Student student);

    Student searchStudentById(int id);

    boolean deleteStudentById(int id);

    boolean updateStudent(int id, String newName, int newAge, double newMarks);

    void displayAllStudents();
}