// Helps to create complex objects step by step instead of using a constructor with too many parameters.


package DesignPatterns.CreationalPattern;

// Product class
class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    public void showSpecs() {
        System.out.println("CPU: " + CPU + ", RAM: " + RAM + ", Storage: " + storage);
    }

    // Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// Client code
public class BuilderMain {
    public static void main(String[] args) {
        Computer pc = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .build();

        pc.showSpecs();
        // Output: CPU: Intel i9, RAM: 32GB, Storage: 1TB SSD
    }
}
