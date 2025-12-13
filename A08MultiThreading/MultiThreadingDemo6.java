package A08MultiThreading;

class YieldThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() +" --- "+ i);
            Thread.yield(); // executing both thread one after one
        }
    }
}

public class MultiThreadingDemo6 {
    public static void main(String[] args) {
        YieldThread y1 = new YieldThread();
        YieldThread y2 = new YieldThread();

        y1.start();
        y2.start();
    }
}
