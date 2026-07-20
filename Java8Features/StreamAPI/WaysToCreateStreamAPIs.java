package Java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysToCreateStreamAPIs {
    public static void main(String[] args) {

        // 1. Using Collection
        List<Integer> stream1 = List.of(1, 2, 3, 4, 5);
        // The "standard" output stream. This stream is already open and ready to accept output data.
        stream1.stream()
                .forEach(System.out::println);

        List<String> stream2 = List.of("Om", "Jay", "Jagdish");
        stream2.stream()
                .forEach(System.out::println);

        // 2. Using Array
        int[] numbers = {11, 22, 33, 44, 55};

        Arrays.stream(numbers)
                .forEach(System.out::println);

        // 3. Using Stream Of
        Stream<String> stream3 = Stream.of("Java", "Spring", "Kafka");

        stream3.forEach(System.out::println);

        // 4. Using String Builder
        Stream<String> stream4 = Stream.<String>builder()
                .add("EC2")
                .add("S3")
                .add("RDS")
                .build();

        stream4.forEach(System.out::println);

        // 5. Stream.generate()
        Stream.generate(() -> "Java")
                .limit(5)
                .forEach(System.out::println);

        // 6. Stream.iterate()
        Stream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(System.out::println);

    }
}
