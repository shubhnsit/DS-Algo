package com.trees;

class Node{

    int data;
    Node left;
    Node right;
    Node connectRight;

    Node(Node node){
        this.data = node.data;
        this.left = node.left;
        this.right = node.right;
        this.connectRight = null;
    }


    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
        this.connectRight = null;
    }


}
