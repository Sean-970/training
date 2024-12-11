package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void testbmi(){
        Person p  = new Person(65f,1.8f);
        Assertions.assertEquals(65f/(1.8f*1.8f),p.bmi());
    }
}
