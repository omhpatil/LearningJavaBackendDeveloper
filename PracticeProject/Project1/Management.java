package PracticeProject.Project1;

class Student {
    int id;
    String name;
    int age;
    double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }

    void isPass() {
        if (marks >= 40) {
            System.out.println(name+ " is Pass");
        } else {
            System.out.println("Student is Fail");
        }
    }
}

public class Management {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Jack", 19, 50);
        Student s2 = new Student(2, "Jack", 19, 30);

        s1.display();
        s1.isPass();

        s2.display();
        s2.isPass();
    }
}
