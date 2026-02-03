// Provides a simple interface to a complex system.
// Hides the system’s complexity and makes it easier for the client to use.


package StructuralPattern;

// Step 1: Complex subsystems
class CPU {
    void start() { System.out.println("CPU started"); }
}
class Memory {
    void load() { System.out.println("Memory loaded"); }
}
class HardDrive {
    void read() { System.out.println("Hard Drive read"); }
}

// Step 2: Facade class
class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hd = new HardDrive();

    public void startComputer() {
        cpu.start();
        memory.load();
        hd.read();
        System.out.println("Computer started successfully!");
    }
}

// Step 3: Client code
public class FacadeMain {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
