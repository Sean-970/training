package org.example;

public class Card {
     public static final char[] types = {'\u2663', '\u2666', '\u2665', '\u2660'};
     int point;
     int type;
     public Card(int index){
         point = index % 13 + 1;
         type = index / 13;
     }
     public Card(int type, int point) {
            this.type = type;
            this.point = point;
        }
     @Override
     public String toString(){
         return ((point < 10) ? " ":"") + point + types[type];
     }


//     public static void main(String[] args) {
//         for (int i = 0; i < 51; i++) {
//             Card cards = new Card(i);
//             System.out.print(cards);
//         }
//     }
}
