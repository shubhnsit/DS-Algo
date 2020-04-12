package com.trees;

import java.util.LinkedList;
import java.util.Queue;

public class DiameterBT {


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

    }








}
