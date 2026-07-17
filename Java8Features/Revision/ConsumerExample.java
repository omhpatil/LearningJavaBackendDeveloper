package Java8Features.Revision;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> ss = name -> System.out.println(name + ", Good Morning");

        ss.accept("Om");
        ss.accept("Adi");
        ss.accept("Shiv");

    }
}
