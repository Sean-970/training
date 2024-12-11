package org.example.meal;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Mcdonalds {
        Map<String,Item> menu = new HashMap<>();
        public Mcdonalds(){
        File file = new File("mcdonalds.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while(line != null){
                String[] tokens = line.split(",");  //split切割
                Item item = new Item(
                        tokens[0],
                        tokens[1],
                        Integer.parseInt(tokens[2]),
                        Integer.parseInt(tokens[3]));
                menu.put(item.id, item);
                line = br.readLine();

            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("點餐失敗");
        }
    }

    public void printmenu(){
        for (Map.Entry<String, Item> itemEntry : menu.entrySet()) {
            System.out.println(itemEntry.getValue());
        }
    }

    public static void main(String[] args) {
        Mcdonalds mcdonalds = new Mcdonalds();
        mcdonalds.printmenu();
    }
}




class Item{
    String name;
    String id;
    int calorle;
    int price;

    @Override
    public String toString() {
        return id + "，"  + name + "," + calorle + "," + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCalorle() {
        return calorle;
    }

    public void setCalorle(int calorle) {
        this.calorle = calorle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(String name, String id, int calorle, int price) {
        this.name = name;
        this.id = id;
        this.calorle = calorle;
        this.price = price;
    }
}
