package com.company.Pattern;

//        ******
//        *    *
//        *    *
//        *    *
//        *    *
//        ******

public class Hollow_Rectangle {
    public static void printRectangle(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ( i == 0 || j == 0 || i == N - 1 || j == N - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printRectangle(6);
    }
}
