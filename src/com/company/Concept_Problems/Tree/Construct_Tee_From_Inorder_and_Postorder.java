package com.company.Concept_Problems.Tree;
import java.util.HashMap;

// we are going to construct a binary tree from Inorder and Postorder traversal
public class Construct_Tee_From_Inorder_and_Postorder {

    public static class Node {
        int val;
        Node left;
        Node right;

        // constructor for node with value as parameter
        Node(int val) {this.val = val; }

    }

    public static Node buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0;i<inorder.length;++i)
            hm.put(inorder[i], i);
        return buildTreePostIn(0, inorder.length-1, postorder, 0,
                postorder.length-1,hm);
    }

    private static Node buildTreePostIn(int is, int ie, int[] postorder, int ps, int pe,
                                        HashMap<Integer, Integer> hm){
        if (ps>pe || is>ie) return null;
        Node root = new Node(postorder[pe]);
        int ri = hm.get(postorder[pe]);
        Node leftchild = buildTreePostIn(is, ri-1, postorder, ps, ps+ri-is-1, hm);
        Node rightchild = buildTreePostIn(ri+1, ie, postorder, ps+ri-is, pe-1, hm);
        root.left = leftchild;
        root.right = rightchild;
        return root;
    }

    public static void inorderTraversal(Node root)
    {
        if(root == null)
            return;
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }


    public static void main(String[] args) {
        int[] inorder = {9, 5, 1, 7, 2, 12, 8, 4, 3, 11};
        int[] postorder = {9, 1, 2, 12, 7, 5, 3, 11, 4, 5};
        Node root = buildTree(inorder, postorder);


        // inorder printing
        inorderTraversal(root);
    }
}
