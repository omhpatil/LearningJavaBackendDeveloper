package Java8Features.Revision;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> bf = (a, b) -> a + b;

        System.out.println(bf.apply(10, 20));
        System.out.println(bf.apply(30, 20));
        System.out.println(bf.apply(40, 20));

    }
}
