package com.misc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample{


    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        TaskCreator t1 = new TaskCreator();
        TaskCreator t2 = new TaskCreator();
        TaskCreator t3 = new TaskCreator();
        TaskCreator t4 = new TaskCreator();
        TaskCreator t5 = new TaskCreator();

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);
        service.submit(t4);
        service.submit(t5);


        service.shutdown();

    }



    static class TaskCreator implements Runnable{


        @Override
        public void run() {

            for(int i=0;i<3;i++){
                System.out.println(System.currentTimeMillis() + ":::" + Thread.currentThread().getName() + ":::" + i);
                System.out.println();
            }

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }



}
