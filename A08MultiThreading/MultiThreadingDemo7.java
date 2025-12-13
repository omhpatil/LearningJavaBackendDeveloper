package A08MultiThreading;

class SleepThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(getName() + " --- " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread Interrupted");
            }
        }
    }
}

public class MultiThreadingDemo7 {
    public static void main(String[] args) {
        SleepThread s = new SleepThread();
        s.setName("My Thread");
        s.start();
    }
}
