package ru.otus.java.basic.lesson13.oop4.interfaces;

public class Door implements Closeable {
    @Override
    public void close() {
        System.out.println("Дверь закрыли");
    }
}
