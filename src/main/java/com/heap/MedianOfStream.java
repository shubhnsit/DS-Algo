package com.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {


    public static void main(String[] args) {

        int arr[] = {10,20,30,22,3,4,55,6};
        int value=90;
        PriorityQueue<Integer> maxHeap = new PriorityQueue();
        PriorityQueue<Integer> minHeap = new PriorityQueue(Collections.reverseOrder());

        addElementsInHeap(maxHeap,minHeap,value);
        rebalanceHeaps(maxHeap,minHeap);
        double result = findMedians(maxHeap,minHeap);

    }

    private static double findMedians(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {

        PriorityQueue<Integer> biggerHeap = maxHeap.size() > minHeap.size() ? maxHeap : minHeap;
        PriorityQueue<Integer> smallerHeap = maxHeap.size() < minHeap.size() ? maxHeap : minHeap;

        if(biggerHeap.size() > smallerHeap.size()){
            return (double) biggerHeap.peek();
        }
        else{
            return (double) (biggerHeap.peek() + smallerHeap.peek())/2;
        }


    }

    private static void rebalanceHeaps(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {

        PriorityQueue<Integer> biggerHeap = maxHeap.size() > minHeap.size() ? maxHeap : minHeap;
        PriorityQueue<Integer> smallerHeap = maxHeap.size() < minHeap.size() ? maxHeap : minHeap;

        if(biggerHeap.size() - smallerHeap.size() >=2 ){
            smallerHeap.add(biggerHeap.poll());
        }
    }

    private static void addElementsInHeap(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap, int value) {

        if(maxHeap.peek()>value){
            maxHeap.add(value);
        }
        else
            minHeap.add(value);

    }


}
