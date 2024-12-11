package org.example.io;

import java.io.FileWriter;

public class WriteTester  {
    public static void main(String[] args) throws Exception {
        FileWriter fr = new FileWriter("ouput.txt");
        fr.write("abcdesu你好");
        fr.flush();
        fr.close();

    }
}
