package com.company;

public class OtherThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from the other side!");
    }
}
