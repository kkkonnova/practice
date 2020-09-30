package ru.ssau.tk.kkkonnova.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTest {

    @Test
    public void testTestToString() {
        Point myPoint = new Point(1.5,2,-5);
        assertEquals(myPoint.toString(),"[1.5, 2.0, -5.0]");
    }
}