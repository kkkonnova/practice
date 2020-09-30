package ru.ssau.tk.kkkonnova.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {

    @Test
    public void testTestToString() {
        Person I = new Person("Kristina", "Konnova");
        assertEquals(I.toString(), "Kristina Konnova");
    }
}