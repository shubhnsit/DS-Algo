package com.trees;

public class BoundaryTraversal {


    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        root.right = new Node(22);
        root.right.right = new Node(25);
        boundaryTraversal(root);

    }

    private static void boundaryTraversal(Node root) {

        // print root -- need to be printed once
        // print leftsubTree
        // print rightsubTree
        // print leaf nodes --- ignore leftmost and rightmost node

        if(root==null){
            return;
        }

        System.out.print(root.data + " ");


        printBoundaryLeft(root.left);
        printLeafNodes(root.left);
        printLeafNodes(root.right);
        printBoundaryRight(root.right);


    }

    private static void printLeafNodes(Node root) {

        if(root == null){
            return;
        }

            printLeafNodes(root.left);

            if(root.left == null && root.right == null){
                System.out.print(root.data + " ");
            }

            printLeafNodes(root.right);

    }

    private static void printBoundaryLeft(Node root) {

        if(root == null)
            return;


            if(root.left != null){
                System.out.println(root.data+ " ");
                printBoundaryLeft(root.left);
            }
            else if (root.right!=null){
                System.out.println(root.data+ " ");
                printBoundaryLeft(root.right);
            }


    }

    private static void printBoundaryRight(Node root) {

        if(root == null)
            return;


            if(root.right != null){
                printBoundaryRight(root.right);
                System.out.println(root.data+ " ");
            }
            else if (root.left!=null){
                printBoundaryRight(root.left);
                System.out.println(root.data+ " ");
            }



    }

}
