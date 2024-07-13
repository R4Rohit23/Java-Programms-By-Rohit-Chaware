package com.company.Concept_Problems.Stack;
// Given an encoded string, return its decoded string.
// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated
// exactly k times. Note that k is guaranteed to be a positive integer.

import java.util.Stack;

// ALGORITHM
// (1) Create two stack -> 1 for storing the current string and 2nd for storing the k value
// (2) Loop through the string
//     (i) If encounter a number then store that number in variable k
//     (ii) If encounter '[' then create a StringBuilder to create a current string
//     (iii) If encounter ']' then pop the current number and pop string from the stack
//            After that run a for loop to append the current string to the poped string k number of times
public class Decode_String {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for(char c: s.toCharArray()) {
            // store the number in variable k
            if(Character.isDigit(c)) {
                k = k * 10 + (c - '0');
                continue;
            }
            // push both string and number in respective stacks
            if(c == '[') {
                stringStack.add(currentString);
                countStack.add(k);
                currentString = new StringBuilder();
                k = 0;
            }
            else if(c == ']') {
                StringBuilder decodedString = stringStack.pop();
                int thisCount = countStack.pop();
                for(int i = 0; i < thisCount; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            }
            else {
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
    public static void main(String[] args) {
        String str = "3[a2[c]]";
        String ans = decodeString(str);
    }
}
