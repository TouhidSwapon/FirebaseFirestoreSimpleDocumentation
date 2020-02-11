package com.mtl.qrapp.Utills;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateUtills {

    public static Date addDays(Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, days); //minus number would decrement the days
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        return cal.getTime();
    }

    //convert string to date
    public static Date stringToDate(String strDate, String existingFormat) {
        Date date = null;
        try {
            date = new SimpleDateFormat(existingFormat, Locale.US).parse(strDate);
            System.out.println(strDate + "\t" + date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }


    public static String dateToString(Date date, String myDesiredFormat) {

        SimpleDateFormat sdf = new SimpleDateFormat(myDesiredFormat);

        return sdf.format(date);
    }

    public static String strToString(String date, String myDesiredFormat) {

        DateFormat to = new SimpleDateFormat(myDesiredFormat);
        DateFormat from = new SimpleDateFormat("yyyy-MM-dd");
        String strDateTime = null;
        try {
            strDateTime = from.format(to.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return strDateTime;
    }


    static Date getCurrentTimeAndDate(Date date) {

        // convert date to string first with desired format
        SimpleDateFormat formatter = new SimpleDateFormat("please add your desired format here", Locale.US);
        String strDate = formatter.format(date);

        //now convert this string again to date format
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("please add your desired format here", Locale.US).parse(strDate);
            System.out.println(strDate + "\t" + date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }

    public static long strToMillis(String traceTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // Month.Day.Year

        Date d = null;
        try {
            d = formatter.parse(traceTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d.getTime();
    }


    public static String getDate(long milliSeconds, String dateFormat) {
        // Create a DateFormatter object for displaying date in specified format.
        SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);

        // Create a calendar object that will convert the date and time value in milliseconds to date.
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return formatter.format(calendar.getTime());
    }


    public static String convertMillisToDateString(String callDate) {

        //convert milliseconds to date string
        SimpleDateFormat formatter1 = new SimpleDateFormat("yyyyMMdd");
        //formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String dateString = formatter1.format(new Date(Long.parseLong(callDate)));

        //Log.d(TAG, "dateString: " + dateString);

        return dateString;
    }


    public static String convertMillisToTimeString(String callDate) {


        //Log.d(TAG, "dateString: " + dateString);

        //convert milliseconds to time string
        SimpleDateFormat formatter2 = new SimpleDateFormat("HHmmss");
        //formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String timeString = formatter2.format(new Date(Long.parseLong(callDate)));

        return timeString;
    }

}
