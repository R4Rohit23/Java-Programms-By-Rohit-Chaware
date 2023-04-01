package com.company.Concept_Problems.Tree;

// Here we are going to find the tree is symmetrical or not
public class Symmetrical_Tree {

    // creating a tree
    public static class Node {
        int val;
        Node left;
        Node right;

        // constructor for node with value as parameter
        Node(int val) {this.val = val; }

        // constructor for node with all 3 parameters
        Node(int val, Node left, Node right)
        {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static boolean isSymmetricHelper(Node left, Node right)
    {
        // if any one of the Node found to be null so we have to check that they both shoul be null
        if(left == null || right == null)
        {
            return left == right;
        }

        // if the nodes are not null so we have to check their value
        if(left.val != right.val) return false;

        // we simultaneously call left's node left and right node's right and left node's right and right node's left
        // because we have to check both side of the tree
        return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
    }

    public static boolean isSymmetric(Node root)
    {
        // We check the root's left is equal to root's right simultaneously for tree to be symmetric
        // this is done by isSymmetricHelper function
        return root == null || isSymmetricHelper(root.left, root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(4);
        root.right.right = new Node(4);

        System.out.println(isSymmetric(root));

        // tree will we be look like
        //       1
        //     /   \
        //    2     2
        //   /       \
        //   4       4
    }

}
