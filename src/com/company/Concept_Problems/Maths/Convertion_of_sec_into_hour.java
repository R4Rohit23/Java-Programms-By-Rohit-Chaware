package com.company.Concept_Problems.Maths;
import java.util.Scanner;

public class Convertion_of_sec_into_hour {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the second:");
        int second = scan.nextInt();
        int hr=second/3600;  //First convert sec into min and then into hr
        int sec=second%60;   //
        int min=sec%60;
        System.out.println(hr+":"+min+":"+sec);

    }
}
