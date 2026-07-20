package Java8Features;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Java8DateTimeDemo {

    public static void main(String[] args) {

        // 1. LocalDate (Date Only)

        System.out.println("===== LocalDate =====");

        LocalDate today = LocalDate.now();

        System.out.println("Current Date      : " + today);
        System.out.println("Year              : " + today.getYear());
        System.out.println("Month             : " + today.getMonth());
        System.out.println("Day               : " + today.getDayOfMonth());

        LocalDate futureDate = today.plusDays(10);
        LocalDate previousDate = today.minusMonths(1);

        System.out.println("Future Date       : " + futureDate);
        System.out.println("Previous Date     : " + previousDate);


        // 2. LocalTime (Time Only)

        System.out.println("\n===== LocalTime =====");

        LocalTime currentTime = LocalTime.now();

        System.out.println("Current Time      : " + currentTime);
        System.out.println("Hour              : " + currentTime.getHour());
        System.out.println("Minute            : " + currentTime.getMinute());
        System.out.println("Second            : " + currentTime.getSecond());

        System.out.println("After 2 Hours     : " + currentTime.plusHours(2));


        // 3. LocalDateTime (Date + Time)

        System.out.println("\n===== LocalDateTime =====");

        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Current DateTime  : " + currentDateTime);
        System.out.println("Tomorrow          : " + currentDateTime.plusDays(1));
        System.out.println("Yesterday         : " + currentDateTime.minusDays(1));


        // 4. DateTimeFormatter

        System.out.println("\n===== DateTimeFormatter =====");

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = currentDateTime.format(formatter);

        System.out.println("Formatted Date    : " + formattedDate);

        LocalDate parsedDate =
                LocalDate.parse("20-07-2026",
                        DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        System.out.println("Parsed Date       : " + parsedDate);


        // 5. Period (Date Difference)

        System.out.println("\n===== Period =====");

        LocalDate birthDate = LocalDate.of(2002, 5, 10);

        Period age = Period.between(birthDate, today);

        System.out.println("Years             : " + age.getYears());
        System.out.println("Months            : " + age.getMonths());
        System.out.println("Days              : " + age.getDays());


        // 6. Duration (Time Difference)

        System.out.println("\n===== Duration =====");

        LocalTime startTime = LocalTime.of(10, 30);

        LocalTime endTime = LocalTime.of(15, 45);

        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Hours             : " + duration.toHours());
        System.out.println("Minutes           : " + duration.toMinutes());


        // 7. Instant (Machine Timestamp)

        System.out.println("\n===== Instant =====");

        Instant instant = Instant.now();

        System.out.println("Current Instant   : " + instant);

        System.out.println("Epoch Seconds     : " + instant.getEpochSecond());


        // 8. ZoneId

        System.out.println("\n===== ZoneId =====");

        ZoneId india = ZoneId.of("Asia/Kolkata");

        ZoneId london = ZoneId.of("Europe/London");

        System.out.println("India Zone        : " + india);

        System.out.println("London Zone       : " + london);


        // 9. ZonedDateTime

        System.out.println("\n===== ZonedDateTime =====");

        ZonedDateTime indiaTime =
                ZonedDateTime.now(india);

        ZonedDateTime londonTime =
                ZonedDateTime.now(london);

        System.out.println("India Time        : " + indiaTime);

        System.out.println("London Time       : " + londonTime);


        // 10. OffsetDateTime

        System.out.println("\n===== OffsetDateTime =====");

        OffsetDateTime offsetDateTime =
                OffsetDateTime.now();

        System.out.println("Offset Date Time  : " + offsetDateTime);

        System.out.println("Offset            : " + offsetDateTime.getOffset());

    }
}
