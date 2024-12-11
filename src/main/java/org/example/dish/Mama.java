package org.example.dish;

public class Mama {
        public Mama(){
            try {
            System.out.println("Cooking 1");
            Thread.sleep(3000);
            System.out.println("Finish 1");
            System.out.println("Cooking 2");
            new Thread(){
                @Override
                public void run() {
                    super.run();
                    System.out.println("buy source");
                    try {
                        sleep(7000);
                        System.out.println("come home ");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }.start();
            Thread.sleep(3000);
            System.out.println("Finish 2");
            System.out.println("Cooking 3");
            Thread.sleep(3000);
            System.out.println("Finish 3");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }

    public static void main(String[] args) {
        new Mama();

    }
}


