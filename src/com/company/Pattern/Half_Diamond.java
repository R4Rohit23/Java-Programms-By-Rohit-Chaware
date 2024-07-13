package com.company.Pattern;

//        *
//        **
//        ***
//        **
//        *

public class Half_Diamond {
    public static void printDiamondSolution1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printDiamondSolution2(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
            int stars = i;

            if (i > n) stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printDiamondSolution2(3);
    }
}
