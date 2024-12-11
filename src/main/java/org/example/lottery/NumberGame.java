package org.example.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0; //定數字數量
    public abstract void generate ();
    public boolean equals(){
        if(numbers.size() == numberCount){
            return true;
        }else{
            return false;
        }
    }
}
