package com.stack;
import java.util.Stack;

public class NextSmallerElement {


    public static void main(String[] args) {
        int arr[] = {4,8,5,2,25};
     //  nse(arr);
       nge(arr,arr.length);
    }

    private static void nse(int[] arr) {

        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);

        for(int i=1;i<n;i++){
            if(!s.isEmpty()) {
                while(!s.isEmpty() && s.peek() > arr[i]) {
                    System.out.println(s.peek() + "--->" + arr[i]);
                    s.pop();
                }
                s.push(arr[i]);
            }
        }
        while(!s.isEmpty()){
            System.out.println(s.peek() + "--->" + "-1");
            s.pop();
        }

    }
//{4,8,5,2,25}
    // 4 3 2 1
   static void nge(int arr[],int n){

        Stack<Integer> s = new Stack();
        s.push(arr[0]);

        for(int i=1;i<n;i++){

                while (!s.isEmpty() && s.peek() < arr[i]) {
                    System.out.println(s.pop() + " ----> " + arr[i]);
                }
                s.push(arr[i]);
        }
        while(!s.isEmpty()){
            System.out.println(s.pop() +" ----> "+ "-1");
        }

    }

}
