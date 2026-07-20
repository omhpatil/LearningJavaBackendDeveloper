package Java8Features;

import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner skills =
                new StringJoiner(", ", "[", "]");

        skills.add("Java");
        skills.add("Spring Boot");
        skills.add("Microservices");
        skills.add("Kafka");

        System.out.println(skills);


        System.out.println("Length : " + skills.length());

        StringJoiner databases =
                new StringJoiner(", ");

        databases.add("MySQL");
        databases.add("MongoDB");

        skills.merge(databases);

        System.out.println(skills);

        StringJoiner empty =
                new StringJoiner(", ");

        empty.setEmptyValue("No Skills");

        System.out.println(empty);
    }
}