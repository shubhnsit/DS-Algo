package com.arrays;

public class LargestContinuousSubArray {


    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        int arr1[] = {-2, -3, 0, -2, -40};
      //  largestSum(arr,arr.length);
        largestProduct(arr1,arr1.length);

    }

    static void largestProduct(int arr[],int n){

        int maxEndingHere=1, maxSofar = Integer.MIN_VALUE;
        int start = 0,end=0,s=0,i=0;

        for(i=0;i<n;i++){

            maxEndingHere = maxEndingHere * arr[i];

            if(maxEndingHere == 0 ){
                maxEndingHere = 1;
                s = i+1;
            }

            if(maxEndingHere > maxSofar){
                maxSofar = maxEndingHere;
                start = s;
                end = i;
            }

        }
        System.out.println(maxSofar);
        System.out.println(start);
        System.out.println(end);


    }

    static void largestSum(int arr[],int n){

        int maxEndingHere=0, maxSofar = Integer.MIN_VALUE;
        int start = 0,end=0,s=0,i=0;

        for(i=0;i<n;i++){

            maxEndingHere = maxEndingHere + arr[i];

            if(maxEndingHere < 0 ){
                maxEndingHere = 0;
                s = i+1;
            }

            if(maxEndingHere > maxSofar){
                maxSofar = maxEndingHere;
                start = s;
                end = i;
            }

        }
        System.out.print(maxSofar);
        System.out.print(start);
        System.out.print(end);


    }



}






