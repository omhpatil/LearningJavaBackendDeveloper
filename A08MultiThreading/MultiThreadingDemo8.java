package A08MultiThreading;

class JoinThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i<3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Child Thread");
        }
    }
}

public class MultiThreadingDemo8 {
    public static void main(String[] args) throws InterruptedException {
        JoinThread j = new JoinThread();
        j.start();
        j.join(); // executing by main thread - jo line or jo thread krne wala hai wahi wait krega means main will wait for child to complete its execution

        for (int i=0; i<3; i++){
            System.out.println("Main Thread");
        }
    }
}
