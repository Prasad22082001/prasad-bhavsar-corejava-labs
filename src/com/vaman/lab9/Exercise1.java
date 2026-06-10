package com.vaman.lab9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {

    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " is executed by "
                + Thread.currentThread().getName());
    }
}

public class Exercise1 {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new Task("Task 1"));
        executor.execute(new Task("Task 2"));
        executor.execute(new Task("Task 3"));
        executor.execute(new Task("Task 4"));
        executor.execute(new Task("Task 5"));

        executor.shutdown();
    }
}