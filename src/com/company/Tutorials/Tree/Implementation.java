package com.company.Tutorials.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Implementation {

    // Nodes of tree are made like LinkedList nodes
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val)
        {
            this.data = val;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        Node root;

        // ------------------------------- Traverse tree ---------------------------------------------

        public void inorderTraversal(Node node) {
            if (node != null) {
                inorderTraversal(node.left);
                System.out.print(" " + node.data);
                inorderTraversal(node.right);
            }
        }

        public void preorder(Node node)
        {
            if(node == null)
                return;

            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }

        public void postorder(Node node)
        {
            if(node == null)
                return;

            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }

        public void levelOrder(Node node)
        {
            if(node == null)
                return;

            // create a queue
            Queue<Node> q = new LinkedList<>();

            // first element
            q.add(node);

            while(!q.isEmpty())
            {
                Node temp = q.poll();

                System.out.print(temp.data + " ");

                if(temp.left != null)
                    q.add(temp.left);
                if(temp.right != null)
                    q.add(temp.right);
            }
        }
        // ---------------------------------------------------------------------------------------------------------------

        public  int sumOfNodes(Node root)
        {
            if(root == null)
                return 0;
            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;
        }

        public int height(Node root)
        {
            if(root == null)
                return 0;

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }

        public int diameter(Node root)
        {
            if(root == null)
                return 0;

            int dia1 = diameter(root.left);
            int dia2 = diameter(root.right);
            int dia3 = height(root.left) + height(root.right) + 1;

            return Math.max(dia3, Math.max(dia1, dia2));
        }
    }

    public static void main(String[] args) {
        // create an object of BinaryTree
        BinaryTree tree = new BinaryTree();

        // create nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);

        // tree will we be look like
        //       1
        //     /   \
        //    2     3
        //   /
        //   4

        System.out.print("Binary Tree in Inorder: ");
        tree.inorderTraversal(tree.root);
        System.out.println();
        System.out.print("Binary Tree in Preorder: ");
        tree.preorder(tree.root);
        System.out.println();
        System.out.print("Binary Tree in Postorder: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.print("Binary Tree Level Order Traversal : ");
        tree.levelOrder(tree.root);
        System.out.println();

        System.out.print("Sum of all the nodes in the tree is: " + tree.sumOfNodes(tree.root));
        System.out.println();

        System.out.print("Height of a tree is: " + tree.height(tree.root));
        System.out.println();

        System.out.print("Diameter of a tree is: " + tree.diameter(tree.root));

    }
}
