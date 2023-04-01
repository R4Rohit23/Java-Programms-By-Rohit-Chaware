package com.company.Concept_Problems.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class FindingLargestIn2DArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Integer[] array=new Integer[]{10,45,67,79,100};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(array));
        int k=3;
        System.out.print(k+" Largest Numbers in Array are:");
        Arrays.sort(array, Collections.reverseOrder());
        for (int i=0;i<k;i++){
            System.out.print(array[i]+" ");
        }
    }

}
