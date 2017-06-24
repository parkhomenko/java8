package datetime;

import java.time.*;

public class Periods {

    public static void main(String[] args) {
        Period p = Period.between(LocalDate.now(), LocalDate.of(2017, Month.JUNE, 10));
        System.out.println(p);

        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2017, Month.JUNE, 11, 18, 15));
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.of(2017, Month.JUNE, 11, 18, 15));
        System.out.println(d);

        LocalDateTime ldt = LocalDateTime.of(2017, 12, 02, 6, 0, 0);
        ZonedDateTime nyZdt = ldt.atZone(ZoneId.of("Europe/London"));
        ZonedDateTime laZdt = ldt.atZone(ZoneId.of("America/New_York"));
        Duration duration = Duration.between(nyZdt, laZdt);
        System.out.println(nyZdt);
        System.out.println(laZdt);
        System.out.println(duration);
    }
}
