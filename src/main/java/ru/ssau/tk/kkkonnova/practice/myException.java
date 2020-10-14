package ru.ssau.tk.kkkonnova.practice;

public class MyException {

    static char getChar(String[] array, int m, int n) {
        if (n > array.length) {
            throw new StringIndexOutOfBoundsException();
        }
        if (m > array.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[m].charAt(n);
    }
}
