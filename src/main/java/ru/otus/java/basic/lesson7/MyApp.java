package ru.otus.java.basic.lesson7;

import java.util.Arrays;

public class MyApp {
    public static void main(String[] args) {
        float[][] arr = {{1.0f}, {2.0f}};
        float x = sum2D(arr);

//        char[][] array = new char[5][5];
//        fill2DArray(array, '0');
//        print2DArray(array);
//        print2DArray(array);
//
//        float[][] floatArr1 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
//        float[][] floatArr2 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
//        float[][] floatArr3 = {{1.0f, 2.0f}, {3.0f, 4.0f}};
//        float result = sum2D(floatArr1) + sum2D(floatArr2) + sum2D(floatArr3);
//        System.out.println(result);

        draw2D();
    }

    public static void draw2D() {
        for (int y = 0; y < 20; y++) {
            for (int x = 0; x < 20; x++) {
                // if (x > (10 - y / 2) && x < (20 - (10 - y / 2))) {
                if (Math.abs(x - 10) < y / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int countPositiveNumbers(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static float sum2D(float[][] arr) {
        float sum = 0.0f;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void fill2DArray(char[][] arr, char initialValue) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = initialValue;
            }
        }
    }

    private static void print2DArray(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void array2DTest() {
        final int SIZE_X = 8;
        final int SIZE_Y = 4;

        char[][] arr2dXY = new char[SIZE_X][SIZE_Y];
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                arr2dXY[i][j] = '*';
            }
        }

        arr2dXY[1][3] = 'X';

        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(arr2dXY[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println();

        char[][] arr2dYX = new char[SIZE_Y][SIZE_X];
        for (int i = 0; i < SIZE_X; i++) {
            for (int j = 0; j < SIZE_Y; j++) {
                arr2dYX[j][i] = '*';
            }
        }

        arr2dYX[1][3] = 'X';

        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(arr2dYX[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static int sum(int a, int b) {
        int res = a + b;
        return res;
    }

    public static int[] createPrefilledArray(int size, int initialValue) {
        int[] out = new int[size];
        for (int i = 0; i < out.length; i++) {
            out[i] = (int) (Math.random() * initialValue);
        }
        return out;
    }
}
