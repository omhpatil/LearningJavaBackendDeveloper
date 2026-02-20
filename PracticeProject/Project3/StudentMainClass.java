package PracticeProject.Project3;

import java.util.Scanner;

public class StudentMainClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService ss = new StudentService();

        while (true) {

            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();                          // Add one extra nextLine() after nextInt() to resolve problem

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

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
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();
                    Student found = ss.searchStudentById(searchId);

                    if (found != null) {
                        System.out.println("Student Found Successfully!");
                        found.display();
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = ss.deleteStudentById(deleteId);
                    if (deleted) {
                        System.out.println("Student Deleted Successfully!");
                    } else {
                        System.out.println("Student Not Deleted!");
                    }
                    break;

                case 5:
                    System.out.print("Enter ID to update: ");
                    int updateId = sc.nextInt();

                    sc.nextLine(); // clear buffer

                    //  First check if student exists
                    Student existingStudent = ss.searchStudentById(updateId);

                    if (existingStudent == null) {
                        System.out.println("Student Not Found!");
                        break;   // 🚀 stop here immediately
                    }

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    boolean updated = ss.updateStudent(updateId, newName, newAge, newMarks);

                    if (updated) {
                        System.out.println("Student Updated Successfully!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

}