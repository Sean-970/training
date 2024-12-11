package org.example.forgame;

import java.util.Random;
import java.util.Scanner;

public class GameV2 {
    public static void main(String[] args) {
        GameV2 game = new GameV2();
        game.guess();
    }
    public void guess(){
        Random random = new Random();
        int answer = random.nextInt(10)+1;
        System.out.println(answer);
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("輸入數字( " +i+ "/3):");
            int number = sc.nextInt();
            System.out.println("第" + i + "次輸入:" + number );
            if(answer < number){
                System.out.println("Low");
            } else if (answer > number) {
                System.out.println("Higher");
            } else{
                System.out.println("Bingo");
                break;
            }
        }
            System.out.println("結束 Number is " + answer);

    }
}
