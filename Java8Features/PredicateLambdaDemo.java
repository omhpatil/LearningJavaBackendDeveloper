package Java8Features;

import java.util.function.Predicate;

public class PredicateLambdaDemo {
    public static void main(String[] args) {

        // Check the number is even or not using lambda expression
        Predicate<Integer> isEven = (num) -> num % 2 == 0;
        System.out.println(isEven.test(6));
        System.out.println(isEven.test(7));

        // Print the names from the array starts with given character
        String[] arr = {"Om", "Jay", "Jagdish"};
        Predicate<String> str = (name) -> name.charAt(0) == 'O';
        for (String s : arr) {
            if (str.test(s)) {
                System.out.println(s);
            }
        }
    }
}
