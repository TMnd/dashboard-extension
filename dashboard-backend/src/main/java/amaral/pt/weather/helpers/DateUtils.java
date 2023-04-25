package amaral.pt.weather.helpers;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateUtils {

    public static String getWeekDayByDate(String inputDate) {
        LocalDate date = LocalDate.parse(inputDate);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.name();
    }
}
