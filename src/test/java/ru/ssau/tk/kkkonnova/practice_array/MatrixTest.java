package ru.ssau.tk.kkkonnova.practice_array;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatrixTest {

    @Test
    public void testGetN() {
        Matrix myMatrix = new Matrix(3, 2);
        assertEquals(myMatrix.getN(), 3);

    }

    @Test
    public void testGetM() {
        Matrix myMatrix = new Matrix(3, 2);
        assertEquals(myMatrix.getM(), 2);

    }

    @Test
    public void testSetAtAndGet() {
        Matrix myMatrix = new Matrix(3, 2);
        myMatrix.setAt(0, 0, 10);
        myMatrix.setAt(2, 1, -3);
        assertEquals(myMatrix.getAt(0, 0), 10);
        assertEquals(myMatrix.getAt(2, 1), -3);

    }
}
