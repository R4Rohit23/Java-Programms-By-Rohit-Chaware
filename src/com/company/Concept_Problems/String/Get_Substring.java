package com.company.Concept_Problems.String;

// Calculating the substring of the given string

public class Get_Substring {

    public static void getSubString(String input)
    {
        for(int i=0; i<input.length(); i++)
        {
            String res = "";

            for(int j=i; j<input.length(); j++)
            {
                res += input.charAt(j);
                System.out.println(res);
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";

        // calling the method
        getSubString(input);
    }
}
