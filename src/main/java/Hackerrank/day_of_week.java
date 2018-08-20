package Hackerrank;

import checkers.units.quals.C;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class day_of_week {

    public static String getDay(String DD, String MM, String YYYY) throws ParseException {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date date = df.parse(DD + "/" + MM +  "/" + YYYY);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();

    }
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}





