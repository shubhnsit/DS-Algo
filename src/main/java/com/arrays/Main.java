package com.arrays;
// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[] {101, 30, 24, 56, 21, 14, 51,3, 33, 25};
        System.out.println(find2ndSmalles(arr)); // 21
    }

    public static int find2ndSmalles(int[] arr) {

        // assuming array size is atleast 2
        int n = arr.length;
        int smallest = arr[0] < arr[1] ? arr[0] : arr[1];
        int secondSmallest = smallest == arr[1] ? arr[0] : arr[1];


        for(int i=2;i<n;i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
}