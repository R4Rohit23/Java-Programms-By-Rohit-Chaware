package com.company.Algorithms.Sorting_Algorithms;
//        Insertion sort is a simple sorting algorithm that sorts an array of elements by inserting each element into its
//        proper position in a sorted subarray. The algorithm works by iterating through the array from left to right,
//        considering each element in turn, and inserting it into its proper position in the sorted subarray to the left of it.
//
//        Here's how the algorithm works:
//
//        (1) Start with the second element of the array.
//        (2) Compare the second element with the first element. If the second element is smaller than the first element, swap them.
//        (3) Consider the third element. Compare it with the second element, and swap them if the third element is smaller. Then compare the second element with the first element, and swap them if necessary.
//        (4)Continue in this manner, comparing each element with the ones before it and inserting it into its proper position in the sorted subarray to the left.
//        Once you have iterated through the entire array, the array will be sorted.
public class Insertion_Sort {

    public static void insertionSort(int[] arr, int n)
    {
        for(int i=1; i<n; i++)
        {
            int currIndx = i;

            while(currIndx > 0 && arr[currIndx-1] > arr[currIndx])
            {
                int temp = arr[currIndx-1];
                arr[currIndx-1] = arr[currIndx];
                arr[currIndx] = temp;
                currIndx -= 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 3, 2};
        insertionSort(arr, 6);

        for(int i: arr)
        {
            System.out.print(i);
        }
    }
}
