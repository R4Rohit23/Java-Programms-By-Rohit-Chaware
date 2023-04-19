package com.company.Algorithms.String_Matching_Algorithm;
//  In this problem, we have to find the first occurrence of needle in a haystack. The characters are taken from the
//  set of lowercase English Characters {a, b, c, ... , y, z}.
public class Sliding_Window {
    public static int slidingWindow(String needle, String haystack) {
        int m = needle.length();
        int n = haystack.length();

        // First substring of length (m) will start at index 0 in the haystack and will end at index (m - 1) + 0.
        // The second substring of length (m) will start at index 1 in the haystack and will end at index (m - 1) + 1
        // The third substring of length (m) will start at index 2 in the haystack and will end at index (m - 1) + 2

        // Thus, if a substring ends at index (m - 1) + k, then it starts at index k.
        // We know that the last substring ends at index (n - 1). Thus, to find starting index k of the last substring,
        // we can equate (n - 1) with (m - 1) + k, to get k = (n-1) - (m-1), or k = n - m.
        // Thus, the last substring of length m will start at index (n - m) in the haystack and will end at index n - 1.

        for (int windowStart = 0; windowStart <= n - m; windowStart++) {
            for (int i = 0; i < m; i++) {
                // increment the starting pointer
                if(needle.charAt(i) != haystack.charAt(windowStart + i))
                    break;
                // if we reach the end means all the previous characters are equal
                if(i == m - 1)
                    return windowStart;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String needle = "train";
        String haystack = "tailtrain";
        int indx = slidingWindow(needle, haystack);
        System.out.println(indx);
    }
}
