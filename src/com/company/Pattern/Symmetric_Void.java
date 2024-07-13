package com.company.Pattern;

//        ************
//        *****  *****
//        ****    ****
//        ***      ***
//        **        **
//        *          *
//        *          *
//        **        **
//        ***      ***
//        ****    ****
//        *****  *****
//        ************

public class Symmetric_Void {
    public static void printVoid(int N) {
        int intSpc = 0;
        for (int i = 0; i < N; i++) {
            // Print star
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < intSpc; k++) {
                System.out.print(" ");
            }
            for (int m = 0; m < N - i; m++) {
                System.out.print("*");
            }
            intSpc += 2;
            System.out.println();
        }

        intSpc = 2 * ( N - 1);

        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < intSpc; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }
            intSpc -= 2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printVoid(6);
    }
}
