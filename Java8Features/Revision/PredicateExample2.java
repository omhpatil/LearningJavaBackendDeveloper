package Java8Features.Revision;

import java.util.function.Predicate;

public class PredicateExample2 {

    public static void main(String[] args) {

        Predicate<Integer> p = num -> num > 10;
        System.out.println(p.test(5));
        System.out.println(p.test(10));
        System.out.println(p.test(15));

    }
}
