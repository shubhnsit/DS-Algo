package com.arrays;

public class Leaders {


    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        leaders(arr,arr.length);

    }

    private static void leaders(int[] arr, int length) {

        int max = arr[length-1];
        System.out.println(max);
        for(int i=length-2;i>0;i--){
            if(arr[i] > max){
                System.out.println(arr[i]);
                max = arr[i];
            }
        }


    }


}






