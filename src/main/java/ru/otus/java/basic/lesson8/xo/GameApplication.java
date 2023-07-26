package ru.otus.java.basic.lesson8.xo;

import java.util.Scanner;

public class GameApplication {
    static final int SIZE = 3;

    static final char EMPTY_SYMBOL = '*';
    static final char X_SYMBOL = 'X';
    static final char O_SYMBOL = 'O';

    static Scanner scanner = new Scanner(System.in);
    static char[][] map;
    static char humanSymbol, aiSymbol;

    public static void main(String[] args) {
        System.out.println("Настройки игры. Выберите чем ходить: 1 - X, 2 - O");
        int answer = scanner.nextInt();
        if (answer == 2) {
            humanSymbol = O_SYMBOL;
            aiSymbol = X_SYMBOL;
        } else {
            humanSymbol = X_SYMBOL;
            aiSymbol = O_SYMBOL;
        }
        initMap();
        printMap();
        System.out.println("Игра начата");
        while (true) {
            playerTurn();
            printMap();
            if (checkWin(humanSymbol)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(aiSymbol)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра завершена");
    }

    public static boolean checkWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;

        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_SYMBOL) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] aiFindBestCell(char targetSymbol) {
        int[] out = new int[]{-1, -1};
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == EMPTY_SYMBOL) {
                    map[i][j] = targetSymbol;
                    if (checkWin(targetSymbol)) {
                        out = new int[]{j, i};
                    }
                    map[i][j] = EMPTY_SYMBOL;
                    if (out[0] > -1) {
                        return out;
                    }
                }
            }
        }
        return out;
    }

    public static void aiTurn() {
        int x, y;
        int[] bestCells;
        bestCells = aiFindBestCell(aiSymbol);
        x = bestCells[0];
        y = bestCells[1];
        if (x == -1 && y == -1) {
            int[] cellToBlock = aiFindBestCell(humanSymbol);
            x = cellToBlock[0];
            y = cellToBlock[1];
        }
        if (x == -1 && y == -1) {
            do {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);
            } while (!isCellValid(x, y));
        }
        System.out.println("Ход компьютера: " + (x + 1) + " " + (y + 1));
        map[y][x] = aiSymbol;
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Ход игрока. Укажите координаты X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = humanSymbol;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[y][x] != EMPTY_SYMBOL) {
            return false;
        }
        return true;
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_SYMBOL;
            }
        }
    }
}