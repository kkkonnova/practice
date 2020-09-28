package ru.ssau.tk.kkkonnova.practice_str;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStringClassTest {

    @Test
    public void testPalindromeCheck() {
        MyStringClass myString = new MyStringClass();
        assertEquals(myString.palindromeCheck("123"),false);
        assertEquals(myString.palindromeCheck("11111"),true);
        assertEquals(myString.palindromeCheck("papap"),true);
        assertEquals(myString.palindromeCheck("123ghb"),false);
        assertEquals(myString.palindromeCheck("123K123"),false);
    }
}