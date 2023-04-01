package com.company.Algorithms.Sorting_Algorithms;

// In this sorting algorithm we loop through the whole array and pick up pivot index and then
// again loop through the array second time to find the element less than the pivot index element
// after finding the min element we just swap the both of these elements until our array is not sorted
public class Selection_Sort {
    public static void selectionSort(int[] arr, int n)
    {
        // initialize minIndx to store the minimum value index
        int minIndx;

        for(int i=0; i<n-1; i++)
        {
            minIndx = i;

            for(int j=i+1; j<n; j++)
            {
                // if lowest element is found then store its index in minIndx variable
                if(arr[j] < arr[minIndx])
                    minIndx = j;
            }

            // just swap the elements
            int temp = arr[i];
            arr[i] = arr[minIndx];
            arr[minIndx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 3, 2};
        int n = 6;
        selectionSort(arr, n);

        for(int i: arr)
        {
            System.out.print(i);
        }
    }
}
