import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DateFormat;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {


        DateFormat dateFormat = new SimpleDateFormat("- dd.MM.yyyy - EEE");
        Calendar calendar = Calendar.getInstance();
        calendar.set(1997, Calendar.JUNE, 13);
        Date date = new Date();
        Date your = calendar.getTime();
        int i = 0;

        while (date.compareTo(your) > 0)
        {
            System.out.println(i + dateFormat.format(your));
            calendar.add(Calendar.YEAR, 1);
            your = calendar.getTime();
            i++;
        }
    }
}
