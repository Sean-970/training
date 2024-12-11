package org.example.school;

public class GraduateStudent extends Student{
    int thesis;
    static int pass = 70;
    public GraduateStudent(String name, int math , int chinese, int thesis){
        super(name, math, chinese);
        this.thesis  = thesis;
    }

    @Override
    public void print() {
        int avg = avg();
        System.out.println(name + "\t" + math + "\t" + chinese + "\t" + thesis + "\t" + avg() + "\t" +
                ((avg >= pass) ? "Pass" : "Fail"));
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

