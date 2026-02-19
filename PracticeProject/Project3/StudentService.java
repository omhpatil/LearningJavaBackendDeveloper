package PracticeProject.Project3;

import java.util.ArrayList;

class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
    }

    void displayAllStudents() {
        for (Student s : students) {
            s.display();
        }
    }
}