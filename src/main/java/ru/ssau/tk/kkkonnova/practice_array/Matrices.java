package ru.ssau.tk.kkkonnova.practice_array;

public class Matrices {

    static Matrix sumMatrix(Matrix matrix1, Matrix matrix2) {
        if ((matrix1.getM() != matrix2.getM()) | (matrix1.getN() != matrix2.getN())) {
            return null;
        }
        Matrix sumMatrix = new Matrix(matrix1.getN(), matrix1.getM());
        for (int i = 0; i < sumMatrix.getN(); i++) {
            for (int j = 0; j < sumMatrix.getM(); j++) {
                double sum = matrix1.getAt(i, j) + matrix2.getAt(i, j);
                sumMatrix.setAt(i, j, sum);
            }
        }
        return sumMatrix;
    }

    static Matrix multiplyMatrix(Matrix matrix1, Matrix matrix2) {
        if (matrix1.getM() != matrix2.getN()) {
            return null;
        }
        Matrix multMatrix = new Matrix(matrix1.getN(), matrix2.getM());
        for (int i = 0; i < multMatrix.getN(); ++i) {
            for (int j = 0; j < multMatrix.getM(); ++j) {
                double mult = 0;
                for (int k = 0; k < matrix1.getM(); ++k) {
                    mult += matrix1.getAt(i, k) * matrix2.getAt(k, j);
                    multMatrix.setAt(i, j,mult );

                }

            }
        }
        return multMatrix;
    }

    static Matrix multiplyByConstMatrix(Matrix matrix, double k) {
        Matrix multMatrix = new Matrix(matrix.getN(), matrix.getM());
        for (int i = 0; i < multMatrix.getN(); i++) {
            for (int j = 0; j < multMatrix.getM(); j++) {
                double multConst = matrix.getAt(i, j) * k;
                multMatrix.setAt(i, j, multConst);
            }
        }
        return multMatrix;
    }
}
