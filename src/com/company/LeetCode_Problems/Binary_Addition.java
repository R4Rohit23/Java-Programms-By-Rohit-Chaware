package com.company.LeetCode_Problems;
// given two binary string return the addition of these two binary string
public class Binary_Addition {
    public static String binaryAddition(String s1, String s2) {
        // we initialize a stringBuilder class here because in java string is immutable
        // but technically you can change the content of the string but it takes little time to process
        // because internally java creates a another string with new size and append the original string into it
        // so it takes extra time to mutate
        // To save our extra time here we are going to use StringBuilder here

        StringBuilder res = new StringBuilder();
        int a = s1.length() - 1;
        int b = s2.length() - 1;

        // in binary addition there are only 2 numbers present 0 and 1
        // 0 + 0 => 0
        // 0 + 1 => 1
        // 1 + 0 => 1
        // 1 + 1 => 10
        // like if you add 9 + 1 => 0 will print first then after carry
        // so if addition cross 1 then we print 0 first and then the carry
        int carry = 0;

        while (a >= 0 || b >= 0) {
            int sum = carry;

            // Now, we subtract by '0' to convert the numbers from a char type into an int, so we can perform operations on the numbers
            if (a >= 0) sum += s1.charAt(a--) - '0';
            if (b >= 0) sum += s2.charAt(b--) - '0';

            carry = sum > 1 ? 1 : 0;

            res.append(sum % 2); // just moduling the sum so, we can get remainder and add it into our result
        }

        // check if carry is left
        if (carry != 0) res.append(carry);
        return res.reverse().toString();
    }
    public static void main(String[] args) {
        String s1 = "110"; //6
        String s2 = "10"; // 2
        String res = binaryAddition(s1, s2);
        System.out.println(res); // 1000
    }
}
