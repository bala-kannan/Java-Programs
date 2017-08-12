import java.time.*;

class DateTimeTest {

public static void main (String[] args) {

LocalDate now = LocalDate.now();

final DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

System.out.println(now.format(dtf));

 }
}