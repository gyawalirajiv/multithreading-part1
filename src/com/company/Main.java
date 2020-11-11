package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main class is Hungry!");
        OtherThread otherThread = new OtherThread();
        otherThread.start();

        Thread customRunnable = new Thread(new CustomRunnable());
        customRunnable.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    customRunnable.join(1000);
                } catch (InterruptedException e) {
                    System.out.println("I could not wait for th custom Thread to complete!");
                }
                System.out.println("Anonymous class says hello!");
            }
        }.start();
        System.out.println("Main class is now FULL!");

    }
}
