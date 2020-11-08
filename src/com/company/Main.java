package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main class is Hungry!");
        OtherThread otherThread = new OtherThread();
        otherThread.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println("Anonymous class says hello!");
            }
        }.start();
        System.out.println("Main class is now FULL!");
    }
}