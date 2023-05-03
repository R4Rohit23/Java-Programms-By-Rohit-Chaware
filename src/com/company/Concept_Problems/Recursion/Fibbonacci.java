package com.company.Concept_Problems.Recursion;

import java.util.*;

public class Fibbonacci {
    public static void fib(int one, int two, int n) {
        // base case
        if (n == 0) {
            return;
        }
        System.out.print(one + " ");

        // our next term is made of sum of previous two terms
        fib(two, one + two, n - 1);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        fib(0, 1, n);
    }
}
