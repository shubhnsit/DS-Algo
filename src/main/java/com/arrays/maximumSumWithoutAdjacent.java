package com.arrays;

public class maximumSumWithoutAdjacent {


    public static void main(String[] args) {
        int arr[] = {6, 7, 1, 3, 8, 2, 4};
        maxSum1(arr,arr.length);

        String s = "10";
        int a = 50;
        String n = s + String.valueOf(a);
        System.out.print(n);


    }

    private static int maxSum1(int[] arr, int n) {

        int incl = arr[0];
        int excl = 0;
        int exclNew;

        for(int i=1;i<n;i++){
            exclNew = Math.max(incl,excl);

            incl = excl + arr[i];
            excl = exclNew;
        }

        return Math.max(incl,excl);

    }


    static void maxSum(int arr[],int n){

        int incl = arr[0];
        int excl = 0;
        int excl_new;

        for(int i=1;i<n;i++){

            excl_new = incl>excl ? incl : excl;

            incl = excl + arr[i];
            excl = excl_new;

        }

        System.out.print(incl>excl ? incl : excl);


    }




}






