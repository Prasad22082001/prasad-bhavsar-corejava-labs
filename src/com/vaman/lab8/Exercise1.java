package com.vaman.lab8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise1 extends Thread {

    private FileInputStream fis;
    private FileOutputStream fos;

    public Exercise1(FileInputStream fis, FileOutputStream fos) {
        this.fis = fis;
        this.fos = fos;
    }

    @Override
    public void run() {

        try {
            int ch;
            int count = 0;

            while ((ch = fis.read()) != -1) {

                fos.write(ch);
                count++;

                if (count % 10 == 0) {
                    System.out.println("10 characters are copied");
                    Thread.sleep(5000);
                }
            }

            fis.close();
            fos.close();

            System.out.println("File copied successfully.");

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}