package ru.otus.java.basic.hw2_discussion.xo;

import java.util.Scanner;

public class HumanPlayer implements Player {
    private Scanner scanner;

    public HumanPlayer() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void turn() {
        System.out.println("Введите координаты");
        int x = scanner.nextInt() - 1;
        int y = scanner.nextInt() - 1;
        System.out.printf("HUMAN походил в клетку %d %d\n", x, y);
    }
}
