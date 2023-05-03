package com.company.Concept_Problems.Dynamic_Programming;

import java.util.*;

// You are climbing a staircase. It takes n steps to reach the top.
//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
public class Climbing_Stairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // this is a classic fibbonacci series problem
        int n = scan.nextInt();

        // type of steps
        int one = 1, two = 1;

        // ignore the first 2 terms
        n = n - 2;

        while (n >= 0) {
            int temp = one;
            one = one + two;
            two = temp;
            n--;
        }
        System.out.println("Total number of different steps: " + one);
    }
}
