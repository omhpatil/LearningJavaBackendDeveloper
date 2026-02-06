package PracticeProject.Project2;

public class StudentManegement {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = new Student(1, "Om", 22, 78);
        Student s2 = new Student(2, "Amit", 21, 35);

        service.addStudent(s1);
        service.addStudent(s2);

        service.displayAllStudents();

    }
}
