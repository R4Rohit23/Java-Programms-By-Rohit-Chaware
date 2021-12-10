package com.company.Tutorials;

import java.time.LocalDate; // for getting only date
import java.time.LocalTime; // for getting only time
import java.time.LocalDateTime; // to get both
import java.time.format.DateTimeFormatter; // to format them

public class Date_And_Time {

    public static void main(String[] args) {

        // We are going to get the date and time

        // now() is use to get current date
        LocalDate date = LocalDate.now();
        System.out.println("Today's Date is " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Time now is " + time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Current date and time is " + datetime);

        // to format date and time in given format by using ofPattern() method
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        // to format datetime object in given formatter pattern
        String formatDate = datetime.format(formatter);
        System.out.println(formatDate);

    }



}
