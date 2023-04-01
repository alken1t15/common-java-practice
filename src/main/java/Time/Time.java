package Time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Time {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(dateTimeFormatter.format(localDateTime));
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMMM, dd, hh:mm");
        System.out.println(dateTimeFormatter1.format(localDateTime));
    }
}