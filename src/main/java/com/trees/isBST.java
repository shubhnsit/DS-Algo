package com.trees;

public class isBST {


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


        Node res = isbST(root);
        System.out.print(res.data);
    }

    private static boolean isbSTUtil(Node root,Node prev) {
        if(root !=null){

            if(!isbSTUtil(root.left,prev)){
                return false;
            }

            if(prev != null && root.data <= prev.data){
                return false;
            }

            prev = root;
            return isbSTUtil(root.right,prev);


        }

        return true;

    }


    private static Node isbST(Node root){

        boolean res = isbSTUtil(root,null);
        if(res){
            return root;
        }
        else{
            Node left = isbST(root.left);
            Node right = isbST(root.right);
        }

        return null;


    }



}
