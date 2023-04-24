package com.company.Concept_Problems.Tree;

import java.util.Stack;

public class Check_BST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean checkBST(TreeNode root) {
        // crate a stack to store the nodes from the bottom
        // this is classic inorder traversal based problem
        // The inorder traversal of BST is sorted sequence
        Stack<TreeNode> stack = new Stack<>();
        Integer prev = null;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();

            // Inorder of BST is sorted sequence so if any val is less than the prev value then that tree is not BST
            if (prev != null && root.val <= prev) {
                return false;
            }
            prev = root.val;
            root = root.right;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        System.out.println(checkBST(root));
    }
}
