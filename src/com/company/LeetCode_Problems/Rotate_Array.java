package com.company.LeetCode_Problems;
// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

public class Rotate_Array {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotateArray(int[] arr, int k) {
        // if k is greater than the size of the array then we use module operator to reduce its size
        k = k % arr.length;

        // The basic idea is that, for example, nums = [1,2,3,4,5,6,7] and k = 3, first we reverse [1,2,3,4], it
        // becomes[4,3,2,1]; then we reverse[5,6,7], it becomes[7,6,5], finally we reverse the array as a whole, it
        // becomes[4,3,2,1,7,6,5] ---> [5,6,7,1,2,3,4].

        // reversing the array with respect to above conditions
        reverse(arr, 0, arr.length - k - 1);
        reverse(arr, arr.length - k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        // steps to rotate the array
        int k = 3;
        rotateArray(arr, k);

        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
