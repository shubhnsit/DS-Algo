package com.trees;

public class MaximumSumTree {


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(10);
        root.left.left = new Node(20);
       /* root.left.left.left = new Node(-5);
        root.left.left.left.left = new Node(16);
        root.left.left.right = new Node(5);
       */ root.left.right = new Node(1);
        root.right.right = new Node(-25);
        root.right.right.left = new Node(3);
        root.right.right.right = new Node(4);
        int maxSum = maximumSum(root);
        System.out.println(maxSum);

    }

    static int maximumSum(Node root){

        if(root==null){
            return 0;
        }

        int left = findMaxUtil(root.left);
        int right = findMaxUtil(root.right);

        int maxSum =   Math.max(left + root.data +right, Math.max(left,right));

        return maxSum;

    }

    private static int findMaxUtil(Node root) {

        if(root == null){
            return 0;
        }

        return root.data + Math.max(findMaxUtil(root.left),findMaxUtil(root.right));


    }


}
