package PracticeProject.Project7.Service;

import PracticeProject.Project7.Exception.DuplicateStudentException;
import PracticeProject.Project7.Exception.StudentNotFoundException;
import PracticeProject.Project7.Model.Student;

import java.io.*;
import java.util.*;

public class StudentServiceImpl implements StudentService {

    private static final String DemoFile = "students.data";
    private HashMap<Integer, Student> students = new HashMap<>();

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public StudentServiceImpl() {
        loadFromFile();
    }

    public void sortStudentsByMarks() {

        List<Student> list = getAllStudents();

        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s1.getMarks(), s2.getMarks());
            }
        });

        for (Student s : list) {
            s.display();
        }
    }

    public void sortStudentsByName() {

        List<Student> list = getAllStudents();

        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        for (Student s : list) {
            s.display();
        }
    }

    private void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(DemoFile))) {

            System.out.println("Saving file at: " + new File(DemoFile).getAbsolutePath());
            oos.writeObject(students);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private void loadFromFile() {

        File file = new File(DemoFile);

        if (!file.exists()) {
            students = new HashMap<>();
            return;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {

            students = (HashMap<Integer, Student>) ois.readObject();

        } catch (Exception e) {
            students = new HashMap<>();
        }
    }

    @Override
    public boolean addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            throw new DuplicateStudentException("Student with this ID already exists");
        }
        students.put(student.getId(), student);
        saveToFile();                                           // Here we calling saveToFile to save data into the file.
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
        saveToFile();
        return true;
    }

    @Override
    public boolean updateStudent(int id, String newName, int newAge, double newMarks) {

        Student student = students.get(id);
        if (student == null) {
            throw new StudentNotFoundException("Student not found with ID: " + id);
        }

        student.setName(newName);
        student.setAge(newAge);
        student.setMarks(newMarks);

        saveToFile();

        return true;
    }

    @Override
    public void displayAllStudents() {

        if (students.isEmpty()) {
            System.out.println("There is no any student found, add first");
            return;
        }

        for (Student s : students.values()) {
            s.display();
        }
    }

}
