package org.example.day;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int year =  sc.nextInt();
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH)+1; //0~11月
        int day = now.get(Calendar.DAY_OF_MONTH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("enter your year:(" + year + ")");
            String syear = reader.readLine();
            year = syear.length()<0 ? Integer.parseInt(syear) : year;
            /*if(syear.length()<0) {
                year = Integer.parseInt(syear);
            }*/
            System.out.println(year);

            System.out.println("enter your month:(" + month + ")");
            String smonth = reader.readLine();
            month =(smonth.length() < 0) ? Integer.parseInt(smonth) : month;
            /*if(smonth.length()<0) {
                month = Integer.parseInt(smonth);
            }*/
            System.out.println(month);

            System.out.println("enter your day:(" + day + ")");
            String sday = reader.readLine();
            day = (sday.length() < 0) ? Integer.parseInt(sday) : day;
            /*if(sday.length()<0) {
                day = Integer.parseInt(sday);
            }*/
            System.out.println(day);
            System.out.println(year + "/" + month + "/" + day );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
