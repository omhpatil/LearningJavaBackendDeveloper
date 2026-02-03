// Provides a way to access elements of a collection one by one without exposing the collection’s internal structure.
// It gives a standard way to loop through objects.


package DesignPatterns.BehavioralPattern;

// Step 1: Iterator interface
interface Iterator {
    boolean hasNext();
    Object next();
}

// Step 2: Collection interface
interface Container {
    Iterator getIterator();
}

// Step 3: Concrete collection
class NameRepository implements Container {
    private String[] names = {"John", "Alice", "Bob"};

    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index = 0;

        public boolean hasNext() {
            return index < names.length;
        }

        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}

// Step 4: Client code
public class IteratorMain {
    public static void main(String[] args) {
        NameRepository repo = new NameRepository();

        Iterator it = repo.getIterator();
        while (it.hasNext()) {
            System.out.println("Name: " + it.next());
        }
    }
}
