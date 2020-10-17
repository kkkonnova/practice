package ru.ssau.tk.kkkonnova.practice_array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyArrayTest {

    private final static double DELTA = 0.00001;

    @Test
    public void testCreateArray() {
        assertEquals(MyArray.createArray(2), new int[2]);
        assertEquals(MyArray.createArray(10), new int[10]);
        assertEquals(MyArray.createArray(1), new int[1]);

    }

    @Test
    public void testGenerateArrayWithOnes() {
        assertEquals(MyArray.generateArrayWithOnes(2), new int[]{2, 2});
        assertEquals(MyArray.generateArrayWithOnes(1), new int[]{2});
        assertEquals(MyArray.generateArrayWithOnes(5), new int[]{2, 1, 1, 1, 2});

    }

    @Test
    public void testGenerateOddNumbers() {
        assertEquals(MyArray.generateOddNumbers(2), new int[]{1, 3});
        assertEquals(MyArray.generateOddNumbers(1), new int[]{1});
        assertEquals(MyArray.generateOddNumbers(5), new int[]{1, 3, 5, 7, 9});
    }

    @Test
    public void testGenerateEvenNumbers() {
        assertEquals(MyArray.generateEvenNumbers(2), new int[]{4, 2});
        assertEquals(MyArray.generateEvenNumbers(1), new int[]{2});
        assertEquals(MyArray.generateEvenNumbers(5), new int[]{10, 8, 6, 4, 2});
    }

    @Test
    public void testGenerateFibonacci() {
        assertEquals(MyArray.generateFibonacci(2), new int[]{1, 1});
        assertEquals(MyArray.generateFibonacci(1), new int[]{1});
        assertEquals(MyArray.generateFibonacci(5), new int[]{1, 1, 2, 3, 5});
    }

    @Test
    public void testGenerateSqrIndex() {
        assertEquals(MyArray.generateSqrIndex(2), new int[]{0, 1});
        assertEquals(MyArray.generateSqrIndex(1), new int[]{0});
        assertEquals(MyArray.generateSqrIndex(5), new int[]{0, 1, 4, 9, 16});
    }

    @Test
    public void testSolveQuadraticEquation() {
        assertEquals(MyArray.solveQuadraticEquation(0, 2, -4), new double[]{2}, DELTA);
        assertEquals(MyArray.solveQuadraticEquation(10, 200, 9874), new double[]{}, DELTA);
        assertEquals(MyArray.solveQuadraticEquation(1, -2, 1), new double[]{1}, DELTA);
        assertEquals(MyArray.solveQuadraticEquation(1, 0, -9), new double[]{3, -3}, DELTA);
    }

    @Test
    public void testFindNumberInArray() {
        int[] array = {2, 6, 8, 10, 4};
        assertFalse(MyArray.findNumberInArray(array, 5));
        assertTrue(MyArray.findNumberInArray(array, 4));
        assertFalse(MyArray.findNumberInArray(array, 7));
    }

    @Test
    public void testGetWithoutMultiplesOfThree() {
        assertEquals(MyArray.getWithoutMultiplesOfThree(1), new int[]{1});
        assertEquals(MyArray.getWithoutMultiplesOfThree(6), new int[]{1, 2, 4, 5, 7, 8});
        assertEquals(MyArray.getWithoutMultiplesOfThree(3), new int[]{1, 2, 4});
    }

    @Test
    public void testGetArithmeticProgression() {
        assertEquals(MyArray.getArithmeticProgression(2, 5, -2), new double[]{5, 3});
        assertEquals(MyArray.getArithmeticProgression(5, -1, 2), new double[]{-1, 1, 3, 5, 7});
        assertEquals(MyArray.getArithmeticProgression(3, 0, 4), new double[]{0, 4, 8});
    }

    @Test
    public void testChangeSign() {
        int[] array = {2, -6, 8};
        MyArray.changeSign(array);
        assertEquals(array[0], -2);
        assertEquals(array[1], 6);
        assertEquals(array[2], -8);
    }

    @Test
    public void testGetGeometricProgression() {
        assertEquals(MyArray.getGeometricProgression(5, 2, 2), new double[]{2, 4, 8, 16, 32});
        assertEquals(MyArray.getGeometricProgression(2, 1, 5), new double[]{1, 5});
        assertEquals(MyArray.getGeometricProgression(3, 400, 0.5), new double[]{400, 200, 100});
    }

    @Test
    public void testSumWithEvenIndex() {
        int[] array = {2, -6, 8};
        assertEquals(MyArray.sumWithEvenIndex(array), 10);
    }

    @Test
    public void testGetIndexOfNumber() {
        int[] array = {2, -6, 8, 2};
        assertEquals(MyArray.getIndexOfNumber(array, 2), 0);
        assertEquals(MyArray.getIndexOfNumber(array, 8), 2);
        assertEquals(MyArray.getIndexOfNumber(array, 10), -1);
    }

    @Test
    public void testGetCountOfEvenNumbers() {
        int[] array1 = {2, -6, 8, 2};
        int[] array2 = {9, -6, 3, 2};
        int[] array3 = {7, -1, 3, 9};
        assertEquals(MyArray.getCountOfEvenNumbers(array1), 4);
        assertEquals(MyArray.getCountOfEvenNumbers(array2), 2);
        assertEquals(MyArray.getCountOfEvenNumbers(array3), 0);
    }

    @Test
    public void testGetMax() {
        int[] array1 = {2, -6, 8, 2};
        int[] array2 = {5};
        Integer p1 = 8;
        Integer p2 = 5;

        assertEquals(MyArray.getMax(array1), p1);
        assertEquals(MyArray.getMax(array2), p2);
        assertNull(MyArray.getMax(new int[]{}));
    }

    @Test
    public void testCreateTwoDimensionalArray() {
        assertEquals(MyArray.createTwoDimensionalArray(3), new int[][]{{1, 2, 3}, {4, 5}, {6}});
    }

    @Test
    public void testIsFirstCool() {
        int[] array1 = {2, -6, 8, 3};
        int[] array2 = {10, -6, 8, 3};
        assertTrue(MyArray.isFirstCool(array1));
        assertFalse(MyArray.isFirstCool(array2));
    }

    @Test
    public void testApplyNOT() {
        int[] array = {254, 32};
        MyArray.applyNOT(array);
        assertEquals(array[0], -255);
        assertEquals(array[1], -33);
    }

    @Test
    public void testApplyNOTNewArray() {
        int[] array = {254, 32};
        assertEquals(MyArray.applyNOTNewArray(array), new int[]{-255, -33});
    }

    @Test
    public void testFindEvenNumbers() {
        int[] array1 = {2, 5, 8, 3};
        assertEquals(MyArray.findEvenNumbers(array1), new boolean[]{true, false, true, false});
    }

    @Test
    public void testCheckNull() {
        Integer[] array = new Integer[]{2, 5, 6, null};
        assertTrue(MyArray.checkNull(array));
    }


    @Test
    public void testExchangedMaxAndMin() {
        int[] array0 = {1, 2, 3, 5, 6};
        MyArray.exchangedMaxAndMin(array0);
        assertEquals(array0, new int[]{6, 2, 3, 5, 1});
        int[] array1 = {2};
        MyArray.exchangedMaxAndMin(array1);
        assertEquals(array1, new int[]{2});
        int[] array2 = {1, 1, 2, 1, 5};
        MyArray.exchangedMaxAndMin(array2);
        assertEquals(array2, new int[]{5, 1, 2, 1, 1});
    }
}