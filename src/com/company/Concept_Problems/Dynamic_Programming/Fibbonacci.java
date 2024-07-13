package com.company.Concept_Problems.Dynamic_Programming;

import java.util.*;

public class Fibbonacci {
    // this is classic problem to demonstrate the DP

    // we are using Dp's bottom-up approach here
    public static int fib(int n) {
        if (n < 2) return n;
        
        // DP in simple term is storing the result of previous sub-problem
        int[] ans = new int[n + 1];

        // storing the independent values in array
        ans[0] = 0;
        ans[1] = 1;

        // using bottom-up approach
        for (int i = 2; i <= n; i++) {
            ans[i] = ans[i-1] + ans[i-2];
        }
        return ans[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.println(fib(n));
    }
}
