package com.company.LeetCode_Problems;
// we are given a sorted array and our task is to remove the duplicate elements from the sorted array without creating
// any new array

// OBSERVATION
// (1) Since the array we have is sorted, all duplicate values will be one after the other.
// (2) We need to update the first k elements in an array with unique values and return the value of k.
// (3) In order to perform in-place operations, we use the Two indexes approach
// (4) The first index updates the value in our input array while reading the data from the second index
// (5) We continue the above steps until the second index reaches the end of an array

public class Remove_Duplicate_Element_From_Sorted_Array {

    public static int removeDuplicate(int[] nums, int n) {
        // note that 0th element is always unique element
        int insertIndex = 1;

        for(int i = 1; i < n; i++){
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        // insertIndex will hold count of unique elements in our array
        return insertIndex;

    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 2, 3, 4, 4, 5};
        int n = arr.length;
        int newSize = removeDuplicate(arr, n);

        // printing unique elements
        for (int i = 0; i < newSize; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
