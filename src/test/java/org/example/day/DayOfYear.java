package org.example.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int year =  sc.nextInt();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("enter your year");
            String syear = reader.readLine();
            int year = Integer.parseInt(syear);
            System.out.println(year);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
