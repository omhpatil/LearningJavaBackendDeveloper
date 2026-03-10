package PracticeProject.Project7.Service;

import PracticeProject.Project7.Model.Student;

public interface StudentService {
    boolean addStudent(Student student);

    Student searchStudentById(int id);

    boolean deleteStudentById(int id);

    boolean updateStudent(int id, String newName, int newAge, double newMarks);

    void displayAllStudents();

    void sortStudentsByMarks();
    
    void sortStudentsByName();
}