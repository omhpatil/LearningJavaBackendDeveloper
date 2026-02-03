// A proxy is like a substitute for another object.
// It controls access to the real object (for logging, security, lazy loading, etc.).


package StructuralPattern;

// Step 1: Subject interface
interface Image {
    void display();
}

// Step 2: Real object
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(); // heavy operation
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

// Step 3: Proxy object
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) { // create only when needed
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}

// Step 4: Client code
public class ProxyMain {
    public static void main(String[] args) {
        Image img = new ProxyImage("photo.png");

        // image will be loaded only when display is called
        img.display();
        System.out.println("---");
        img.display();  // second time, no loading
    }
}
