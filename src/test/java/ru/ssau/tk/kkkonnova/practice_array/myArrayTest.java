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
        assertEquals(myArray.generateOddNumbers(2), new int[]{1,3});
        assertEquals(myArray.generateOddNumbers(1), new int[]{1});
        assertEquals(myArray.generateOddNumbers(5), new int[]{1,3,5,7,9});
    }
}