package com.arrays;

public class CountInversions {

    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5 };
        int count = inversionsByMergeSort(arr,0,arr.length);
        System.out.print(count);
    }

    private static int inversionsByMergeSort(int[] arr, int low,int high) {
        return 1;
    }


    private static int inversions(int[] arr, int n) {

        int count =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){

                if(arr[i]>arr[j]){
                    count++;
                }

            }
        }

        return count;

    }


}
