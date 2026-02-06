package PracticeProject.Project2;

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

    public void display() {
        System.out.println(id + " " + name + " " + age + " " + marks);
    }
}
