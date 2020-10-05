package ru.ssau.tk.kkkonnova.practice_array;

public class myArray {

    static int getCountOfEvenNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    static int getIndexOfNumber(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }
        }

        return -1;
    }

    static int sumWithEvenIndex(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            sum = sum + array[i];
        }
        return sum;
    }

    //2.13
    /*
        static int[] getSymmetricArray(int n) {
            int[] array = new int[n];
            int stop = n / 2 + n % 2;
            for (int i = 0; i < stop-1; i++) {
                array[i] = i+1;
            }
            for (int i = stop; i < n; i++) {
                array[i] = stop;
                stop--;
            }
            return array;
        }
    */
    static double[] getGeometricProgression(int n, double b1, double q) {
        double[] array = new double[n];
        array[0] = b1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] * q;
        }
        return array;
    }

    static void changeSign(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -1 * array[i];
        }
    }

    static double[] getArithmeticProgression(int n, double a1, double d) {
        double[] array = new double[n];
        array[0] = a1;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + d;
        }
        return array;
    }

    static int[] getWithoutMultiplesOfThree(int n) {
        int[] array = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k++;
            if (k % 3 == 0) {
                k++;
            }
        }
        return array;
    }

    static boolean findNumberInArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }

    static double[] solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            return new double[]{-c / b};
        }
        double D = b * b - 4 * a * c;
        if (D < 0) {
            return new double[]{};
        }
        if (D == 0) {
            return new double[]{-b / (2 * a)};
        }
        double[] array = new double[2];
        array[0] = (-b + Math.sqrt(D)) / 2;
        array[1] = (-b - Math.sqrt(D)) / 2;
        return array;
    }

    static int[] generateSqrIndex(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i * i;
        }
        return array;
    }

    static int[] generateFibonacci(int n) {
        if (n == 1) {
            return new int[]{1};
        }
        if (n == 2) {
            return new int[]{1, 1};
        }
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    static int[] generateEvenNumbers(int n) {
        int[] array = new int[n];
        int k = n * 2;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k = k - 2;
        }
        return array;
    }

    static int[] generateOddNumbers(int n) {
        int[] array = new int[n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            array[i] = k;
            k = k + 2;
        }
        return array;
    }

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
