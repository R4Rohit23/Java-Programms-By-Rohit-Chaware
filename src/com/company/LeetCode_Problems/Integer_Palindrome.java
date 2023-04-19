package com.company.LeetCode_Problems;
// check if integer is palindrome or not
public class Integer_Palindrome {
    public static boolean intPalindrome(int num) {
        // we reverse the last half part of the integer so that it will become equal to first part if it is palindrome
        int rev = 0;

        while (num > rev) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        // checking if the integer contains odd digit
        // if length is odd then the digit in the middle doesn't matter in palindrome check
        return (rev == num || rev / 10 == num);
    }
    public static void main(String[] args) {
        int num = 12321;
        System.out.println(intPalindrome(num));
    }
}
