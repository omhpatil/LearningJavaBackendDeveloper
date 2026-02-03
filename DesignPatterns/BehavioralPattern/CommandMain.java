// Turns a request (action) into a command object, so you can pass it, queue it, or undo it later.
// It decouples the object that sends a request from the one that actually executes it.


package DesignPatterns.BehavioralPattern;

// Step 1: Command interface
interface Command {
    void execute();
}

// Step 2: Receiver (actual work)
class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Step 3: Concrete commands
class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}

// Step 4: Invoker
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

// Step 5: Client code
public class CommandMain {
    public static void main(String[] args) {
        Light light = new Light();

        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(on);
        remote.pressButton();  // Output: Light is ON

        remote.setCommand(off);
        remote.pressButton();  // Output: Light is OFF
    }
}
