package com.company.LeetCode_Problems;
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside
// the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
public class Reverse_Integer {
    public static int reverseInteger(int num) {
        // take help of long variable
        //long > int
        long x = 0;

        // reversing the number
        while (num != 0) {
            x = x * 10 + num % 10;
            num /= 10;

            // check overflow and underflow
            if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) return 0;
        }

        return (int) x;
    }
    public static void main(String[] args) {
        int n = -123;
        int reverseNum = reverseInteger(n);
        System.out.println("The reverse number is: " + reverseNum);
    }
}
