package com.company.Concept_Problems.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Given an integer n, return all the structurally unique BST's (binary search trees), which has exactly n nodes of
// unique values from 1 to n. Return the answer in any order.
public class Unique_BST {
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    public static List<TreeNode> generateBST(int s, int e) {
        // ans list
        List<TreeNode> ans = new LinkedList<>();

        if (s > e) {
            ans.add(null); // empty tree
            return ans;
        }

        // root
        for (int i = s; i <= e; i++) {
            // for BST left of root is less than root and right is greater than root
            List<TreeNode> leftTree = generateBST(s, i - 1);
            List<TreeNode> rightTree = generateBST(i + 1, e);

            for (TreeNode left: leftTree) {
                for (TreeNode right: rightTree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    ans.add(root);
                }
            }
        }
        return ans;
    }

    public static List<TreeNode> createUniqueBST(int n) {
        return generateBST(1, n);
    }

    public static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<TreeNode> ans = createUniqueBST(n);

        for (TreeNode root: ans) {
            printInorder(root);
            System.out.println();
        }
    }
}
