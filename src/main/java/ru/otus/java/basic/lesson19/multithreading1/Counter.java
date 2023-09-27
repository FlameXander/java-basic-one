package ru.otus.java.basic.lesson19.multithreading1;

public class Counter {
    private int value;

    public int getValue() {
        return value;
    }

    public synchronized void inc() {
        value++;
    }

    public synchronized void dec() {
        value--;
    }
}
