package com.company.Algorithms.Sliding_Window;

public class Minimum_Size_SubArray_Sum {
    // An intuitive technique is to go through all the subarrays one by one and
    // check the sum of each one. If the total of the subarray under consideration
    // is larger than or equal to target, we attempt to update our answer variable
    // by using the minimum of the current answer and the length of this subarray.
    // To get all the subarrays, we can run two loops: the outer loop selects a
    // starting point and the inner loop selects an ending point. This solution,
    // however, will take O(n
    // 2
    // ) time, resulting in a time limit exceeded (TLE).

    // Let's think whether we really need to iterate over all the subarrays.

    // Given that we only have positive integers, there is no purpose in adding
    // further elements to a subarray if its sum exceeds or equals target. Adding
    // more elements to such a subarray will result in the construction of longer
    // subarrays, which is useless because we have already found a smaller subarray
    // that meets our requirements.

    // Only if the sum of the current subarray under consideration is smaller than
    // target, we should append elements to the subarray. When the sum of the
    // subarrays exceeds or equals target, we will attempt to update our answer with
    // the length of the current subarray.

    // We now try to remove the elements from the start and see if we can form a
    // smaller subarray that meets our requirements. We remove the first element
    // from the subarray and check if we still have the total higher than or equal
    // to target. If the total exceeds or equals target, we have a smaller subarray
    // that meets our requirement. As a result, we again try to update our answer
    // with the length of the current subarray and repeat the process of eliminating
    // the first element from the current subarray until the sum no longer exceeds
    // or equals target.

    // Now after removing elements, if the sum of the subarray is less than target,
    // we have to append more elements to it until the sum becomes larger than or
    // equal to target. We append elements until the sum equals or exceeds target,
    // then try to update our answer variable and repeat the process of eliminating
    // the first element.

    // The above approach can be efficiently solved using the sliding window
    // approach.

    // If you are not familiar with sliding window, please refer to our explore
    // cards Sliding Window Explore Card.

    // A sliding window is achieved by using two pointers left and right, which
    // point to the starting and ending indices of the subarray. We set them to a
    // value of 0.

    // To "add" elements to the window, we loop over the array by incrementing
    // right. In this problem, if the sum of the window exceeds or equals target, we
    // try to update our answer and then "remove" elements from the window by
    // incrementing left until the sum is less than target again.
    public static int findMinimumSize(int[] arr, int target) {
        int left = 0, right = 0, sumOfWindow = 0, result = Integer.MAX_VALUE;

        for (right = 0; right < arr.length; right++) {
            sumOfWindow += arr[right];

            while (sumOfWindow >= target) {
                result = Math.min(result, right - left + 1);
                sumOfWindow -= arr[left++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;

    }
    // Given an array of positive integers nums and a positive integer target,
    // return the minimal length of a subarray whose sum is greater than or equal to
    // target. If there is no such subarray, return 0 instead.

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        System.out.println("Minimum size of subarray: " + findMinimumSize(arr, 7));
    }
}
