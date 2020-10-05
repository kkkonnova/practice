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

    @Test
    public void testGetWithoutMultiplesOfThree() {
        assertEquals(myArray.getWithoutMultiplesOfThree(1), new int[]{1});
        assertEquals(myArray.getWithoutMultiplesOfThree(6), new int[]{1, 2, 4, 5, 7, 8});
        assertEquals(myArray.getWithoutMultiplesOfThree(3), new int[]{1, 2, 4});
    }

    @Test
    public void testGetArithmeticProgression() {
        assertEquals(myArray.getArithmeticProgression(2, 5, -2), new double[]{5, 3});
        assertEquals(myArray.getArithmeticProgression(5, -1, 2), new double[]{-1, 1, 3, 5, 7});
        assertEquals(myArray.getArithmeticProgression(3, 0, 4), new double[]{0, 4, 8});
    }

    @Test
    public void testChangeSign() {
        int[] array = {2, -6, 8};
        myArray.changeSign(array);
        assertEquals(array[0], -2);
        assertEquals(array[1], 6);
        assertEquals(array[2], -8);
    }

    @Test
    public void testGetGeometricProgression() {
        assertEquals(myArray.getGeometricProgression(5, 2, 2), new double[]{2, 4, 8, 16, 32});
        assertEquals(myArray.getGeometricProgression(2, 1, 5), new double[]{1, 5});
        assertEquals(myArray.getGeometricProgression(3, 400, 0.5), new double[]{400, 200, 100});
    }

    @Test
    public void testSumWithEvenIndex() {
        int[] array = {2, -6, 8};
        assertEquals(myArray.sumWithEvenIndex(array), 10);
    }

    @Test
    public void testGetIndexOfNumber() {
        int[] array = {2, -6, 8, 2};
        assertEquals(myArray.getIndexOfNumber(array, 2), 0);
        assertEquals(myArray.getIndexOfNumber(array, 8), 2);
        assertEquals(myArray.getIndexOfNumber(array, 10), -1);
    }

    @Test
    public void testGetCountOfEvenNumbers() {
        int[] array1 = {2, -6, 8, 2};
        int[] array2 = {9, -6, 3, 2};
        int[] array3 = {7, -1, 3, 9};
        assertEquals(myArray.getCountOfEvenNumbers(array1), 4);
        assertEquals(myArray.getCountOfEvenNumbers(array2), 2);
        assertEquals(myArray.getCountOfEvenNumbers(array3), 0);
    }
}