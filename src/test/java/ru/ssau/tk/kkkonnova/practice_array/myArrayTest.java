package ru.ssau.tk.kkkonnova.practice_array;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class myArrayTest {


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
}