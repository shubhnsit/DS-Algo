package com.arrays;

public class StockBuySell {


    public static void main(String[] args) {
        int arr1[] = {100, 180, 260, 310, 40, 535, 695};
        int arr[] = {100, 80, 60, 40, 35};
        maxProfit(arr,arr.length);
    }


    static void maxProfit(int arr[],int n){

        int maxProfit = 0;
        int cp = arr[0];

        for(int i=1;i<n-1;i++){

            if(arr[i]>arr[i+1]){
                maxProfit = maxProfit + arr[i] - cp;
                cp = arr[i+1];
            }

            if(i==n-2){
                maxProfit = maxProfit + arr[n-1] - cp;
            }

        }
        System.out.print(maxProfit);


    }




}






