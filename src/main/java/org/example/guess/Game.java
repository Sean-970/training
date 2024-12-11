package org.example.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int answer = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int guess = 0;
        final int maxguess = 3; //猜最大次數
        while (number != answer && guess < maxguess) {
            System.out.println("輸入數字");
            number = scanner.nextInt();
            guess++;
            if (number > answer) {
                System.out.println("LOWER");
            } else if (number < answer) {
                System.out.println("HIGHER");
            } else {
                System.out.println("BINGO");
            }
            if (number != answer && guess == maxguess) {
                System.out.println("Game over! The answer is " + answer);
            }
        }
    }
}
