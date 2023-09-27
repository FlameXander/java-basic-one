package ru.otus.java.basic.lesson24.generics;

public class ComparableBox implements Comparable<ComparableBox> {
    private int size;

    public ComparableBox(int size) {
        this.size = size;
    }

    @Override
    public int compareTo(ComparableBox o) {
        return this.size - o.size;
    }
}
