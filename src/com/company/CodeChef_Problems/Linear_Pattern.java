//-----------------------------------------------Problem------------------------------------------
//You're given a number N. Print the first N numbers of the below-given pattern separated by space.
//10,2,20,4,30,6,40,8,50,…
//--------------------------------------------- Solution-----------------------------------------------
package com.company.CodeChef_Problems;
import java.util.*;
import java.lang.*;

public class Linear_Pattern {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            Scanner scan = new Scanner(System.in);
            int count = scan.nextInt();

            //Lets assume some values
            int n1 = 10;
            int n2 = 2;

            for (int i = 1; i <= count / 2; i++) {
                int num1 = n1 * i;
                int num2 = n2 * i;

                System.out.print(num1 + " " + num2 + " ");
            }

        } catch(Exception ignored) {
        }
    }
}
