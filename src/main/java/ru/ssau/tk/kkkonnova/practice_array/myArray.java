package ru.ssau.tk.kkkonnova.practice_array;

public class myArray {

    static int[] generateArrayWithOnes(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1;
        }
        array[0] = 2;
        array[n - 1] = 2;
        return array;
    }

    static int[] createArray(int n) {
        return new int[n];
    }
}
