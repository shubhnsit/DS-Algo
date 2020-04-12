package com.trees;

public class RootToLeafPath {

    static int sumArr[] = new int[10];
    static int sumArrLen = 0;

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);

        printPath(root);
       for(int i=0;i<sumArr.length;i++){
           System.out.print(sumArr[i] + "***");
       }


    }

    private static void printPath(Node root) {

        int path[] = new int[1000];
         printPathRecur(root,path,0);
    }

    private static void printPathRecur(Node root, int[] path, int pathLen) {

        if(root==null){
            return ;
        }

        path[pathLen] = root.data;
        pathLen++;

        if(root.left== null && root.right==null){
            printArray(path,pathLen);
        }
        else {
            printPathRecur(root.left,path,pathLen);
            printPathRecur(root.right,path,pathLen);
        }

    }

    private static void printArray(int path[],int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + path[i];
            System.out.print(path[i] + "--");
        }
        System.out.println();

        sumArr[sumArrLen++] = sum;

    }


}
