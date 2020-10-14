package ru.ssau.tk.kkkonnova.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class MyExceptionTest {
    @Test
    public void testTestToString() {
        String[] strings = {"2323", "123456", "12", "54432"};
        assertEquals(MyException.getChar(strings, 1, 3), '4');
        assertThrows(StringIndexOutOfBoundsException.class, () -> MyException.getChar(strings, 2, 4));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> MyException.getChar(strings, 1000, 4));
    }

}
