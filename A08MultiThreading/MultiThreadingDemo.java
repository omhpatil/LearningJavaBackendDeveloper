package A08MultiThreading;

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("thread child class");
    }
}

public class MultiThreadingDemo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}