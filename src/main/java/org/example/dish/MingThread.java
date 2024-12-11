package org.example.dish;

public class MingThread extends Thread{
    @Override
    public void run() {
        System.out.println("buy source");
        try {
            sleep(7000);
            System.out.println("back");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
