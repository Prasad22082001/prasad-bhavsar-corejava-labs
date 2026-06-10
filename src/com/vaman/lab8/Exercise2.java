package com.vaman.lab8;

import java.time.LocalTime;

public class Exercise2 implements Runnable {

    @Override
    public void run() {

        try {

            while (true) {
                System.out.println("Current Time: " + LocalTime.now());

                Thread.sleep(10000); // 10 seconds
            }

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }

    public static void main(String[] args) {

        Exercise2 timer = new Exercise2();

        Thread thread = new Thread(timer);

        thread.start();
    }
}