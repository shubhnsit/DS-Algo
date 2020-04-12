package com.trees;

public class isheightBalancedBT {


    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node (30);
        root.right = new Node (60);
        root.left.left = new Node (5);
        root.left.right = new Node (20);
        root.right.left = new Node (45);
        root.right.right = new Node (70);
        root.right.right.left = new Node (65);
        root.right.right.right = new Node (80);
      //  root.right.right.right.right = new Node (80);

        boolean res = isheightBalanced(root);
        System.out.print(res);
    }

    private static boolean isheightBalanced(Node root) {


        if(root==null){
            return true;
        }

        else{
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            if(Math.abs(lHeight-rHeight) <=1 &&
                    isheightBalanced(root.left) &&
                    isheightBalanced(root.right)){
                return true;
            }
        }

        return false;
    }

    private static int height(Node root) {

        if(root==null){
            return 0;
        }

        else{
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            return 1+ Math.max(lHeight,rHeight);
        }
    }


}
