// Given a time in -hour AM/PM format, convert it to military (24-hour) time.
package com.company.Concept_Problems.Implementation;

import java.util.Scanner;

public class Time_Conversion {

    public static void convertTime(String time) {
        // Converting the String Into Integer with the help of ASCII value
        int hour = (time.charAt(0) - '0') * 10 + (time.charAt(1) - '0');
        int min = (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
        int sec = (time.charAt(6) - '0') * 10 + (time.charAt(7) - '0');

//        12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
        if ((hour == 12) && time.charAt(8) == 'A') hour = 0;

        if ((hour < 12) && time.charAt((8)) == 'P') hour += 12;

        System.out.println(hour + ":" + min + ":" + sec);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Time is in the form of hh:mm:ssAM/PM
        String time = scan.nextLine();
        convertTime(time);
    }
}
