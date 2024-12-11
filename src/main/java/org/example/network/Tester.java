package org.example.network;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://datacenter.taichung.gov.tw/swagger/OpenData/d07814d4-a50d-4049-98b2-b925e0dec1d3");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = br.readLine();
            StringBuffer json = new StringBuffer();
            while(line != null){
                System.out.print(line);
                json.append(line);
                line = br.readLine();
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
