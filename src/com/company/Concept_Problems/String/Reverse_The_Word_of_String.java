package com.company.Concept_Problems.String;

// Here we are reversing the word of the string
/*
>>> Sudo Code
(1) First split the string on the basis of the space between two words and store the result in the string array
(2) Now introduce two pointers first pointing to the zeroth element and other pointing to the last element
(3) Run a while loop and swap the string array elements
Hence like this our string is reversed word wise
 */

public class Reverse_The_Word_of_String {

    public static void reverseByWord(String input)
    {
        // Step 1
        String[] result = input.split(" ");

        // Step 2
        int i=0, j=result.length -1;

        // Step 3
        while(i < j)
        {
            String temp = result[i];
            result[i] = result[j];
            result[j] = temp;

            i++;
            j--;
        }

        StringBuilder ans = new StringBuilder();
        for (i = 0; i < result.length; i++) {
            ans.append(result[i]).append(" ");
        }
        System.out.print("Reversed String: " + ans);
    }

    public static void main(String[] args) {

        String input = "Hello I am Rohit";
        System.out.print("Original String: " + input + "\n");
        reverseByWord(input);
    }
}
