package Java8Features.Thread;

public class ApproachOneToCreateThread implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ApproachOneToCreateThread ap = new ApproachOneToCreateThread();
        Thread t = new Thread(ap);

        t.start();
    }
}