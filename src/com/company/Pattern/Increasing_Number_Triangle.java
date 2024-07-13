package com.company.Pattern;

//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//        16 17 18 19 20 21

public class Increasing_Number_Triangle {
    public static void printTriangle(int N) {
        int num = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printTriangle(6);
    }
}
