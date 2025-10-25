package Methods;

// Method are the set of instructions which are used to perform specific task
// Basically there is no any type of method but for practice there are four types of methods

// 1. without parameter and without return
// 2. with parameter and without return
// 3. without parameter and with return
// 4. with parameter and with return

public class MethodDemo {

    // 1. without parameter and without return
    public void display() {
        System.out.println("My name is Om Patil");
    }

    // 2. with parameter and without return
    public void display(String str) {
        System.out.println("My name is "+str);
    }

    // 3. without parameter and with return
    public String display2() {
        return "My name is Om Patil";
    }

    // 4. with parameter and with return
    public String display2(String name) {
        return "My name is " + name;
    }


    public static void main(String[] args) {

        MethodDemo d = new MethodDemo();
        d.display();
        d.display("Om Patil");
        System.out.println(d.display2());
        String res = d.display2("Om Patil");
        System.out.println(res);
//        System.out.println(d.display2("Om"));
    }
}

