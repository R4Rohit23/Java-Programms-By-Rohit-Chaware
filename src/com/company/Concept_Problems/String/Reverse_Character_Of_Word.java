package com.company.Concept_Problems.String;

// We are reversing the character of a word

public class Reverse_Character_Of_Word {

    public static void reverseChar(String input)
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

    public static void main(String[] args) {
        String input = "Hello I am Rohit";
        System.out.println("Original String: " + input);
        reverseChar(input);
    }
}
