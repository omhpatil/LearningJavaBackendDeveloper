package PracticeProject.Project7.UI;

import PracticeProject.Project7.Exception.DuplicateStudentException;
import PracticeProject.Project7.Exception.InvalidStudentDataException;
import PracticeProject.Project7.Exception.StudentNotFoundException;
import PracticeProject.Project7.Model.Student;
import PracticeProject.Project7.Service.StudentService;
import PracticeProject.Project7.Service.StudentServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentService service = new StudentServiceImpl();

        while (true) {

            System.out.println("\n----- Student Management System -----");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Sort Students by Marks");
            System.out.println("7. Sort Students by Name");
            System.out.println("8. Quit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:

                    try {
                        System.out.print("Enter Student ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Student Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Student Marks: ");
                        double marks = sc.nextDouble();

                        Student student = new Student(id, name, age, marks);

                        service.addStudent(student);

                        System.out.println("Student Added Successfully!");

                    } catch (DuplicateStudentException | InvalidStudentDataException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 2:

                    service.displayAllStudents();

                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    Student found = service.searchStudentById(searchId);

                    if (found != null) {
                        System.out.println("Student Found Successfully!");
                        found.display();
                    } else {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 4:

                    try {

                        System.out.print("Enter Student ID: ");
                        int deleteId = sc.nextInt();

                        service.deleteStudentById(deleteId);

                        System.out.println("Student Deleted Successfully!");

                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 5:

                    try {

                        System.out.print("Enter ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter New Age: ");
                        int newAge = sc.nextInt();

                        System.out.print("Enter New Marks: ");
                        double newMarks = sc.nextDouble();

                        service.updateStudent(updateId, newName, newAge, newMarks);

                        System.out.println("Student Updated Successfully!");

                    } catch (StudentNotFoundException | InvalidStudentDataException e) {
                        System.out.println(e.getMessage());
                    }

                    break;

                case 6:
                    service.sortStudentsByMarks();
                    break;

                case 7:
                    service.sortStudentsByName();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");
            }
        }
    }
}