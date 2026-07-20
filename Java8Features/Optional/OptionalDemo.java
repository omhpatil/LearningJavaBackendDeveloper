package Java8Features.Optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        // ============================
        // 1. Optional.of()
        // ============================

        Employee emp1 = new Employee(1L, "Om", 70000);

        Optional<Employee> optional1 = Optional.of(emp1);

        System.out.println("Optional.of(): " + optional1);


        // ============================
        // 2. Optional.ofNullable()
        // ============================

        Employee emp2 = null;

        Optional<Employee> optional2 = Optional.ofNullable(emp2);

        System.out.println("Optional.ofNullable(): " + optional2);


        // ============================
        // 3. Optional.empty()
        // ============================

        Optional<Employee> optional3 = Optional.empty();

        System.out.println("Optional.empty(): " + optional3);


        // ============================
        // 4. isPresent()
        // ============================

        System.out.println("\nisPresent()");

        if (optional1.isPresent()) {
            System.out.println("Employee Found");
        }

        if (optional3.isPresent()) {
            System.out.println("Employee Found");
        } else {
            System.out.println("Employee Not Found");
        }


        // ============================
        // 5. ifPresent()
        // ============================

        System.out.println("\nifPresent()");

        optional1.ifPresent(System.out::println);


        // ============================
        // 6. get()
        // ============================

        System.out.println("\nget()");

        Employee employee = optional1.get();

        System.out.println(employee);


        // ============================
        // 7. map()
        // ============================

        System.out.println("\nmap()");

        Optional<String> employeeName =
                optional1.map(Employee::getName);

        System.out.println(employeeName);


        // ============================
        // 8. filter()
        // ============================

        System.out.println("\nfilter()");

        Optional<Employee> filteredEmployee =
                optional1.filter(emp -> emp.getSalary() > 50000);

        System.out.println(filteredEmployee);

        Optional<Employee> filteredEmployee2 =
                optional1.filter(emp -> emp.getSalary() > 100000);

        System.out.println(filteredEmployee2);


        // ============================
        // 9. orElse()
        // ============================

        System.out.println("\norElse()");

        Employee employee1 =
                optional3.orElse(
                        new Employee(0L, "Guest", 0));

        System.out.println(employee1);


        // ============================
        // 10. orElseGet()
        // ============================

        System.out.println("\norElseGet()");

        Employee employee2 =
                optional3.orElseGet(() ->
                        new Employee(100L, "Default User", 1000));

        System.out.println(employee2);


        // ============================
        // 11. orElseThrow()
        // ============================

        System.out.println("\norElseThrow()");

        Employee employee3 =
                optional1.orElseThrow(() ->
                        new RuntimeException("Employee Not Found"));

        System.out.println(employee3);

        /*
         Uncomment this to see Exception

        Employee employee4 =
                optional3.orElseThrow(() ->
                        new RuntimeException("Employee Not Found"));

        System.out.println(employee4);

        */


        // ============================
        // 12. Chaining Example
        // ============================

        System.out.println("\nMethod Chaining");

        String result = optional1
                .filter(emp -> emp.getSalary() > 50000)
                .map(Employee::getName)
                .orElse("Guest");

        System.out.println(result);

    }

}