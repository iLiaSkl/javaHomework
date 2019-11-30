
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Main {
    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1997, 6, 13);
        LocalDate today = LocalDate.now();


        int i = 0;

        while (today.isAfter(birthday))
        {
            String formattedDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(birthday);
            birthday = birthday.plusYears(1);
            System.out.println(i + " " + formattedDate);
            i++;
        }
    }
}
