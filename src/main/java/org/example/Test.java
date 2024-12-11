package org.example;

public class Test {
    public static void main(String[] args) {
        Deck d1 = new Deck();
        d1.shuffle();
        d1.print(13);
        Finace Finace = new Finace();
        Finace.print();
        Report report = new Finace();
        Report someReport  = new Report() {
            @Override
            public void print() {

            }
        };
        Report r = () ->{

        };
    }
}
