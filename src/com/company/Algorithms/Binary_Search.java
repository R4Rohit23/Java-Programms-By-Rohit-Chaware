package com.company.Algorithms;

public class Binary_Search {

    // Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search
    // interval in half. The idea of binary search is to use the information that the array is sorted and
    // reduce the time complexity to O(Log n).

    // Step-by-step Binary Search Algorithm: We basically ignore half of the elements just after one comparison.
    //
    // (1) Compare x with the middle element.
    // (2) If x matches with the middle element, we return the mid index.
    // (3) Else If x is greater than the mid element, then x can only lie in the right half subarray after
    // the mid element. So we recur for the right half.
    // (4)Else (x is smaller) recur for the left half.

    public static int binarySearchIterative(int[] arr, int x)
    {
        int l = 0, r = arr.length - 1;

        while (l <= r) {

            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int l, int r)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == target)
                return mid;

            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid] > target)
                return binarySearchRecursive(arr, target, l, mid-1);

            // Else the element can only be present in right subarray
            return binarySearchRecursive(arr, target, mid - 1, r);
        }

        // We reach here when element is not present in array
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,10,12,23,35,48,59,67,89};

        int n = arr.length;

        int r = n - 1;
        int l = 0;

        int res1 = binarySearchRecursive(arr, 59, l, r);
        int res2 = binarySearchIterative(arr, 59);
        System.out.println("Binary Search Recursive: " + res1);
        System.out.println("Binary Search Iterative: " + res2);
    }
}
