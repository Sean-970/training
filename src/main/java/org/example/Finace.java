package org.example;

public class Finace implements Report {

    @Override
    public void print() {
        System.out.println("print Finace");
    }

    @Override
    public void load() {
        System.out.println("Load Finace");
    }
}
