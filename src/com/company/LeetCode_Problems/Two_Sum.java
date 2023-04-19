package com.company.LeetCode_Problems;
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
// target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

import java.util.*;

public class Two_Sum {
    public static int[] twoSum(int[] arr, int target) {
        // this classic leetcode problem is solved using Map data structure
        // Here we use map to store the key as arr elements and value as their indexes
        Map<Integer, Integer> map = new HashMap<>();

        // While we are iterating and inserting elements into the hash table, we also look back to check if current
        // element's complement already exists in the hash table. If it exists, we have found a solution and return the indices immediately.
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int complement = target - curr;

            // if our complement is exists in the map then we just return the index of complement and current element
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }
            map.put(curr, i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] ans = twoSum(arr, 6);
        System.out.println("The indexes are: ");
        System.out.print(ans[0] + " " + ans[1]);
    }
}
