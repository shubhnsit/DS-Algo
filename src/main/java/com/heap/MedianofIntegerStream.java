package com.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianofIntegerStream {


    public static void main(String[] args) {

        int arr[] = {10,20,22,34,12,100};
        PriorityQueue<Integer> lowers = new PriorityQueue<>(Collections.reverseOrder()); // maxHeap
        PriorityQueue<Integer> higher = new PriorityQueue<>();  // minHeap
        double median[] = new double[arr.length];

        for(int i=0;i<arr.length;i++){
            int number = arr[i];
            addNumber(lowers,higher,number);
            rebalance(lowers,higher);

            median[i] = getMedian(lowers,higher);

        }

        for(int i=0;i<median.length;i++){
            System.out.print(median[i] + "  ");
        }

    }

    private static double getMedian(PriorityQueue<Integer> lowers, PriorityQueue<Integer> higher) {

        PriorityQueue<Integer> biggerHeap = lowers.size() > higher.size() ? lowers : higher;
        PriorityQueue<Integer> smallerHeap = lowers.size() > higher.size() ? higher : lowers;

        if(biggerHeap.size() == smallerHeap.size()){
            return (double)(biggerHeap.peek() + smallerHeap.peek())/2;
        }
        else{
            return biggerHeap.peek();
        }


    }

    private static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> higher) {

        PriorityQueue<Integer> biggerHeap = lowers.size() > higher.size() ? lowers : higher;
        PriorityQueue<Integer> smallerHeap = lowers.size() > higher.size() ? higher : lowers;

        if(biggerHeap.size() - smallerHeap.size() >=2){
            smallerHeap.add(biggerHeap.poll());
        }


    }

    private static void addNumber(PriorityQueue<Integer> lowers, PriorityQueue<Integer> higher, int number) {

        if(lowers.size() ==0 || lowers.peek() > number ){
            lowers.add(number);
        }
        else{
            higher.add(number);
        }

    }


}
