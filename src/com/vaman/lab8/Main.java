package com.vaman.lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        try {

            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("target.txt");

            Exercise1 thread = new Exercise1(fis, fos);

            thread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}