//-------------------------------------------------------Problem------------------------------------------------
//You are given a list of N integers and you need to reverse it and print the reversed list in a new line.

//------------------------------------------------------Solution------------------------------------------------------
package com.company.LeetCode_Problems;
import java.util.*;

public class Reverse_Me {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        try {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            //lets build new array
            int[] b = new int[n];
            int j = n;

            for (int i = 0; i < n; i++) {
                b[j - 1] = arr[i];
                j--;
            }
            //printing reversed array
            for (int k = 0; k < n; k++) {
                System.out.print(b[k] + " ");
            }


        } catch (Exception ignored) {

        }
    }
}
