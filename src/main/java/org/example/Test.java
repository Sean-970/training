package org.example;

public class Test {
    public static void main(String[] args) {
        Deck d1 = new Deck();
        d1.shuffle();
        d1.print(13);
        Person p = new Person(66.5f,1.8f);
        p.hello();
        System.out.println(p.bmi());



    }
}
