package com.company.Pattern;

//Input Format: N = 6
//        1          1
//        12        21
//        12       321
//        1234    4321
//        12345  54321
//        123456654321

public class Number_Crown {
    public static void printCrown(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            for (int k = 0; k < 2 * (N - i - 1); k++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 0; l--) {
                System.out.print(l + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printCrown(6);
    }
}
