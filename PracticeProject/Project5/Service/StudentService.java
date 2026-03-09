package PracticeProject.Project5.Service;

import PracticeProject.Project5.Model.Student;

public interface StudentService {
    boolean addStudent(Student student);

    Student searchStudentById(int id);

    boolean deleteStudentById(int id);

    boolean updateStudent(int id, String newName, int newAge, double newMarks);

    void displayAllStudents();
}

// In this project, WHY Interface?
// - Interface defines WHAT
// -Implementation defines HOW
// -Loose coupling
// -Easy to replace logic later

//This is foundation of:
//- Spring Boot
//- Dependency Injection
//- Clean Architecture