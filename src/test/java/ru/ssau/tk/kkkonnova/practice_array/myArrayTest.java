package ru.ssau.tk.kkkonnova.practice_array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class myArrayTest {

    private final static double DELTA = 0.00001;

    @Test
    public void testCreateArray() {
        assertEquals(myArray.createArray(2), new int[2]);
        assertEquals(myArray.createArray(10), new int[10]);
        assertEquals(myArray.createArray(1), new int[1]);

    }

    @Test
    public void testGenerateArrayWithOnes() {
        assertEquals(myArray.generateArrayWithOnes(2), new int[]{2, 2});
        assertEquals(myArray.generateArrayWithOnes(1), new int[]{2});
        assertEquals(myArray.generateArrayWithOnes(5), new int[]{2, 1, 1, 1, 2});

    }

    @Test
    public void testGenerateOddNumbers() {
        assertEquals(myArray.generateOddNumbers(2), new int[]{1, 3});
        assertEquals(myArray.generateOddNumbers(1), new int[]{1});
        assertEquals(myArray.generateOddNumbers(5), new int[]{1, 3, 5, 7, 9});
    }

    @Test
    public void testGenerateEvenNumbers() {
        assertEquals(myArray.generateEvenNumbers(2), new int[]{4, 2});
        assertEquals(myArray.generateEvenNumbers(1), new int[]{2});
        assertEquals(myArray.generateEvenNumbers(5), new int[]{10, 8, 6, 4, 2});
    }

    @Test
    public void testGenerateFibonacci() {
        assertEquals(myArray.generateFibonacci(2), new int[]{1, 1});
        assertEquals(myArray.generateFibonacci(1), new int[]{1});
        assertEquals(myArray.generateFibonacci(5), new int[]{1, 1, 2, 3, 5});
    }

    @Test
    public void testGenerateSqrIndex() {
        assertEquals(myArray.generateSqrIndex(2), new int[]{0, 1});
        assertEquals(myArray.generateSqrIndex(1), new int[]{0});
        assertEquals(myArray.generateSqrIndex(5), new int[]{0, 1, 4, 9, 16});
    }

    @Test
    public void testSolveQuadraticEquation() {
        assertEquals(myArray.solveQuadraticEquation(0, 2, -4), new double[]{2}, DELTA);
        assertEquals(myArray.solveQuadraticEquation(10, 200, 9874), new double[]{}, DELTA);
        assertEquals(myArray.solveQuadraticEquation(1, -2, 1), new double[]{1}, DELTA);
        assertEquals(myArray.solveQuadraticEquation(1, 0, -9), new double[]{3, -3}, DELTA);
    }

    @Test
    public void testFindNumberInArray() {
        int[] array = {2, 6, 8, 10, 4};
        assertEquals(myArray.findNumberInArray(array, 5), false);
        assertEquals(myArray.findNumberInArray(array, 4), true);
        assertEquals(myArray.findNumberInArray(array, 7), false);
    }
}