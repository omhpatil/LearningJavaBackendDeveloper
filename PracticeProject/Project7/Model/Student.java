package PracticeProject.Project6.Model;

import PracticeProject.Project6.Exception.InvalidStudentDataException;

public class Student {
    int id;
    String name;
    int age;
    double marks;

    public Student(int id, String name, int age, double marks) {

        if (age <= 0) {
            throw new InvalidStudentDataException("Age must be greater than 0");
        }

        if (marks < 0 || marks > 100) {
            throw new InvalidStudentDataException("Marks must be between 0 and 100");
        }

        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}