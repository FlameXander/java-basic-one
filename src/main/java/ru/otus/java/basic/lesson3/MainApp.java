package ru.otus.java.basic.lesson3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
    }

    public static void intervalInput() {
        int min = 1;
        int max = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число в диапазоне " + min + "-" + max);
        int n;
        do {
            n = scanner.nextInt();
        } while (n < min || n > max);
        System.out.println("Вы ввели число: " + n);
    }

    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите сложность: 1-3");
        int difficulty = scanner.nextInt();
        int max;
        int tries;
        if (difficulty == 1) {
            max = 9;
            tries = 5;
        } else if (difficulty == 2) {
            max = 14;
            tries = 4;
        } else if (difficulty == 3) {
            max = 19;
            tries = 3;
        } else {
            System.out.println("Я не буду с Вами играть. Вы читер!");
            return;
        }

        int aiNumber = (int) (Math.random() * (max + 1));
        System.out.println("Попробуйте угадать число 0-" + max + ". С " + tries + " попыток");
        while (true) {
            int answer = scanner.nextInt();
            if (answer == aiNumber) {
                System.out.println("Вы победили!!!");
                break;
            } else if (answer > aiNumber) {
                System.out.println("Не угадали. Загаданное число меньше");
            } else {
                System.out.println("Не угадали. Загаданное число больше");
            }
            tries--;
            if (tries == 0) {
                System.out.println("Попытки закончились. Вы проиграли");
                break;
            }
            System.out.println("У Вас осталось попыток: " + tries);
        }
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите операцию: + - * /");
        char operation = scanner.next().charAt(0);
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (operation == '+') {
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        } else if (operation == '-') {
            int result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        } else if (operation == '*') {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        } else if (operation == '/') {
            if (b == 0) {
                System.out.println("Делить на 0 непозволительно!");
                return;
            }
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        } else {
            System.out.println("Введена неизвестная операция");
        }
    }

    public static void simpleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите номер операции: (1 +) (2 -) (3 *) (4 /)");
        int operation = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        if (operation == 1) {
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        if (operation == 2) {
            int result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        }
        if (operation == 3) {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
        if (operation == 4) {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
    }
}
