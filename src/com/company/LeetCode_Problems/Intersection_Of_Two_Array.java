package com.company.LeetCode_Problems;
// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must
// appear as many times as it shows in both arrays and you may return the result in any order.

import java.util.*;

public class Intersection_Of_Two_Array {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i: nums1) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        List<Integer> ans = new ArrayList<>();

        for (int i : nums2) {
            if (mp.containsKey(i) && mp.get(i) > 0) {
                ans.add(i);
                mp.put(i, mp.get(i) - 1);
            }
        }

        int[] res = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) res[i] = ans.get(i);

        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 2, 1};
        int[] nums2 = {3, 2};
        int[] res = intersect(nums1, nums2);
        System.out.println("The intersection of array is at");
        for (int i: res)
            System.out.print(i + " ");
    }
}
