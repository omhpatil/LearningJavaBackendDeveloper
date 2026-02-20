package PracticeProject.Project3;

import java.util.ArrayList;

class StudentService {

    private final ArrayList<Student> students = new ArrayList<>();

    boolean addStudent(Student student) {

        if (searchStudentById(student.getId()) != null) {
            return false; // duplicate found
        }

        students.add(student);
        return true;
    }


    Student searchStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    boolean updateStudent(int id, String newName, int newAge, double newMarks) {
        Student student = searchStudentById(id);

        if (student != null) {
            student.setName(newName);
            student.setAge(newAge);
            student.setMarks(newMarks);
            return true;
        }
        return false;
    }

    void displayAllStudents() {
        for (Student s : students) {
            s.display();
        }
    }

    boolean deleteStudentById(int id) {
        Student student = searchStudentById(id);

        if (student != null) {
            students.remove(student);                   // using inbuilt method .remove()
            return true;
        }
        return false;
    }


}

// We use return type Student because: This method searches and returns a Student object that matches the given id.

// Q: How to make search/update/delete O(1)?
// --> Use HashMap<Integer, Student>