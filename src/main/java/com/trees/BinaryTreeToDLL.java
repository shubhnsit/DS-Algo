package com.trees;


public class BinaryTreeToDLL {

    static Node head=null;
    static Node prev=null;



    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(12);
        root.right = new Node(15);
        root.left.left = new Node(25);
        root.left.right = new Node(30);
        root.right.left = new Node(36);

        convertToDLL(root);
        printList(head);

    }

    static void printList(Node node)
    {
        while (node != null)
        {
            System.out.print(node.data + " ");
            node = node.right;
        }
    }

    private static void convertToDLL(Node root) {


        if(root==null){
            return;
        }

        convertToDLL(root.left);

        if(prev==null){
            head = root;
        }else{
            root.left = prev;
            prev.right = root;
        }

        prev = root;

        convertToDLL(root.right);

    }


}
