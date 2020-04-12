package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class WidthBinaryTree {


    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(-2);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(-4);
        root.right.left = new Node(7);
        root.right.right = new Node(5);
        root.right.right.left = new Node(5);
        root.right.right.right = new Node(5);
        root.right.left.right = new Node(5);
        root.left.left.right = new Node(8);
        root.left.left.left = new Node(8);

        levelOrderTraversal(root);

    }


    static void levelOrderTraversal(Node root){


        if(root == null)
            return;


        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int[] width = new int[100];
        int maxWidth = 0;
        int m =0;
        while(!q.isEmpty()){

            int n = q.size();
            maxWidth = Math.max(maxWidth,n);
            width[m++] = n;

                Node temp = q.remove();

                    System.out.print(temp.data + "  ");

                if (temp.left != null) {
                    q.add(temp.left);
                }

                if (temp.right != null) {
                    q.add(temp.right);
                }


        }


        System.out.print("printing");
    int max = width[0];
    for(int i=0;i<width.length;i++){
        if(max<width[i]){
            max = width[i];
        }
    }
        System.out.print(max);
        System.out.print("mammmmmmm"+maxWidth);



    }






}
