package com.company.Algorithms.String_Matching_Algorithm;
//  The KMP algorithm, short for Knuth-Morris-Pratt algorithm, is a string matching algorithm that searches for a
//  pattern within a longer string.
//  The algorithm works by pre-processing the pattern string to create a table that allows the algorithm to skip over
//  portions of the string that it has already examined.

// Here's how the algorithm works:
// (1) First, the pattern string is pre-processed to create a table of values called the "failure function". This table
// contains information about the pattern string that allows the algorithm to skip over portions of the string that
// have already been matched.

// (2) Next, the algorithm begins comparing the pattern string to the longer string, starting at the beginning of both
// strings. If the characters match, the algorithm moves on to the next character in both strings.

// (3) If the characters do not match, the algorithm uses the values in the failure function table to determine how far
// to backtrack in the pattern string before continuing the comparison.

// (4) The algorithm continues this process until it either finds a match or reaches the end of the longer string
// without finding a match.

//Overall, the KMP algorithm is an efficient way to search for a pattern within a longer string, with a time complexity of
// O(n + m) where n is the length of the longer string and m is the length of the pattern string.

public class KMP_Algorithm {
    public static int kmp(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (n < m)
            return -1;

        // PREPROCESSING
        // longest_border array
        int[] longest_border = new int[m];

        // Length of Longest Border for prefix before it.
        int prev = 0;

        // Iterating from index-1. longest_border[0] will always be 0
        int i = 1;

        while (i < m) {
            if (needle.charAt(i) == needle.charAt(prev)) {
                // Length of the Longest Border Increased
                prev += 1;
                longest_border[i] = prev;
                i += 1;
            } else {
                // Only empty border exist
                if (prev == 0) {
                    longest_border[i] = 0;
                    i += 1;
                }
                // Try finding the longest border for this i with reduced prev
                else {
                    prev = longest_border[prev - 1];
                }
            }
        }

        // SEARCHING
        // Pointer for haystack
        int haystackPointer = 0;

        // Pointer for needle.
        // Also indicates number of characters matched in current window.
        int needlePointer = 0;

        while (haystackPointer < n) {
            if (haystack.charAt(haystackPointer) == needle.charAt(needlePointer)) {
                // Matched Increment Both
                needlePointer += 1;
                haystackPointer += 1;

                // All characters matched
                if (needlePointer == m) {
                    // m characters behind last matching will be start of window
                    return haystackPointer - m;
                }
            } else {
                if (needlePointer == 0) {
                    // Zero Matched
                    haystackPointer += 1;
                } else {
                    // Optimally shift left needlePointer. Don't change haystackPointer
                    needlePointer = longest_border[needlePointer - 1];
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String s1 = "onionionse";
        String s2  = "onions";

        System.out.println("The index is: " + kmp(s1, s2));
    }
}
