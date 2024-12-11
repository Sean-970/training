package org.example.school;

import java.util.Scanner;

public class Call {
    public static void main(String[] args) {
        Student s1 = new Student("Sean", 70,60);
        s1.print();
        GraduateStudent g = new GraduateStudent("Hank", 60,60, 60);
        g.print();
//        userinput();


    }

    private static void userinput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入姓名:");
        String name = sc.next();
        System.out.println("輸入數學成績");
        int math = sc.nextInt();
        System.out.println("輸入國文成績");
        int chinese = sc.nextInt();
        System.out.println("輸入體重");
        Float weight = sc.nextFloat();
        System.out.println("輸入身高");
        Float height = sc.nextFloat();
        Student s1 = new Student(name, math,chinese,weight,height);
        System.out.println(s1.bmi());
        System.out.println(s1.avg());
        s1.print();
        System.out.println( "High Score" + " " + s1.highest());
    }
}
