package com.trees;// Iterative Queue based Java program to do level order traversal
// of Binary Tree

/* importing the inbuilt java classes required for the program */
import java.util.Queue;
import java.util.LinkedList;

/* Class to represent Tree node */

/* Class to print Level Order Traversal */
public class LeftView {

    Node root;

    /* Given a binary tree. Print its nodes in level order
    using array for implementing queue */



    void printLevelOrder() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

			/* poll() removes the present head.
			For more information on poll() visit
			http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */

            int n = queue.size();

            for(int i=1;i<=n;i++) {
                Node tempNode = queue.remove();

                if (i == 1)
                    System.out.print(tempNode.data + " ");

                /*Enqueue left child */
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }

                /*Enqueue right child */
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }

            }
        }
    }

    static int max_level = 0;

    // recursive function to print left view
    void leftViewUtil(Node node, int level)
    {
        // Base Case
        if (node == null)
            return;

        // If this is the first node of its level
        if (max_level < level) {
            System.out.print(" " + node.data);
            max_level = level;
        }

        // Recur for left and right subtrees
        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }

    // A wrapper over leftViewUtil()
    void leftView()
    {
        leftViewUtil(root, 1);
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        LeftView tree = new LeftView();
        tree.root = new Node(12);
        tree.root.left = new Node(10);
        tree.root.right = new Node(30);
        tree.root.right.left = new Node(25);
        tree.root.right.right = new Node(40);
        tree.root.right.left.left = new Node(250);
        tree.root.right.left.right = new Node(122);
        tree.root.right.left.left.left = new Node(1125);

        tree.leftView();
        System.out.println();
        tree.printLevelOrder();
    }
}