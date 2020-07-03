package com.arrays;


import java.util.Scanner;
public class SlidingWindowMaximum {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        subarray(arr,arr.length,k);

    }

    private static void subarray(int[] arr, int n,int k) {
        int j, maximum;
        for (int i = 0; i <= n - k; i++) {
            maximum = arr[i];
            for (j = 1; j < k; j++) {
                if (arr[i + j] > maximum)
                    maximum = arr[i + j];
            }
            System.out.println(maximum + " ");
        }

    }

}






