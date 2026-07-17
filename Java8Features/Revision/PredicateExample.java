package Java8Features.Revision;

import java.util.function.Predicate;

public class PredicateExample {

    // program to write name starts with 'A'

    public static void main(String[] args) {

        String[] names = {"Om", "Anushka", "Ajay", "Atul"};

        Predicate<String> p = name -> name.charAt(0) == 'A';

        for (String name : names) {
            if (p.test(name)) {
                System.out.println(name);
            }
        }
    }
}
