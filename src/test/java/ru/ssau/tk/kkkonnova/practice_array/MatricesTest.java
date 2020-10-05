package ru.ssau.tk.kkkonnova.practice_array;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatricesTest {

    @Test
    public void testSumMatrix() {
        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 2);
        matrix1.setAt(1, 0, 3);
        matrix1.setAt(1, 1, 4);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setAt(0, 0, 4);
        matrix2.setAt(0, 1, 3);
        matrix2.setAt(1, 0, 2);
        matrix2.setAt(1, 1, 1);

        Matrix sumMatrix = Matrices.sumMatrix(matrix1, matrix2);
        assertEquals(sumMatrix.getAt(0, 0), 5);
        assertEquals(sumMatrix.getAt(0, 1), 5);
        assertEquals(sumMatrix.getAt(1, 0), 5);
        assertEquals(sumMatrix.getAt(1, 1), 5);

        assertEquals(Matrices.sumMatrix(matrix1, new Matrix(7, 10)), null);
    }

    @Test
    public void testMultiplyMatrix() {

        Matrix matrix1 = new Matrix(2, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 0);
        matrix1.setAt(1, 0, 0);
        matrix1.setAt(1, 1, 1);

        Matrix matrix2 = new Matrix(2, 2);
        matrix2.setAt(0, 0, 2);
        matrix2.setAt(0, 1, 4);
        matrix2.setAt(1, 0, 6);
        matrix2.setAt(1, 1, 8);

        Matrix multMatrix = Matrices.multiplyMatrix(matrix1, matrix2);
        assertEquals(multMatrix.getAt(0, 0), 2);
        assertEquals(multMatrix.getAt(0, 1), 4);
        assertEquals(multMatrix.getAt(1, 0), 6);
        assertEquals(multMatrix.getAt(1, 1), 8);

        assertEquals(Matrices.sumMatrix(matrix1, new Matrix(7, 10)), null);
    }

    @Test
    public void testMultiplyByConstMatrix() {
        Matrix matrix1 = new Matrix(1, 2);
        matrix1.setAt(0, 0, 1);
        matrix1.setAt(0, 1, 2);

        Matrix resMatrix = Matrices.multiplyByConstMatrix(matrix1, 5);
        assertEquals(resMatrix.getAt(0, 0), 5);
        assertEquals(resMatrix.getAt(0, 1), 10);
    }
}
