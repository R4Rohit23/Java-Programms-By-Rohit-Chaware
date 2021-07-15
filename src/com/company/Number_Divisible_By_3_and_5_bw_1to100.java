package com.company;

public class Number_Divisible_By_3_and_5_bw_1to100 {
    public static void main(String[] args) {
        int num = 0;

        //For number divisible by 3
        System.out.println("\nNumber divible by 3 are:");
        for (num = 0; num <= 100; num++) {
            if (num % 3 == 0) {
                System.out.print(num+",");
            }
        }

        //For number divisible by 5
        System.out.println("\n\nNumber divisible by 5 are:");
        for (num = 0; num <= 100; num++) {
            if (num % 5 == 0) {
                System.out.print(num+",");
            }
        }

        //For number divisible by 3 and 5 are
        System.out.println("\n\nNumbers Divisible by 3 and 5 are:");
        for (num = 0; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print(num+",");
            }
        }
    }
}

