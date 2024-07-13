package com.company.Pattern;

//        *          *
//        **        **
//        ***      ***
//        ****    ****
//        *****  *****
//        ************
//        *****  *****
//        ****    ****
//        ***      ***
//        **        **
//        *          *

public class Symmetric_Butterfly {
    public static void printPattern(int N) {
        int intSpc = 2 * (N - 1);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < intSpc; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            intSpc -= 2;
            System.out.println();
        }

        intSpc = 2;
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < intSpc; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            intSpc += 2;
            System.out.println();

        }
    }
    public static void main(String[] args) {
        printPattern(6);
    }
}
