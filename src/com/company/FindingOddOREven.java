package com.company;
import java.util.Scanner;

public class FindingOddOREven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num =scan.nextInt();

        if (num%2==0){
            System.out.println("The entered number is even number");
        }
        else {
            System.out.println("The entered number is odd number");
        }

    }
}
