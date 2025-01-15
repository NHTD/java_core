package java_core_7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        // get date-time using a calender class
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Calendar cld = Calendar.getInstance();
        Date d = cld.getTime();
        String strCld = sdf.format(d);
        System.out.println(strCld);

        // get date-time from date class
        Date date = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss a");
        String hms1 = sdf2.format(date);
        String hms2 = sdf3.format(date);
        System.out.println(hms1);
        System.out.println(hms2);
    }
}
