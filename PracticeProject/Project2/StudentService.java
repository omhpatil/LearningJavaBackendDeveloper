package PracticeProject.Project2;

import java.util.ArrayList;

class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // add student
    // Library methods (already implemented) -----> ArrayList.add()
    void addStudent(Student student) {
        students.add(student);
    }

    // display all students
    void displayAllStudents() {
        for (Student s : students) {
            s.display();
        }
    }
}

