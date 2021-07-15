package com.company;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] twodm ={
                {10,20,30},
                {40,50,60}
                       };
        System.out.print("Original Array is:\n");
        print_original(twodm);
        System.out.println("Array After Traversing:");
        array_transposed(twodm);

    }


    //For printing transposed array

    private static void array_transposed(int[][] twodm){
        int[][] newtwodm = new int[twodm[0].length][twodm.length];  //rows converted to columns and columns
        //                               ^              ^             // converted to rows
        //                               |              |
        //                               3              2

        for (int i=0;i< twodm.length;i++){
            for (int j=0;j<twodm[0].length;j++){
                newtwodm[j][i]=twodm[i][j];

            }

        }
        print_original(newtwodm);
    }
    //for printing original array
    private static void print_original(int[][] twodm){
        for(int i=0;i< twodm.length;i++){         //for ptinting rows
            for (int j=0;j<twodm[0].length;j++){  //for  printing columns
                System.out.print(twodm[i][j]+" ");
            }
            System.out.println();

        }
    }
}
