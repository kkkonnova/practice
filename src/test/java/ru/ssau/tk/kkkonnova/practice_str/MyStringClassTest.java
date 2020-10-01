package ru.ssau.tk.kkkonnova.practice_str;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MyStringClassTest {

    @Test
    public void testPalindromeCheck() {
        MyStringClass myString = new MyStringClass();
        assertEquals(myString.palindromeCheck("123"), false);
        assertEquals(myString.palindromeCheck("11111"), true);
        assertEquals(myString.palindromeCheck("papap"), true);
        assertEquals(myString.palindromeCheck("123ghb"), false);
        assertEquals(myString.palindromeCheck("123K123"), false);
    }

    @Test
    public void testGetSubstring() {
        assertEquals(MyStringClass.getSubstring("string", 20, 100), "");
        assertEquals(MyStringClass.getSubstring("string", 1, 2), "t");
        assertEquals(MyStringClass.getSubstring("string", -1, 12345), "string");
    }

    @Test
    public void testFindFirstInSecond() {
        assertEquals(MyStringClass.findFirstInSecond("ca", "abcaca"), 2);
        assertEquals(MyStringClass.findFirstInSecond("a", "отвар"), -1);
        assertEquals(MyStringClass.findFirstInSecond("ca", "456"), -1);
        assertEquals(MyStringClass.findFirstInSecond("кот", "токикот"), 4);
        assertEquals(MyStringClass.findFirstInSecond("qwer", "tr"), -1);
    }

    @Test
    public void testFindFirstInSecondToo() {
        assertEquals(MyStringClass.findFirstInSecond("a", "отвар"), -1);
        assertEquals(MyStringClass.findFirstInSecond("ca", "456"), -1);
        assertEquals(MyStringClass.findFirstInSecond("tina", "Kristina"), 4);
    }

    @Test
    public void testFindFirstInSecondTwo() {
        assertEquals(MyStringClass.findFirstInSecond("a", "отвар"), -1);
        assertEquals(MyStringClass.findFirstInSecond("ca", "456"), -1);
        assertEquals(MyStringClass.findFirstInSecond("ri", "Kristina"), 1);
    }

    @Test
    public void testGetPrefixPostfixCount() {
        String[] strings = {"papap", "1qwerty123", "p", "123"};
        assertEquals(MyStringClass.getPrefixPostfixCount(strings, "1", "3"), 2);
        assertEquals(MyStringClass.getPrefixPostfixCount(strings, "p", "p"), 2);
        assertEquals(MyStringClass.getPrefixPostfixCount(strings, "qw", "p"), 0);
    }

    @Test
    public void testConcatenateStrings() {
        String[] strings = {"123", "p", "try"};
        assertEquals(MyStringClass.concatenateStrings(strings), "123, p, try");

    }

    @Test
    public void testGetPrefixPostfixCountToo() {
        String[] strings = {"   papap   ", " 1qwerty123  ", "p", " 123"};
        assertEquals(MyStringClass.getPrefixPostfixCountToo(strings, "1", "3"), 2);
        assertEquals(MyStringClass.getPrefixPostfixCountToo(strings, "p", "p"), 2);
        assertEquals(MyStringClass.getPrefixPostfixCountToo(strings, "qw", "p"), 0);
    }

    @Test
    public void testListUpX() {
        assertEquals(MyStringClass.listUpX(3),"0 1 2");
    }
}