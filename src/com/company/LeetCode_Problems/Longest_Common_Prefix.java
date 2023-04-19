package com.company.LeetCode_Problems;
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

public class Longest_Common_Prefix {
    // check throughout the whole string array horizontally
    public static String horizontalScanning(String[] arr) {
        if (arr.length == 0) return " ";

        // store the 1st string as prefix, we keep iterating the whole string array by taking this prefix in
        // consideration because the prefix is same throughout the whole string array
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {
            //  reducing the prefix until it starts from 0
            // indexOf() => gives the starting index of the string if another string contains it
            while (arr[i].indexOf(prefix) != 0) {
                // reducing the prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) return " ";
            }
        }
        return prefix;
    }
    // Time complexity => O(S) where S = sum of all characters in all string
    // Space complexity => O(1) no extra space is used

    // check string character by character
    public static String verticalScanning(String[] arr) {
        // if string array is empty or null
        if (arr == null || arr.length == 0) return " ";

        // checking each character is equal
        for (int i = 0; i < arr[0].length(); i++) {
            char ch = arr[0].charAt(i);

            for (int j = 1; j < arr.length; j++) {
                // main condition
                // 1st condition is to avoid array index out of bound exception
                if (i == arr[j].length() || arr[j].charAt(i) != ch) {
                    return arr[0].substring(0, i);
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String hs = horizontalScanning(arr);
    }
}
