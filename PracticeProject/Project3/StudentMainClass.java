package PracticeProject.Project3;

import java.util.Scanner;

public class StudentMainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService ss = new StudentService();

        while (true) {

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Student Name: ");
                    String name = sc.next();

                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Student Marks: ");
                    int marks = sc.nextInt();

                    Student student = new Student(id, name, age, marks);
                    ss.addStudent(student);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    ss.displayAllStudents();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

}