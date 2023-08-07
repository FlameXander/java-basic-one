package ru.otus.java.basic.lesson12.oop3.cats;

public class FoodPackage {
    private int capacity;
    private boolean empty;

    public boolean isEmpty() {
        return empty;
    }

    public FoodPackage(int capacity) {
        this.capacity = capacity;
        this.empty = false;
    }

    public int transfer() {
        empty = true;
        return capacity;
    }
}
