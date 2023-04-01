package com.company.Concept_Problems.Maths;
import java.util.Scanner;

public class SomeOfDigitOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = scan.nextInt();
        System.out.println("The sum of the digit is:" + sumDigit(num));

    }
    //we are going to make another function
    public static int sumDigit(int num){
        int sum=0;
        while (num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;

    }
}
