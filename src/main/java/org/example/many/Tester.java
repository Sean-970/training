package org.example.many;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        HashMap<Integer,String> stocks = new HashMap<>();
        stocks.put(2330,"台積電" );
        stocks.put(2317,"鴻海" );
        stocks.put(2330,"TSMC" ); //重複會被蓋過
        System.out.println(stocks.get(2330));
        System.out.println(stocks);
        for (Integer key : stocks.keySet()){
            System.out.println(stocks.get(key));
        }
//        set();
//        list();
//       array();


    }

    private static void set() {
        HashSet<Integer> set = new HashSet<>(); //適合不重複
        set.add(1);
        set.add(4);
        set.add(6);
        set.add(5);
        set.add(5);
        System.out.println(set);
        for (int n : set){
            System.out.println(n);
        }
    }

    private static void list() {
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
//        list.add('b');
//        list.add("你好");
//        list.add(true);
        list.add(3);
        list.add(5);
        list.add(0);
        list.add(6);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(1);
        System.out.println(list.size());

        List<Integer> scores = Arrays.asList(88,99,66,55,44);
        for (int score : scores){
            System.out.println(score);
        }
    }


    private static void array() {
        int[] numbers = new int[5];
        numbers[0] = 0;
        numbers[1] = 5;
        int[] scores = {88,99,66,55,44};
        System.out.println(scores);
        for (int i = 0; i < 5; i++) {
            System.out.println(scores[i]);
        }
        for (int n : scores ){
            System.out.println(n);
        }
    }
}
