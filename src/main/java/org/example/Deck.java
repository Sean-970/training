package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
//    Card[] card = new Card[52];
    List<Card> cards = new ArrayList<Card>();

    public  Deck(){
        initCards();
    }
    private void initCards(){
        cards.clear();
        for (int i = 0; i < 52; i++) {
            cards.add(new Card(i));
        }
    }

    public void shuffle(){
        Random random = new Random();
        for (int i = cards.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card temp = cards.get(i);
            cards.set(i, cards.get(j));
            cards.set(j, temp);
        }

    }
    public void print(){
        for(Card card : cards){
            System.out.print(card + " ");
        }
    }

    public void print(int a){
        int count = 0;
        for(Card card : cards) {
            System.out.print(card + " ");
            count++;
            if (count % a == 0) System.out.println();
        }
    }
    public Card draw() {
        return cards.isEmpty() ? null : cards.remove(0);
    }
}

