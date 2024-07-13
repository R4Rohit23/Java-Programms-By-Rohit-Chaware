//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

package com.company.LeetCode_Problems.String;

import java.util.Scanner;

// Algorithm
// (1) Check if the concatenations of str1 and str2 in different orders are the same.
// (2) If not, return "".
// (3) Get the GCD gcdLength of the two lengths of str1 and str2.
// (4) Return the prefix string with a length of gcdLength of either str1 or str2 as the answer.
public class GCD_of_String {

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
    public static String gcdOfString(String str1, String str2) {
        // Check if they have non-zero GCD string.
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get the GCD of the two lengths.
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        String res = gcdOfString(str1, str2);
        System.out.println(res);
    }
}
