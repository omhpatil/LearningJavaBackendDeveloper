package PracticeProject.Project4;

import java.util.HashMap;

class StudentService {

    private HashMap<Integer, Student> students = new HashMap<>();

    boolean addStudent(Student student) {

        if (students.containsKey(student.getId())) {
            return false; // duplicate ID
        }
        students.put(student.getId(), student);
        return true;
    }

    Student searchStudentById(int id) {
        return students.get(id);
    }

    boolean updateStudent(int id, String newName, int newAge, double newMarks) {

        Student student = students.get(id);

        if (student != null) {
            student.setName(newName);
            student.setAge(newAge);
            student.setMarks(newMarks);
            return true;
        }
        return false;
    }

    void displayAllStudents() {
        for (Student s : students.values()) {
            s.display();
        }
    }


    boolean deleteStudentById(int id) {

        if (students.containsKey(id)) {
            students.remove(id);
            return true;
        }
        return false;
    }



}

// We use return type Student because: This method searches and returns a Student object that matches the given id.

// Q: How to make search/update/delete O(1)?
// --> Use HashMap<Integer, Student>