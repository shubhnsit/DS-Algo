package com.arrays;

public class CountFrequencySortedArray {


    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3};
       int freq =  countFrequency(arr,0,arr.length,2);
       System.out.print(freq);
    }

    private static int countFrequency(int[] arr,int low, int high,int k) {

        int first = getFirstOccurence(arr,0,arr.length,2);
        System.out.println(first);

        if(first==-1)
            return first;

        int last  = getLastOccurence(arr,0,arr.length,2);
        System.out.println(last);


        return high - (last - first);

    }

    private static int getFirstOccurence(int[] arr, int low, int high, int k) {

        if(high>=low){

            int mid = low + (high - low)/2;

            if(arr[mid-1] < k && arr[mid] == k){
                return mid;
            }

            else if(arr[mid]<k){
                return getFirstOccurence(arr,mid+1,high,k);
            }

            else{
                return getFirstOccurence(arr,low,mid-1,k);
            }


        }

        return -1;
    }

    private static int getLastOccurence(int[] arr, int low, int high, int k) {
// 1, 1, 2, 2, 2, 2, 3
        if(high>=low){

            int mid = low + (high - low)/2;

            if(mid+1 < high && arr[mid+1] > k && arr[mid] == k){
                return mid;
            }

            else if(arr[mid]>=k){
                return getLastOccurence(arr,mid+1,high,k);
                }
            else{
                return getLastOccurence(arr,low,mid-1,k);
            }
        }

        return -1;


    }


}






