package com.rajiv;

public class OtherThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello from the other side!");
    }
}
