package com.company.Algorithms.Sorting_Algorithms;
//         In this technique, we just compare the two adjacent elements of the array and then sort them manually by swapping if not sorted.
//        Similarly, we will compare the next two elements (one from the previous position and the corresponding next) of the array and sort them manually.
//        This way the elements from the last get placed in their correct position.
//        This is the difference between selection sort and bubble sort.
public class Bubble_Sort {
    public static void bubbleSort(int[] arr, int n)
    {
        for(int i=0; i<n-1; i++)
        {
            // after successful sorting we don't need to compare the last sorted elements
            // so we limit our j pointer
            for(int j=0; j<n-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 3, 2};
        bubbleSort(arr, 6);
        for(int i: arr)
        {
            System.out.print(i);
        }
    }
}
