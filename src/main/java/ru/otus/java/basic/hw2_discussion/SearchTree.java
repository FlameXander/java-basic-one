package ru.otus.java.basic.hw2_discussion;

import java.util.List;

public interface SearchTree<T> {
    T find(T element);
    List<T> getSortedList();
}
