package ru.otus.java.basic.lesson13.oop4.interfaces;

public class Wardrobe implements Closeable {
    @Override
    public void close() {
        System.out.println("Шкаф закрыли");
    }
}
