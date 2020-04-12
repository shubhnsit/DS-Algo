package com.arrays;

public class MajorityElement {


    public static void main(String[] args) {
        int arr[] = {16, 2, 17, 4, 2, 2, 3, 5, 2,17,17,17,17,17,17,17,17};
        majorityElement(arr, arr.length);

    }

    private static void majorityElement(int[] arr, int n) {

        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {

            if (candidate == arr[i]) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }

        }

        boolean isMajority = isMajority(arr, candidate);
        System.out.print(isMajority + "  " + candidate);


    }

    private static boolean isMajority(int arr[], int candidate) {

        int count = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == candidate) {
                count++;
            }

            if (count >= Math.nextUp(n / 2))
                return true;

        }
        return false;

    }


}




