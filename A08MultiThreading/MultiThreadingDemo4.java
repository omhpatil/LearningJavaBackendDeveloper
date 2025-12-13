package A08MultiThreading;

class MyThreadDemo extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class MultiThreadingDemo4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = Thread.currentThread();
        thread.setName("OP-Thread");
        System.out.println(thread.getName());

        MyThreadDemo t1 = new MyThreadDemo();
        System.out.println(t1.getName());

    }
}



// Here are some thread methods:
//start(), run(), getName(), setName(), setPriority()
