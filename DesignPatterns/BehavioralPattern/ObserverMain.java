// When one object (called Subject) changes, it automatically notifies all dependent objects (Observers).
// Used for publish–subscribe scenarios (e.g., notifications, event handling).


package DesignPatterns.BehavioralPattern;

// Step 1: Subject class
import java.util.ArrayList;
import java.util.List;

// Step 2: Observer interface
interface Observer {
    void update(String message);
}


class NewsAgency {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) { observers.add(o); }
    public void removeObserver(Observer o) { observers.remove(o); }

    public void notifyObservers(String news) {
        for (Observer o : observers) {
            o.update(news);
        }
    }
}

// Step 3: Concrete observers
class Subscriber implements Observer {
    private String name;
    public Subscriber(String name) { this.name = name; }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

// Step 4: Client code
public class ObserverMain {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");

        agency.addObserver(sub1);
        agency.addObserver(sub2);

        agency.notifyObservers("Breaking News: Observer Pattern Simplified!");
    }
}
