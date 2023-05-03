package com.company.Concept_Problems.Tree;

public class Convert_Sorted_Array_Into_BST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // constructor for node with value as parameter
        TreeNode(int val) {this.val = val; }
        
    }

    public static TreeNode convertToBST(int[] num) {
        if (num.length == 0) return null;

        return helper(num, 0, num.length - 1);
    }

    public static TreeNode helper(int[] num, int low, int high) {
        if (low > high) return null;

        // the middle node will be our root, so that its left element are less than it and right elements are greater than it
        int mid = (low + high) / 2;

        TreeNode newNode = new TreeNode(num[mid]);

        // recursively calling helper function
        newNode.left = helper(num, low, mid - 1);
        newNode.right = helper(num, mid + 1, high);

        return newNode;
    }

    public static void main(String[] args) {
        int[] num = {-10, -3, 0, 5, 6};
        TreeNode root = convertToBST(num);

    }
}
