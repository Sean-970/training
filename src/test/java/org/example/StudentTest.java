package org.example;

import org.example.school.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void testavg(){
        Student s1 = new Student("Sean", 60,60,62,180);
        Assertions.assertEquals((60 + 60) / 2,s1.avg());
    }
    @Test
    public void highest(){
        Student s1 = new Student("Amy", 80,60);
        Assertions.assertEquals(80,s1.highest());
    }
}
