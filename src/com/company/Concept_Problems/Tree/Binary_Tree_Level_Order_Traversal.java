package com.company.Concept_Problems.Tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// level order traversal in the form of list
public class Binary_Tree_Level_Order_Traversal {
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

    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> mainList = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) return mainList;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int currListSize = queue.size();
            List<Integer> subList = new LinkedList<>();

            for (int i = 0; i < currListSize; i++) {
                if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            mainList.add(subList);
        }
        return mainList;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        List<List<Integer>> ans = levelOrderTraversal(root);

        for (List<Integer> i : ans) {
            for (int j: i) {
                System.out.print(j);
            }
        }
    }
}
