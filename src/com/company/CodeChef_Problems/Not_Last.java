//--------------------------------------------------Problem----------------------------------------------
//Given an integer N, check if its second last digit is 7 or not.
// If the second last digit is 7, print 1, else print 0.

//Note: The second last digit of an integer refers to the digit at
// the tens place, i.e. second digit from the right.

//-------------------------------------------------Solution--------------------------------------
package com.company.CodeChef_Problems;
import java.util.*;
import java.lang.*;


public class Not_Last {
    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            //Converting integer value into string
            String s = String.valueOf(n);

            int length = s.length();

            //Will give the character at given point
            char ch = s.charAt(length - 2);

            if(ch == '7') {
                System.out.println("1");
            }
            else {
                System.out.println("0");
            }

        } catch(Exception ignored) {

        }
    }

}