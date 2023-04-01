package com.company.Algorithms.Sorting_Algorithms;

// This is basically a divide and conquer based sorting algorithm in which array elements are
// divided into smaller parts and then merge into one array in sorted order

public class Merge_Sort {

    public static void conquer(int[] arr, int left, int mid, int right)
    {
        // create array temp to store sorted array
        int[] temp = new int[right - left + 1];

        // takes two index
        int indx1 = left;
        int indx2 = mid + 1;
        int indx = 0;

        while(indx1 <= mid && indx2 <= right)
        {
            if (arr[indx1] < arr[indx2]) {
                temp[indx++] = arr[indx1++];
            }
            else
            {
                temp[indx++] = arr[indx2++];
            }
        }

        // if elements are left in both the arrays
        while(indx1 <= mid)
        {
            temp[indx++] = arr[indx1++];
        }

        while(indx2 <= right)
        {
            temp[indx++] = arr[indx2++];
        }

        // copy the temp array to original array
        int i = 0;
        while(i < temp.length && left <= right)
        {
            arr[left++] = temp[i++];
        }
    }

    public static void divide(int[] arr, int left, int right)
    {
        // base case: only 1 element is remains to be sorted
        if(left == right)
            return;

        // finding middle index
        int mid = left + (right - left) / 2;

        // dividing the array into smaller parts
        divide(arr, left, mid);
        divide(arr, mid+1, right);

        // after dividing we need to merge our array elements into sorted array
        conquer(arr, left, mid, right);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        divide(arr, 0, n-1);

        for(int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}
