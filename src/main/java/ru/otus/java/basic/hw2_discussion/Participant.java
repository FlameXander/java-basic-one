package ru.otus.java.basic.hw2_discussion;

public interface Participant {
    default void run(int distance) {
        decreaseEndurance(distance);
        System.out.println("Кто-то пробежал");
    }

    void swim(int distance);

    boolean decreaseEndurance(int amount);
}
