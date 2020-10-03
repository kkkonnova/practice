package ru.ssau.tk.kkkonnova.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class myExceptionTest {

    @Test
    public void testGetNullPointerException() {
        Person Kristina = new Person("Kristina", "Konnova");
        assertEquals(myException.getNullPointerException(Kristina), "Kristina Konnova");
        Assert.assertThrows(NullPointerException.class, () -> {
            myException.getNullPointerException(null);
        });
    }
}
