package com.arrays;

public class water {


    public static void main(String[] args) {
        int arr[] = {10, 6, 8, 2, 8,6,10};
        water(arr,arr.length);

    }

    private static void water(int[] arr, int n) {

        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],arr[i]);
        }

        right[n-1] = arr[n-1];
        for(int j=n-2;j>=0;j--){
            right[j] = Math.max(right[j+1],arr[j]);
        }

        int water = 0;
        for(int i=0;i<n;i++){

            water = water + Math.min(left[i],right[i]) - arr[i];

        }

        System.out.print(water);



    }


}






