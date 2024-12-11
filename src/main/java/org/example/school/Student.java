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

    public Student(String name, int math, int chinese) {
        this.name = name;
        this.math = math;
        this.chinese = chinese;
    }
    public int avg(){
        return (math + chinese) / 2;
    }
    public float bmi(){
        return weight / (height * height);
    }
    public int  highest(){
//        int max = ;
//        if (math > chinese){
//            max = math;
//        }else{
//            max = chinese;
//        }
        return (math > chinese) ? math : chinese;
    }

    public void print(){
        int avg = avg();
        System.out.println(name + "\t" + math + "\t" + chinese + "\t" + avg() + "\t" +
                ((avg >= 60) ? "Pass" : "Fail"));
        /*if(avg() >= 60){
            System.out.println("\tPass");
        }else{
            System.out.println("\tFail");
        }*/
        char grade = 'F';
        switch (avg / 10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("\t" + grade);
    }

}
