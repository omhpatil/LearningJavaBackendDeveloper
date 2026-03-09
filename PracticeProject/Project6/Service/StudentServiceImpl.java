package PracticeProject.Project6.Service;

import PracticeProject.Project6.Exception.DuplicateStudentException;
import PracticeProject.Project6.Exception.StudentNotFoundException;
import PracticeProject.Project6.Model.Student;

import java.util.HashMap;

public class StudentServiceImpl implements StudentService {

    private HashMap<Integer, Student> students = new HashMap<>();

    @Override
    public boolean addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            throw new DuplicateStudentException("Student with this ID already exists");
        }
        students.put(student.getId(), student);
        return true;
    }

    @Override
    public Student searchStudentById(int id) {
        return students.get(id);
    }

    @Override
    public boolean deleteStudentById(int id) {

        if (!students.containsKey(id)) {
            throw new StudentNotFoundException("Student not found with ID: " + id);
        }

        students.remove(id);
        return true;
    }

    @Override
    public boolean updateStudent(int id, String newName, int newAge, double newMarks) {
        Student student = students.get(id);
        if (student != null) {
            student.setName(newName);
            student.setAge(newAge);
            student.setMarks(newMarks);
            return true;
        }
        return false;
    }

    @Override
    public void displayAllStudents() {
        for (Student s : students.values()) {
            s.display();
        }
    }

}
