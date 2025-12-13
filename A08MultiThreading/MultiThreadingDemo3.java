package A08MultiThreading;

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Child Thread Class");
    }
}

public class MultiThreadingDemo3 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread2());
        t.start();
        System.out.println("Main Thread Class");
    }
}
