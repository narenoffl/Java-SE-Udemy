import java.util.*;
import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

public class JodaAPIDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        //LocalDate dt = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        //LocalDate dt = LocalDate.of(2020,Month.MARCH,07);
        //LocalDate dt = LocalDate.ofEpochDay(1000);
        LocalDate dt = LocalDate.parse("2020-01-03");
        LocalDate dt1 = dt.plusMonths(6);
        System.out.println("LocalDate " + dt1);

        LocalTime lte = LocalTime.now();
        System.out.println(lte);

        ZonedDateTime ldt = ZonedDateTime.now();
        System.out.println(ldt);

        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt.toZonedDateTime());

        Period p = Period.of(2, 2, 10);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i = Instant.now();
        System.out.println(i);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/YYYY hh:mm:ss z");
        System.out.println(df.format(ldt));

        LocalDateTime ldt2 = LocalDateTime.now();
        System.out.println(ldt2.get(ChronoField.CLOCK_HOUR_OF_DAY));


    }
}
