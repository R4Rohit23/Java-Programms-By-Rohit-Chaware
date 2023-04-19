package com.company.Concept_Problems.String;

// We are reversing the character of a word

public class Reverse_Character_Of_Word {
    public static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    public static String reverseCharUsingTwoPointer(String input) {
        // stores the index of last space
        int lastSpaceIndx = -1;

        // convert string into character array
        char[] arr = input.toCharArray();

        int n = input.length();

        for (int currIndx = 0; currIndx <= n; currIndx++) {
            if (currIndx == n || arr[currIndx] == ' ') {
                // the starting index of every word is a character after the last observed space
                int start = lastSpaceIndx + 1;
                // end will be current space character index observed
                int end = currIndx - 1;
                reverse(arr, start, end);
                lastSpaceIndx = currIndx;
            }
        }

        return new String(arr);
    }
    // Time complexity => O(No. of character in input string * time complexity to swap the characters)
    // i.e O(n + n / 2) => O(N)
    // Space Complexity => O(N)

    public static void reverseCharUsingStringBuilder(String input)
    {
        String[] words = input.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : words) {
            for (int j = word.length() - 1; j >= 0; j--) {
                ans.append(word.charAt(j));
            }
            ans.append(" ");
        }

        System.out.println("Reversed String: " + ans);
    }
    // Time Complexity => O(length of each word * no. of character in each word)
    // for worst case if length and no. of character is same then complexity will be O(n^2)
    // Space Complexity => O(N)
    // Because we are creating extra string builder class to store the resultant string pf size equal to original
    // string size

    public static void main(String[] args) {
        String input = "Hello I am Rohit";
        System.out.println("Original String: " + input);
        reverseCharUsingStringBuilder(input);
        String res = reverseCharUsingTwoPointer(input);
        System.out.println(res);
    }
}
