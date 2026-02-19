package PracticeProject.Project2;

import java.util.ArrayList;

class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // add student
    // Library methods (already implemented) -----> ArrayList.add()
    void addStudent(Student student) {
        students.add(student);
    }

    // display all students
    void displayAllStudents() {
        for (Student s : students) {
            s.display();
        }
    }
}


// Encapsulation = Hide internal data and control access through methods.
// just to acheive encapsulation we make this arrylist as private, if we make it public then
// anyone can assign assign it as null or can insert null data

//✔ To achieve encapsulation
//✔ To protect internal data
//✔ To control modifications
//✔ To maintain clean OOP design
//✔ To avoid unwanted external changes

//🔍 Hidden Concepts (Interview Alert):
//- Composition (StudentService HAS students)
//- Encapsulation (list is private)
//- Single Responsibility Principle

// Dont make this common mistakes:
//❌ Putting ArrayList inside MainApp
//❌ Writing business logic inside main()
//❌ Making everything public
//❌ Skipping service layer