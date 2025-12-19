package A08MultiThreading;

class DaemonExample {
    public static void main(String[] args) {
        Thread userThread = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("User Thread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("User Thread finished");
        });

        Thread daemonThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {  // Will NOT complete all 10
                System.out.println("Daemon Thread: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Daemon Thread finished");  // May not print!
        });

        daemonThread.setDaemon(true);  // Mark as daemon
        System.out.println(daemonThread.isDaemon());

        userThread.start();
        daemonThread.start();

        System.out.println("Main thread ending");
    }
}