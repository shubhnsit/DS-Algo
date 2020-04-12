package com.arrays;

public class MaxDistanceBtw2Elements {


    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3};
        int res = minDistance(arr,arr.length,3,6);
        System.out.print(res);
    }

    private static int minDistance(int[] arr, int length,int first,int second) {

        int minDistance = Integer.MAX_VALUE;
        int indexofFirst = Integer.MAX_VALUE;
        int indexofSecond = Integer.MAX_VALUE - 500;
        boolean firstUpdated;
        boolean secondUpdated;

        for(int i=0;i<length;i++){
            firstUpdated = false;
            secondUpdated = false;

        if(arr[i]== first) {
            indexofFirst = i;
            firstUpdated = true;
        }

        if(arr[i]==second){
            indexofSecond = i;
            secondUpdated = true;
        }

        if(firstUpdated || secondUpdated)
        minDistance = Math.min(indexofFirst > indexofSecond ? indexofFirst - indexofSecond : indexofSecond - indexofFirst,minDistance);

        }

        return minDistance;

    }


}






