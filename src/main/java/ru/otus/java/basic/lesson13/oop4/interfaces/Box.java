package ru.otus.java.basic.lesson13.oop4.interfaces;

import java.io.Serializable;

public class Box extends Object implements Closeable, Serializable {
    @Override
    public void close() {
        System.out.println("Коробка закрылась");
    }

    public void putItem() {

    }
}
