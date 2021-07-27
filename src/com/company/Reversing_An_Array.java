package com.company;
import java.util.*;

public class Reversing_An_Array {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        //Get the length of your array
        int n = scan.nextInt();

        //Build your array with n length
        int[] arr = new int[n];

        //Get the elements of your array
        for(int i=0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        //lets build new array
        int[] b = new int[n];
        int j = n;

        //Ex- if n = 5 then arr[0] will be b[4] means 1st elements of original array will be last (that means reversal :) )
        for(int i = 0; i < n; i++){
            b[j - 1] = arr[i];
            j--;
        }

        //printing reversed array
        for(int k = 0; k < n; k++){
            System.out.print(b[k] + " ");
        }



    }
}
