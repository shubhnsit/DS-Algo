package com.trees;

import java.util.Stack;

public class SumTree {


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);

        inOrder(root);
        System.out.println();
        convertToSumTree(root);
        inOrder(root);

    }

    private static int convertToSumTree(Node root) {

        if(root == null){
            return 0;
        }

        int oldValue = root.data;

        root.data = convertToSumTree(root.left) + convertToSumTree(root.right);

        return oldValue + root.data;

    }


    private static void inOrder(Node root){


        Stack<Node> s = new Stack<>();
        Node curr = root;

        while(curr!=null || !s.isEmpty()){

            while(curr!=null){
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            System.out.print(curr.data + "  ");

            curr = curr.right;
        }

    }


}
