package ru.otus.java.basic.lesson5;

import java.util.Arrays;

public class Lesson5Application {
    // for each
    public static void main(String[] args) {
        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) { // обход каждой ячейки массива
//            arr[i] = 2;
//        }
        //   0, 1, 2, 3, 4
        // { 2, 2, 2, 2, 2 }

//        for (int i = 0; i < arr.length; i += 2) { // обход ячеек с шагом
//            arr[i] = 2;
//        }
        //   0, 1, 2, 3, 4
        // { 2, 0, 2, 0, 2 }

//        int[] prefilledArr = {4, 5, -2, 5, 3, -6, 7, 0, 1};
//        int sum = 0;
//        for (int i = 0; i < prefilledArr.length; i++) {
//                sum += prefilledArr[i];
//        }
//        System.out.println(sum);

//        int[] prefilledArr = {4, 5, -2, 5, 3, -6, 7, 0, 1};
//        int count = 0;
//        for (int i = 0; i < prefilledArr.length; i++) {
//            if (prefilledArr[i] > 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

//        int[] prefilledArr = {4, 5, -2, 5, 3, -6, 7, 0, 1};
//        for (int i = 0; i < prefilledArr.length; i++) {
//            System.out.print(prefilledArr[i] + " ");
//        }
//        System.out.println();

//        //            0  1  2  3  4
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {5, 4, 3, 2, 1};
//        //            2  4  6  8  10
//        int[] crossSum = new int[5];
//        // 0 1 2 3 4
//        // 2 4 6 8 10
//        for (int i = 0; i < crossSum.length; i++) {
//            crossSum[i] = arr1[i] + arr2[crossSum.length - 1 - i];
//        }

        System.out.println(Arrays.toString(arr));

        int[] anotherArr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(anotherArr));
        clearArray(anotherArr);
        System.out.println(Arrays.toString(anotherArr));
        printString("Hello");
    }

    public static void printString(String arg) {
        System.out.println(arg);
    }

    public static void clearArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static void sumAndPrint(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
