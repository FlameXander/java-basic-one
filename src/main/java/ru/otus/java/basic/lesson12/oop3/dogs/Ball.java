package ru.otus.java.basic.lesson12.oop3.dogs;

public class Ball {
    private String color;
    private Dog owner;

    public Dog getOwner() {
        return owner;
    }

    public void setOwner(Dog owner) {
        this.owner = owner;
    }

    public Ball(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }
}
