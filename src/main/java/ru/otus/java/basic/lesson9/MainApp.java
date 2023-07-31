package ru.otus.java.basic.lesson9;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MainApp {

    public static String checkData(String[] args) {
        String res = Arrays.stream(args)
                .map(String::length)
                .filter(n -> n > 5)
                .sorted()
                .skip(1)
                .limit(3)
                .map(n -> {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < n; i++) {
                        sb.append("X");
                    }
                    return sb.toString();
                }).collect(Collectors.joining(","));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(checkData(new String[]{"kdhfikuhe", "kwreviuwef","weoiuhfwioe", "wioeuhiwue", "woeuhiweufgn"}));

//        int[] arr = {1, 2, 3, 4};
//        int[] out = new int[10];
//        System.out.println(Arrays.toString(out));
//        System.arraycopy(arr, 0, out, out.length - arr.length, arr.length);
//        System.out.println(Arrays.toString(out));

//        int[][] arr = {
//                // 0  1  2  3
//                {1, 2, 3, 4}, // 0
//                {5, 6, 7, 8}, // 1
//                {1, 2, 3, 4}, // 2
//                {5, 6, 7, 8}  // 3
//        };
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] % 2 == 0) {
//                    arr[i][j] = 0;
//                }
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            arr[i][arr[i].length - 1] = 0;
//        }
//
//        for (int y = 0; y < arr.length; y++) {
//            for (int x = 0; x < arr[y].length; x++) {
//                if (x == arr[y].length - 1) {
//                    arr[y][x] *= 2;
//                }
//            }
//        }
    }
}
