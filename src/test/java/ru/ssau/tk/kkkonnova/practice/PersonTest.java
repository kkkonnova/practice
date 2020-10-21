package ru.ssau.tk.kkkonnova.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    private Person getPersonI() {
        return new Person("Kristina", "Konnova");
    }

    private Person getPersonStas() {
        return new Person("Stanislav", "Chernyshev", 123456);
    }

    private Person getNewPerson() {
        return new Person();
    }

    @Test
    public void testTestToString() {
        Person testPerson1 = getPersonI();
        Person testPerson2 = getPersonStas();
        assertEquals(testPerson1.toString(), "Kristina Konnova");
        assertEquals(testPerson2.toString(), "Stanislav Chernyshev");
    }

    @Test
    public void testGetFirstName() {
        Person testPerson1 = getPersonI();
        Person testPerson2 = getPersonStas();
        assertEquals(testPerson1.getFirstName(), "Kristina");
        assertEquals(testPerson2.getFirstName(), "Stanislav");
    }

    @Test
    public void testSetFirstName() {
        Person testPerson1 = getNewPerson();
        testPerson1.setLastName("FirstName");
        assertEquals(testPerson1.getLastName(), "FirstName");

    }

    @Test
    public void testGetLastName() {
        Person testPerson1 = getPersonI();
        Person testPerson2 = getPersonStas();
        assertEquals(testPerson1.getLastName(), "Konnova");
        assertEquals(testPerson2.getLastName(), "Chernyshev");
    }

    @Test
    public void testSetLastName() {
        Person testPerson1 = getNewPerson();
        testPerson1.setLastName("LastName");
        assertEquals(testPerson1.getLastName(), "LastName");
    }

    @Test
    public void testGetPassportId() {
        Person testPerson1 = getPersonI();
        Person testPerson2 = getPersonStas();
        assertEquals(testPerson1.getPassportId(), 0);
        assertEquals(testPerson2.getPassportId(), 123456);
    }

    @Test
    public void testSetPassportId() {
        Person testPerson1 = getNewPerson();
        testPerson1.setPassportId(631245);
        assertEquals(testPerson1.getPassportId(), 631245);
    }
}