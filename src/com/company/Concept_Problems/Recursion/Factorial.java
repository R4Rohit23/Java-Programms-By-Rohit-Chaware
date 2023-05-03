package com.company.Concept_Problems.Recursion;

import java.util.Scanner;

// this is a classic example of recursion
public class Factorial {
    public static int factorial(int num) {
        // every recursive function have base case
        // it is a case where our recursion ends
        if (num <= 1) return 1;

        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));
    }
}
