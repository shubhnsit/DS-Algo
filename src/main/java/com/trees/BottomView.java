package com.trees;

import java.util.HashMap;

import java.util.Map.Entry;

public class BottomView
{
    // Tree node
    static class Node
    {
        int key;
        Node left;
        Node right;

        // Constructor
        Node(int data)
        {
            key = data;
            left = null;
            right = null;
        }
    }

    static class Pair {

        Integer a;
        Integer b;

        Pair(Integer a, Integer b) {
            this.a = a;
            this.b = b;

        }
    }

    // Utility function to store vertical order in map 'm'
    // 'hd' is horizontal distance of current node from root.
    // 'hd' is initially passed as 0
    static void getBottomViewOrder(Node root, int hd, HashMap<Integer, Pair> m, int height) {
        // Base case
        if(root == null)
            return;

        if(!m.containsKey(hd)) {
         m.put(hd,new Pair(root.key,height));
        }else {

            Pair p1 = m.get(hd);
            if(p1.b <= height) {
            m.replace(hd,new Pair(root.key,height));
            }

        }

        // Store nodes in left subtree
        getBottomViewOrder(root.left, hd-1, m,height+1);

        // Store nodes in right subtree
        getBottomViewOrder(root.right, hd+1, m,height+1);
    }

    // The main function to print vertical order of a binary tree
    // with the given root
    static void printBottomView(Node root) {
        // Create a map and store vertical order in map using
        // function getVerticalOrder()
        HashMap<Integer, Pair> m = new HashMap<>();
        int hd = 0;
        int height = 0;
        getBottomViewOrder(root, hd, m,height);

        // Traverse the map and print nodes at every horigontal
        // distance (hd)
        for (Entry<Integer, Pair> entry : m.entrySet()) {
                System.out.println(entry.getKey() + "--->>" +entry.getValue().a);
            }
        }


    // Driver program to test above functions
    public static void main(String[] args) {

        // TO DO Auto-generated method stub
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        System.out.println("Vertical Order traversal is");
        printBottomView(root);

    }
}
// This code is contributed by Sumit Ghosh
