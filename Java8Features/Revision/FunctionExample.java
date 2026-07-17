package Java8Features.Revision;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> f = name -> name.length();

        System.out.println(f.apply("Om"));
        System.out.println(f.apply("Adi"));
        System.out.println(f.apply("Shiv"));

    }
}
