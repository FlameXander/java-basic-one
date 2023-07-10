package ru.otus.java.basic.lesson3;

public class MainApp {
    public static void main(String[] args) {
        int min = 5;
        int max = 17;

        int result = min + (int)(Math.random() * (max - min + 1));
        System.out.println(result);
    }
}
