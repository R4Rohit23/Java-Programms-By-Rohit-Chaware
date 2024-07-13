package com.company.Pattern;

//        1
//        01
//        101
//        0101
//        10101
//        010101

public class Binary_Number_Triangle {
    public static void printTriangle(int N) {
        for (int i = 1; i <= N; i++) {
            int startDigit = i % 2 == 0 ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                // if 1st index is 1 => even index is 0 and odd index is 1 and vice versa
                System.out.print(startDigit);
                startDigit = 1 - startDigit;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(6);
    }
}
