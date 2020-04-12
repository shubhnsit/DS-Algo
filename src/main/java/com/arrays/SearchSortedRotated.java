package com.arrays;

public class SearchSortedRotated {


    public static void main(String[] args) {
        int arr[] = {4,5,7,11,23,26,1,2,3};
      //  int index = search(arr,0,arr.length-1,23);
        int sortedRotated = searchSortedRotated(arr,0,arr.length-1,2);
        System.out.print(sortedRotated);

    }

    static int search(int arr[],int low,int high,int num){

        if(high>=low) {
            int mid = low + (high - low) / 2;

            if (num == arr[mid]) {
                return mid;
            }

            if (arr[mid] > num) {
               return search(arr, low, mid - 1, num);
            } else {
               return  search(arr, mid + 1, high, num);
            }
        }

     return -1;

    }


    // find pivot element --> element which is greater than its left and right element, only one element of this kind exists in the array

    static int searchSortedRotated(int arr[],int low,int high,int num){

        if(high>=low) {
            int mid = low + (high - low) / 2;

            if (num == arr[mid]) {
                return mid;
            }
            ///arr[mid] > arr[low] implies first half is sorted
            if (arr[mid] > arr[low]) {
                if(arr[mid] > num && arr[low]< num){
                    return search(arr, low, mid - 1, num);
                }
                return  search(arr, mid + 1, high, num);
            } else {
                if(arr[mid] < num && arr[high]> num){
                    return  search(arr, mid + 1, high, num);
                }
                return search(arr, low, mid - 1, num);
            }
        }

        return -1;

    }




}






