package com.company.Concept_Problems.Tree;
// You are given the root of a binary search tree (BST) and an integer val.
//
// Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a
// node does not exist, return null.
public class Search_In_BST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        // constructor for node with value as parameter
        TreeNode(int val) {this.val = val; }

        // constructor for node with all 3 parameters
        TreeNode(int val, TreeNode left, TreeNode right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode searchInBST(TreeNode root, int val) {
        if(root == null) return root;

        if(root.val == val) return root;
        else {
            // as the tree is BST so the value less than root will be on the left side of tree or if val is greater than
            // root value then it will be present on the right side of the tree
            return val < root.val ? searchInBST(root.left, val) : searchInBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        TreeNode node = searchInBST(root, 5);
    }
}
