package com.arrays;


public class largestSubarrayWithK {


    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 5};
     //  int rs =  mostK(arr, arr.length);

    }
   static int mostK(int arr[],int n,int k){

        int sum = 0;
        int count= 0;
        int maxCount = 0;

        for(int i=0;i<n;i++){

            if(sum+arr[i]<=k){
                sum = sum + arr[i];
                count++;
            }
            else{
                sum = sum - arr[i-count] + arr[i];
            }

            maxCount = Math.max(count,maxCount);
        }


        return maxCount;

    }


}