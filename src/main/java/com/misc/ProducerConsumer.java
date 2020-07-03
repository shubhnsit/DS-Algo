package com.misc;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {



    public static void main(String[] args) throws InterruptedException {

        Buffer buffer = new Buffer(2);

        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        buffer.produce();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        });

        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    buffer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

    }


    static class Buffer{
        int size;
        Queue<Integer> list = new LinkedList();


        Buffer(int size){
            this.size = size;
        }


        void produce() throws InterruptedException {
            int value = 0;
            while(true){
                synchronized (this){
                    while(list.size()>=size){
                        wait();
                    }

                    list.add(value);
                    // print value
                    value++;
                    notify();
                    Thread.sleep(1000);

                }
            }

        }


        void consume() throws InterruptedException {
            while(true){
                synchronized (this){
                    while(size==0){
                        wait();
                    }
                    int value = list.remove();
                    // print

                    notify();

                    Thread.sleep(1000);

                }
            }
        }


    }

}
