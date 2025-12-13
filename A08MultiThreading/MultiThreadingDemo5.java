package A08MultiThreading;
// Thread Priority

class PriorityThread extends Thread {
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getPriority());
    }
}

public class MultiThreadingDemo5 {
    public static void main(String[] args) {
        PriorityThread p1 = new PriorityThread();
        p1.setName("P1 Thread");
        p1.setPriority(Thread.MIN_PRIORITY);

        PriorityThread p2 = new PriorityThread();
        p2.setName("P2 Thread");
        p2.setPriority(Thread.MAX_PRIORITY);

        PriorityThread p3 = new PriorityThread();
        p3.setName("P3 Thread");
        p3.setPriority(Thread.NORM_PRIORITY);

        p1.start();
        p2.start();
        p3.start();
    }
}


// MIN_Priority < 1
// NORM_Priority < 5
// MAX_Priority < 10