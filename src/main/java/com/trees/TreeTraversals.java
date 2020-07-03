package com.trees;

import java.util.*;

public class TreeTraversals {


    public static void main(String[] args) {

        Node root=null;
        int hd =0;
        TreeMap<Integer,List<Integer>> tm = new TreeMap<>();
        printVerticalOrder(hd,tm,root);


    }

    static void getBottomViewOrder(BottomView.Node root, int hd, HashMap<Integer, BottomView.Pair> m, int height) {
        // Base case
        if(root == null)
            return;

        if(!m.containsKey(hd)) {
            m.put(hd,new BottomView.Pair(root.key,height));
        }else {
            BottomView.Pair p1 = m.get(hd);
            if(p1.b <= height) {
                m.replace(hd,new BottomView.Pair(root.key,height));
            }

        }

        // Store nodes in left subtree
        getBottomViewOrder(root.left, hd-1, m,height+1);

        // Store nodes in right subtree
        getBottomViewOrder(root.right, hd+1, m,height+1);
    }


    private static void printVerticalOrder(int hd, TreeMap<Integer, List<Integer>> tm, Node root) {

        if(root == null){
            return;
        }

        List<Integer> res = tm.get(hd);
        if(res==null){
            res = new ArrayList<>();
            res.add(root.data);
        }else{
            res.add(root.data);
        }

        tm.put(hd,res);

        printVerticalOrder(hd-1,tm,root.left);
        printVerticalOrder(hd+1,tm,root.right);

    }




    void inOrder(Node root){

        if(root == null){
            return;
        }

        Stack<Node> s = new Stack<>();
        Node curr = root;

        while(curr!=null || !s.isEmpty()){

            while(curr!=null) {
                s.push(curr);
                curr = curr.left;
            }

            curr = s.pop();
            System.out.print(curr.data + "  ");

            curr = curr.right;

        }

    }


    void printLevelOrder(Node root) {
        int k;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {

           int n = queue.size();
           for(int i=1;i<=n;i++) {

               Node tempNode = queue.poll();
               if(i==1) {
                   System.out.print(tempNode.data + " ");
               }
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

    static Node prev = null;

    boolean isBST(Node root){


        if(root==null){
            return true;
        }

        if(!isBST(root.left)){
            return false;
        }

        if(prev!=null && root.data <= prev.data)
            return false;

        prev = root;

        return isBST(root.right);



    }

    void inOrder1(Node root){

        Stack<Node> s = new Stack<>();
        Node curr = root;

        while(curr!=null || !s.isEmpty()){

            while(curr!=null){
                s.add(curr);
                curr = curr.left;
            }

            curr = s.pop();
            // print

            curr = curr.right;

        }



    }

    private void printGivenLevel(Node root, int level) {
        if(root==null || level<0)
            return;

        if(level == 0){
            System.out.print(root.data);
        }else {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }


    void levelOrder(Node root){

        int height = height(root);
        for(int i=0;i<height;i++){
            printGivenLevel(root,i);
        }

    }

    private int height(Node root) {

        if(root == null){
            return 0;
        }
        else {
            int lHeight = height(root.left);
            int rHeight = height(root.right);

            return lHeight > rHeight ? lHeight + 1 : rHeight + 1;
        }

    }

    // can be used to calculate width of binary tree as well
    void printLeftView(Node root) {
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

}





