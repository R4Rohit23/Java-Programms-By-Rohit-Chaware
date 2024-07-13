package com.company.LeetCode_Problems.Array;
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
public class Max_Consecutive_One {
    public static int maxConsecutiveOne(int[] nums, int k) {
        // We solve this problem using the Sliding window technique
        // We initialize a variable zeroCount to count the number of zeros in the given window
        int i = 0, j = 0, zeroCount = 0, ans = 0;

        while (j < nums.length) {
            // we count the number of zeros with the help of j index
            zeroCount += (nums[j] == 0 ? 1 : 0);

            // if count of zero is greater than the given k then we slide our window by removing the left or i index
            // value
            while (zeroCount > k) {
                zeroCount -= (nums[i] == 0 ? 1 : 0);
                i++;
            }

            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int ans = maxConsecutiveOne(nums, k);
        System.out.println(ans);
    }
}
