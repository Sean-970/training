package org.example;

public class Dealling {
    public static void main(String[] args) {
        int[] cards = new int[52];
        char[] types = {'\u2663', '\u2666', '\u2665', '\u2660'};
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
            int point = i % 13 + 1;
            System.out.print(point);
            System.out.print(types[i/13]);
            System.out.print(" ");
            if(point==13){
                System.out.println();
            }
        }
    }
}
