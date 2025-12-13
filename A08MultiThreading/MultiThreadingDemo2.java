package A08MultiThreading;

class MyThread1 extends Thread{
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Child thread class");
        }
    }
}

public class MultiThreadingDemo2 {
    public static void main(String[] args) {
        System.out.println("Thread Name: "+Thread.currentThread().getName() );
        MyThread1 t =new MyThread1();
        t.start();
        for (int i=0; i<5; i++){
            System.out.println("Main thread class");
        }
    }
}



// For the program why mix output? sometimes child and sometimes parent
// Thread Scheduler: when multiple threads are waiting for execution, the which thread will execute first is decided by thread scheduler
// TS have specific algorithm by using TS decides that it is not standard process it depends on JVM to JVM
// TS decides on the basis of priority and initially default priority of main thread is 5
// so if we create any thread from the main thread the priority will pass on