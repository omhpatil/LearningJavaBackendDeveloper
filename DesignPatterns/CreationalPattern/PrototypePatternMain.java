package DesignPatterns.CreationalPattern;

// PrototypePatternDemo.java
public class PrototypePatternMain {

    /* =========================
       PROTOTYPE INTERFACE
       ========================= */
    interface Prototype<T> {
        T clone();
    }

    /* =========================
       CONCRETE PROTOTYPE
       ========================= */
    static class Employee implements Prototype<Employee> {

        private String name;
        private String department;
        private Address address; // reference type

        public Employee(String name, String department, Address address) {
            this.name = name;
            this.department = department;
            this.address = address;
        }

        // Deep copy implementation
        @Override
        public Employee clone() {
            Address clonedAddress =
                    new Address(address.city, address.pincode);
            return new Employee(name, department, clonedAddress);
        }

        public void setName(String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", address=" + address +
                    '}';
        }
    }

    /* =========================
       SUPPORTING CLASS
       ========================= */
    static class Address {
        private String city;
        private int pincode;

        public Address(String city, int pincode) {
            this.city = city;
            this.pincode = pincode;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", pincode=" + pincode +
                    '}';
        }
    }

    /* =========================
       MAIN METHOD
       ========================= */
    public static void main(String[] args) {

        // Original object
        Employee original = new Employee(
                "Om",
                "IT",
                new Address("Pune", 411001)
        );

        // Clone object
        Employee clone = original.clone();

        // Modify clone
        clone.setName("Rahul");
        clone.getAddress().city = "Mumbai";

        // Print both
        System.out.println("Original Employee: " + original);
        System.out.println("Cloned Employee:   " + clone);
    }
}
