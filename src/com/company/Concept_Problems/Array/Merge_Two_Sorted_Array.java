package com.company.Concept_Problems.Array;
// Given two sorted array merge them so that the resultant array will also be sorted
public class Merge_Two_Sorted_Array {
    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        // make new array of size m + n
        int[] res = new int[m + n];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                res[k] = arr1[i];
                i++;
            }
            else {
                res[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            res[k++] = arr1[i++];
        }

        while (j < n) {
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] res = mergeArray(arr1, arr2);

        for (int i: res) {
            System.out.print(i + " ");
        }
    }
}
