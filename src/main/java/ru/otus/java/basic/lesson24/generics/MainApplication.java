package ru.otus.java.basic.lesson24.generics;

import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
//        SimpleBox b1 = new SimpleBox(10);
//        SimpleBox b2 = new SimpleBox(20);
//        // ...
//        b1.setObj("A");
//        // ...
//        if (b1.getObj() instanceof Integer && b2.getObj() instanceof Integer) {
//            int result = (Integer) b1.getObj() + (Integer) b2.getObj();
//            System.out.println(result);
//        }

//        BoxGeneric<Integer> bgi1 = new BoxGeneric<>(10);
//        BoxGeneric<Integer> bgi2 = new BoxGeneric<>(20);
//        // ...
//        // bgi1.setObj("X");
//        // ...
//        int result = bgi1.getObj() + bgi2.getObj();
//
//        BoxWithNumbers<Integer> bwni1 = new BoxWithNumbers<>(1, 2, 3, 4);
//        BoxWithNumbers<Float> bwnf1 = new BoxWithNumbers<>(1f, 2f, 3f, 4f);
//        BoxWithNumbers<Float> bwnf2 = new BoxWithNumbers<>(4f, 2f, 3f, 1f);
//
//        System.out.println(bwni1.avg());
//        System.out.println(bwnf1.avg());
//        System.out.println(bwnf2.avg());
//        System.out.println(bwnf1.compareByAvg(bwni1));

        List<Integer> list = List.of(1, 2, 3, 4);
        Integer i = getFirstElement(list);

        List<String> listS = List.of("A");
        String s = getFirstElement(listS);
    }

    public static double sum(List<? extends Number> list) {
        double result = 0.0;
        for (Number n : list) {
            result += n.doubleValue();
        }
        return result;
    }

    public static <T> T getFirstElement(List<T> list) {
        return list.get(0);
    }
}
