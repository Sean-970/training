package org.example.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.txt");
        System.out.println(file.exists()); //存不存在
        System.out.println(file.getAbsoluteFile());//查path
        try {
            FileInputStream fin = new FileInputStream(file);
            int n = fin.read();
            while( n != -1){
                System.out.print((char)n);
                n = fin.read();
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("open success");

    }
}
