package com.misc;

public class PrintFromMultipleThreads {

    public static boolean isOdd = true;
    public static Integer number = 1;

    public static void main(String[] args) {

        PrintFromMultipleThreads printer = new PrintFromMultipleThreads();

        Thread odd = new Thread();
        Thread even = new Thread();

        odd.start();

    }



}
