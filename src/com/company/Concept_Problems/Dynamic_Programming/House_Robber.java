package com.company.Concept_Problems.Dynamic_Programming;
//  You are a professional robber planning to rob houses along a street. Each house has a certain amount of money
//  stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security
//  systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the maximum amount of money you
// can rob tonight without alerting the police.

import java.lang.*;
public class House_Robber {
    /* the order is: prev2, prev1, num  */
    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        int prev1 = 0;
        int prev2 = 0;
        for (int num : nums) {
            int tmp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = tmp;
        }
        return prev1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }
}
