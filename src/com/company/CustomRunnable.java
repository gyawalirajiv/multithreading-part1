package com.company;

public class CustomRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable is running!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Runnable is interrupted!");
        }
        System.out.println("Runnable is about to exit");
    }
}
