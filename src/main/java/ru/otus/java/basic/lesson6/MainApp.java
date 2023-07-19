package ru.otus.java.basic.lesson6;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Inventory inv1 = new Inventory();
        inv1.add("Фонарик");
        inv1.print();

        Inventory inv2 = new Inventory();
        inv2.add("Бутерброд");
        inv2.print();
    }

    public static void wheelOfFortune() {
        // aiWord: { a p p l e }
        // mask:   { f t t f f }
        Scanner scanner = new Scanner(System.in);
        String aiWord = "apple";
        char[] aiWordArray = aiWord.toCharArray();
        boolean[] mask = new boolean[aiWordArray.length];
        printWheelOfFortuneWord(aiWordArray, mask);
        while (true) {
            String answer = scanner.next();
            if (answer.length() == 1) {
                for (int i = 0; i < aiWordArray.length; i++) {
                    if (aiWordArray[i] == answer.charAt(0)) {
                        mask[i] = true;
                    }
                }
            } else {
                if (answer.equals(aiWord)) {
                    System.out.println("Правильно! Ответ: " + answer);
                    break;
                } else {
                    System.out.println("Не угадали!");
                }
            }
            printWheelOfFortuneWord(aiWordArray, mask);
        }
    }

    public static void printWheelOfFortuneWord(char[] word, boolean[] mask) {
        for (int i = 0; i < word.length; i++) {
            if (mask[i]) {
                System.out.print(word[i]);
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }

    public static void wordsQuiz() {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"apple", "orange", "pineapple", "lemon", "melon", "blueberry", "bread", "banana", "cheese", "milk"};
        String aiWord = words[(int) (Math.random() * words.length)];
        System.out.println("Игра началась. Компьютер загадал еду.");
        boolean superEasy = true;

        while (true) {
            System.out.println("Введите ваш ответ");
            String answer = scanner.next();
            if (answer.equals(aiWord)) {
                System.out.println("Победа! Загаданное слово: " + answer);
                break;
            }
            char[] aiWordArray = aiWord.toCharArray();
            char[] answerArray = answer.toCharArray();
            if (!superEasy) {
                int counter = 0;
                for (int i = 0; i < Math.min(aiWordArray.length, answerArray.length); i++) {
                    if (aiWordArray[i] == answerArray[i]) {
                        counter++;
                    }
                }
                System.out.println("Не угадали. Букв на своих местах: " + counter);
            } else {
                for (int i = 0; i < 20; i++) {
                    if (i < Math.min(aiWordArray.length, answerArray.length) && aiWordArray[i] == answerArray[i]) {
                        System.out.print(aiWordArray[i]);
                        continue;
                    }
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        System.out.println("Игра завершена");
    }

    public static void findMinMax() {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
    }
}
