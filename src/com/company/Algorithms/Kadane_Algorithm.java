package com.company.Algorithms;

// ❔ Problem Statement

// Given an array of N integers a1,a2,a3,....., aN find the maximum subarray(non-empty) sum of the given array.

// 💡 Kadane’s Algorithm

// The idea of Kadane’s algorithm is to maintain a maximum subarray sum ending at every index ‘i’ of the given array and update the maximum sum obtained by comparing it with the maximum sum of the subarray ending at every index ‘i’.


public class Kadane_Algorithm {

    public static int kadaneAlgorithm(int[] arr) {
        int currSum = 0;
        int maxSum = 0;

        for (int j : arr) {
            currSum = Math.max(0, currSum + j);
            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 4, 2, 0, -6, -1};
        System.out.println(kadaneAlgorithm(arr));
    }
}
