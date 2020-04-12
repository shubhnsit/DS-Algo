    package com.arrays;

    public class SumDivisibleByK {

       // order of o(n)3
        public static void main(String[] args) {
            int arr[] = {4, 5, 0, -2, -3, 1};
            sumDivisibleByK(arr,arr.length,5);
        }


        static void sumDivisibleByK(int arr[],int n,int num){

          int sum = 0,count =0;
          for(int i=0;i<n;i++){
              for(int j=i;j<n;j++){
                  sum = 0;
                  for(int k=i;k<=j;k++){
                      sum = sum + arr[k];
                  }
                  if(sum%num==0){
                      count++;
                  }
              }
          }
            System.out.print(count);
          }
    }


    /*// Java code to print all possible subarrays
// for given array using recursion

class solution
{

// Recursive function to print all possible subarrays
// for given array
static void printSubArrays(int []arr, int start, int end)
{
	// Stop if we have reached the end of the array
	if (end == arr.length)
		return;

	// Increment the end point and start from 0
	else if (start > end)
		printSubArrays(arr, 0, end + 1);

	// Print the subarray and increment the starting point
	else
	{
		System.out.print("[");
		for (int i = start; i < end; i++){
			System.out.print(arr[i]+", ");
		}

		System.out.println(arr[end]+"]");
		printSubArrays(arr, start + 1, end);
	}

	return;
}

public static void main(String args[])
{
int []arr = {1, 2, 3};
printSubArrays(arr, 0, 0);

}
}
*/

/*
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-->0)
	    {
	        String[] nk = br.readLine().trim().split(" ");
	        int n = Integer.parseInt(nk[0]);
	        int k = Integer.parseInt(nk[1]);
	        HashMap<Integer, Integer> map = new HashMap<>();
	        map.put(0, 1);
	        int[] arr = new int[n];
	        String[] str = br.readLine().trim().split(" ");
	        for(int i=0; i<n; i++)
	        {
	            arr[i] = Integer.parseInt(str[i]);
	        }
	        int presum=0, count=0;
	        for(int i=0; i<n; i++)
	        {
	            presum += arr[i];
	            int mod = presum % k;
	            if(map.containsKey(mod))
	            {
	                count += map.get(mod);
	                map.put(mod, map.get(mod)+1);
	            }
	            else
	            {
	                map.put(mod, 1);
	            }
	        }
	        System.out.println(count);
	    }
	}
}*/



