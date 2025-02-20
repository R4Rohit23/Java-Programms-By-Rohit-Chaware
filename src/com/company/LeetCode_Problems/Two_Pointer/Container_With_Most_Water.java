package com.company.LeetCode_Problems.Two_Pointer;

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.

public class Container_With_Most_Water {
    public static int calculateMaxContainerCapacity(int[] arr) {
        int start = 0;
        int last = arr.length - 1;
        int maxWaterCapacity = 0;

        while (start < last) {
            maxWaterCapacity = Math.max(maxWaterCapacity, (last - start) * Math.min(arr[start], arr[last]));

            if (arr[start] < arr[last]) {
                start++;
            } else {
                last--;
            }
        }
        return maxWaterCapacity;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println("Max Water Capacity is: " + calculateMaxContainerCapacity(arr));
    }
}
