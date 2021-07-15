package com.company;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import  java.util.TimeZone;

public class DisplayingTime {
    public static void main(String[] args) {
        System.out.print("Date and Time in String Format is:");
        System.out.format(" %tc%n",System.currentTimeMillis());

        SimpleDateFormat cdt =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
        System.out.println("Date and Time in Numerical Format is:" +cdt.format(System.currentTimeMillis()));
    }
}
