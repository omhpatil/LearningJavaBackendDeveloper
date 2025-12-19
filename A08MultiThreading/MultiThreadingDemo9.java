package A08MultiThreading;

class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class MyThreads extends Thread {
    Counter counter;

    MyThreads(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            counter.increment();
        }
    }
}

public class MultiThreadingDemo9 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyThreads t1 = new MyThreads(counter);
        MyThreads t2 = new MyThreads(counter);
        MyThreads t3 = new MyThreads(counter);
        
        t1.start();  // runs 500 times for this call
        t2.start();  // runs 500 times for this call
        t3.start();  // runs 500 times for this call means total answer will be 1500

        System.out.println("Main thread waiting");
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Final Count: " + counter.count);
        System.out.println("Main thread completed");
    }
}


//This code demonstrates thread synchronization to prevent race conditions when multiple threads access shared data concurrently.
//Main Goal: Show that without proper synchronization, multiple threads can corrupt shared data, but with the synchronized keyword,
//we can safely update shared variables.
// also to resolve this issue we can be make method as a synchronize and block also synchronize but which one better?
// A synchronized block is generally better than a synchronized method because it allows for more granular control,
// locking only the critical section of code, which improves performance and concurrency. synchronised(this) -> locks current object


// inter thread communication: Inter-thread communication is a mechanism by which threads coordinate with each other by sharing
// information and controlling execution order, so that one thread waits until another thread completes a specific task.
// In java achieved using: wait(), notify(), notifyAll()
// These methods belong to the Object class and are used inside synchronized blocks or methods.
// When multiple threads work on a shared resource: One thread may need to wait until some condition becomes true
//Another thread notifies when that condition is fulfilled. This avoids busy waiting and improves efficiency.
// Example: Producer must wait if the buffer is full, Consumer must wait if the buffer is empty.

//Producer produces data and Consumer consumes data
//They coordinate so: Producer waits if data is already produced and Consumer waits if data is not yet produced


// -------------------------------------------------------------------------------------------------------------------------------------

//🔹 wait()
//wait() is called on an object
//It must be used inside a synchronized block or method
//When a thread calls wait():
//The thread stops running
//It releases the lock on that object
//It goes into waiting state
//The thread will stay waiting until another thread calls notify() or notifyAll() on the same object
//👉 In short:
//wait() = “I will pause and wait until someone wakes me up.”
//🔹 notify()
//notify() is also called on an object
//It must be used inside a synchronized block or method
//When a thread calls notify():
//It wakes up one waiting thread
//Which thread wakes up is not decided by us
//The decision is made by the JVM
//👉 In short:
//notify() = “Wake up one waiting thread.”
//🔹 notifyAll()
//notifyAll() is called on an object
//It must be used inside a synchronized block or method
//When a thread calls notifyAll():
//It wakes up all threads that are waiting on that object
//All waiting threads move from WAITING → RUNNABLE
//Only one thread gets the lock at a time (others wait again)
//Which thread runs first is decided by the JVM / thread scheduler
//👉 In short:
//notifyAll() = “Wake up all waiting threads.”

//---------------------------------------------------------------------------------------------------------------
//Methods That Acquire and Release Locks in Java Multithreading
//1. synchronized methods
//2. synchronized blocks
//3. Implicit lock methods (must be called inside synchronized context): wait(), notify(), notifyAll()
//
//Methods That RELEASE Locks
//1. wait()
//2. wait(long timeout)
//3. wait(long timeout, int nanos)
//4. Exiting synchronized block/method: Lock is released when execution exits the synchronized scope
//5. Exception in synchronized block: Lock is released even if exception is thrown
//
//Methods That DO NOT Release Locks
//1. sleep(): Thread sleeps but holds the lock, Other threads cannot access synchronized code
//2. yield(): Gives CPU to other threads but keeps the lock
//3. join(): Waits for another thread but doesn't release current lock
//4. notify() / notifyAll(): Wakes up waiting threads but keeps the lock, Lock is released only when synchronized block exits

//---------------------------------------------------------------------------------------------------------------

