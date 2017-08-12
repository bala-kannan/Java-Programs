import java.time.*;

class DateTime {

public static void main (String[] args) {

LocalDate date = LocalDate.of(2016, Month.FEBRUARY, 29);
LocalTime time = LocalTime.of(15, 30, 20);
LocalDateTime dateTime = LocalDateTime.of(date, time);

System.out.println("date = " + date + "time = " + time + "Date Time = " + dateTime);

date = date.plusYears(1);
System.out.println(date);
dateTime = dateTime.minusHours(12).minusMinutes(20).
minusSeconds(12);


 }
}