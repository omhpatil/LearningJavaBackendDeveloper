// Defines the skeleton of an algorithm in a method, but lets subclasses fill in the steps.
// Common steps are in the parent class, and subclasses override only the parts they need.



package DesignPatterns.BehavioralPattern;

// Step 1: Abstract class with template method
abstract class Game {
    // Template method
    public final void play() {
        start();
        playGame();
        end();
    }

    abstract void start();
    abstract void playGame();
    abstract void end();
}

// Step 2: Concrete classes
class Football extends Game {
    void start() { System.out.println("Football Game Started"); }
    void playGame() { System.out.println("Playing Football"); }
    void end() { System.out.println("Football Game Ended"); }
}

class Cricket extends Game {
    void start() { System.out.println("Cricket Game Started"); }
    void playGame() { System.out.println("Playing Cricket"); }
    void end() { System.out.println("Cricket Game Ended"); }
}

// Step 3: Client code
public class TemplateMethodMain {
    public static void main(String[] args) {
        Game g1 = new Football();
        g1.play();

        System.out.println("---");

        Game g2 = new Cricket();
        g2.play();
    }
}
