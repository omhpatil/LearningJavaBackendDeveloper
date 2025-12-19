package A08MultiThreading;

class SharedResource {
    int data;
    boolean hasData = false;

    synchronized void produce(int value) {
        try {
            while (hasData) {
                wait();
            }
            data = value;
            System.out.println("Produced: " + data);
            hasData = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!hasData) {
                wait();
            }
            System.out.println("Consumed: " + data);
            hasData = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Producer extends Thread {
    SharedResource resource;

    Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            resource.produce(i);
        }
    }
}

class Consumer extends Thread {
    SharedResource resource;

    Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            resource.consume();
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Producer p = new Producer(resource);
        Consumer c = new Consumer(resource);

        p.start();
        c.start();
    }
}
