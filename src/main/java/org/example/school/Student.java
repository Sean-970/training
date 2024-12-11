package org.example.school;

public class Student {
    int id;
    String name ;
    int math;
    int chinese;
    float weight;
    float height;

    public Student(String name, int math, int chinese, float weight, float height) {
        this.name = name;
        this.math = math;
        this.chinese = chinese;
        this.weight = weight;
        this.height = height;
    }

    public int avg(){
        return (math + chinese) / 2;
    }
    public float bmi(){
        return weight / (height * height);
    }

}
