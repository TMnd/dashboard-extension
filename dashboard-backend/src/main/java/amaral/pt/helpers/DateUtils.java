package amaral.pt.helpers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateUtils {

    public static String getWeekDayByDate(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.name();
    }
}
