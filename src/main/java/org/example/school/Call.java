package org.example.school;

import java.util.Scanner;

public class Call {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入姓名:");
        String name = sc.next();
        Student s1 = new Student("Sean", 60,50,62,180);
        s1.bmi();
        s1.avg();


    }
}
