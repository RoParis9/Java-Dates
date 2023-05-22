import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class LearningDates {
    public static void main(String[] args) {
        simpleDateFormat();
        timeZoneExample();
        LocalDate();
        Instant();
    }

    public static void simpleDateFormat() {
        Calendar calendar = new GregorianCalendar(2013, 0, 28, 13, 24, 56);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        System.out.println(sdf.format(calendar.getTime()));

        sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss", Locale.US);
        System.out.println(sdf.format(calendar.getTime()));
    }

    public static void timeZoneExample() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss a");
        sdf.setTimeZone(TimeZone.getTimeZone("America/Sao_Paulo"));
        Date date = new Date(1090215021581L);
        System.out.println(sdf.format(date));
    }

    public static void LocalDate() {

        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);
    }

    public static void Instant() {
        Instant rightNow = Instant.now();
        System.out.println(rightNow);
    }

}
