package PracticeProject.Project3;

import java.util.ArrayList;

class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student student) {
        students.add(student);
    }

    Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    void displayAllStudents() {
        for (Student s : students) {
            s.display();
        }
    }
}

// We use return type Student because: This method searches and returns a Student object that matches the given id.