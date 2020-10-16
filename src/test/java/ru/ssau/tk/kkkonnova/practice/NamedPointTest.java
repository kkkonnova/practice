package ru.ssau.tk.kkkonnova.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    @Test
    public void testGetName() {
        NamedPoint point1 = new NamedPoint();
        NamedPoint point2 = new NamedPoint(1, 2, 3);
        NamedPoint point3 = new NamedPoint(4, 5, 6, "myPoint");

        assertEquals(point1.getName(), "Origin");
        assertEquals(point2.getName(), null);
        assertEquals(point3.getName(), "myPoint");
    }

    @Test
    public void testSetName() {
        NamedPoint point1 = new NamedPoint();
        NamedPoint point2 = new NamedPoint(1, 2, 3);
        NamedPoint point3 = new NamedPoint(4, 5, 6);

        point1.setName("point1");
        point2.setName("point2");
        point3.setName("point3");

        assertEquals(point1.getName(), "point1");
        assertEquals(point2.getName(), "point2");
        assertEquals(point3.getName(), "point3");
    }

    @Test
    public void testTestToString() {
        NamedPoint point1 = new NamedPoint(9, 8, 7);
        NamedPoint point2 = new NamedPoint(1, 2, 3, "myPoint");

        assertEquals(point1.toString(), "[9.0, 8.0, 7.0]");
        assertEquals(point2.toString(), "myPoint [1.0, 2.0, 3.0]");
    }
}