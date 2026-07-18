package Java8Features;

interface MyInterfaces {
    Student getStudent();
}

class Student {

    public Student() {
        System.out.println("Student Object Created");
    }
}

public class ConstructorReferenceExample {

    public static void main(String[] args) {

        MyInterfaces m = Student::new;

        Student s = m.getStudent();
    }
}