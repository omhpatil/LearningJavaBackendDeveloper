package Java8Features;

import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {

        List<String> names = List.of("Om", "Adi", "Shiv");
        names.forEach(name -> System.out.println(name));

    }
}
