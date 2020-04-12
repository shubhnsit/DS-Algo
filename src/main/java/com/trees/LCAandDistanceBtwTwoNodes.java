package com.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class LCAandDistanceBtwTwoNodes {


    public static void main(String[] args) {


    }


     // complexity O(h) where h is height of tree
     private static int findlcaBST(Node root,Node n1,Node  n2){

        if(n1.data == n2.data){
            return n1.data;
        }

        else if(n1.data <= root.data && n2.data >= root.data){
            return root.data;
        }

        else if (n1.data<=root.data && n2.data<=root.data){
            findlcaBST(root.left,n1,n2);
        }

        else if (n1.data>=root.data && n2.data>=root.data){
            findlcaBST(root.right,n1,n2);
        }

        return -1;

    }

    // this method assumes both n1 and n2 present, if anyone absent it return other value...
    // now extending solution to handle cases when n1 or n2 may be absent



    private static Node findlcaBTUtil(Node root,int n1,int n2){

        boolean v1 = false;
        boolean v2 = false;

        if(root.data == n1){
            v1 = true;
        }

        if(root.data == n2){
            v2 = true;
        }

        Node lca = findlcaBT(root,n1,n2);

        if((v1==true && checkIfExist(lca,n2)) || (v2==true && checkIfExist(lca,n1) )  ){
            return lca;
        }

        return null;

    }

    private static boolean checkIfExist(Node root, int n) {

        if(root==null)
            return false;


            if( root.data==n || checkIfExist(root.left,n) || checkIfExist(root.right,n) ){
                return true;
            }


        return false;

    }


    private static Integer distanceFromRoot(Node root,int n,int distance){

       if(root==null){
           return -1;
       }

       if(root.data == n){
           return distance;
       }

       int left = distanceFromRoot(root.left,n,distance+1);
       if(left==-1){
           return distanceFromRoot(root.right,n,distance+1);
       }
       return left;

    }


    private static Node findlcaBT(Node root,int n1,int n2){

       if(root == null)
           return null;

       if(n1==root.data || n2==root.data){
           return root;
       }

       Node leftLCA = findlcaBT(root.left,n1,n2);
       Node rightLCA = findlcaBT(root.right,n1,n2);


       if(leftLCA != null && rightLCA != null){
           return root;
       }

        return leftLCA != null ? leftLCA : rightLCA;

    }


    static class Node{

        int data;
        Node left;
        Node right;
    }



}






