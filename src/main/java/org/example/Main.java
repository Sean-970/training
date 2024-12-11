package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] flowers =new String[] {"c", "h", "d", "s"};
        List<String> deck = new ArrayList<>();
        for(String flower:flowers){
            for (int i = 1; i <= 13; i++) {
                deck.add(i+flower);
            }
        }
        System.out.println(deck);
        Collections.shuffle(deck);
        System.out.println(deck);
    }
}