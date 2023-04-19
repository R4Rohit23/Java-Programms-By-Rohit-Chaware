package com.company.LeetCode_Problems;
// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of
//  the integer. The digits are ordered from most significant to least significant in left-to-right order. The large
//  integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.
import java.util.*;

public class Plus_One {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // traversing from the right end because we need to add 1 to the rightmost digit
        for (int i = n - 1; i >= 0; i--) {
            // if the rightmost digit is less than 9 then just add 1 and return it
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // if it is 9 then we change its value to 0 and continue the loop
            digits[i] = 0;
        }

        // if we reach here, so we conclude that our number is like 9999, so its answer is 10000
        // change the size
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] res = plusOne(arr);

        for (int i: res) System.out.print(i + " ");
    }
}
