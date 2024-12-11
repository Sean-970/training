package org.example.io;

import java.io.*;

public class ReadTester {
    public static void main(String[] args) {
            bufferedreader();


//          filereader();
//          inputstream();

    }

    private static void bufferedreader() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line =  br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void filereader() {
        try {
            FileReader fr = new FileReader("data.txt");
            int n = fr.read();
            while (n != -1){
                System.out.print((char) n);
                 n = fr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static void inputstream() {
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
