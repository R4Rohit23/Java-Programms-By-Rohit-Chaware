package com.company;
import java.util.Scanner;

public class copying_elements_of_array {
    public static void main(String[] args) {
        //Here I am gonna show you how to copy elements of array1 into array2 by using for loop

        //Lets make scanner to scan elements of array1
        Scanner scan = new Scanner(System.in);

//        scan no. of elements should be in array from user
        System.out.print("Give No. of elements of an array: ");
        int n = scan.nextInt();

//      define array1
        int[] arr1;
        arr1 = new int[n];

//        scanning elements of an array
        for (int i =0;i<n;i++){
             arr1[i] = scan.nextInt();
        }

//        displaying elements of array1 using simple for loop
        System.out.println("Elements of an original array: ");
        for (int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

//        defining array2
        //note that our second array length should be same as original array
        int arr2[] = new int[arr1.length];

//        Copying all elements of original array into array2
        for (int i = 0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }

//        Displaying copyied array using for each loop
//        in for each loop all the elements of arr2 are now stored into integer i
        System.out.println("Elements of new array: ");
         for (int i:arr2){
             System.out.print(i+ " ");
         }




    }
}
