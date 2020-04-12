package com.trees;

import java.util.*;

public class ConvertIntoMirror {


    public static void main(String[] args) {

    }

    private static boolean checkifMirror(Node root1,Node root2){

        if(root1==null && root2==null){
            return true;
        }

        if(root1 == null || root2 == null){
            return false;
        }

        if(root1.data == root2.data &&
                checkifMirror(root1.left,root2.right) &&
                checkifMirror(root1.right,root2.left) ){
            return true;
        }

        return false;

    }


    private static void convertIntoMirror(Node root){

        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            Node node = q.remove();

            Node temp = node.left;
            node.left = node.right;
            node.right = temp;


            if(node.left!=null){
                q.add(node.left);
            }

            if(node.right!=null){
                q.add(node.right);
            }


        }





    }

}









