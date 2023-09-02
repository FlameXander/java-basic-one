package ru.otus.java.basic.hw2_discussion;

public class Human implements Participant {
    private String name;
    private int endurance;

    @Override
    public boolean decreaseEndurance(int amount) {
        endurance -= amount;
        return true;
    }

    public Human(String name, int endurance) {
        this.name = name;
        this.endurance = endurance;
    }

    @Override
    public void run(int distance) {

    }

    @Override
    public void swim(int distance) {

    }
}
