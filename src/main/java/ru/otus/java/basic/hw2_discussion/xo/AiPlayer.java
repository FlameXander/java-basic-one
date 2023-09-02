package ru.otus.java.basic.hw2_discussion.xo;

public class AiPlayer implements Player {
    @Override
    public void turn() {
        int x = (int)(Math.random() * 3);
        int y = (int)(Math.random() * 3);
        System.out.printf("AI походил в клетку %d %d\n", x, y);
    }
}
