package com.company.Concept_Problems.Stack;

import java.util.Stack;

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
public class Valid_Parenthesis {
    public static boolean validParenthesis(String s) {
        // we are creating a stack to check the opening bracket is associated with closing bracket
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // if the current element is opening bracket then we just push it into the stack
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else {
                // closing bracket occurred
                if (stack.isEmpty() || (stack.peek() == '(' && ch != ')') || (stack.peek() == '[' && ch != ']') || (stack.peek() == '{' && ch != '}'))
                    return false;

                // if control reaches here means we get the right pair
                stack.pop();
            }
        }
        // if the string contains the right pair of parenthesis, so after the whole operation our stack will be empty
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{([])}";
        System.out.println(validParenthesis(s));
    }
}
