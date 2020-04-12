package com.arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5 };
        mergeSort(arr,0,arr.length);
        System.out.print(arr);
    }

    private static void mergeSort(int[] arr, int low,int high) {

        if(high>=low) {

            int mid = low + (high - low) / 2;

            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);

            merge(arr,low,mid,high);

        }

    }

    private static void merge(int[] arr, int low, int mid, int high) {


        int n = mid - low + 1;
        int m = high - mid;


        int left[] = new int[n+1];
        int right[] = new int[m+1];


        for(int i=0;i<n;i++){
            left[i] = arr[i];
        }


        for(int i=n;i<high;i++){
            right[i] = arr[i];
        }

        int i=0,j=0,k=low;




    }


}
