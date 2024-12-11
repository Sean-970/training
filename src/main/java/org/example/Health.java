package org.example;

public class Health implements Report{
    @Override
    public void print() {
        System.out.println("Print Health");
    }

    @Override
    public void load() {
        System.out.println("Load Health");
    }
}
