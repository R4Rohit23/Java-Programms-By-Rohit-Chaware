package com.company.Concept_Problems.Maths;
import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        //For getting input from the keyboard
        Scanner scan =new Scanner(System.in);
        //This will print the given statement
        System.out.println("Enter the marks of 5 subjects:");
        //Here we have get value for 5 subjects
        float SM1= scan.nextInt();
        float SM2= scan.nextInt();
        float SM3= scan.nextInt();
        float SM4= scan.nextInt();
        float SM5= scan.nextInt();
        float sum=SM1+SM2+SM3+SM4+SM5;
        System.out.println("The total marks you have gain out of 500 are:"+sum);
        float per=(sum/500)*100;
        System.out.println("The percentage you have gain is:"+per);





    }
}
