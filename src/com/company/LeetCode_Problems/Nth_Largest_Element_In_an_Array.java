package com.company.LeetCode_Problems;
// Given an integer array nums, return the Nth distinct maximum number in this array. If the Nth maximum does not exist,
// return the maximum number.

import java.util.TreeSet;

public class Nth_Largest_Element_In_an_Array {
    public static int findThirdLargest(int[] nums, int n) {
        // To solve this problem we use set data structure here
        // set stores only unique elements
        // it also stores the elements in sorted order

        // Initialization
        TreeSet<Integer> uniqueEle = new TreeSet<>();

        for (int num: nums) {
            // if repeated element occurred
            if (uniqueEle.contains(num))
                continue;

            // we restricted our set size to contain only N elements so that the 1st element will be our Nth largest element
            if(uniqueEle.size() == n) {

                // if our set's smallest element is found to be small compared to num array then we replace the set smallest element
                // with the current element
                if (uniqueEle.first() < num) {
                    uniqueEle.pollFirst();
                    uniqueEle.add(num);
                }
            }
            else {
                uniqueEle.add(num);
            }
        }

        // if our set contains N elements then return the smallest element
        // which is located at first index because our set contains elements in sorted order
        if (uniqueEle.size() == n) {
            return uniqueEle.first();
        }

        // if third-largest element is not present then return the largest element
        // which is present at last index
        return uniqueEle.last();
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 8, 4, 0};
        int thirdLargest = findThirdLargest(nums, 2);
        System.out.println("Third largest element is: " + thirdLargest);
    }
}
